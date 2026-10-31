package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SingleFlatMapNotification<T, R> extends Single<R> {
    public final Single a;
    public final Function b;
    public final Function c;

    public static final class FlatMapSingleObserver<T, R> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {
        public final SingleObserver a;
        public final Function b;
        public final Function c;
        public Disposable d;

        public final class InnerObserver implements SingleObserver<R> {
            public InnerObserver() {
            }

            public final void onError(Throwable th) {
                FlatMapSingleObserver.this.a.onError(th);
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.g(FlatMapSingleObserver.this, disposable);
            }

            public final void onSuccess(Object obj) {
                FlatMapSingleObserver.this.a.onSuccess(obj);
            }
        }

        public FlatMapSingleObserver(SingleObserver singleObserver, Function function, Function function2) {
            this.a = singleObserver;
            this.b = function;
            this.c = function2;
        }

        public void dispose() {
            DisposableHelper.a(this);
            this.d.dispose();
        }

        public boolean isDisposed() {
            return DisposableHelper.b(get());
        }

        public final void onError(Throwable th) {
            try {
                Object objApply = this.c.apply(th);
                Objects.requireNonNull(objApply, "The onErrorMapper returned a null SingleSource");
                SingleSource singleSource = (SingleSource) objApply;
                if (isDisposed()) {
                    return;
                }
                singleSource.subscribe(new InnerObserver());
            } catch (Throwable th2) {
                Exceptions.a(th2);
                this.a.onError(new CompositeException(new Throwable[]{th, th2}));
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.d, disposable)) {
                this.d = disposable;
                this.a.onSubscribe(this);
            }
        }

        public final void onSuccess(Object obj) {
            try {
                Object objApply = this.b.apply(obj);
                Objects.requireNonNull(objApply, "The onSuccessMapper returned a null SingleSource");
                SingleSource singleSource = (SingleSource) objApply;
                if (isDisposed()) {
                    return;
                }
                singleSource.subscribe(new InnerObserver());
            } catch (Throwable th) {
                Exceptions.a(th);
                this.a.onError(th);
            }
        }
    }

    public SingleFlatMapNotification(Single single, Function function, Function function2) {
        this.a = single;
        this.b = function;
        this.c = function2;
    }

    public final void subscribeActual(SingleObserver singleObserver) {
        this.a.subscribe(new FlatMapSingleObserver(singleObserver, this.b, this.c));
    }
}
