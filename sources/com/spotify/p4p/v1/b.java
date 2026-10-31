package com.spotify.p4p.v1;

import p.hhg1;
import p.v190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum b implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    REASON_UNSPECIFIED(0),
    /* JADX INFO: Fake field, exist only in values array */
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
