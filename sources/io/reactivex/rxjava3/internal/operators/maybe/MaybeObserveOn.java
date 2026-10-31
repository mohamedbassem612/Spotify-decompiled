package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class MaybeObserveOn<T> extends AbstractMaybeWithUpstream<T, T> {
    public final Scheduler b;

    public static final class ObserveOnMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable, Runnable {
        public final MaybeObserver a;
        public final Scheduler b;
        public Object c;
        public Throwable d;

        public ObserveOnMaybeObserver(MaybeObserver maybeObserver, Scheduler scheduler) {
            this.a = maybeObserver;
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

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onComplete() {
            DisposableHelper.c(this, this.b.c(this));
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            this.d = th;
            DisposableHelper.c(this, this.b.c(this));
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.g(this, disposable)) {
                this.a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            this.c = obj;
            DisposableHelper.c(this, this.b.c(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.d;
            MaybeObserver maybeObserver = this.a;
            if (th != null) {
                this.d = null;
                maybeObserver.onError(th);
                return;
            }
            Object obj = this.c;
            if (obj == null) {
                maybeObserver.onComplete();
            } else {
                this.c = null;
                maybeObserver.onSuccess(obj);
            }
        }
    }

    public MaybeObserveOn(Maybe maybe, Scheduler scheduler) {
        super(maybe);
        this.b = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public final void i(MaybeObserver maybeObserver) {
        this.a.subscribe(new ObserveOnMaybeObserver(maybeObserver, this.b));
    }
}
