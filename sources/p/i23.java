package p;

import com.spotify.playlist.ai.creation.v2.Sender;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract /* synthetic */ class i23 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Sender.values().length];
        try {
            iArr[Sender.SENDER_USER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Sender.SENDER_AI.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Sender.SENDER_SPOTIFY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Sender.SENDER_UNSPECIFIED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Sender.UNRECOGNIZED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
