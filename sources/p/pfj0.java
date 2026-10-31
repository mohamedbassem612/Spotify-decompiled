package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pfj0 {
    public final MessageResponseToken a;
    public final kfj0 b;

    public pfj0(MessageResponseToken messageResponseToken, kfj0 kfj0Var) {
        this.a = messageResponseToken;
        this.b = kfj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfj0)) {
            return false;
        }
        pfj0 pfj0Var = (pfj0) obj;
        return u890.j(this.a, pfj0Var.a) && this.b.equals(pfj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
