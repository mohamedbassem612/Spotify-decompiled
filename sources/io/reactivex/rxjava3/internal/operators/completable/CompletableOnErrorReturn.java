package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class CompletableOnErrorReturn<T> extends Maybe<T> {
    public final Completable a;
    public final Function b;

    public static final class OnErrorReturnMaybeObserver<T> implements CompletableObserver, Disposable {
        public final MaybeObserver a;
        public final Function b;
        public Disposable c;

        public OnErrorReturnMaybeObserver(MaybeObserver maybeObserver, Function function) {
            this.a = maybeObserver;
            this.b = function;
        }

        public void dispose() {
            this.c.dispose();
        }

        public boolean isDisposed() {
            return this.c.isDisposed();
        }

        public final void onComplete() {
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            MaybeObserver maybeObserver = this.a;
            try {
                Object objApply = this.b.apply(th);
                Objects.requireNonNull(objApply, "The itemSupplier returned a null value");
                maybeObserver.onSuccess(objApply);
            } catch (Throwable th2) {
                Exceptions.a(th2);
                maybeObserver.onError(new CompositeException(new Throwable[]{th, th2}));
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.c, disposable)) {
                this.c = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public CompletableOnErrorReturn(Completable completable, Function function) {
        this.a = completable;
        this.b = function;
    }

    public final void i(MaybeObserver maybeObserver) {
        this.a.subscribe(new OnErrorReturnMaybeObserver(maybeObserver, this.b));
    }
}
