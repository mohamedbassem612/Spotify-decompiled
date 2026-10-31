package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.impl.models.PluginIntegrationStatus;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract /* synthetic */ class jmc {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PluginIntegrationStatus.values().length];
        try {
            iArr[PluginIntegrationStatus.DETACHED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PluginIntegrationStatus.ATTACHED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
