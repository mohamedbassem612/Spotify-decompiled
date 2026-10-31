package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.gnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableOnBackpressureLatest<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class BackpressureLatestSubscriber<T> extends AbstractBackpressureThrottlingSubscriber<T, T> {
        @Override // p.gnc1
        public final void onNext(Object obj) {
            this.g.lazySet(obj);
            b();
        }
    }

    public FlowableOnBackpressureLatest(Flowable flowable) {
        super(flowable);
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        this.b.subscribe((FlowableSubscriber) new BackpressureLatestSubscriber(gnc1Var));
    }
}
