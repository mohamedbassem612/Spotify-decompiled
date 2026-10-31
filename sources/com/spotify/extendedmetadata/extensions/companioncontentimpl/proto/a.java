package com.spotify.extendedmetadata.extensions.companioncontentimpl.proto;

import p.hhg1;
import p.v190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum a implements v190 {
    UNSPECIFIED(0),
    ALBUM(1),
    SINGLE(2),
    EP(3),
    UNRECOGNIZED(-1);

    public final int a;

    a(int i) {
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
