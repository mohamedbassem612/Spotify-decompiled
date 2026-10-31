package p;

import com.spotify.player.model.ErrorType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract /* synthetic */ class qve0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ErrorType.values().length];
        try {
            iArr[ErrorType.ONE_TRACK_UNPLAYABLE_AUTO_STOPPED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ErrorType.ALL_TRACKS_UNPLAYABLE_AUTO_STOPPED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
