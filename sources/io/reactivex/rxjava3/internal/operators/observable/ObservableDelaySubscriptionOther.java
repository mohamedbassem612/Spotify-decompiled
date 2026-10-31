package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableDelaySubscriptionOther<T, U> extends Observable<T> {
    public final Observable a;
    public final ObservableSource b;

    public final class DelayObserver implements Observer<U> {
        public final SequentialDisposable a;
        public final Observer b;
        public boolean c;

        public final class OnComplete implements Observer<T> {
            public OnComplete() {
            }

            public final void onComplete() {
                DelayObserver.this.b.onComplete();
            }

            public final void onError(Throwable th) {
                DelayObserver.this.b.onError(th);
            }

            public final void onNext(Object obj) {
                DelayObserver.this.b.onNext(obj);
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.f(DelayObserver.this.a, disposable);
            }
        }

        public DelayObserver(SequentialDisposable sequentialDisposable, Observer observer) {
            this.a = sequentialDisposable;
            this.b = observer;
        }

        public final void onComplete() {
            if (this.c) {
                return;
            }
            this.c = true;
            ObservableDelaySubscriptionOther.this.a.subscribe(new OnComplete());
        }

        public final void onError(Throwable th) {
            if (this.c) {
                RxJavaPlugins.b(th);
            } else {
                this.c = true;
                this.b.onError(th);
            }
        }

        public final void onNext(Object obj) {
            onComplete();
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.f(this.a, disposable);
        }
    }

    public ObservableDelaySubscriptionOther(Observable observable, ObservableSource observableSource) {
        this.a = observable;
        this.b = observableSource;
    }

    public final void subscribeActual(Observer observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        this.b.subscribe(new DelayObserver(sequentialDisposable, observer));
    }
}
