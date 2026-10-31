package com.spotify.mobius;

import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
class EventSourceConnectable<M, E> implements Connectable<M, E> {
    public final EventSource a;

    public EventSourceConnectable(EventSource eventSource) {
        this.a = eventSource;
    }

    @Override // com.spotify.mobius.Connectable
    public final Connection L(Consumer consumer) {
        final Disposable disposableA = this.a.a(consumer);
        return new Connection<Object>() { // from class: com.spotify.mobius.EventSourceConnectable.1
            @Override // com.spotify.mobius.Connection, com.spotify.mobius.functions.Consumer
            public final synchronized void accept(Object obj) {
            }

            @Override // com.spotify.mobius.Connection, com.spotify.mobius.disposables.Disposable
            public final synchronized void dispose() {
                disposableA.dispose();
            }
        };
    }
}
