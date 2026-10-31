package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jdj0 {
    public final MessageResponseToken a;
    public final cdj0 b;

    static {
        int i = MessageResponseToken.$stable;
    }

    public jdj0(MessageResponseToken messageResponseToken, cdj0 cdj0Var) {
        this.a = messageResponseToken;
        this.b = cdj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdj0)) {
            return false;
        }
        jdj0 jdj0Var = (jdj0) obj;
        return u890.j(this.a, jdj0Var.a) && this.b.equals(jdj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
