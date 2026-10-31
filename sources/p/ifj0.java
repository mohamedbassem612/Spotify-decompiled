package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ifj0 {
    public final MessageResponseToken a;
    public final boolean b;

    public ifj0(MessageResponseToken messageResponseToken, boolean z) {
        this.a = messageResponseToken;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifj0)) {
            return false;
        }
        ifj0 ifj0Var = (ifj0) obj;
        return u890.j(this.a, ifj0Var.a) && this.b == ifj0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
