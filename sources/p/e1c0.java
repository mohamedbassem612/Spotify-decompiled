package p;

import com.spotify.player.model.AudioStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract /* synthetic */ class e1c0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AudioStream.values().length];
        try {
            iArr[AudioStream.ALARM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AudioStream.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
