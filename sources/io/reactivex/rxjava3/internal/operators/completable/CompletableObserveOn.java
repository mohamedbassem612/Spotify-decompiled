package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CompletableObserveOn extends Completable {
    public final Completable a;
    public final Scheduler b;

    public static final class ObserveOnCompletableObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Runnable {
        public final CompletableObserver a;
        public final Scheduler b;
        public Throwable c;

        public ObserveOnCompletableObserver(CompletableObserver completableObserver, Scheduler scheduler) {
            this.a = completableObserver;
            this.b = scheduler;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onComplete() {
            DisposableHelper.c(this, this.b.c(this));
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            this.c = th;
            DisposableHelper.c(this, this.b.c(this));
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.g(this, disposable)) {
                this.a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.c;
            CompletableObserver completableObserver = this.a;
            if (th == null) {
                completableObserver.onComplete();
            } else {
                this.c = null;
                completableObserver.onError(th);
            }
        }
    }

    public CompletableObserveOn(Completable completable, Scheduler scheduler) {
        this.a = completable;
        this.b = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public final void r(CompletableObserver completableObserver) {
        this.a.subscribe(new ObserveOnCompletableObserver(completableObserver, this.b));
    }
}
