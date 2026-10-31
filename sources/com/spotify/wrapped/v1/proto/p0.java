package com.spotify.wrapped.v1.proto;

import p.hhg1;
import p.v190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum p0 implements v190 {
    SHAPE_SQUARE(0),
    SHAPE_CIRCLE(1),
    SHAPE_ROUNDED(2),
    UNRECOGNIZED(-1);

    public final int a;

    p0(int i) {
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
