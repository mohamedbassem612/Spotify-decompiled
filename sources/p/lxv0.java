package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lxv0 extends qtg {
    public final gmc d;
    public final Message e;
    public final DiscardReason f;

    public lxv0(gmc gmcVar, Message.CreativeMessage creativeMessage, DiscardReason discardReason) {
        this.d = gmcVar;
        this.e = creativeMessage;
        this.f = discardReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxv0)) {
            return false;
        }
        lxv0 lxv0Var = (lxv0) obj;
        return this.d.equals(lxv0Var.d) && this.e.equals(lxv0Var.e) && u890.j(this.f, lxv0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31);
    }

    public final gmc n() {
        return this.d;
    }
}
