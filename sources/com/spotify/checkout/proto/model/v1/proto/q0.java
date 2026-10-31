package com.spotify.checkout.proto.model.v1.proto;

import p.hhg1;
import p.v190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum q0 implements v190 {
    DEFAULT(0),
    ADDED(1),
    REMOVED(2),
    STRIKETHROUGH(3),
    UNRECOGNIZED(-1);

    public final int a;

    q0(int i) {
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
