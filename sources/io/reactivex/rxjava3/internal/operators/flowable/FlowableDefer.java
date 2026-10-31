package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import java.util.Objects;
import p.gnc1;
import p.moy0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableDefer<T> extends Flowable<T> {
    public final Supplier b;

    public FlowableDefer(Supplier supplier) {
        this.b = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        try {
            Object obj = this.b.get();
            Objects.requireNonNull(obj, "The publisher supplied is null");
            ((moy0) obj).subscribe(gnc1Var);
        } catch (Throwable th) {
            Exceptions.a(th);
            gnc1Var.onSubscribe(EmptySubscription.a);
            gnc1Var.onError(th);
        }
    }
}
