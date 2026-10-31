package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SingleFlatMapBiSelector<T, U, R> extends Single<R> {
    public final Single a;
    public final Function b;
    public final BiFunction c;

    public static final class FlatMapBiMainObserver<T, U, R> implements SingleObserver<T>, Disposable {
        public final Function a;
        public final InnerObserver b;

        public static final class InnerObserver<T, U, R> extends AtomicReference<Disposable> implements SingleObserver<U> {
            public final SingleObserver a;
            public final BiFunction b;
            public Object c;

            public InnerObserver(SingleObserver singleObserver, BiFunction biFunction) {
                this.a = singleObserver;
                this.b = biFunction;
            }

            public final void onError(Throwable th) {
                this.a.onError(th);
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.g(this, disposable);
            }

            public final void onSuccess(Object obj) {
                SingleObserver singleObserver = this.a;
                Object obj2 = this.c;
                this.c = null;
                try {
                    Object objApply = this.b.apply(obj2, obj);
                    Objects.requireNonNull(objApply, "The resultSelector returned a null value");
                    singleObserver.onSuccess(objApply);
                } catch (Throwable th) {
                    Exceptions.a(th);
                    singleObserver.onError(th);
                }
            }
        }

        public FlatMapBiMainObserver(SingleObserver singleObserver, Function function, BiFunction biFunction) {
            this.b = new InnerObserver(singleObserver, biFunction);
            this.a = function;
        }

        public void dispose() {
            DisposableHelper.a(this.b);
        }

        public boolean isDisposed() {
            return DisposableHelper.b(this.b.get());
        }

        public final void onError(Throwable th) {
            this.b.a.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            InnerObserver innerObserver = this.b;
            if (DisposableHelper.g(innerObserver, disposable)) {
                innerObserver.a.onSubscribe(this);
            }
        }

        public final void onSuccess(Object obj) {
            InnerObserver innerObserver = this.b;
            try {
                Object objApply = this.a.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null MaybeSource");
                SingleSource singleSource = (SingleSource) objApply;
                if (DisposableHelper.c(innerObserver, (Disposable) null)) {
                    innerObserver.c = obj;
                    singleSource.subscribe(innerObserver);
                }
            } catch (Throwable th) {
                Exceptions.a(th);
                innerObserver.a.onError(th);
            }
        }
    }

    public SingleFlatMapBiSelector(Single single, Function function, BiFunction biFunction) {
        this.a = single;
        this.b = function;
        this.c = biFunction;
    }

    public final void subscribeActual(SingleObserver singleObserver) {
        this.a.subscribe(new FlatMapBiMainObserver(singleObserver, this.b, this.c));
    }
}
