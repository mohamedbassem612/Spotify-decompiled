package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.operators.QueueSubscription;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableIgnoreElements<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class IgnoreElementsSubscriber<T> implements FlowableSubscriber<T>, QueueSubscription<T> {
        public final gnc1 a;
        public pnc1 b;

        public IgnoreElementsSubscriber(gnc1 gnc1Var) {
            this.a = gnc1Var;
        }

        public final int a(int i) {
            return 2;
        }

        public final void cancel() {
            this.b.cancel();
        }

        public final void clear() {
        }

        public final boolean isEmpty() {
            return true;
        }

        public final boolean offer(Object obj) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        public final void onComplete() {
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onNext(Object obj) {
        }

        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.b, pnc1Var)) {
                this.b = pnc1Var;
                this.a.onSubscribe(this);
                pnc1Var.request(Long.MAX_VALUE);
            }
        }

        public final Object poll() {
            return null;
        }

        public final void request(long j) {
        }
    }

    public FlowableIgnoreElements(Flowable flowable) {
        super(flowable);
    }

    public final void V(gnc1 gnc1Var) {
        ((AbstractFlowableWithUpstream) this).b.subscribe(new IgnoreElementsSubscriber(gnc1Var));
    }
}
