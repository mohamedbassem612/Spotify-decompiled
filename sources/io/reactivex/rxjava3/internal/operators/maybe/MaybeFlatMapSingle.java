package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class MaybeFlatMapSingle<T, R> extends Maybe<R> {
    public final Maybe a;
    public final Function b;

    public static final class FlatMapMaybeObserver<T, R> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {
        public final MaybeObserver a;
        public final Function b;

        public FlatMapMaybeObserver(MaybeObserver maybeObserver, Function function) {
            this.a = maybeObserver;
            this.b = function;
        }

        public void dispose() {
            DisposableHelper.a(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.b(get());
        }

        public final void onComplete() {
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.g(this, disposable)) {
                this.a.onSubscribe(this);
            }
        }

        public final void onSuccess(Object obj) {
            try {
                Object objApply = this.b.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null SingleSource");
                SingleSource singleSource = (SingleSource) objApply;
                if (isDisposed()) {
                    return;
                }
                singleSource.subscribe(new FlatMapSingleObserver(this.a, this));
            } catch (Throwable th) {
                Exceptions.a(th);
                onError(th);
            }
        }
    }

    public static final class FlatMapSingleObserver<R> implements SingleObserver<R> {
        public final AtomicReference a;
        public final MaybeObserver b;

        public FlatMapSingleObserver(MaybeObserver maybeObserver, AtomicReference atomicReference) {
            this.a = atomicReference;
            this.b = maybeObserver;
        }

        public final void onError(Throwable th) {
            this.b.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.c(this.a, disposable);
        }

        public final void onSuccess(Object obj) {
            this.b.onSuccess(obj);
        }
    }

    public MaybeFlatMapSingle(Maybe maybe, Function function) {
        this.a = maybe;
        this.b = function;
    }

    public final void i(MaybeObserver maybeObserver) {
        this.a.subscribe(new FlatMapMaybeObserver(maybeObserver, this.b));
    }
}
