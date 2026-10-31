package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w4j0 extends a5j0 {
    public final pih1 a;
    public final Message b;
    public final DismissReason c;

    public w4j0(pih1 pih1Var, Message message, DismissReason dismissReason) {
        this.a = pih1Var;
        this.b = message;
        this.c = dismissReason;
    }

    @Override // p.a5j0
    public final pih1 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4j0)) {
            return false;
        }
        w4j0 w4j0Var = (w4j0) obj;
        return u890.j(this.a, w4j0Var.a) && u890.j(this.b, w4j0Var.b) && u890.j(this.c, w4j0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
