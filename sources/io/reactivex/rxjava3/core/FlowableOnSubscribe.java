package io.reactivex.rxjava3.core;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@FunctionalInterface
public interface FlowableOnSubscribe<T> {
    void subscribe(FlowableEmitter<T> flowableEmitter);
}
