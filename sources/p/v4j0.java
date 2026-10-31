package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v4j0 extends a5j0 {
    public final pih1 a;
    public final Message b;
    public final DiscardReason c;

    public v4j0(pih1 pih1Var, Message message, DiscardReason discardReason) {
        this.a = pih1Var;
        this.b = message;
        this.c = discardReason;
    }

    @Override // p.a5j0
    public final pih1 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4j0)) {
            return false;
        }
        v4j0 v4j0Var = (v4j0) obj;
        return u890.j(this.a, v4j0Var.a) && u890.j(this.b, v4j0Var.b) && u890.j(this.c, v4j0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Message message = this.b;
        return this.c.hashCode() + ((iHashCode + (message == null ? 0 : message.hashCode())) * 31);
    }
}
