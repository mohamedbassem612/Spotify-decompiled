package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nak1 extends rak1 {
    public final pih1 a;
    public final Message b;
    public final Button c;

    public nak1(pih1 pih1Var, Message.CreativeMessage creativeMessage, Button button) {
        this.a = pih1Var;
        this.b = creativeMessage;
        this.c = button;
    }

    public final Button a() {
        return this.c;
    }

    public final Message b() {
        return this.b;
    }

    public final pih1 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nak1)) {
            return false;
        }
        nak1 nak1Var = (nak1) obj;
        return this.a.equals(nak1Var.a) && this.b.equals(nak1Var.b) && u890.j(this.c, nak1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
