package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j4j0 extends wwo1 {
    public final pih1 b;
    public final Message c;

    public j4j0(pih1 pih1Var, Message message) {
        this.b = pih1Var;
        this.c = message;
    }

    public final Message P() {
        return this.c;
    }

    public final pih1 Q() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4j0)) {
            return false;
        }
        j4j0 j4j0Var = (j4j0) obj;
        return u890.j(this.b, j4j0Var.b) && u890.j(this.c, j4j0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
