package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract /* synthetic */ class e5j0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TriggerType.values().length];
        try {
            iArr[TriggerType.URI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TriggerType.CLIENT_EVENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
