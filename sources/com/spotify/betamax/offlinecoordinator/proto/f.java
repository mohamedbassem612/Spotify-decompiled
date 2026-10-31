package com.spotify.betamax.offlinecoordinator.proto;

import p.hhg1;
import p.v190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public enum f implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    MISSING(1),
    COMPLETE(2),
    NOT_APPLICABLE(3),
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
