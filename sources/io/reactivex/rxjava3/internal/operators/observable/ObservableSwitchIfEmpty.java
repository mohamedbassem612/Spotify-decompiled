package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableSwitchIfEmpty<T> extends AbstractObservableWithUpstream<T, T> {
    public final ObservableSource b;

    public static final class SwitchIfEmptyObserver<T> implements Observer<T> {
        public final Observer a;
        public final ObservableSource b;
        public boolean d = true;
        public final SequentialDisposable c = new SequentialDisposable();

        public SwitchIfEmptyObserver(ObservableSource observableSource, Observer observer) {
            this.a = observer;
            this.b = observableSource;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (!this.d) {
                this.a.onComplete();
            } else {
                this.d = false;
                this.b.subscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.d) {
                this.d = false;
            }
            this.a.onNext(obj);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.f(this.c, disposable);
        }
    }

    public ObservableSwitchIfEmpty(Observable observable, ObservableSource observableSource) {
        super(observable);
        this.b = observableSource;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        SwitchIfEmptyObserver switchIfEmptyObserver = new SwitchIfEmptyObserver(this.b, observer);
        observer.onSubscribe(switchIfEmptyObserver.c);
        this.a.subscribe(switchIfEmptyObserver);
    }
}
