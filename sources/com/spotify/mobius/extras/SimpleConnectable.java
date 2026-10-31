package com.spotify.mobius.extras;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class SimpleConnectable<T, R> implements Connectable<T, R> {
    public final Function a;

    public SimpleConnectable(Function function) {
        this.a = function;
    }

    public final Connection L(Consumer consumer) {
        return (Connection) ((Connectables.AnonymousClass1) this.a).apply(consumer);
    }
}
