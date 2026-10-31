package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.observers.BasicFuseableObserver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableDoAfterNext<T> extends AbstractObservableWithUpstream<T, T> {
    public final Consumer b;

    public static final class DoAfterObserver<T> extends BasicFuseableObserver<T, T> {
        public final Consumer f;

        public DoAfterObserver(Observer observer, Consumer consumer) {
            super(observer);
            this.f = consumer;
        }

        public final void onNext(Object obj) {
            ((BasicFuseableObserver) this).a.onNext(obj);
            if (((BasicFuseableObserver) this).e == 0) {
                try {
                    this.f.accept(obj);
                } catch (Throwable th) {
                    b(th);
                }
            }
        }

        public final Object poll() {
            Object objPoll = ((BasicFuseableObserver) this).c.poll();
            if (objPoll != null) {
                this.f.accept(objPoll);
            }
            return objPoll;
        }
    }

    public ObservableDoAfterNext(Observable observable, Consumer consumer) {
        super(observable);
        this.b = consumer;
    }

    public final void subscribeActual(Observer observer) {
        ((AbstractObservableWithUpstream) this).a.subscribe(new DoAfterObserver(observer, this.b));
    }
}
