package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CompletableAndThenObservable<R> extends Observable<R> {
    public final Completable a;
    public final ObservableSource b;

    public static final class AndThenObservableObserver<R> extends AtomicReference<Disposable> implements Observer<R>, CompletableObserver, Disposable {
        public final Observer a;
        public ObservableSource b;

        public AndThenObservableObserver(ObservableSource observableSource, Observer observer) {
            this.b = observableSource;
            this.a = observer;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            ObservableSource observableSource = this.b;
            if (observableSource == null) {
                this.a.onComplete();
            } else {
                this.b = null;
                observableSource.subscribe(this);
            }
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
            DisposableHelper.c(this, disposable);
        }
    }

    public CompletableAndThenObservable(Completable completable, ObservableSource observableSource) {
        this.a = completable;
        this.b = observableSource;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        AndThenObservableObserver andThenObservableObserver = new AndThenObservableObserver(this.b, observer);
        observer.onSubscribe(andThenObservableObserver);
        this.a.subscribe(andThenObservableObserver);
    }
}
