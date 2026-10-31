package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import p.moy0;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SingleFromPublisher<T> extends Single<T> {
    public final moy0 a;

    public static final class ToSingleObserver<T> implements FlowableSubscriber<T>, Disposable {
        public final SingleObserver a;
        public pnc1 b;
        public Object c;
        public boolean d;
        public volatile boolean e;

        public ToSingleObserver(SingleObserver singleObserver) {
            this.a = singleObserver;
        }

        public void dispose() {
            this.e = true;
            this.b.cancel();
        }

        public boolean isDisposed() {
            return this.e;
        }

        public final void onComplete() {
            if (this.d) {
                return;
            }
            this.d = true;
            Object obj = this.c;
            this.c = null;
            SingleObserver singleObserver = this.a;
            if (obj == null) {
                singleObserver.onError(new NoSuchElementException("The source Publisher is empty"));
            } else {
                singleObserver.onSuccess(obj);
            }
        }

        public final void onError(Throwable th) {
            if (this.d) {
                RxJavaPlugins.b(th);
                return;
            }
            this.d = true;
            this.c = null;
            this.a.onError(th);
        }

        public final void onNext(Object obj) {
            if (this.d) {
                return;
            }
            if (this.c == null) {
                this.c = obj;
                return;
            }
            this.b.cancel();
            this.d = true;
            this.c = null;
            this.a.onError(new IndexOutOfBoundsException("Too many elements in the Publisher"));
        }

        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.b, pnc1Var)) {
                this.b = pnc1Var;
                this.a.onSubscribe(this);
                pnc1Var.request(Long.MAX_VALUE);
            }
        }
    }

    public SingleFromPublisher(moy0 moy0Var) {
        this.a = moy0Var;
    }

    public final void subscribeActual(SingleObserver singleObserver) {
        this.a.subscribe(new ToSingleObserver(singleObserver));
    }
}
