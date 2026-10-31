package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SingleDoOnLifecycle<T> extends Single<T> {
    public final Single a;
    public final Consumer b;
    public final Action c;

    public static final class SingleLifecycleObserver<T> implements SingleObserver<T>, Disposable {
        public final SingleObserver a;
        public final Consumer b;
        public final Action c;
        public Disposable d;

        public SingleLifecycleObserver(SingleObserver singleObserver, Consumer consumer, Action action) {
            this.a = singleObserver;
            this.b = consumer;
            this.c = action;
        }

        public void dispose() {
            try {
                this.c.run();
            } catch (Throwable th) {
                Exceptions.a(th);
                RxJavaPlugins.b(th);
            }
            this.d.dispose();
            this.d = DisposableHelper.a;
        }

        public boolean isDisposed() {
            return this.d.isDisposed();
        }

        public final void onError(Throwable th) {
            DisposableHelper disposableHelper = this.d;
            DisposableHelper disposableHelper2 = DisposableHelper.a;
            if (disposableHelper == disposableHelper2) {
                RxJavaPlugins.b(th);
            } else {
                this.d = disposableHelper2;
                this.a.onError(th);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            SingleObserver singleObserver = this.a;
            try {
                this.b.accept(disposable);
                if (DisposableHelper.h(this.d, disposable)) {
                    this.d = disposable;
                    singleObserver.onSubscribe(this);
                }
            } catch (Throwable th) {
                Exceptions.a(th);
                disposable.dispose();
                this.d = DisposableHelper.a;
                EmptyDisposable.f(th, singleObserver);
            }
        }

        public final void onSuccess(Object obj) {
            DisposableHelper disposableHelper = this.d;
            DisposableHelper disposableHelper2 = DisposableHelper.a;
            if (disposableHelper != disposableHelper2) {
                this.d = disposableHelper2;
                this.a.onSuccess(obj);
            }
        }
    }

    public SingleDoOnLifecycle(Single single, Consumer consumer, Action action) {
        this.a = single;
        this.b = consumer;
        this.c = action;
    }

    public final void subscribeActual(SingleObserver singleObserver) {
        this.a.subscribe(new SingleLifecycleObserver(singleObserver, this.b, this.c));
    }
}
