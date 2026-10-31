package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oak1 extends rak1 {
    public final pih1 a;
    public final Message b;
    public final DiscardReason c;

    public oak1(pih1 pih1Var, Message message, DiscardReason discardReason) {
        this.a = pih1Var;
        this.b = message;
        this.c = discardReason;
    }

    public final DiscardReason a() {
        return this.c;
    }

    public final Message b() {
        return this.b;
    }

    public final pih1 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oak1)) {
            return false;
        }
        oak1 oak1Var = (oak1) obj;
        return this.a.equals(oak1Var.a) && u890.j(this.b, oak1Var.b) && u890.j(this.c, oak1Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Message message = this.b;
        return this.c.hashCode() + ((iHashCode + (message == null ? 0 : message.hashCode())) * 31);
    }
}
