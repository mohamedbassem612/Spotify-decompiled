package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class MaybeDelayWithCompletable<T> extends Maybe<T> {
    public final MaybeJust a;
    public final Completable b;

    public static final class DelayWithMainObserver<T> implements MaybeObserver<T> {
        public final AtomicReference a;
        public final MaybeObserver b;

        public DelayWithMainObserver(MaybeObserver maybeObserver, AtomicReference atomicReference) {
            this.a = atomicReference;
            this.b = maybeObserver;
        }

        public final void onComplete() {
            this.b.onComplete();
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

    public static final class OtherObserver<T> extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
        public final MaybeObserver a;
        public final MaybeSource b;

        public OtherObserver(MaybeObserver maybeObserver, MaybeJust maybeJust) {
            this.a = maybeObserver;
            this.b = maybeJust;
        }

        public void dispose() {
            DisposableHelper.a(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.b(get());
        }

        public final void onComplete() {
            this.b.subscribe(new DelayWithMainObserver(this.a, this));
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.g(this, disposable)) {
                this.a.onSubscribe(this);
            }
        }
    }

    public MaybeDelayWithCompletable(MaybeJust maybeJust, Completable completable) {
        this.a = maybeJust;
        this.b = completable;
    }

    public final void i(MaybeObserver maybeObserver) {
        this.b.subscribe(new OtherObserver(maybeObserver, this.a));
    }
}
