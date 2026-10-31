package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class MaybeSwitchIfEmpty<T> extends AbstractMaybeWithUpstream<T, T> {
    public final Maybe b;

    public static final class SwitchIfEmptyMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {
        public final MaybeObserver a;
        public final MaybeSource b;

        public static final class OtherMaybeObserver<T> implements MaybeObserver<T> {
            public final MaybeObserver a;
            public final AtomicReference b;

            public OtherMaybeObserver(MaybeObserver maybeObserver, AtomicReference atomicReference) {
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

        public SwitchIfEmptyMaybeObserver(Maybe maybe, MaybeObserver maybeObserver) {
            this.a = maybeObserver;
            this.b = maybe;
        }

        public void dispose() {
            DisposableHelper.a(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.b(get());
        }

        public final void onComplete() {
            DisposableHelper disposableHelper = (Disposable) get();
            if (disposableHelper == DisposableHelper.a || !compareAndSet(disposableHelper, null)) {
                return;
            }
            this.b.subscribe(new OtherMaybeObserver(this.a, this));
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
            this.a.onSuccess(obj);
        }
    }

    public MaybeSwitchIfEmpty(Maybe maybe, Maybe maybe2) {
        super(maybe);
        this.b = maybe2;
    }

    public final void i(MaybeObserver maybeObserver) {
        ((AbstractMaybeWithUpstream) this).a.subscribe(new SwitchIfEmptyMaybeObserver(this.b, maybeObserver));
    }
}
