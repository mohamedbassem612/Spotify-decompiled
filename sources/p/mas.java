package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContentSize;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract /* synthetic */ class mas {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AccessoryContentSize.values().length];
        try {
            iArr[AccessoryContentSize.XSMALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
