package com.spotify.mobius;

import com.spotify.mobius.internal_util.Preconditions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
class MobiusStore<M, E, F> {
    public final Update a;
    public Object b;

    public MobiusStore(Update update, Object obj) {
        this.a = update;
        Preconditions.b(obj);
        this.b = obj;
    }
}
