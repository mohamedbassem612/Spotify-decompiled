package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class SingleFlatMap<T, R> extends Single<R> {
    public final SingleSource a;
    public final Function b;

    public static final class SingleFlatMapCallback<T, R> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {
        public final SingleObserver a;
        public final Function b;

        public static final class FlatMapSingleObserver<R> implements SingleObserver<R> {
            public final AtomicReference a;
            public final SingleObserver b;

            public FlatMapSingleObserver(SingleObserver singleObserver, AtomicReference atomicReference) {
                this.a = atomicReference;
                this.b = singleObserver;
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
            public final void onError(Throwable th) {
                this.b.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.c(this.a, disposable);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.MaybeObserver
            public final void onSuccess(Object obj) {
                this.b.onSuccess(obj);
            }
        }

        public SingleFlatMapCallback(SingleObserver singleObserver, Function function) {
            this.a = singleObserver;
            this.b = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.g(this, disposable)) {
                this.a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            SingleObserver singleObserver = this.a;
            try {
                Object objApply = this.b.apply(obj);
                Objects.requireNonNull(objApply, "The single returned by the mapper is null");
                SingleSource singleSource = (SingleSource) objApply;
                if (isDisposed()) {
                    return;
                }
                singleSource.subscribe(new FlatMapSingleObserver(singleObserver, this));
            } catch (Throwable th) {
                Exceptions.a(th);
                singleObserver.onError(th);
            }
        }
    }

    public SingleFlatMap(SingleSource singleSource, Function function) {
        this.b = function;
        this.a = singleSource;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.a.subscribe(new SingleFlatMapCallback(singleObserver, this.b));
    }
}
