package io.reactivex.rxjava3.internal.functions;

import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Functions$ActionConsumer<T> implements Consumer<T> {
    public final Action a;

    public Functions$ActionConsumer(Action action) {
        this.a = action;
    }

    public final void accept(Object obj) {
        this.a.run();
    }
}
