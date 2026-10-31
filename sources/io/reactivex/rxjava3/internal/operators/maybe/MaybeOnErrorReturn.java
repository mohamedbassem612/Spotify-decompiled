package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class MaybeOnErrorReturn<T> extends AbstractMaybeWithUpstream<T, T> {
    public final Function b;

    public static final class OnErrorReturnMaybeObserver<T> implements MaybeObserver<T>, Disposable {
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

        public final void onSuccess(Object obj) {
            this.a.onSuccess(obj);
        }
    }

    public MaybeOnErrorReturn(Maybe maybe, Function function) {
        super(maybe);
        this.b = function;
    }

    public final void i(MaybeObserver maybeObserver) {
        ((AbstractMaybeWithUpstream) this).a.subscribe(new OnErrorReturnMaybeObserver(maybeObserver, this.b));
    }
}
