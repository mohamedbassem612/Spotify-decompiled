package p;

import com.spotify.player.model.ErrorType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract /* synthetic */ class v6u0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ErrorType.values().length];
        try {
            iArr[ErrorType.PLAYBACK_STUCK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ErrorType.PLAYBACK_START_SLOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ErrorType.PLAYBACK_STUCK_TIMEOUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ErrorType.PLAYBACK_START_TIMEOUT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
