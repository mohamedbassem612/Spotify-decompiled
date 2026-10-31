package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.observers.BasicFuseableObserver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableDistinctUntilChanged<T, K> extends AbstractObservableWithUpstream<T, T> {
    public final Function b;
    public final BiPredicate c;

    public static final class DistinctUntilChangedObserver<T, K> extends BasicFuseableObserver<T, T> {
        public final Function f;
        public final BiPredicate g;
        public Object h;
        public boolean i;

        public DistinctUntilChangedObserver(Observer observer, Function function, BiPredicate biPredicate) {
            super(observer);
            this.f = function;
            this.g = biPredicate;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.d) {
                return;
            }
            int i = this.e;
            Observer observer = this.a;
            if (i != 0) {
                observer.onNext(obj);
                return;
            }
            try {
                Object objApply = this.f.apply(obj);
                if (this.i) {
                    boolean zTest = this.g.test(this.h, objApply);
                    this.h = objApply;
                    if (zTest) {
                        return;
                    }
                } else {
                    this.i = true;
                    this.h = objApply;
                }
                observer.onNext(obj);
            } catch (Throwable th) {
                b(th);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            while (true) {
                Object objPoll = this.c.poll();
                if (objPoll == null) {
                    return null;
                }
                Object objApply = this.f.apply(objPoll);
                if (!this.i) {
                    this.i = true;
                    this.h = objApply;
                    return objPoll;
                }
                if (!this.g.test(this.h, objApply)) {
                    this.h = objApply;
                    return objPoll;
                }
                this.h = objApply;
            }
        }
    }

    public ObservableDistinctUntilChanged(Observable observable, Function function, BiPredicate biPredicate) {
        super(observable);
        this.b = function;
        this.c = biPredicate;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        this.a.subscribe(new DistinctUntilChangedObserver(observer, this.b, this.c));
    }
}
