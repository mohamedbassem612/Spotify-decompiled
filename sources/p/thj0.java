package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class thj0 {
    public final MessageResponseToken a;
    public final iwq b;

    static {
        int i = MessageResponseToken.$stable;
    }

    public thj0(MessageResponseToken messageResponseToken, iwq iwqVar) {
        this.a = messageResponseToken;
        this.b = iwqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thj0)) {
            return false;
        }
        thj0 thj0Var = (thj0) obj;
        return u890.j(this.a, thj0Var.a) && u890.j(this.b, thj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
