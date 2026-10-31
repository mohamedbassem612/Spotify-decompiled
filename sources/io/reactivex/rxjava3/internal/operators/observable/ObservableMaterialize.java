package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableMaterialize<T> extends AbstractObservableWithUpstream<T, Notification<T>> {

    public static final class MaterializeObserver<T> implements Observer<T>, Disposable {
        public final Observer a;
        public Disposable b;

        public MaterializeObserver(Observer observer) {
            this.a = observer;
        }

        public void dispose() {
            this.b.dispose();
        }

        public boolean isDisposed() {
            return this.b.isDisposed();
        }

        public final void onComplete() {
            Observer observer = this.a;
            observer.onNext(Notification.b);
            observer.onComplete();
        }

        public final void onError(Throwable th) {
            Notification notificationA = Notification.a(th);
            Observer observer = this.a;
            observer.onNext(notificationA);
            observer.onComplete();
        }

        public final void onNext(Object obj) {
            this.a.onNext(Notification.b(obj));
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.b, disposable)) {
                this.b = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableMaterialize(Observable observable) {
        super(observable);
    }

    public final void subscribeActual(Observer observer) {
        ((AbstractObservableWithUpstream) this).a.subscribe(new MaterializeObserver(observer));
    }
}
