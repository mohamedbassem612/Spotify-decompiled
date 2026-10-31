package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.fuseable.FuseToFlowable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableElementAtSingle<T> extends Single<T> implements FuseToFlowable<T> {
    public final Flowable a;
    public final Object b;

    public static final class ElementAtSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        public final SingleObserver a;
        public final Object b;
        public pnc1 c;
        public long d;
        public boolean e;

        public ElementAtSubscriber(SingleObserver singleObserver, Object obj) {
            this.a = singleObserver;
            this.b = obj;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.c.cancel();
            this.c = SubscriptionHelper.a;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.c == SubscriptionHelper.a;
        }

        @Override // p.gnc1
        public final void onComplete() {
            this.c = SubscriptionHelper.a;
            if (this.e) {
                return;
            }
            this.e = true;
            Object obj = this.b;
            SingleObserver singleObserver = this.a;
            if (obj != null) {
                singleObserver.onSuccess(obj);
            } else {
                singleObserver.onError(new NoSuchElementException());
            }
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            if (this.e) {
                RxJavaPlugins.b(th);
                return;
            }
            this.e = true;
            this.c = SubscriptionHelper.a;
            this.a.onError(th);
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            if (this.e) {
                return;
            }
            long j = this.d;
            if (j != 0) {
                this.d = j + 1;
                return;
            }
            this.e = true;
            this.c.cancel();
            this.c = SubscriptionHelper.a;
            this.a.onSuccess(obj);
        }

        @Override // p.gnc1
        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.c, pnc1Var)) {
                this.c = pnc1Var;
                this.a.onSubscribe(this);
                pnc1Var.request(1L);
            }
        }
    }

    public FlowableElementAtSingle(Flowable flowable, Object obj) {
        this.a = flowable;
        this.b = obj;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.FuseToFlowable
    public final Flowable b() {
        return new FlowableElementAt(this.a, this.b, true);
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.a.subscribe((FlowableSubscriber) new ElementAtSubscriber(singleObserver, this.b));
    }
}
