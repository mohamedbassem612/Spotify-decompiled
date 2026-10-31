package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiPredicate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SingleContains<T> extends Single<Boolean> {
    public final Single a;
    public final Object b;
    public final BiPredicate c;

    public final class ContainsSingleObserver implements SingleObserver<T> {
        public final SingleObserver a;

        public ContainsSingleObserver(SingleObserver singleObserver) {
            this.a = singleObserver;
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            this.a.onSubscribe(disposable);
        }

        public final void onSuccess(Object obj) {
            SingleObserver singleObserver = this.a;
            try {
                SingleContains singleContains = SingleContains.this;
                singleObserver.onSuccess(Boolean.valueOf(singleContains.c.test(obj, singleContains.b)));
            } catch (Throwable th) {
                Exceptions.a(th);
                singleObserver.onError(th);
            }
        }
    }

    public SingleContains(Single single, Object obj, BiPredicate biPredicate) {
        this.a = single;
        this.b = obj;
        this.c = biPredicate;
    }

    public final void subscribeActual(SingleObserver singleObserver) {
        this.a.subscribe(new ContainsSingleObserver(singleObserver));
    }
}
