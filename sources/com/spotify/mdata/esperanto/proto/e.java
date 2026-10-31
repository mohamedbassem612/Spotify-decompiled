package com.spotify.mdata.esperanto.proto;

import p.hhg1;
import p.v190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum e implements v190 {
    UNKNOWN(0),
    OK(1),
    NOT_RESOLVED(2),
    NOT_FOUND(3),
    UNAVAILABLE_FOR_LEGAL_REASONS(4),
    UNRECOGNIZED(-1);

    public final int a;

    e(int i) {
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
