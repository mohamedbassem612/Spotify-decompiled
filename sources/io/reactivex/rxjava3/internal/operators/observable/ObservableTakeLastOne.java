package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableTakeLastOne<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class TakeLastOneObserver<T> implements Observer<T>, Disposable {
        public final Observer a;
        public Disposable b;
        public Object c;

        public TakeLastOneObserver(Observer observer) {
            this.a = observer;
        }

        public void dispose() {
            this.c = null;
            this.b.dispose();
        }

        public boolean isDisposed() {
            return this.b.isDisposed();
        }

        public final void onComplete() {
            Object obj = this.c;
            Observer observer = this.a;
            if (obj != null) {
                this.c = null;
                observer.onNext(obj);
            }
            observer.onComplete();
        }

        public final void onError(Throwable th) {
            this.c = null;
            this.a.onError(th);
        }

        public final void onNext(Object obj) {
            this.c = obj;
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.b, disposable)) {
                this.b = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableTakeLastOne(Observable observable) {
        super(observable);
    }

    public final void subscribeActual(Observer observer) {
        ((AbstractObservableWithUpstream) this).a.subscribe(new TakeLastOneObserver(observer));
    }
}
