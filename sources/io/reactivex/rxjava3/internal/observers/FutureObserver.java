package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FutureObserver<T> extends CountDownLatch implements Observer<T>, Future<T>, Disposable {
    public Object a;
    public Throwable b;
    public final AtomicReference c;

    public FutureObserver() {
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
        if (this.a == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        AtomicReference atomicReference = this.c;
        DisposableHelper disposableHelper = (Disposable) atomicReference.get();
        if (disposableHelper == this || disposableHelper == DisposableHelper.a) {
            return;
        }
        while (!atomicReference.compareAndSet(disposableHelper, this)) {
            if (atomicReference.get() != disposableHelper) {
                return;
            }
        }
        countDown();
    }

    public final void onError(Throwable th) {
        if (this.b == null) {
            AtomicReference atomicReference = this.c;
            DisposableHelper disposableHelper = (Disposable) atomicReference.get();
            if (disposableHelper != this && disposableHelper != DisposableHelper.a) {
                while (!atomicReference.compareAndSet(disposableHelper, this)) {
                    if (atomicReference.get() != disposableHelper) {
                    }
                }
                this.b = th;
                countDown();
                return;
            }
        }
        RxJavaPlugins.b(th);
    }

    public final void onNext(Object obj) {
        if (this.a == null) {
            this.a = obj;
        } else {
            ((Disposable) this.c.get()).dispose();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.g(this.c, disposable);
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
