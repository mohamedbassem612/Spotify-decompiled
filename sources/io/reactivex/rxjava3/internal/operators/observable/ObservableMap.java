package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.observers.BasicFuseableObserver;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableMap<T, U> extends AbstractObservableWithUpstream<T, U> {
    public final Function b;

    public static final class MapObserver<T, U> extends BasicFuseableObserver<T, U> {
        public final Function f;

        public MapObserver(Observer observer, Function function) {
            super(observer);
            this.f = function;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.d) {
                return;
            }
            int i = this.e;
            Observer observer = this.a;
            if (i != 0) {
                observer.onNext(null);
                return;
            }
            try {
                Object objApply = this.f.apply(obj);
                Objects.requireNonNull(objApply, "The mapper function returned a null value.");
                observer.onNext(objApply);
            } catch (Throwable th) {
                b(th);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Object objPoll = this.c.poll();
            if (objPoll == null) {
                return null;
            }
            Object objApply = this.f.apply(objPoll);
            Objects.requireNonNull(objApply, "The mapper function returned a null value.");
            return objApply;
        }
    }

    public ObservableMap(ObservableSource observableSource, Function function) {
        super(observableSource);
        this.b = function;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        this.a.subscribe(new MapObserver(observer, this.b));
    }
}
