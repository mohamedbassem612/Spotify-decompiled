package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class CompletableSubject extends Completable implements CompletableObserver {
    public static final CompletableDisposable[] d = new CompletableDisposable[0];
    public static final CompletableDisposable[] e = new CompletableDisposable[0];
    public Throwable c;
    public final AtomicBoolean b = new AtomicBoolean();
    public final AtomicReference a = new AtomicReference(d);

    public static final class CompletableDisposable extends AtomicReference<CompletableSubject> implements Disposable {
        public final CompletableObserver a;

        public CompletableDisposable(CompletableObserver completableObserver, CompletableSubject completableSubject) {
            this.a = completableObserver;
            lazySet(completableSubject);
        }

        public void dispose() {
            CompletableSubject andSet = getAndSet(null);
            if (andSet != null) {
                andSet.A(this);
            }
        }

        public boolean isDisposed() {
            return get() == null;
        }
    }

    public static CompletableSubject z() {
        return new CompletableSubject();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(CompletableDisposable completableDisposable) {
        CompletableDisposable[] completableDisposableArr;
        while (true) {
            AtomicReference atomicReference = this.a;
            CompletableDisposable[] completableDisposableArr2 = (CompletableDisposable[]) atomicReference.get();
            int length = completableDisposableArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (completableDisposableArr2[i] == completableDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                completableDisposableArr = d;
            } else {
                CompletableDisposable[] completableDisposableArr3 = new CompletableDisposable[length - 1];
                System.arraycopy(completableDisposableArr2, 0, completableDisposableArr3, 0, i);
                System.arraycopy(completableDisposableArr2, i + 1, completableDisposableArr3, i, (length - i) - 1);
                completableDisposableArr = completableDisposableArr3;
            }
            while (!atomicReference.compareAndSet(completableDisposableArr2, completableDisposableArr)) {
                if (atomicReference.get() != completableDisposableArr2) {
                }
            }
            return;
        }
    }

    public final void onComplete() {
        if (this.b.compareAndSet(false, true)) {
            for (CompletableDisposable completableDisposable : (CompletableDisposable[]) this.a.getAndSet(e)) {
                completableDisposable.a.onComplete();
            }
        }
    }

    public final void onError(Throwable th) {
        ExceptionHelper.c(th, "onError called with a null Throwable.");
        if (!this.b.compareAndSet(false, true)) {
            RxJavaPlugins.b(th);
            return;
        }
        this.c = th;
        for (CompletableDisposable completableDisposable : (CompletableDisposable[]) this.a.getAndSet(e)) {
            completableDisposable.a.onError(th);
        }
    }

    public final void onSubscribe(Disposable disposable) {
        if (this.a.get() == e) {
            disposable.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(CompletableObserver completableObserver) {
        CompletableDisposable completableDisposable = new CompletableDisposable(completableObserver, this);
        completableObserver.onSubscribe(completableDisposable);
        while (true) {
            AtomicReference atomicReference = this.a;
            CompletableDisposable[] completableDisposableArr = (CompletableDisposable[]) atomicReference.get();
            if (completableDisposableArr == e) {
                Throwable th = this.c;
                if (th != null) {
                    completableObserver.onError(th);
                    return;
                } else {
                    completableObserver.onComplete();
                    return;
                }
            }
            int length = completableDisposableArr.length;
            CompletableDisposable[] completableDisposableArr2 = new CompletableDisposable[length + 1];
            System.arraycopy(completableDisposableArr, 0, completableDisposableArr2, 0, length);
            completableDisposableArr2[length] = completableDisposable;
            do {
                if (atomicReference.compareAndSet(completableDisposableArr, completableDisposableArr2)) {
                    if (completableDisposable.isDisposed()) {
                        A(completableDisposable);
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == completableDisposableArr);
        }
    }
}
