package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wgj0 extends nyo1 {
    public final MessageResponseToken c;
    public final DismissReason d;

    static {
        int i = MessageResponseToken.$stable;
    }

    public wgj0(MessageResponseToken messageResponseToken, DismissReason dismissReason) {
        this.c = messageResponseToken;
        this.d = dismissReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgj0)) {
            return false;
        }
        wgj0 wgj0Var = (wgj0) obj;
        return u890.j(this.c, wgj0Var.c) && u890.j(this.d, wgj0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
