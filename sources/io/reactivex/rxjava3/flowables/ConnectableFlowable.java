package io.reactivex.rxjava3.flowables;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class ConnectableFlowable<T> extends Flowable<T> {
    public abstract void d0(Consumer consumer);

    public abstract void e0();
}
