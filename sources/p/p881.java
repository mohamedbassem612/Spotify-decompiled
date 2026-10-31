package p;

import com.spotify.cosmos.util.proto.PlayabilityRestriction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract /* synthetic */ class p881 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlayabilityRestriction.values().length];
        try {
            iArr[PlayabilityRestriction.EXPLICIT_CONTENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlayabilityRestriction.AGE_RESTRICTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
