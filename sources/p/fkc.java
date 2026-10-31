package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.LoggingData;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fkc extends ikc {
    public final pih1 b;
    public final LoggingData c;
    public final Button d;

    public fkc(pih1 pih1Var, LoggingData loggingData, Button button) {
        this.b = pih1Var;
        this.c = loggingData;
        this.d = button;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fkc)) {
            return false;
        }
        fkc fkcVar = (fkc) obj;
        return u890.j(this.b, fkcVar.b) && this.c.equals(fkcVar.c) && u890.j(this.d, fkcVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }
}
