package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableOnErrorComplete<T> extends AbstractFlowableWithUpstream<T, T> {
    public final Predicate c;

    public static final class OnErrorCompleteSubscriber<T> implements FlowableSubscriber<T>, pnc1 {
        public final gnc1 a;
        public final Predicate b;
        public pnc1 c;

        public OnErrorCompleteSubscriber(gnc1 gnc1Var, Predicate predicate) {
            this.a = gnc1Var;
            this.b = predicate;
        }

        public final void cancel() {
            this.c.cancel();
        }

        public final void onComplete() {
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            gnc1 gnc1Var = this.a;
            try {
                if (this.b.test(th)) {
                    gnc1Var.onComplete();
                } else {
                    gnc1Var.onError(th);
                }
            } catch (Throwable th2) {
                Exceptions.a(th2);
                gnc1Var.onError(new CompositeException(new Throwable[]{th, th2}));
            }
        }

        public final void onNext(Object obj) {
            this.a.onNext(obj);
        }

        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.c, pnc1Var)) {
                this.c = pnc1Var;
                this.a.onSubscribe(this);
            }
        }

        public final void request(long j) {
            this.c.request(j);
        }
    }

    public FlowableOnErrorComplete(Flowable flowable, Predicate predicate) {
        super(flowable);
        this.c = predicate;
    }

    public final void V(gnc1 gnc1Var) {
        ((AbstractFlowableWithUpstream) this).b.subscribe(new OnErrorCompleteSubscriber(gnc1Var, this.c));
    }
}
