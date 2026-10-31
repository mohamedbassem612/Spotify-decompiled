package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.LoggingData;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ckc extends ikc {
    public final pih1 b;
    public final LoggingData c;
    public final DiscardReason d;

    public ckc(pih1 pih1Var, LoggingData loggingData, DiscardReason discardReason) {
        this.b = pih1Var;
        this.c = loggingData;
        this.d = discardReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckc)) {
            return false;
        }
        ckc ckcVar = (ckc) obj;
        return u890.j(this.b, ckcVar.b) && this.c.equals(ckcVar.c) && u890.j(this.d, ckcVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }
}
