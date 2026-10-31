package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p.i3a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class SingleSubject<T> extends Single<T> implements SingleObserver<T> {
    public static final SingleDisposable[] e = new SingleDisposable[0];
    public static final SingleDisposable[] f = new SingleDisposable[0];
    public Object c;
    public Throwable d;
    public final AtomicBoolean b = new AtomicBoolean();
    public final AtomicReference a = new AtomicReference(e);

    public static final class SingleDisposable<T> extends AtomicReference<SingleSubject<T>> implements Disposable {
        public final SingleObserver a;

        public SingleDisposable(SingleObserver singleObserver, SingleSubject singleSubject) {
            this.a = singleObserver;
            lazySet(singleSubject);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            SingleSubject<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return get() == null;
        }
    }

    public final void c(SingleDisposable singleDisposable) {
        AtomicReference atomicReference;
        SingleDisposable[] singleDisposableArr;
        SingleDisposable[] singleDisposableArr2;
        do {
            atomicReference = this.a;
            singleDisposableArr = (SingleDisposable[]) atomicReference.get();
            int length = singleDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (singleDisposableArr[i] == singleDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                singleDisposableArr2 = e;
            } else {
                SingleDisposable[] singleDisposableArr3 = new SingleDisposable[length - 1];
                System.arraycopy(singleDisposableArr, 0, singleDisposableArr3, 0, i);
                System.arraycopy(singleDisposableArr, i + 1, singleDisposableArr3, i, (length - i) - 1);
                singleDisposableArr2 = singleDisposableArr3;
            }
        } while (!i3a.p(atomicReference, singleDisposableArr, singleDisposableArr2));
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
    public final void onError(Throwable th) {
        ExceptionHelper.c(th, "onError called with a null Throwable.");
        if (!this.b.compareAndSet(false, true)) {
            RxJavaPlugins.b(th);
            return;
        }
        this.d = th;
        for (SingleDisposable singleDisposable : (SingleDisposable[]) this.a.getAndSet(f)) {
            singleDisposable.a.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
    public final void onSubscribe(Disposable disposable) {
        if (this.a.get() == f) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.MaybeObserver
    public void onSuccess(T t) {
        ExceptionHelper.c(t, "onSuccess called with a null value.");
        if (this.b.compareAndSet(false, true)) {
            this.c = t;
            for (SingleDisposable singleDisposable : (SingleDisposable[]) this.a.getAndSet(f)) {
                singleDisposable.a.onSuccess(t);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        AtomicReference atomicReference;
        SingleDisposable[] singleDisposableArr;
        SingleDisposable[] singleDisposableArr2;
        SingleDisposable singleDisposable = new SingleDisposable(singleObserver, this);
        singleObserver.onSubscribe(singleDisposable);
        do {
            atomicReference = this.a;
            singleDisposableArr = (SingleDisposable[]) atomicReference.get();
            if (singleDisposableArr == f) {
                Throwable th = this.d;
                if (th != null) {
                    singleObserver.onError(th);
                    return;
                } else {
                    singleObserver.onSuccess(this.c);
                    return;
                }
            }
            int length = singleDisposableArr.length;
            singleDisposableArr2 = new SingleDisposable[length + 1];
            System.arraycopy(singleDisposableArr, 0, singleDisposableArr2, 0, length);
            singleDisposableArr2[length] = singleDisposable;
        } while (!i3a.p(atomicReference, singleDisposableArr, singleDisposableArr2));
        if (singleDisposable.isDisposed()) {
            c(singleDisposable);
        }
    }
}
