package p;

import com.spotify.yourupdates.domain.models.FetchMode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract /* synthetic */ class e2n1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[v80.values().length];
        try {
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            h80 h80Var = v80.Companion;
            iArr[2] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[FetchMode.values().length];
        try {
            iArr2[FetchMode.NEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[FetchMode.INITIAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr2;
    }
}
