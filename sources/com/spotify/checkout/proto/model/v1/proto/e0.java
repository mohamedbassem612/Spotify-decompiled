package com.spotify.checkout.proto.model.v1.proto;

import p.hhg1;
import p.v190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum e0 implements v190 {
    EXPANSION_STATE_UNKNOWN(0),
    EXPANSION_STATE_SPOTIFY_EXPANDED(1),
    EXPANSION_STATE_GOOGLE_EXPANDED(2),
    EXPANSION_STATE_NONE_EXPANDED(3),
    UNRECOGNIZED(-1);

    public final int a;

    e0(int i) {
        this.a = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
