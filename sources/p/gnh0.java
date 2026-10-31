package p;

import com.spotify.player.model.AudioStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract /* synthetic */ class gnh0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[AudioStream.values().length];
        try {
            iArr[AudioStream.ALARM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
        int[] iArr2 = new int[enh0.values().length];
        try {
            iArr2[1] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        b = iArr2;
    }
}
