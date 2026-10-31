package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.UserLoginState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ilc extends jlc {
    public final UserLoginState a;

    public ilc(UserLoginState userLoginState) {
        this.a = userLoginState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ilc) && this.a == ((ilc) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
