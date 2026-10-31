package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y8j0 {
    public final MessageResponseToken a;
    public final eyo1 b;

    static {
        int i = MessageResponseToken.$stable;
    }

    public y8j0(MessageResponseToken messageResponseToken, eyo1 eyo1Var) {
        this.a = messageResponseToken;
        this.b = eyo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8j0)) {
            return false;
        }
        y8j0 y8j0Var = (y8j0) obj;
        return u890.j(this.a, y8j0Var.a) && this.b.equals(y8j0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
