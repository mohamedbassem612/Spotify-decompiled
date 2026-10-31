package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pak1 extends rak1 {
    public final pih1 a;
    public final Message b;
    public final DismissReason c;

    public pak1(pih1 pih1Var, Message message, DismissReason dismissReason) {
        this.a = pih1Var;
        this.b = message;
        this.c = dismissReason;
    }

    public final DismissReason a() {
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
        if (!(obj instanceof pak1)) {
            return false;
        }
        pak1 pak1Var = (pak1) obj;
        return this.a.equals(pak1Var.a) && u890.j(this.b, pak1Var.b) && u890.j(this.c, pak1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
