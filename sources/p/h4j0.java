package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h4j0 extends wwo1 {
    public final pih1 b;
    public final Message c;
    public final DiscardReason d;

    public h4j0(pih1 pih1Var, Message message, DiscardReason discardReason) {
        this.b = pih1Var;
        this.c = message;
        this.d = discardReason;
    }

    public final DiscardReason P() {
        return this.d;
    }

    public final Message Q() {
        return this.c;
    }

    public final pih1 R() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4j0)) {
            return false;
        }
        h4j0 h4j0Var = (h4j0) obj;
        return u890.j(this.b, h4j0Var.b) && u890.j(this.c, h4j0Var.c) && u890.j(this.d, h4j0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        Message message = this.c;
        return this.d.hashCode() + ((iHashCode + (message == null ? 0 : message.hashCode())) * 31);
    }
}
