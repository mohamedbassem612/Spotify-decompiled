package p;

import com.spotify.player.model.command.options.PlayOperation;
import com.spotify.player.model.command.options.PlayTrigger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract /* synthetic */ class pot0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PlayOperation.values().length];
        try {
            iArr[PlayOperation.REPLACE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlayOperation.ENQUEUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlayOperation.PUSH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[PlayTrigger.values().length];
        try {
            iArr2[PlayTrigger.IMMEDIATELY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[PlayTrigger.ADVANCED_PAST_TRACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PlayTrigger.ADVANCED_PAST_CONTEXT.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
