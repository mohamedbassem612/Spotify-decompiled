package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableTakeUntil<T, U> extends AbstractObservableWithUpstream<T, T> {
    public final ObservableSource b;

    public static final class TakeUntilMainObserver<T, U> extends AtomicInteger implements Observer<T>, Disposable {
        public final Observer a;
        public final AtomicReference b = new AtomicReference();
        public final OtherObserver c = new OtherObserver();
        public final AtomicThrowable d = new AtomicThrowable();

        public final class OtherObserver extends AtomicReference<Disposable> implements Observer<U> {
            public OtherObserver() {
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onComplete() {
                TakeUntilMainObserver takeUntilMainObserver = TakeUntilMainObserver.this;
                DisposableHelper.a(takeUntilMainObserver.b);
                HalfSerializer.a(takeUntilMainObserver.a, takeUntilMainObserver, takeUntilMainObserver.d);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onError(Throwable th) {
                TakeUntilMainObserver takeUntilMainObserver = TakeUntilMainObserver.this;
                DisposableHelper.a(takeUntilMainObserver.b);
                HalfSerializer.b(takeUntilMainObserver.a, th, takeUntilMainObserver, takeUntilMainObserver.d);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onNext(Object obj) {
                DisposableHelper.a(this);
                TakeUntilMainObserver takeUntilMainObserver = TakeUntilMainObserver.this;
                DisposableHelper.a(takeUntilMainObserver.b);
                HalfSerializer.a(takeUntilMainObserver.a, takeUntilMainObserver, takeUntilMainObserver.d);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.g(this, disposable);
            }
        }

        public TakeUntilMainObserver(Observer observer) {
            this.a = observer;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.a(this.b);
            DisposableHelper.a(this.c);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.b((Disposable) this.b.get());
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            DisposableHelper.a(this.c);
            HalfSerializer.a(this.a, this, this.d);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            DisposableHelper.a(this.c);
            HalfSerializer.b(this.a, th, this, this.d);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            HalfSerializer.c(this.a, obj, this, this.d);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.g(this.b, disposable);
        }
    }

    public ObservableTakeUntil(Observable observable, ObservableSource observableSource) {
        super(observable);
        this.b = observableSource;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        TakeUntilMainObserver takeUntilMainObserver = new TakeUntilMainObserver(observer);
        observer.onSubscribe(takeUntilMainObserver);
        this.b.subscribe(takeUntilMainObserver.c);
        this.a.subscribe(takeUntilMainObserver);
    }
}
