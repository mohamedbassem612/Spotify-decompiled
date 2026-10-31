package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Rule;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y5j0 extends hxo1 {
    public final Rule c;
    public final Message d;
    public final String e;

    public y5j0(Rule rule, Message message, String str) {
        this.c = rule;
        this.d = message;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5j0)) {
            return false;
        }
        y5j0 y5j0Var = (y5j0) obj;
        return this.c == y5j0Var.c && u890.j(this.d, y5j0Var.d) && u890.j(this.e, y5j0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        Message message = this.d;
        int iHashCode2 = (iHashCode + (message == null ? 0 : message.hashCode())) * 31;
        String str = this.e;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final Message y() {
        return this.d;
    }
}
