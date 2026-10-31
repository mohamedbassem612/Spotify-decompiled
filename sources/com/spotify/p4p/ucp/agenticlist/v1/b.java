package com.spotify.p4p.ucp.agenticlist.v1;

import p.hhg1;
import p.v190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum b implements v190 {
    REASON_UNSPECIFIED(0),
    PREVIOUS_SIGNAL_FAILED(1),
    UNRECOGNIZED(-1);

    public final int a;

    b(int i) {
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
