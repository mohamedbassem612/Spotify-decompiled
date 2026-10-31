package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class MaybeIgnoreElement<T> extends AbstractMaybeWithUpstream<T, T> {

    public static final class IgnoreMaybeObserver<T> implements MaybeObserver<T>, Disposable {
        public final MaybeObserver a;
        public Disposable b;

        public IgnoreMaybeObserver(MaybeObserver maybeObserver) {
            this.a = maybeObserver;
        }

        public void dispose() {
            this.b.dispose();
            this.b = DisposableHelper.a;
        }

        public boolean isDisposed() {
            return this.b.isDisposed();
        }

        public final void onComplete() {
            this.b = DisposableHelper.a;
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            this.b = DisposableHelper.a;
            this.a.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.b, disposable)) {
                this.b = disposable;
                this.a.onSubscribe(this);
            }
        }

        public final void onSuccess(Object obj) {
            this.b = DisposableHelper.a;
            this.a.onComplete();
        }
    }

    public MaybeIgnoreElement(Maybe maybe) {
        super(maybe);
    }

    public final void i(MaybeObserver maybeObserver) {
        ((AbstractMaybeWithUpstream) this).a.subscribe(new IgnoreMaybeObserver(maybeObserver));
    }
}
