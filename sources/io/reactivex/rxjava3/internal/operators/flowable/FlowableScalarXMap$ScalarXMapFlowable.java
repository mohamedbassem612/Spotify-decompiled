package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.ScalarSubscription;
import java.util.Objects;
import p.gnc1;
import p.moy0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableScalarXMap$ScalarXMapFlowable<T, R> extends Flowable<R> {
    public final Object b;
    public final Function c;

    public FlowableScalarXMap$ScalarXMapFlowable(Object obj, Function function) {
        this.b = obj;
        this.c = function;
    }

    public final void V(gnc1 gnc1Var) {
        EmptySubscription emptySubscription = EmptySubscription.a;
        try {
            Object objApply = this.c.apply(this.b);
            Objects.requireNonNull(objApply, "The mapper returned a null Publisher");
            Supplier supplier = (moy0) objApply;
            if (!(supplier instanceof Supplier)) {
                supplier.subscribe(gnc1Var);
                return;
            }
            try {
                Object obj = supplier.get();
                if (obj != null) {
                    gnc1Var.onSubscribe(new ScalarSubscription(obj, gnc1Var));
                } else {
                    gnc1Var.onSubscribe(emptySubscription);
                    gnc1Var.onComplete();
                }
            } catch (Throwable th) {
                Exceptions.a(th);
                gnc1Var.onSubscribe(emptySubscription);
                gnc1Var.onError(th);
            }
        } catch (Throwable th2) {
            Exceptions.a(th2);
            gnc1Var.onSubscribe(emptySubscription);
            gnc1Var.onError(th2);
        }
    }
}
