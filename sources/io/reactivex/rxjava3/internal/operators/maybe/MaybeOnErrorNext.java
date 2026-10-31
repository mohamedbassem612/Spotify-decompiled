package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class MaybeOnErrorNext<T> extends AbstractMaybeWithUpstream<T, T> {
    public final Function b;

    public static final class OnErrorNextMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {
        public final MaybeObserver a;
        public final Function b;

        public static final class NextMaybeObserver<T> implements MaybeObserver<T> {
            public final MaybeObserver a;
            public final AtomicReference b;

            public NextMaybeObserver(MaybeObserver maybeObserver, AtomicReference atomicReference) {
                this.a = maybeObserver;
                this.b = atomicReference;
            }

            public final void onComplete() {
                this.a.onComplete();
            }

            public final void onError(Throwable th) {
                this.a.onError(th);
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.g(this.b, disposable);
            }

            public final void onSuccess(Object obj) {
                this.a.onSuccess(obj);
            }
        }

        public OnErrorNextMaybeObserver(MaybeObserver maybeObserver, Function function) {
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
            MaybeObserver maybeObserver = this.a;
            try {
                Object objApply = this.b.apply(th);
                Objects.requireNonNull(objApply, "The resumeFunction returned a null MaybeSource");
                MaybeSource maybeSource = (MaybeSource) objApply;
                DisposableHelper.c(this, (Disposable) null);
                maybeSource.subscribe(new NextMaybeObserver(maybeObserver, this));
            } catch (Throwable th2) {
                Exceptions.a(th2);
                maybeObserver.onError(new CompositeException(new Throwable[]{th, th2}));
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.g(this, disposable)) {
                this.a.onSubscribe(this);
            }
        }

        public final void onSuccess(Object obj) {
            this.a.onSuccess(obj);
        }
    }

    public MaybeOnErrorNext(Maybe maybe, Function function) {
        super(maybe);
        this.b = function;
    }

    public final void i(MaybeObserver maybeObserver) {
        ((AbstractMaybeWithUpstream) this).a.subscribe(new OnErrorNextMaybeObserver(maybeObserver, this.b));
    }
}
