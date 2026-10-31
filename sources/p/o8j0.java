package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o8j0 {
    public final MessageResponseToken a;
    public final g8j0 b;

    public o8j0(MessageResponseToken messageResponseToken, g8j0 g8j0Var) {
        this.a = messageResponseToken;
        this.b = g8j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8j0)) {
            return false;
        }
        o8j0 o8j0Var = (o8j0) obj;
        return u890.j(this.a, o8j0Var.a) && this.b.equals(o8j0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
