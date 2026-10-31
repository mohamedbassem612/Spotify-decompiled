package p;

import com.spotify.playlist.ai.creation.v2.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract /* synthetic */ class f23 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[Action.values().length];
        try {
            iArr[Action.ACTION_QUEUED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Action.ACTION_PROCESSING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Action.ACTION_SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Action.ACTION_ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Action.ACTION_TIMEOUT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[Action.ACTION_UNSPECIFIED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[Action.UNRECOGNIZED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
        int[] iArr2 = new int[l1d.H(7).length];
        try {
            iArr2[3] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[4] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[1] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[2] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[5] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        b = iArr2;
    }
}
