package com.spotify.extendedmetadata.extensions.audioattributesv2impl.proto;

import p.hhg1;
import p.v190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum d implements v190 {
    MODE_UNKNOWN(0),
    MODE_MINOR(1),
    MODE_MAJOR(2),
    UNRECOGNIZED(-1);

    public final int a;

    d(int i) {
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
