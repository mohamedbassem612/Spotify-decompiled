package p;

import com.spotify.adsinternal.adscore.model.Format;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract /* synthetic */ class dq0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Format.values().length];
        try {
            iArr[Format.AUDIO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Format.BANNER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Format.DUMMY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Format.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Format.UNRECOGNIZED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[Format.VIDEO.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
