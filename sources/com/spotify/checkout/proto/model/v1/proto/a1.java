package com.spotify.checkout.proto.model.v1.proto;

import p.hhg1;
import p.v190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum a1 implements v190 {
    CHECKBOX(0),
    TEXT(1),
    CONSPICUOUS_TEXT(2),
    CONSPICUOUS_CHECKBOX(3),
    UNRECOGNIZED(-1);

    public final int a;

    a1(int i) {
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
