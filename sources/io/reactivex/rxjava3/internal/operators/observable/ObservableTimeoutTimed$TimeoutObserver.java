package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableTimeoutTimed$TimeoutObserver<T> extends AtomicLong implements Observer<T>, Disposable, ObservableTimeoutTimed.TimeoutSupport {
    public final Observer a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler.Worker d;
    public final SequentialDisposable e = new SequentialDisposable();
    public final AtomicReference f = new AtomicReference();

    public ObservableTimeoutTimed$TimeoutObserver(Observer observer, long j, TimeUnit timeUnit, Scheduler.Worker worker) {
        this.a = observer;
        this.b = j;
        this.c = timeUnit;
        this.d = worker;
    }

    public final void b(long j) {
        if (compareAndSet(j, Long.MAX_VALUE)) {
            DisposableHelper.a(this.f);
            this.a.onError(new TimeoutException(ExceptionHelper.e(this.b, this.c)));
            this.d.dispose();
        }
    }

    public final void c(long j) {
        DisposableHelper.c(this.e, this.d.b(new ObservableTimeoutTimed.TimeoutTask(j, this), this.b, this.c));
    }

    public void dispose() {
        DisposableHelper.a(this.f);
        this.d.dispose();
    }

    public boolean isDisposed() {
        return DisposableHelper.b((Disposable) this.f.get());
    }

    public final void onComplete() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.e.dispose();
            this.a.onComplete();
            this.d.dispose();
        }
    }

    public final void onError(Throwable th) {
        if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            RxJavaPlugins.b(th);
            return;
        }
        this.e.dispose();
        this.a.onError(th);
        this.d.dispose();
    }

    public final void onNext(Object obj) {
        long j = get();
        if (j != Long.MAX_VALUE) {
            long j2 = 1 + j;
            if (compareAndSet(j, j2)) {
                ((Disposable) this.e.get()).dispose();
                this.a.onNext(obj);
                c(j2);
            }
        }
    }

    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.g(this.f, disposable);
    }
}
