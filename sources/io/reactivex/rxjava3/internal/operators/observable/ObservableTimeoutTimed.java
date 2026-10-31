package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableTimeoutTimed<T> extends AbstractObservableWithUpstream<T, T> {
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final ObservableSource e;

    public static final class FallbackObserver<T> implements Observer<T> {
        public final Observer a;
        public final AtomicReference b;

        public FallbackObserver(Observer observer, AtomicReference atomicReference) {
            this.a = observer;
            this.b = atomicReference;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            this.a.onNext(obj);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.c(this.b, disposable);
        }
    }

    public static final class TimeoutFallbackObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, TimeoutSupport {
        public final Observer a;
        public final long b;
        public final TimeUnit c;
        public final Scheduler.Worker d;
        public final SequentialDisposable e = new SequentialDisposable();
        public final AtomicLong f = new AtomicLong();
        public final AtomicReference g = new AtomicReference();
        public ObservableSource h;

        public TimeoutFallbackObserver(Observer observer, long j, TimeUnit timeUnit, Scheduler.Worker worker, ObservableSource observableSource) {
            this.a = observer;
            this.b = j;
            this.c = timeUnit;
            this.d = worker;
            this.h = observableSource;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport
        public final void b(long j) {
            if (this.f.compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.a(this.g);
                ObservableSource observableSource = this.h;
                this.h = null;
                observableSource.subscribe(new FallbackObserver(this.a, this));
                this.d.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.a(this.g);
            DisposableHelper.a(this);
            this.d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.e.dispose();
                this.a.onComplete();
                this.d.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.f.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.b(th);
                return;
            }
            this.e.dispose();
            this.a.onError(th);
            this.d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            AtomicLong atomicLong = this.f;
            long j = atomicLong.get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (atomicLong.compareAndSet(j, j2)) {
                    SequentialDisposable sequentialDisposable = this.e;
                    sequentialDisposable.get().dispose();
                    this.a.onNext(obj);
                    DisposableHelper.c(sequentialDisposable, this.d.b(new TimeoutTask(j2, this), this.b, this.c));
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.g(this.g, disposable);
        }
    }

    public interface TimeoutSupport {
        void b(long j);
    }

    public static final class TimeoutTask implements Runnable {
        public final TimeoutSupport a;
        public final long b;

        public TimeoutTask(long j, TimeoutSupport timeoutSupport) {
            this.b = j;
            this.a = timeoutSupport;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.b(this.b);
        }
    }

    public ObservableTimeoutTimed(Observable observable, long j, TimeUnit timeUnit, Scheduler scheduler, ObservableSource observableSource) {
        super(observable);
        this.b = j;
        this.c = timeUnit;
        this.d = scheduler;
        this.e = observableSource;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        ObservableSource observableSource = this.e;
        ObservableSource observableSource2 = this.a;
        Scheduler scheduler = this.d;
        if (observableSource == null) {
            Disposable timeoutObserver = new TimeoutObserver(observer, this.b, this.c, scheduler.b());
            observer.onSubscribe(timeoutObserver);
            timeoutObserver.c(0L);
            observableSource2.subscribe(timeoutObserver);
            return;
        }
        TimeoutFallbackObserver timeoutFallbackObserver = new TimeoutFallbackObserver(observer, this.b, this.c, scheduler.b(), this.e);
        observer.onSubscribe(timeoutFallbackObserver);
        DisposableHelper.c(timeoutFallbackObserver.e, timeoutFallbackObserver.d.b(new TimeoutTask(0L, timeoutFallbackObserver), timeoutFallbackObserver.b, timeoutFallbackObserver.c));
        observableSource2.subscribe(timeoutFallbackObserver);
    }
}
