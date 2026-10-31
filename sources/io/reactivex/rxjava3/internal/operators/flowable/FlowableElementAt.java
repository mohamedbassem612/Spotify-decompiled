package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableElementAt<T> extends AbstractFlowableWithUpstream<T, T> {
    public final Object c;
    public final boolean d;

    public static final class ElementAtSubscriber<T> extends DeferredScalarSubscription<T> implements FlowableSubscriber<T> {
        public final Object c;
        public final boolean d;
        public pnc1 e;
        public long f;
        public boolean g;

        public ElementAtSubscriber(gnc1 gnc1Var, Object obj, boolean z) {
            super(gnc1Var);
            this.c = obj;
            this.d = z;
        }

        public final void cancel() {
            super.cancel();
            this.e.cancel();
        }

        public final void onComplete() {
            if (this.g) {
                return;
            }
            this.g = true;
            Object obj = this.c;
            if (obj != null) {
                b(obj);
                return;
            }
            boolean z = this.d;
            gnc1 gnc1Var = ((DeferredScalarSubscription) this).a;
            if (z) {
                gnc1Var.onError(new NoSuchElementException());
            } else {
                gnc1Var.onComplete();
            }
        }

        public final void onError(Throwable th) {
            if (this.g) {
                RxJavaPlugins.b(th);
            } else {
                this.g = true;
                ((DeferredScalarSubscription) this).a.onError(th);
            }
        }

        public final void onNext(Object obj) {
            if (this.g) {
                return;
            }
            long j = this.f;
            if (j != 0) {
                this.f = j + 1;
                return;
            }
            this.g = true;
            this.e.cancel();
            b(obj);
        }

        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.e, pnc1Var)) {
                this.e = pnc1Var;
                ((DeferredScalarSubscription) this).a.onSubscribe(this);
                pnc1Var.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableElementAt(Flowable flowable, Object obj, boolean z) {
        super(flowable);
        this.c = obj;
        this.d = z;
    }

    public final void V(gnc1 gnc1Var) {
        ((AbstractFlowableWithUpstream) this).b.subscribe(new ElementAtSubscriber(gnc1Var, this.c, this.d));
    }
}
