package com.spotify.rcs.model;

import p.hhg1;
import p.v190;
import p.y190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum a implements v190 {
    UNKNOWN(0),
    ANDROID(1),
    BACKEND(2),
    IOS(3),
    WEB(4),
    UNRECOGNIZED(-1);

    private static final y190 internalValueMap = new y190() { // from class: com.spotify.rcs.model.Platform$1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public a m7findValueByNumber(int i) {
            return a.a(i);
        }
    };
    private final int value;

    a(int i) {
        this.value = i;
    }

    public static a a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ANDROID;
        }
        if (i == 2) {
            return BACKEND;
        }
        if (i == 3) {
            return IOS;
        }
        if (i != 4) {
            return null;
        }
        return WEB;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
