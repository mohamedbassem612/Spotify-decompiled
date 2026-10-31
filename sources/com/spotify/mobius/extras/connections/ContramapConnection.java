package com.spotify.mobius.extras.connections;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public class ContramapConnection<A, B, C> implements Connection<B> {
    public final Function a;
    public final Connection b;

    public ContramapConnection(Function function, Connectable connectable, Consumer consumer) {
        this.a = function;
        this.b = connectable.L(consumer);
    }

    public final void accept(Object obj) {
        this.b.accept(this.a.apply(obj));
    }

    public final void dispose() {
        this.b.dispose();
    }
}
