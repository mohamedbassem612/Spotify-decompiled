package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.operators.ScalarSupplier;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class FlowableEmpty extends Flowable<Object> implements ScalarSupplier<Object> {
    public static final FlowableEmpty b = new FlowableEmpty();

    private FlowableEmpty() {
    }

    public final Object get() {
        return null;
    }
}
