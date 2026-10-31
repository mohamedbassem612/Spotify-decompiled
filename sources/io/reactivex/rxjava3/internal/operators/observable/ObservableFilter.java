package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.observers.BasicFuseableObserver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableFilter<T> extends AbstractObservableWithUpstream<T, T> {
    public final Predicate b;

    public static final class FilterObserver<T> extends BasicFuseableObserver<T, T> {
        public final Predicate f;

        public FilterObserver(Observer observer, Predicate predicate) {
            super(observer);
            this.f = predicate;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            int i = this.e;
            Observer observer = this.a;
            if (i != 0) {
                observer.onNext(null);
                return;
            }
            try {
                if (this.f.test(obj)) {
                    observer.onNext(obj);
                }
            } catch (Throwable th) {
                b(th);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Object objPoll;
            do {
                objPoll = this.c.poll();
                if (objPoll == null) {
                    break;
                }
            } while (!this.f.test(objPoll));
            return objPoll;
        }
    }

    public ObservableFilter(Observable observable, Predicate predicate) {
        super(observable);
        this.b = predicate;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        this.a.subscribe(new FilterObserver(observer, this.b));
    }
}
