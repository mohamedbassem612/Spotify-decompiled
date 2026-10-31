package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SingleDoOnDispose<T> extends Single<T> {
    public final Single a;
    public final Action b;

    public static final class DoOnDisposeObserver<T> extends AtomicReference<Action> implements SingleObserver<T>, Disposable {
        public final SingleObserver a;
        public Disposable b;

        public DoOnDisposeObserver(SingleObserver singleObserver, Action action) {
            this.a = singleObserver;
            lazySet(action);
        }

        public void dispose() {
            Action andSet = getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.run();
                } catch (Throwable th) {
                    Exceptions.a(th);
                    RxJavaPlugins.b(th);
                }
                this.b.dispose();
            }
        }

        public boolean isDisposed() {
            return this.b.isDisposed();
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.b, disposable)) {
                this.b = disposable;
                this.a.onSubscribe(this);
            }
        }

        public final void onSuccess(Object obj) {
            this.a.onSuccess(obj);
        }
    }

    public SingleDoOnDispose(Single single, Action action) {
        this.a = single;
        this.b = action;
    }

    public final void subscribeActual(SingleObserver singleObserver) {
        this.a.subscribe(new DoOnDisposeObserver(singleObserver, this.b));
    }
}
