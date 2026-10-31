package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.observers.SerializedObserver;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableSampleWithObservable<T> extends AbstractObservableWithUpstream<T, T> {
    public final ObservableSource b;
    public final boolean c;

    public static final class SampleMainEmitLast<T> extends SampleMainObserver<T> {
        public final AtomicInteger e;
        public volatile boolean f;

        public SampleMainEmitLast(SerializedObserver serializedObserver, ObservableSource observableSource) {
            super(serializedObserver, observableSource);
            this.e = new AtomicInteger();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        public final void a() {
            this.f = true;
            if (this.e.getAndIncrement() == 0) {
                T andSet = getAndSet(null);
                if (andSet != null) {
                    this.a.onNext(andSet);
                }
                this.a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        public final void b() {
            if (this.e.getAndIncrement() == 0) {
                do {
                    boolean z = this.f;
                    T andSet = getAndSet(null);
                    if (andSet != null) {
                        this.a.onNext(andSet);
                    }
                    if (z) {
                        this.a.onComplete();
                        return;
                    }
                } while (this.e.decrementAndGet() != 0);
            }
        }
    }

    public static final class SampleMainNoLast<T> extends SampleMainObserver<T> {
    }

    public static abstract class SampleMainObserver<T> extends AtomicReference<T> implements Observer<T>, Disposable {
        public final SerializedObserver a;
        public final ObservableSource b;
        public final AtomicReference c = new AtomicReference();
        public Disposable d;

        public SampleMainObserver(SerializedObserver serializedObserver, ObservableSource observableSource) {
            this.a = serializedObserver;
            this.b = observableSource;
        }

        public void a() {
            this.a.onComplete();
        }

        public void b() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.a.onNext(andSet);
            }
        }

        public void dispose() {
            DisposableHelper.a(this.c);
            this.d.dispose();
        }

        public boolean isDisposed() {
            return this.c.get() == DisposableHelper.a;
        }

        public final void onComplete() {
            DisposableHelper.a(this.c);
            a();
        }

        public final void onError(Throwable th) {
            DisposableHelper.a(this.c);
            this.a.onError(th);
        }

        public final void onNext(Object obj) {
            lazySet(obj);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.d, disposable)) {
                this.d = disposable;
                this.a.onSubscribe(this);
                if (this.c.get() == null) {
                    this.b.subscribe(new SamplerObserver(this));
                }
            }
        }
    }

    public static final class SamplerObserver<T> implements Observer<Object> {
        public final SampleMainObserver a;

        public SamplerObserver(SampleMainObserver sampleMainObserver) {
            this.a = sampleMainObserver;
        }

        public final void onComplete() {
            SampleMainObserver sampleMainObserver = this.a;
            sampleMainObserver.d.dispose();
            sampleMainObserver.a();
        }

        public final void onError(Throwable th) {
            SampleMainObserver sampleMainObserver = this.a;
            sampleMainObserver.d.dispose();
            sampleMainObserver.a.onError(th);
        }

        public final void onNext(Object obj) {
            this.a.b();
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.g(this.a.c, disposable);
        }
    }

    public ObservableSampleWithObservable(Observable observable, ObservableSource observableSource, boolean z) {
        super(observable);
        this.b = observableSource;
        this.c = z;
    }

    public final void subscribeActual(Observer observer) {
        SerializedObserver serializedObserver = new SerializedObserver(observer);
        ObservableSource observableSource = this.b;
        boolean z = this.c;
        ObservableSource observableSource2 = ((AbstractObservableWithUpstream) this).a;
        if (z) {
            observableSource2.subscribe(new SampleMainEmitLast(serializedObserver, observableSource));
        } else {
            observableSource2.subscribe(new SampleMainNoLast(serializedObserver, observableSource));
        }
    }
}
