package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import p.gnc1;
import p.moy0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableFromPublisher<T> extends Flowable<T> {
    public final moy0 b;

    public FlowableFromPublisher(moy0 moy0Var) {
        this.b = moy0Var;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        this.b.subscribe(gnc1Var);
    }
}
