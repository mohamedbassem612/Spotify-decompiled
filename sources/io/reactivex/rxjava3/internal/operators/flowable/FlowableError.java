package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import p.gnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableError<T> extends Flowable<T> {
    public final Supplier b;

    public FlowableError(Supplier supplier) {
        this.b = supplier;
    }

    public final void V(gnc1 gnc1Var) {
        try {
            Object obj = this.b.get();
            if (obj == null) {
                throw ExceptionHelper.b("Callable returned a null Throwable.");
            }
            Throwable th = ExceptionHelper.a;
            th = (Throwable) obj;
            gnc1Var.onSubscribe(EmptySubscription.a);
            gnc1Var.onError(th);
        } catch (Throwable th2) {
            th = th2;
            Exceptions.a(th);
        }
    }
}
