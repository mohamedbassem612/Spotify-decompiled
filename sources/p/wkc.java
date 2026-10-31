package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wkc extends jlc {
    public final pih1 a;
    public final Message b;
    public final Button c;

    public wkc(pih1 pih1Var, Message message, Button button) {
        this.a = pih1Var;
        this.b = message;
        this.c = button;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkc)) {
            return false;
        }
        wkc wkcVar = (wkc) obj;
        return u890.j(this.a, wkcVar.a) && u890.j(this.b, wkcVar.b) && u890.j(this.c, wkcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
