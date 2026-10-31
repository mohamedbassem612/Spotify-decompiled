package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.Callable;
import p.gnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableFromCallable<T> extends Flowable<T> implements Supplier<T> {
    public final Callable b;

    public FlowableFromCallable(Callable callable) {
        this.b = callable;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(gnc1Var);
        gnc1Var.onSubscribe(deferredScalarSubscription);
        try {
            Object objCall = this.b.call();
            Objects.requireNonNull(objCall, "The callable returned a null value");
            deferredScalarSubscription.b(objCall);
        } catch (Throwable th) {
            Exceptions.a(th);
            if (deferredScalarSubscription.get() == 4) {
                RxJavaPlugins.b(th);
            } else {
                gnc1Var.onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() throws Exception {
        Object objCall = this.b.call();
        Objects.requireNonNull(objCall, "The callable returned a null value");
        return objCall;
    }
}
