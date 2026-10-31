package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SingleDoAfterSuccess<T> extends Single<T> {
    public final Single a;
    public final Consumer b;

    public static final class DoAfterObserver<T> implements SingleObserver<T>, Disposable {
        public final SingleObserver a;
        public final Consumer b;
        public Disposable c;

        public DoAfterObserver(SingleObserver singleObserver, Consumer consumer) {
            this.a = singleObserver;
            this.b = consumer;
        }

        public void dispose() {
            this.c.dispose();
        }

        public boolean isDisposed() {
            return this.c.isDisposed();
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.c, disposable)) {
                this.c = disposable;
                this.a.onSubscribe(this);
            }
        }

        public final void onSuccess(Object obj) {
            this.a.onSuccess(obj);
            try {
                this.b.accept(obj);
            } catch (Throwable th) {
                Exceptions.a(th);
                RxJavaPlugins.b(th);
            }
        }
    }

    public SingleDoAfterSuccess(Single single, Consumer consumer) {
        this.a = single;
        this.b = consumer;
    }

    public final void subscribeActual(SingleObserver singleObserver) {
        this.a.subscribe(new DoAfterObserver(singleObserver, this.b));
    }
}
