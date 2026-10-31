package com.spotify.podcast.access.proto;

import p.hhg1;
import p.v190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum c implements v190 {
    UNSPECIFIED(0),
    EXTERNAL_LINK(1),
    EMAIL(2),
    INTERNAL_REDIRECT(3),
    UNRECOGNIZED(-1);

    public final int a;

    c(int i) {
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
