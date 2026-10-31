package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiConsumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class SingleDoOnEvent<T> extends Single<T> {
    public final Single a;
    public final BiConsumer b;

    public final class DoOnEvent implements SingleObserver<T> {
        public final SingleObserver a;

        public DoOnEvent(SingleObserver singleObserver) {
            this.a = singleObserver;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            try {
                SingleDoOnEvent.this.b.accept(null, th);
            } catch (Throwable th2) {
                Exceptions.a(th2);
                th = new CompositeException(th, th2);
            }
            this.a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            this.a.onSubscribe(disposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            SingleObserver singleObserver = this.a;
            try {
                SingleDoOnEvent.this.b.accept(obj, null);
                singleObserver.onSuccess(obj);
            } catch (Throwable th) {
                Exceptions.a(th);
                singleObserver.onError(th);
            }
        }
    }

    public SingleDoOnEvent(Single single, BiConsumer biConsumer) {
        this.a = single;
        this.b = biConsumer;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.a.subscribe(new DoOnEvent(singleObserver));
    }
}
