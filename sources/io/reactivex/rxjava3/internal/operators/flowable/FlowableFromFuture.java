package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p.gnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableFromFuture<T> extends Flowable<T> {
    public final Future b;
    public final long c;
    public final TimeUnit d;

    public FlowableFromFuture(Future future, long j, TimeUnit timeUnit) {
        this.b = future;
        this.c = j;
        this.d = timeUnit;
    }

    public final void V(gnc1 gnc1Var) {
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(gnc1Var);
        gnc1Var.onSubscribe(deferredScalarSubscription);
        try {
            TimeUnit timeUnit = this.d;
            Future future = this.b;
            Object obj = timeUnit != null ? future.get(this.c, timeUnit) : future.get();
            if (obj == null) {
                gnc1Var.onError(ExceptionHelper.b("The future returned a null value."));
            } else {
                deferredScalarSubscription.b(obj);
            }
        } catch (Throwable th) {
            Exceptions.a(th);
            if (deferredScalarSubscription.get() == 4) {
                return;
            }
            gnc1Var.onError(th);
        }
    }
}
