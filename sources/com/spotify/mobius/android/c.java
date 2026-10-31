package com.spotify.mobius.android;

import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class c implements Disposable {
    public final /* synthetic */ ObservableMutableLiveData a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ c(ObservableMutableLiveData observableMutableLiveData, Consumer consumer) {
        this.a = observableMutableLiveData;
        this.b = consumer;
    }

    public final void dispose() {
        this.a.Y.remove(this.b);
    }
}
