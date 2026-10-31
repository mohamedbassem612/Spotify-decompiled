package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class CompletableDelay extends Completable {
    public final Completable a;
    public final long b;
    public final TimeUnit c = TimeUnit.MILLISECONDS;
    public final Scheduler d;

    public static final class Delay extends AtomicReference<Disposable> implements CompletableObserver, Runnable, Disposable {
        public final CompletableObserver a;
        public final long b;
        public final TimeUnit c;
        public final Scheduler d;
        public Throwable e;

        public Delay(CompletableObserver completableObserver, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.a = completableObserver;
            this.b = j;
            this.c = timeUnit;
            this.d = scheduler;
        }

        public void dispose() {
            DisposableHelper.a(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.b(get());
        }

        public final void onComplete() {
            DisposableHelper.c(this, this.d.d(this, this.b, this.c));
        }

        public final void onError(Throwable th) {
            this.e = th;
            DisposableHelper.c(this, this.d.d(this, 0L, this.c));
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.g(this, disposable)) {
                this.a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.e;
            this.e = null;
            CompletableObserver completableObserver = this.a;
            if (th != null) {
                completableObserver.onError(th);
            } else {
                completableObserver.onComplete();
            }
        }
    }

    public CompletableDelay(Completable completable, long j, Scheduler scheduler) {
        this.a = completable;
        this.b = j;
        this.d = scheduler;
    }

    public final void r(CompletableObserver completableObserver) {
        this.a.subscribe(new Delay(completableObserver, this.b, this.c, this.d));
    }
}
