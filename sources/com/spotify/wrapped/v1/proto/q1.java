package com.spotify.wrapped.v1.proto;

import p.hhg1;
import p.v190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum q1 implements v190 {
    ALBUM_TYPE_UNSPECIFIED(0),
    RANK_1(1),
    RANK_2(2),
    RANK_3(3),
    RANK_4(4),
    RANK_5(5),
    HONORABLE_MENTION(6),
    BRAND(7),
    UNRECOGNIZED(-1);

    public final int a;

    q1(int i) {
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
