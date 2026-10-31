package com.spotify.mobius;

import com.spotify.mobius.disposables.CompositeDisposable;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.internal_util.Preconditions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
class DiscardAfterDisposeConnectable<I, O> implements Connectable<I, O> {
    public final Connectable a;

    public DiscardAfterDisposeConnectable(Connectable connectable) {
        Preconditions.b(connectable);
        this.a = connectable;
    }

    @Override // com.spotify.mobius.Connectable
    public final Connection L(Consumer consumer) {
        Preconditions.b(consumer);
        DiscardAfterDisposeWrapper discardAfterDisposeWrapper = new DiscardAfterDisposeWrapper(consumer, null);
        Connection connectionL = this.a.L(discardAfterDisposeWrapper);
        Preconditions.b(connectionL);
        final DiscardAfterDisposeWrapper discardAfterDisposeWrapper2 = new DiscardAfterDisposeWrapper(connectionL, connectionL);
        final CompositeDisposable compositeDisposable = new CompositeDisposable(new Disposable[]{discardAfterDisposeWrapper2, discardAfterDisposeWrapper});
        return new Connection<Object>() { // from class: com.spotify.mobius.DiscardAfterDisposeConnectable.1
            @Override // com.spotify.mobius.Connection, com.spotify.mobius.functions.Consumer
            public final void accept(Object obj) {
                discardAfterDisposeWrapper2.accept(obj);
            }

            @Override // com.spotify.mobius.Connection, com.spotify.mobius.disposables.Disposable
            public final void dispose() {
                compositeDisposable.dispose();
            }
        };
    }
}
