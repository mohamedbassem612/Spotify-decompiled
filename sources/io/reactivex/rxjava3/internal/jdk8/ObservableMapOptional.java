package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.observers.BasicFuseableObserver;
import java.util.Objects;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableMapOptional<T, R> extends Observable<R> {
    public final Observable a;
    public final Function b;

    public static final class MapOptionalObserver<T, R> extends BasicFuseableObserver<T, R> {
        public final Function f;

        public MapOptionalObserver(Observer observer, Function function) {
            super(observer);
            this.f = function;
        }

        public final void onNext(Object obj) {
            if (((BasicFuseableObserver) this).d) {
                return;
            }
            int i = ((BasicFuseableObserver) this).e;
            Observer observer = ((BasicFuseableObserver) this).a;
            if (i != 0) {
                observer.onNext((Object) null);
                return;
            }
            try {
                Object objApply = this.f.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null Optional");
                Optional optional = (Optional) objApply;
                if (optional.isPresent()) {
                    observer.onNext(optional.get());
                }
            } catch (Throwable th) {
                b(th);
            }
        }

        public final Object poll() {
            Optional optional;
            do {
                Object objPoll = ((BasicFuseableObserver) this).c.poll();
                if (objPoll == null) {
                    return null;
                }
                Object objApply = this.f.apply(objPoll);
                Objects.requireNonNull(objApply, "The mapper returned a null Optional");
                optional = (Optional) objApply;
            } while (!optional.isPresent());
            return optional.get();
        }
    }

    public ObservableMapOptional(Observable observable, Function function) {
        this.a = observable;
        this.b = function;
    }

    public final void subscribeActual(Observer observer) {
        this.a.subscribe(new MapOptionalObserver(observer, this.b));
    }
}
