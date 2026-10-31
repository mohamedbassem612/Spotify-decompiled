package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.subscriptions.ScalarSubscription;
import io.reactivex.rxjava3.operators.ScalarSupplier;
import p.gnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableJust<T> extends Flowable<T> implements ScalarSupplier<T> {
    public final Object b;

    public FlowableJust(Object obj) {
        this.b = obj;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        gnc1Var.onSubscribe(new ScalarSubscription(this.b, gnc1Var));
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        return this.b;
    }
}
