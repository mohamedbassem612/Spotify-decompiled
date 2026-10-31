package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fbj0 {
    public final MessageResponseToken a;
    public final zaj0 b;

    static {
        int i = MessageResponseToken.$stable;
    }

    public fbj0(MessageResponseToken messageResponseToken, zaj0 zaj0Var) {
        this.a = messageResponseToken;
        this.b = zaj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbj0)) {
            return false;
        }
        fbj0 fbj0Var = (fbj0) obj;
        return u890.j(this.a, fbj0Var.a) && this.b.equals(fbj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
