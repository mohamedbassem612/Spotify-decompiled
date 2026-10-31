package com.spotify.mobius;

import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class b implements Connectable {
    @Override // com.spotify.mobius.Connectable
    public final Connection L(Consumer consumer) {
        b bVar = Mobius.a;
        return new Connection<Object>() { // from class: com.spotify.mobius.Mobius.1
            @Override // com.spotify.mobius.Connection, com.spotify.mobius.functions.Consumer
            public final void accept(Object obj) {
            }

            @Override // com.spotify.mobius.Connection, com.spotify.mobius.disposables.Disposable
            public final void dispose() {
            }
        };
    }
}
