package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p6j0 extends zxo1 {
    public final gmc c;
    public final Message d;
    public final DiscardReason e;

    public p6j0(gmc gmcVar, Message message, DiscardReason discardReason) {
        this.c = gmcVar;
        this.d = message;
        this.e = discardReason;
    }

    public final DiscardReason E() {
        return this.e;
    }

    public final Message F() {
        return this.d;
    }

    public final gmc G() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6j0)) {
            return false;
        }
        p6j0 p6j0Var = (p6j0) obj;
        return u890.j(this.c, p6j0Var.c) && this.d.equals(p6j0Var.d) && u890.j(this.e, p6j0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
    }
}
