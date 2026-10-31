package p;

import com.spotify.cosmos.util.libs.proto.PlayabilityRestriction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract /* synthetic */ class so30 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[ja81.values().length];
        try {
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[4] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[3] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[5] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[la81.values().length];
        try {
            iArr2[1] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[2] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[3] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
        int[] iArr3 = new int[w6z.values().length];
        try {
            iArr3[0] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[1] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[2] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        c = iArr3;
        int[] iArr4 = new int[v6z.values().length];
        try {
            iArr4[3] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[1] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[2] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        int[] iArr5 = new int[PlayabilityRestriction.values().length];
        try {
            iArr5[PlayabilityRestriction.AGE_RESTRICTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr5[PlayabilityRestriction.EXPLICIT_CONTENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr5[PlayabilityRestriction.NO_RESTRICTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr5[PlayabilityRestriction.NOT_IN_CATALOGUE.ordinal()] = 4;
        } catch (NoSuchFieldError unused18) {
        }
        d = iArr5;
    }
}
