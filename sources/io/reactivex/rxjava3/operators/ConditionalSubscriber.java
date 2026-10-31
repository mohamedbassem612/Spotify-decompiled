package io.reactivex.rxjava3.operators;

import io.reactivex.rxjava3.core.FlowableSubscriber;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface ConditionalSubscriber<T> extends FlowableSubscriber<T> {
    boolean f(Object obj);
}
