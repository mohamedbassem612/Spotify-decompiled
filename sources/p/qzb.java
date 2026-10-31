package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qzb extends exd0 {
    public final MessageResponseToken c;
    public final DismissReason d;

    static {
        int i = MessageResponseToken.$stable;
    }

    public qzb(MessageResponseToken messageResponseToken, DismissReason dismissReason) {
        this.c = messageResponseToken;
        this.d = dismissReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qzb)) {
            return false;
        }
        qzb qzbVar = (qzb) obj;
        return this.c.equals(qzbVar.c) && u890.j(this.d, qzbVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
