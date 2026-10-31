package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.EmptyComponent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableDetach<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class DetachObserver<T> implements Observer<T>, Disposable {
        public Observer a;
        public Disposable b;

        public void dispose() {
            Disposable disposable = this.b;
            EmptyComponent emptyComponent = EmptyComponent.a;
            this.b = emptyComponent;
            this.a = emptyComponent;
            disposable.dispose();
        }

        public boolean isDisposed() {
            return this.b.isDisposed();
        }

        public final void onComplete() {
            Observer observer = this.a;
            EmptyComponent emptyComponent = EmptyComponent.a;
            this.b = emptyComponent;
            this.a = emptyComponent;
            observer.onComplete();
        }

        public final void onError(Throwable th) {
            Observer observer = this.a;
            EmptyComponent emptyComponent = EmptyComponent.a;
            this.b = emptyComponent;
            this.a = emptyComponent;
            observer.onError(th);
        }

        public final void onNext(Object obj) {
            this.a.onNext(obj);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.b, disposable)) {
                this.b = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableDetach(Observable observable) {
        super(observable);
    }

    public final void subscribeActual(Observer observer) {
        DetachObserver detachObserver = new DetachObserver();
        detachObserver.a = observer;
        ((AbstractObservableWithUpstream) this).a.subscribe(detachObserver);
    }
}
