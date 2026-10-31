package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i4j0 extends wwo1 {
    public final pih1 b;
    public final Message c;
    public final DismissReason d;

    public i4j0(pih1 pih1Var, Message message, DismissReason dismissReason) {
        this.b = pih1Var;
        this.c = message;
        this.d = dismissReason;
    }

    public final DismissReason P() {
        return this.d;
    }

    public final Message Q() {
        return this.c;
    }

    public final pih1 R() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4j0)) {
            return false;
        }
        i4j0 i4j0Var = (i4j0) obj;
        return u890.j(this.b, i4j0Var.b) && u890.j(this.c, i4j0Var.c) && u890.j(this.d, i4j0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }
}
