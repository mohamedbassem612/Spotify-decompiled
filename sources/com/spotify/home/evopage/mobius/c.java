package com.spotify.home.evopage.mobius;

import io.reactivex.rxjava3.functions.Function;
import p.v6a0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c implements Function {
    public final /* synthetic */ v6a0 a;

    public c(v6a0 v6a0Var) {
        this.a = v6a0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        return new Event.ConnectivityChanged(((Boolean) obj).booleanValue(), this.a.v(false));
    }
}
