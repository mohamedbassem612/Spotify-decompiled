package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.observers.SerializedObserver;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableSampleTimed<T> extends AbstractObservableWithUpstream<T, T> {
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final boolean e;

    public static final class SampleTimedNoLast<T> extends SampleTimedObserver<T> {
        @Override // java.lang.Runnable
        public final void run() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.a.onNext(andSet);
            }
        }
    }

    public static abstract class SampleTimedObserver<T> extends AtomicReference<T> implements Observer<T>, Disposable, Runnable {
        public final SerializedObserver a;
        public final long b;
        public final TimeUnit c;
        public final Scheduler d;
        public final AtomicReference e = new AtomicReference();
        public Disposable f;

        public SampleTimedObserver(SerializedObserver serializedObserver, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.a = serializedObserver;
            this.b = j;
            this.c = timeUnit;
            this.d = scheduler;
        }

        public void a() {
            this.a.onComplete();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.a(this.e);
            this.f.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            DisposableHelper.a(this.e);
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            DisposableHelper.a(this.e);
            this.a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            lazySet(obj);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.f, disposable)) {
                this.f = disposable;
                this.a.onSubscribe(this);
                long j = this.b;
                DisposableHelper.c(this.e, this.d.e(this, j, j, this.c));
            }
        }
    }

    public ObservableSampleTimed(Observable observable, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        super(observable);
        this.b = j;
        this.c = timeUnit;
        this.d = scheduler;
        this.e = z;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        SerializedObserver serializedObserver = new SerializedObserver(observer);
        boolean z = this.e;
        ObservableSource observableSource = this.a;
        if (z) {
            observableSource.subscribe(new SampleTimedEmitLast(serializedObserver, this.b, this.c, this.d));
        } else {
            observableSource.subscribe(new SampleTimedNoLast(serializedObserver, this.b, this.c, this.d));
        }
    }
}
