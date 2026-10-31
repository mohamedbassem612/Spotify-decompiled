package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class SingleOnErrorReturn<T> extends Single<T> {
    public final Single a;
    public final Function b;
    public final Object c;

    public final class OnErrorReturn implements SingleObserver<T> {
        public final SingleObserver a;

        public OnErrorReturn(SingleObserver singleObserver) {
            this.a = singleObserver;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            Object objApply;
            SingleOnErrorReturn singleOnErrorReturn = SingleOnErrorReturn.this;
            Function function = singleOnErrorReturn.b;
            SingleObserver singleObserver = this.a;
            if (function != null) {
                try {
                    objApply = function.apply(th);
                } catch (Throwable th2) {
                    Exceptions.a(th2);
                    singleObserver.onError(new CompositeException(th, th2));
                    return;
                }
            } else {
                objApply = singleOnErrorReturn.c;
            }
            if (objApply != null) {
                singleObserver.onSuccess(objApply);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
            nullPointerException.initCause(th);
            singleObserver.onError(nullPointerException);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            this.a.onSubscribe(disposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            this.a.onSuccess(obj);
        }
    }

    public SingleOnErrorReturn(Single single, Function function, Object obj) {
        this.a = single;
        this.b = function;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.a.subscribe(new OnErrorReturn(singleObserver));
    }
}
