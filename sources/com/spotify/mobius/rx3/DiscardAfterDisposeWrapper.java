package com.spotify.mobius.rx3;

import com.spotify.mobius.Connection;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
class DiscardAfterDisposeWrapper<I> implements Consumer<I>, Disposable {
    public final Consumer a;
    public final Disposable b;
    public volatile boolean c;

    public DiscardAfterDisposeWrapper(Consumer consumer, Connection connection) {
        this.a = consumer;
        this.b = connection;
    }

    @Override // com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        if (this.c) {
            return;
        }
        this.a.accept(obj);
    }

    @Override // com.spotify.mobius.disposables.Disposable
    public final void dispose() {
        this.c = true;
        Disposable disposable = this.b;
        if (disposable != null) {
            disposable.dispose();
        }
    }
}
