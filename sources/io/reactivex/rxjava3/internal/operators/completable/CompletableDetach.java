package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CompletableDetach extends Completable {
    public final CompletableObserveOn a;

    public static final class DetachCompletableObserver implements CompletableObserver, Disposable {
        public CompletableObserver a;
        public Disposable b;

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.a = null;
            this.b.dispose();
            this.b = DisposableHelper.a;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onComplete() {
            this.b = DisposableHelper.a;
            CompletableObserver completableObserver = this.a;
            if (completableObserver != null) {
                this.a = null;
                completableObserver.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            this.b = DisposableHelper.a;
            CompletableObserver completableObserver = this.a;
            if (completableObserver != null) {
                this.a = null;
                completableObserver.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.b, disposable)) {
                this.b = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public CompletableDetach(CompletableObserveOn completableObserveOn) {
        this.a = completableObserveOn;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public final void r(CompletableObserver completableObserver) {
        DetachCompletableObserver detachCompletableObserver = new DetachCompletableObserver();
        detachCompletableObserver.a = completableObserver;
        this.a.subscribe(detachCompletableObserver);
    }
}
