package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Cancellable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableCreate$SerializedEmitter<T> extends AtomicInteger implements ObservableEmitter<T> {
    public final ObservableEmitter a;
    public final AtomicThrowable b = new AtomicThrowable();
    public final SpscLinkedArrayQueue c = new SpscLinkedArrayQueue(16);
    public volatile boolean d;

    public ObservableCreate$SerializedEmitter(ObservableEmitter observableEmitter) {
        this.a = observableEmitter;
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            b();
        }
    }

    public final void b() {
        ObservableCreate.CreateEmitter createEmitter = this.a;
        SpscLinkedArrayQueue spscLinkedArrayQueue = this.c;
        AtomicThrowable atomicThrowable = this.b;
        int iAddAndGet = 1;
        while (!createEmitter.isDisposed()) {
            if (atomicThrowable.get() != null) {
                spscLinkedArrayQueue.clear();
                Throwable thD = ExceptionHelper.d(atomicThrowable);
                if (thD == null) {
                    createEmitter.onComplete();
                    return;
                } else {
                    if (thD != ExceptionHelper.a) {
                        createEmitter.onError(thD);
                        return;
                    }
                    return;
                }
            }
            boolean z = this.d;
            Object objPoll = spscLinkedArrayQueue.poll();
            boolean z2 = objPoll == null;
            if (z && z2) {
                createEmitter.onComplete();
                return;
            } else if (z2) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                createEmitter.onNext(objPoll);
            }
        }
        spscLinkedArrayQueue.clear();
    }

    public final boolean isDisposed() {
        return this.a.isDisposed();
    }

    public final void onComplete() {
        if (this.d || this.a.isDisposed()) {
            return;
        }
        this.d = true;
        a();
    }

    public final void onError(Throwable th) {
        if (tryOnError(th)) {
            return;
        }
        RxJavaPlugins.b(th);
    }

    public void onNext(T t) {
        if (this.d || this.a.isDisposed()) {
            return;
        }
        if (t == null) {
            onError(ExceptionHelper.b("onNext called with a null value."));
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            this.a.onNext(t);
            if (decrementAndGet() == 0) {
                return;
            }
        } else {
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.c;
            synchronized (spscLinkedArrayQueue) {
                spscLinkedArrayQueue.offer(t);
            }
            if (getAndIncrement() != 0) {
                return;
            }
        }
        b();
    }

    public final ObservableEmitter serialize() {
        return this;
    }

    public void setCancellable(Cancellable cancellable) {
        this.a.setCancellable(cancellable);
    }

    public final void setDisposable(Disposable disposable) {
        DisposableHelper.f(this.a, disposable);
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public final String toString() {
        return this.a.toString();
    }

    public final boolean tryOnError(Throwable th) {
        if (this.d || this.a.isDisposed()) {
            return false;
        }
        if (th == null) {
            th = ExceptionHelper.b("onError called with a null Throwable.");
        }
        if (!ExceptionHelper.a(this.b, th)) {
            return false;
        }
        this.d = true;
        a();
        return true;
    }
}
