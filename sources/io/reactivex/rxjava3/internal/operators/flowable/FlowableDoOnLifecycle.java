package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.LongConsumer;
import p.gnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableDoOnLifecycle<T> extends AbstractFlowableWithUpstream<T, T> {
    public final Consumer c;
    public final LongConsumer d;
    public final Action e;

    public FlowableDoOnLifecycle(Flowable flowable, Consumer consumer, LongConsumer longConsumer, Action action) {
        super(flowable);
        this.c = consumer;
        this.d = longConsumer;
        this.e = action;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        this.b.subscribe((FlowableSubscriber) new SubscriptionLambdaSubscriber<>(gnc1Var, this.c, this.d, this.e));
    }
}
