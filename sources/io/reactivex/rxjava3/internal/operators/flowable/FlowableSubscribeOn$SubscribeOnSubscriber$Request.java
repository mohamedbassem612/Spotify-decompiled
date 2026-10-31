package io.reactivex.rxjava3.internal.operators.flowable;

import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableSubscribeOn$SubscribeOnSubscriber$Request implements Runnable {
    public final pnc1 a;
    public final long b;

    public FlowableSubscribeOn$SubscribeOnSubscriber$Request(long j, pnc1 pnc1Var) {
        this.a = pnc1Var;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.request(this.b);
    }
}
