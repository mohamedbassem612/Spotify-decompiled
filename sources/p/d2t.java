package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ContentAlignment;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract /* synthetic */ class d2t {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ContentAlignment.values().length];
        try {
            iArr[ContentAlignment.BOTTOM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
