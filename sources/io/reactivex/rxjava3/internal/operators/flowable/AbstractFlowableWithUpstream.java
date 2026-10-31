package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
abstract class AbstractFlowableWithUpstream<T, R> extends Flowable<R> {
    public final Flowable b;

    public AbstractFlowableWithUpstream(Flowable flowable) {
        Objects.requireNonNull(flowable, "source is null");
        this.b = flowable;
    }
}
