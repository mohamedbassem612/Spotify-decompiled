package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.rxjava3.processors.FlowableProcessor;
import io.reactivex.rxjava3.subscribers.SerializedSubscriber;
import java.io.Serializable;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class FlowableRepeatWhen$WhenSourceSubscriber<T, U> extends SubscriptionArbiter implements FlowableSubscriber<T> {
    public final pnc1 X;
    public long Y;
    public final SerializedSubscriber i;
    public final FlowableProcessor t;

    public FlowableRepeatWhen$WhenSourceSubscriber(SerializedSubscriber serializedSubscriber, FlowableProcessor flowableProcessor, pnc1 pnc1Var) {
        super(false);
        this.i = serializedSubscriber;
        this.t = flowableProcessor;
        this.X = pnc1Var;
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter, p.pnc1
    public final void cancel() {
        super.cancel();
        ((FlowableRepeatWhen$WhenReceiver) this.X).cancel();
    }

    public final void g(Serializable serializable) {
        e(EmptySubscription.a);
        long j = this.Y;
        if (j != 0) {
            this.Y = 0L;
            d(j);
        }
        ((FlowableRepeatWhen$WhenReceiver) this.X).request(1L);
        this.t.onNext(serializable);
    }

    @Override // p.gnc1
    public void onError(Throwable th) {
        g(th);
    }

    @Override // p.gnc1
    public final void onNext(Object obj) {
        this.Y++;
        this.i.onNext(obj);
    }
}
