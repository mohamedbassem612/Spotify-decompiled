package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicBoolean;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableConcatMap$SimpleScalarSubscription<T> extends AtomicBoolean implements pnc1 {
    public final gnc1 a;
    public final Object b;

    public FlowableConcatMap$SimpleScalarSubscription(Object obj, gnc1 gnc1Var) {
        this.b = obj;
        this.a = gnc1Var;
    }

    public final void cancel() {
    }

    public final void request(long j) {
        if (j <= 0 || !compareAndSet(false, true)) {
            return;
        }
        Object obj = this.b;
        gnc1 gnc1Var = this.a;
        gnc1Var.onNext(obj);
        gnc1Var.onComplete();
    }
}
