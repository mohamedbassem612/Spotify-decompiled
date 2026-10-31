package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.InteractionType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract /* synthetic */ class yd70 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[InteractionType.values().length];
        try {
            iArr[InteractionType.DISMISS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InteractionType.CLICK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
