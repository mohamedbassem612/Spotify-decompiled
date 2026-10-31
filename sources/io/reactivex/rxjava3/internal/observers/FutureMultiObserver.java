package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FutureMultiObserver<T> extends CountDownLatch implements MaybeObserver<T>, SingleObserver<T>, CompletableObserver, Future<T>, Disposable {
    public Object a;
    public Throwable b;
    public final AtomicReference c;

    public FutureMultiObserver() {
        super(1);
        this.c = new AtomicReference();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        DisposableHelper disposableHelper;
        while (true) {
            AtomicReference atomicReference = this.c;
            DisposableHelper disposableHelper2 = (Disposable) atomicReference.get();
            if (disposableHelper2 == this || disposableHelper2 == (disposableHelper = DisposableHelper.a)) {
                return false;
            }
            do {
                if (atomicReference.compareAndSet(disposableHelper2, disposableHelper)) {
                    if (disposableHelper2 != null) {
                        disposableHelper2.dispose();
                    }
                    countDown();
                    return true;
                }
            } while (atomicReference.get() == disposableHelper2);
        }
    }

    public void dispose() {
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        if (getCount() != 0 && !await(j, timeUnit)) {
            throw new TimeoutException(ExceptionHelper.e(j, timeUnit));
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th = this.b;
        if (th == null) {
            return this.a;
        }
        throw new ExecutionException(th);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return DisposableHelper.b((Disposable) this.c.get());
    }

    public boolean isDisposed() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return getCount() == 0;
    }

    public final void onComplete() {
        AtomicReference atomicReference = this.c;
        DisposableHelper disposableHelper = (Disposable) atomicReference.get();
        if (disposableHelper == DisposableHelper.a) {
            return;
        }
        while (!atomicReference.compareAndSet(disposableHelper, this) && atomicReference.get() == disposableHelper) {
        }
        countDown();
    }

    public final void onError(Throwable th) {
        while (true) {
            AtomicReference atomicReference = this.c;
            DisposableHelper disposableHelper = (Disposable) atomicReference.get();
            if (disposableHelper == DisposableHelper.a) {
                RxJavaPlugins.b(th);
                return;
            }
            this.b = th;
            do {
                if (atomicReference.compareAndSet(disposableHelper, this)) {
                    countDown();
                    return;
                }
            } while (atomicReference.get() == disposableHelper);
        }
    }

    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.g(this.c, disposable);
    }

    public final void onSuccess(Object obj) {
        AtomicReference atomicReference = this.c;
        DisposableHelper disposableHelper = (Disposable) atomicReference.get();
        if (disposableHelper == DisposableHelper.a) {
            return;
        }
        this.a = obj;
        while (!atomicReference.compareAndSet(disposableHelper, this) && atomicReference.get() == disposableHelper) {
        }
        countDown();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        if (getCount() != 0) {
            await();
        }
        if (!isCancelled()) {
            Throwable th = this.b;
            if (th == null) {
                return this.a;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }
}
