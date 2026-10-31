package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import p.gnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableCreate$ErrorAsyncEmitter<T> extends FlowableCreate$NoOverflowBaseAsyncEmitter<T> {
    public FlowableCreate$ErrorAsyncEmitter(gnc1 gnc1Var) {
        super(gnc1Var);
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate$NoOverflowBaseAsyncEmitter
    public final void f() {
        onError(new MissingBackpressureException("create: could not emit value due to lack of requests"));
    }
}
