package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vjc extends t3k1 {
    public final pih1 b;
    public final Message c;
    public final DismissReason d;

    public vjc(pih1 pih1Var, Message message, DismissReason dismissReason) {
        this.b = pih1Var;
        this.c = message;
        this.d = dismissReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vjc)) {
            return false;
        }
        vjc vjcVar = (vjc) obj;
        return this.b.equals(vjcVar.b) && u890.j(this.c, vjcVar.c) && u890.j(this.d, vjcVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }
}
