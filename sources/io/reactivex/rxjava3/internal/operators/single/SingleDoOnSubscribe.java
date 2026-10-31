package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class SingleDoOnSubscribe<T> extends Single<T> {
    public final Single a;
    public final Consumer b;

    public static final class DoOnSubscribeSingleObserver<T> implements SingleObserver<T> {
        public final SingleObserver a;
        public final Consumer b;
        public boolean c;

        public DoOnSubscribeSingleObserver(SingleObserver singleObserver, Consumer consumer) {
            this.a = singleObserver;
            this.b = consumer;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            if (this.c) {
                RxJavaPlugins.b(th);
            } else {
                this.a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            SingleObserver singleObserver = this.a;
            try {
                this.b.accept(disposable);
                singleObserver.onSubscribe(disposable);
            } catch (Throwable th) {
                Exceptions.a(th);
                this.c = true;
                disposable.dispose();
                EmptyDisposable.f(th, singleObserver);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            if (this.c) {
                return;
            }
            this.a.onSuccess(obj);
        }
    }

    public SingleDoOnSubscribe(Single single, Consumer consumer) {
        this.a = single;
        this.b = consumer;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.a.subscribe(new DoOnSubscribeSingleObserver(singleObserver, this.b));
    }
}
