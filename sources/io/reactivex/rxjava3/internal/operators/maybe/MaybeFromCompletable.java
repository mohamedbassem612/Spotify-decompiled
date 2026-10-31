package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class MaybeFromCompletable<T> extends Maybe<T> {
    public final Completable a;

    public static final class FromCompletableObserver<T> implements CompletableObserver, Disposable {
        public final MaybeObserver a;
        public Disposable b;

        public FromCompletableObserver(MaybeObserver maybeObserver) {
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
    }

    public MaybeFromCompletable(Completable completable) {
        this.a = completable;
    }

    public final void i(MaybeObserver maybeObserver) {
        this.a.subscribe(new FromCompletableObserver(maybeObserver));
    }
}
