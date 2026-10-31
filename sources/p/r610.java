package p;

import com.spotify.player.model.ErrorType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract /* synthetic */ class r610 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ErrorType.values().length];
        a = iArr;
        try {
            iArr[ErrorType.TRACK_UNAVAILABLE_OFFLINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[ErrorType.ONE_TRACK_UNPLAYABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[ErrorType.AUDIOBOOK_NOT_PLAYABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
