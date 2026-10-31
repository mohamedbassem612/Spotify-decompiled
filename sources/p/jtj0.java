package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.UserLoginState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract /* synthetic */ class jtj0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UserLoginState.values().length];
        try {
            iArr[UserLoginState.LOGGING_OUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UserLoginState.LOGGED_IN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
