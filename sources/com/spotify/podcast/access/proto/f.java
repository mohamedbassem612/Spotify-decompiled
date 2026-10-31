package com.spotify.podcast.access.proto;

import p.hhg1;
import p.v190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum f implements v190 {
    NONE(0),
    HEART(1),
    PADLOCK(2),
    UNRECOGNIZED(-1);

    public final int a;

    f(int i) {
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
