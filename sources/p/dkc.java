package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.LoggingData;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dkc extends ikc {
    public final pih1 b;
    public final LoggingData c;
    public final DismissReason d;

    public dkc(pih1 pih1Var, LoggingData loggingData, DismissReason dismissReason) {
        this.b = pih1Var;
        this.c = loggingData;
        this.d = dismissReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkc)) {
            return false;
        }
        dkc dkcVar = (dkc) obj;
        return u890.j(this.b, dkcVar.b) && this.c.equals(dkcVar.c) && u890.j(this.d, dkcVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }
}
