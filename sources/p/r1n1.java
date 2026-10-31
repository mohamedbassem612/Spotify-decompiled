package p;

import com.spotify.yourupdates.badgingstate.models.BadgingState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract /* synthetic */ class r1n1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BadgingState.values().length];
        try {
            iArr[BadgingState.SHOW_BADGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BadgingState.HIDE_BADGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
