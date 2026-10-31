package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableSubscribeOn<T> extends AbstractObservableWithUpstream<T, T> {
    public final Scheduler b;

    public static final class SubscribeOnObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
        public final Observer a;
        public final AtomicReference b = new AtomicReference();

        public SubscribeOnObserver(Observer observer) {
            this.a = observer;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.a(this.b);
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.b(get());
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
            DisposableHelper.g(this.b, disposable);
        }
    }

    public final class SubscribeTask implements Runnable {
        public final SubscribeOnObserver a;

        public SubscribeTask(SubscribeOnObserver subscribeOnObserver) {
            this.a = subscribeOnObserver;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ObservableSubscribeOn.this.a.subscribe(this.a);
        }
    }

    public ObservableSubscribeOn(Observable observable, Scheduler scheduler) {
        super(observable);
        this.b = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(observer);
        observer.onSubscribe(subscribeOnObserver);
        DisposableHelper.g(subscribeOnObserver, this.b.c(new SubscribeTask(subscribeOnObserver)));
    }
}
