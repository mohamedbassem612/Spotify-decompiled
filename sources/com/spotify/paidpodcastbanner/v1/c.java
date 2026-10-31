package com.spotify.paidpodcastbanner.v1;

import p.hhg1;
import p.v190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum c implements v190 {
    CTA_TYPE_UNKNOWN(0),
    CTA_TYPE_BUTTON(1),
    CTA_TYPE_CHEVRON(2),
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
