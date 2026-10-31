package io.reactivex.rxjava3.operators;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface SimpleQueue<T> {
    void clear();

    boolean isEmpty();

    boolean offer(Object obj);

    Object poll();
}
