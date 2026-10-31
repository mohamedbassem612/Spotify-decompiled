package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableOnSubscribe;
import io.reactivex.rxjava3.exceptions.Exceptions;
import p.gnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableCreate<T> extends Flowable<T> {
    public final FlowableOnSubscribe b;
    public final BackpressureStrategy c;

    public FlowableCreate(FlowableOnSubscribe flowableOnSubscribe, BackpressureStrategy backpressureStrategy) {
        this.b = flowableOnSubscribe;
        this.c = backpressureStrategy;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        BufferAsyncEmitter missingEmitter;
        int iOrdinal = this.c.ordinal();
        if (iOrdinal == 0) {
            missingEmitter = new MissingEmitter(gnc1Var);
        } else if (iOrdinal == 1) {
            missingEmitter = new ErrorAsyncEmitter(gnc1Var);
        } else if (iOrdinal != 3) {
            missingEmitter = iOrdinal != 4 ? new BufferAsyncEmitter(gnc1Var, Flowable.a) : new LatestAsyncEmitter(gnc1Var);
        } else {
            missingEmitter = new DropAsyncEmitter(gnc1Var);
        }
        gnc1Var.onSubscribe(missingEmitter);
        try {
            this.b.subscribe(missingEmitter);
        } catch (Throwable th) {
            Exceptions.a(th);
            missingEmitter.onError(th);
        }
    }
}
