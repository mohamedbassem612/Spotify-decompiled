package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.gnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class FlowableProcessor<T> extends Flowable<T> implements gnc1, FlowableSubscriber<T> {
    public final FlowableProcessor d0() {
        return this instanceof SerializedProcessor ? this : new SerializedProcessor((UnicastProcessor) this);
    }
}
