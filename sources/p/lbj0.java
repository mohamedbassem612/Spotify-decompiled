package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lbj0 {
    public final MessageResponseToken a;
    public final gbj0 b;
    public final String c;

    public lbj0(MessageResponseToken messageResponseToken, gbj0 gbj0Var, String str) {
        this.a = messageResponseToken;
        this.b = gbj0Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbj0)) {
            return false;
        }
        lbj0 lbj0Var = (lbj0) obj;
        return u890.j(this.a, lbj0Var.a) && this.b.equals(lbj0Var.b) && this.c.equals(lbj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
