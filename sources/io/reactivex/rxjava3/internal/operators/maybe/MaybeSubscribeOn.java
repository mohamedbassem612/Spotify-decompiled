package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class MaybeSubscribeOn<T> extends AbstractMaybeWithUpstream<T, T> {
    public final Scheduler b;

    public static final class SubscribeOnMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {
        public final SequentialDisposable a = new SequentialDisposable();
        public final MaybeObserver b;

        public SubscribeOnMaybeObserver(MaybeObserver maybeObserver) {
            this.b = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.a(this);
            this.a.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onComplete() {
            this.b.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            this.b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.g(this, disposable);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            this.b.onSuccess(obj);
        }
    }

    public static final class SubscribeTask<T> implements Runnable {
        public final MaybeObserver a;
        public final MaybeSource b;

        public SubscribeTask(MaybeObserver maybeObserver, MaybeSource maybeSource) {
            this.a = maybeObserver;
            this.b = maybeSource;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.b.subscribe(this.a);
        }
    }

    public MaybeSubscribeOn(Maybe maybe, Scheduler scheduler) {
        super(maybe);
        this.b = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public final void i(MaybeObserver maybeObserver) {
        SubscribeOnMaybeObserver subscribeOnMaybeObserver = new SubscribeOnMaybeObserver(maybeObserver);
        maybeObserver.onSubscribe(subscribeOnMaybeObserver);
        DisposableHelper.c(subscribeOnMaybeObserver.a, this.b.c(new SubscribeTask(subscribeOnMaybeObserver, this.a)));
    }
}
