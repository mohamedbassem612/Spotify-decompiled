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
public final class FlowableSingle<T> extends AbstractFlowableWithUpstream<T, T> {
    public final boolean c;

    public static final class SingleElementSubscriber<T> extends DeferredScalarSubscription<T> implements FlowableSubscriber<T> {
        public final boolean c;
        public pnc1 d;
        public boolean e;

        public SingleElementSubscriber(gnc1 gnc1Var, boolean z) {
            super(gnc1Var);
            this.c = z;
        }

        public final void cancel() {
            super.cancel();
            this.d.cancel();
        }

        public final void onComplete() {
            if (this.e) {
                return;
            }
            this.e = true;
            Object obj = ((DeferredScalarSubscription) this).b;
            ((DeferredScalarSubscription) this).b = null;
            if (obj == null) {
                obj = null;
            }
            if (obj != null) {
                b(obj);
                return;
            }
            boolean z = this.c;
            gnc1 gnc1Var = ((DeferredScalarSubscription) this).a;
            if (z) {
                gnc1Var.onError(new NoSuchElementException());
            } else {
                gnc1Var.onComplete();
            }
        }

        public final void onError(Throwable th) {
            if (this.e) {
                RxJavaPlugins.b(th);
            } else {
                this.e = true;
                ((DeferredScalarSubscription) this).a.onError(th);
            }
        }

        public final void onNext(Object obj) {
            if (this.e) {
                return;
            }
            if (((DeferredScalarSubscription) this).b == null) {
                ((DeferredScalarSubscription) this).b = obj;
                return;
            }
            this.e = true;
            this.d.cancel();
            ((DeferredScalarSubscription) this).a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.d, pnc1Var)) {
                this.d = pnc1Var;
                ((DeferredScalarSubscription) this).a.onSubscribe(this);
                pnc1Var.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableSingle(Flowable flowable, boolean z) {
        super(flowable);
        this.c = z;
    }

    public final void V(gnc1 gnc1Var) {
        ((AbstractFlowableWithUpstream) this).b.subscribe(new SingleElementSubscriber(gnc1Var, this.c));
    }
}
