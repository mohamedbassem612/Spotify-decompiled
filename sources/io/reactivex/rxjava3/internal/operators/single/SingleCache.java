package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p.i3a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class SingleCache<T> extends Single<T> implements SingleObserver<T> {
    public static final CacheDisposable[] f = new CacheDisposable[0];
    public static final CacheDisposable[] g = new CacheDisposable[0];
    public final Single a;
    public final AtomicInteger b = new AtomicInteger();
    public final AtomicReference c = new AtomicReference(f);
    public Object d;
    public Throwable e;

    public static final class CacheDisposable<T> extends AtomicBoolean implements Disposable {
        public final SingleObserver a;
        public final SingleCache b;

        public CacheDisposable(SingleObserver singleObserver, SingleCache singleCache) {
            this.a = singleObserver;
            this.b = singleCache;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.b.c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return get();
        }
    }

    public SingleCache(Single single) {
        this.a = single;
    }

    public final void c(CacheDisposable cacheDisposable) {
        AtomicReference atomicReference;
        CacheDisposable[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            atomicReference = this.c;
            cacheDisposableArr = (CacheDisposable[]) atomicReference.get();
            int length = cacheDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (cacheDisposableArr[i] == cacheDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                cacheDisposableArr2 = f;
            } else {
                CacheDisposable[] cacheDisposableArr3 = new CacheDisposable[length - 1];
                System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr3, 0, i);
                System.arraycopy(cacheDisposableArr, i + 1, cacheDisposableArr3, i, (length - i) - 1);
                cacheDisposableArr2 = cacheDisposableArr3;
            }
        } while (!i3a.p(atomicReference, cacheDisposableArr, cacheDisposableArr2));
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
    public final void onError(Throwable th) {
        this.e = th;
        for (CacheDisposable cacheDisposable : (CacheDisposable[]) this.c.getAndSet(g)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.a.onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
    public final void onSubscribe(Disposable disposable) {
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.MaybeObserver
    public void onSuccess(T t) {
        this.d = t;
        for (CacheDisposable cacheDisposable : (CacheDisposable[]) this.c.getAndSet(g)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.a.onSuccess(t);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        AtomicReference atomicReference;
        CacheDisposable[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        CacheDisposable cacheDisposable = new CacheDisposable(singleObserver, this);
        singleObserver.onSubscribe(cacheDisposable);
        do {
            atomicReference = this.c;
            cacheDisposableArr = (CacheDisposable[]) atomicReference.get();
            if (cacheDisposableArr == g) {
                Throwable th = this.e;
                if (th != null) {
                    singleObserver.onError(th);
                    return;
                } else {
                    singleObserver.onSuccess(this.d);
                    return;
                }
            }
            int length = cacheDisposableArr.length;
            cacheDisposableArr2 = new CacheDisposable[length + 1];
            System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
            cacheDisposableArr2[length] = cacheDisposable;
        } while (!i3a.p(atomicReference, cacheDisposableArr, cacheDisposableArr2));
        if (cacheDisposable.isDisposed()) {
            c(cacheDisposable);
        }
        if (this.b.getAndIncrement() == 0) {
            this.a.subscribe(this);
        }
    }
}
