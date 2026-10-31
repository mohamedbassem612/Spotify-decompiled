package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableSkip<T> extends AbstractFlowableWithUpstream<T, T> {
    public final boolean c;

    public static final class SkipSubscriber<T> implements FlowableSubscriber<T>, pnc1 {
        public final gnc1 a;
        public long b;
        public pnc1 c;

        public SkipSubscriber(gnc1 gnc1Var, long j) {
            this.a = gnc1Var;
            this.b = j;
        }

        @Override // p.pnc1
        public final void cancel() {
            this.c.cancel();
        }

        @Override // p.gnc1
        public final void onComplete() {
            this.a.onComplete();
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            long j = this.b;
            if (j != 0) {
                this.b = j - 1;
            } else {
                this.a.onNext(obj);
            }
        }

        @Override // p.gnc1
        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.c, pnc1Var)) {
                long j = this.b;
                this.c = pnc1Var;
                this.a.onSubscribe(this);
                pnc1Var.request(j);
            }
        }

        @Override // p.pnc1
        public final void request(long j) {
            this.c.request(j);
        }
    }

    public FlowableSkip(Flowable flowable) {
        super(flowable);
        this.c = true;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        this.b.subscribe((FlowableSubscriber) new SkipSubscriber(gnc1Var, this.c ? 1L : 0L));
    }
}
