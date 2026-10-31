package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import p.gnc1;
import p.moy0;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableSwitchIfEmpty<T> extends AbstractFlowableWithUpstream<T, T> {
    public final FlowableJust c;

    public static final class SwitchIfEmptySubscriber<T> implements FlowableSubscriber<T> {
        public final gnc1 a;
        public final moy0 b;
        public boolean d = true;
        public final SubscriptionArbiter c = new SubscriptionArbiter(false);

        public SwitchIfEmptySubscriber(gnc1 gnc1Var, FlowableJust flowableJust) {
            this.a = gnc1Var;
            this.b = flowableJust;
        }

        @Override // p.gnc1
        public final void onComplete() {
            if (!this.d) {
                this.a.onComplete();
            } else {
                this.d = false;
                this.b.subscribe(this);
            }
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            if (this.d) {
                this.d = false;
            }
            this.a.onNext(obj);
        }

        @Override // p.gnc1
        public final void onSubscribe(pnc1 pnc1Var) {
            this.c.e(pnc1Var);
        }
    }

    public FlowableSwitchIfEmpty(Flowable flowable, FlowableJust flowableJust) {
        super(flowable);
        this.c = flowableJust;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        SwitchIfEmptySubscriber switchIfEmptySubscriber = new SwitchIfEmptySubscriber(gnc1Var, this.c);
        gnc1Var.onSubscribe(switchIfEmptySubscriber.c);
        this.b.subscribe((FlowableSubscriber) switchIfEmptySubscriber);
    }
}
