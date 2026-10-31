package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.observers.BasicFuseableObserver;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableDistinct<T, K> extends AbstractObservableWithUpstream<T, T> {
    public final Function b;
    public final Supplier c;

    public static final class DistinctObserver<T, K> extends BasicFuseableObserver<T, T> {
        public final Collection f;
        public final Function g;

        public DistinctObserver(Observer observer, Function function, Collection collection) {
            super(observer);
            this.g = function;
            this.f = collection;
        }

        @Override // io.reactivex.rxjava3.internal.observers.BasicFuseableObserver, io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.f.clear();
            super.clear();
        }

        @Override // io.reactivex.rxjava3.internal.observers.BasicFuseableObserver, io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.d) {
                return;
            }
            this.d = true;
            this.f.clear();
            this.a.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.observers.BasicFuseableObserver, io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.d) {
                RxJavaPlugins.b(th);
                return;
            }
            this.d = true;
            this.f.clear();
            this.a.onError(th);
        }

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
                Object objApply = this.g.apply(obj);
                Objects.requireNonNull(objApply, "The keySelector returned a null key");
                if (this.f.add(objApply)) {
                    observer.onNext(obj);
                }
            } catch (Throwable th) {
                b(th);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Object objPoll;
            Object objApply;
            do {
                objPoll = this.c.poll();
                if (objPoll == null) {
                    break;
                }
                objApply = this.g.apply(objPoll);
                Objects.requireNonNull(objApply, "The keySelector returned a null key");
            } while (!this.f.add(objApply));
            return objPoll;
        }
    }

    public ObservableDistinct(Observable observable, Function function, Supplier supplier) {
        super(observable);
        this.b = function;
        this.c = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        try {
            Object obj = this.c.get();
            if (obj == null) {
                throw ExceptionHelper.b("The collectionSupplier returned a null Collection.");
            }
            Throwable th = ExceptionHelper.a;
            this.a.subscribe(new DistinctObserver(observer, this.b, (Collection) obj));
        } catch (Throwable th2) {
            Exceptions.a(th2);
            EmptyDisposable.c(th2, observer);
        }
    }
}
