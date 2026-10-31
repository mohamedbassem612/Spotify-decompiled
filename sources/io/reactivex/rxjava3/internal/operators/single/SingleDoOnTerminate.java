package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SingleDoOnTerminate<T> extends Single<T> {
    public final Single a;
    public final Action b;

    public final class DoOnTerminate implements SingleObserver<T> {
        public final SingleObserver a;

        public DoOnTerminate(SingleObserver singleObserver) {
            this.a = singleObserver;
        }

        public final void onError(Throwable th) {
            try {
                SingleDoOnTerminate.this.b.run();
            } catch (Throwable th2) {
                Exceptions.a(th2);
                th = new CompositeException(new Throwable[]{th, th2});
            }
            this.a.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            this.a.onSubscribe(disposable);
        }

        public final void onSuccess(Object obj) {
            SingleObserver singleObserver = this.a;
            try {
                SingleDoOnTerminate.this.b.run();
                singleObserver.onSuccess(obj);
            } catch (Throwable th) {
                Exceptions.a(th);
                singleObserver.onError(th);
            }
        }
    }

    public SingleDoOnTerminate(Single single, Action action) {
        this.a = single;
        this.b = action;
    }

    public final void subscribeActual(SingleObserver singleObserver) {
        this.a.subscribe(new DoOnTerminate(singleObserver));
    }
}
