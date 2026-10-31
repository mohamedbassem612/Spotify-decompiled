package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableTimeout<T, U, V> extends AbstractObservableWithUpstream<T, T> {
    public final ObservableSource b;
    public final Function c;
    public final ObservableSource d;

    public static final class TimeoutConsumer extends AtomicReference<Disposable> implements Observer<Object>, Disposable {
        public final TimeoutSelectorSupport a;
        public final long b;

        public TimeoutConsumer(long j, TimeoutSelectorSupport timeoutSelectorSupport) {
            this.b = j;
            this.a = timeoutSelectorSupport;
        }

        public void dispose() {
            DisposableHelper.a(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.b(get());
        }

        public final void onComplete() {
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.a;
            if (obj != disposableHelper) {
                lazySet(disposableHelper);
                this.a.b(this.b);
            }
        }

        public final void onError(Throwable th) {
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.a;
            if (obj == disposableHelper) {
                RxJavaPlugins.b(th);
            } else {
                lazySet(disposableHelper);
                this.a.a(this.b, th);
            }
        }

        public final void onNext(Object obj) {
            DisposableHelper disposableHelper = (Disposable) get();
            DisposableHelper disposableHelper2 = DisposableHelper.a;
            if (disposableHelper != disposableHelper2) {
                disposableHelper.dispose();
                lazySet(disposableHelper2);
                this.a.b(this.b);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.g(this, disposable);
        }
    }

    public static final class TimeoutFallbackObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, TimeoutSelectorSupport {
        public final Observer a;
        public final Function b;
        public final SequentialDisposable c = new SequentialDisposable();
        public final AtomicLong d = new AtomicLong();
        public final AtomicReference e = new AtomicReference();
        public ObservableSource f;

        public TimeoutFallbackObserver(ObservableSource observableSource, Observer observer, Function function) {
            this.a = observer;
            this.b = function;
            this.f = observableSource;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableTimeout.TimeoutSelectorSupport
        public final void a(long j, Throwable th) {
            if (!this.d.compareAndSet(j, Long.MAX_VALUE)) {
                RxJavaPlugins.b(th);
            } else {
                DisposableHelper.a(this);
                this.a.onError(th);
            }
        }

        public final void b(long j) {
            if (this.d.compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.a(this.e);
                ObservableSource observableSource = this.f;
                this.f = null;
                observableSource.subscribe(new ObservableTimeoutTimed.FallbackObserver(this.a, this));
            }
        }

        public void dispose() {
            DisposableHelper.a(this.e);
            DisposableHelper.a(this);
            this.c.dispose();
        }

        public boolean isDisposed() {
            return DisposableHelper.b(get());
        }

        public final void onComplete() {
            if (this.d.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                SequentialDisposable sequentialDisposable = this.c;
                sequentialDisposable.dispose();
                this.a.onComplete();
                sequentialDisposable.dispose();
            }
        }

        public final void onError(Throwable th) {
            if (this.d.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.b(th);
                return;
            }
            SequentialDisposable sequentialDisposable = this.c;
            sequentialDisposable.dispose();
            this.a.onError(th);
            sequentialDisposable.dispose();
        }

        public final void onNext(Object obj) {
            AtomicLong atomicLong = this.d;
            long j = atomicLong.get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (atomicLong.compareAndSet(j, j2)) {
                    SequentialDisposable sequentialDisposable = this.c;
                    Disposable disposable = (Disposable) sequentialDisposable.get();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    Observer observer = this.a;
                    observer.onNext(obj);
                    try {
                        Object objApply = this.b.apply(obj);
                        Objects.requireNonNull(objApply, "The itemTimeoutIndicator returned a null ObservableSource.");
                        ObservableSource observableSource = (ObservableSource) objApply;
                        TimeoutConsumer timeoutConsumer = new TimeoutConsumer(j2, this);
                        if (DisposableHelper.c(sequentialDisposable, timeoutConsumer)) {
                            observableSource.subscribe(timeoutConsumer);
                        }
                    } catch (Throwable th) {
                        Exceptions.a(th);
                        ((Disposable) this.e.get()).dispose();
                        atomicLong.getAndSet(Long.MAX_VALUE);
                        observer.onError(th);
                    }
                }
            }
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.g(this.e, disposable);
        }
    }

    public static final class TimeoutObserver<T> extends AtomicLong implements Observer<T>, Disposable, TimeoutSelectorSupport {
        public final Observer a;
        public final Function b;
        public final SequentialDisposable c = new SequentialDisposable();
        public final AtomicReference d = new AtomicReference();

        public TimeoutObserver(Observer observer, Function function) {
            this.a = observer;
            this.b = function;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableTimeout.TimeoutSelectorSupport
        public final void a(long j, Throwable th) {
            if (!compareAndSet(j, Long.MAX_VALUE)) {
                RxJavaPlugins.b(th);
            } else {
                DisposableHelper.a(this.d);
                this.a.onError(th);
            }
        }

        public final void b(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.a(this.d);
                this.a.onError(new TimeoutException());
            }
        }

        public void dispose() {
            DisposableHelper.a(this.d);
            this.c.dispose();
        }

        public boolean isDisposed() {
            return DisposableHelper.b((Disposable) this.d.get());
        }

        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.c.dispose();
                this.a.onComplete();
            }
        }

        public final void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.b(th);
            } else {
                this.c.dispose();
                this.a.onError(th);
            }
        }

        public final void onNext(Object obj) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    SequentialDisposable sequentialDisposable = this.c;
                    Disposable disposable = (Disposable) sequentialDisposable.get();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    Observer observer = this.a;
                    observer.onNext(obj);
                    try {
                        Object objApply = this.b.apply(obj);
                        Objects.requireNonNull(objApply, "The itemTimeoutIndicator returned a null ObservableSource.");
                        ObservableSource observableSource = (ObservableSource) objApply;
                        TimeoutConsumer timeoutConsumer = new TimeoutConsumer(j2, this);
                        if (DisposableHelper.c(sequentialDisposable, timeoutConsumer)) {
                            observableSource.subscribe(timeoutConsumer);
                        }
                    } catch (Throwable th) {
                        Exceptions.a(th);
                        ((Disposable) this.d.get()).dispose();
                        getAndSet(Long.MAX_VALUE);
                        observer.onError(th);
                    }
                }
            }
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.g(this.d, disposable);
        }
    }

    public interface TimeoutSelectorSupport extends ObservableTimeoutTimed.TimeoutSupport {
        void a(long j, Throwable th);
    }

    public ObservableTimeout(Observable observable, ObservableSource observableSource, Function function, ObservableSource observableSource2) {
        super(observable);
        this.b = observableSource;
        this.c = function;
        this.d = observableSource2;
    }

    public final void subscribeActual(Observer observer) {
        ObservableSource observableSource = ((AbstractObservableWithUpstream) this).a;
        ObservableSource observableSource2 = this.b;
        Function function = this.c;
        ObservableSource observableSource3 = this.d;
        if (observableSource3 == null) {
            TimeoutObserver timeoutObserver = new TimeoutObserver(observer, function);
            observer.onSubscribe(timeoutObserver);
            if (observableSource2 != null) {
                TimeoutConsumer timeoutConsumer = new TimeoutConsumer(0L, timeoutObserver);
                if (DisposableHelper.c(timeoutObserver.c, timeoutConsumer)) {
                    observableSource2.subscribe(timeoutConsumer);
                }
            }
            observableSource.subscribe(timeoutObserver);
            return;
        }
        TimeoutFallbackObserver timeoutFallbackObserver = new TimeoutFallbackObserver(observableSource3, observer, function);
        observer.onSubscribe(timeoutFallbackObserver);
        if (observableSource2 != null) {
            TimeoutConsumer timeoutConsumer2 = new TimeoutConsumer(0L, timeoutFallbackObserver);
            if (DisposableHelper.c(timeoutFallbackObserver.c, timeoutConsumer2)) {
                observableSource2.subscribe(timeoutConsumer2);
            }
        }
        observableSource.subscribe(timeoutFallbackObserver);
    }
}
