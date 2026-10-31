package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SingleMapOptional<T, R> extends Maybe<R> {
    public final Single a;
    public final Function b;

    public static final class MapOptionalSingleObserver<T, R> implements SingleObserver<T>, Disposable {
        public final MaybeObserver a;
        public final Function b;
        public Disposable c;

        public MapOptionalSingleObserver(MaybeObserver maybeObserver, Function function) {
            this.a = maybeObserver;
            this.b = function;
        }

        public void dispose() {
            Disposable disposable = this.c;
            this.c = DisposableHelper.a;
            disposable.dispose();
        }

        public boolean isDisposed() {
            return this.c.isDisposed();
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.c, disposable)) {
                this.c = disposable;
                this.a.onSubscribe(this);
            }
        }

        public final void onSuccess(Object obj) {
            MaybeObserver maybeObserver = this.a;
            try {
                Object objApply = this.b.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null item");
                Optional optional = (Optional) objApply;
                if (optional.isPresent()) {
                    maybeObserver.onSuccess(optional.get());
                } else {
                    maybeObserver.onComplete();
                }
            } catch (Throwable th) {
                Exceptions.a(th);
                maybeObserver.onError(th);
            }
        }
    }

    public SingleMapOptional(Single single, Function function) {
        this.a = single;
        this.b = function;
    }

    public final void i(MaybeObserver maybeObserver) {
        this.a.subscribe(new MapOptionalSingleObserver(maybeObserver, this.b));
    }
}
