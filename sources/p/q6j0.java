package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q6j0 extends zxo1 {
    public final gmc c;
    public final Message d;
    public final r4j0 e;

    public q6j0(gmc gmcVar, Message message, r4j0 r4j0Var) {
        this.c = gmcVar;
        this.d = message;
        this.e = r4j0Var;
    }

    public final r4j0 E() {
        return this.e;
    }

    public final gmc F() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6j0)) {
            return false;
        }
        q6j0 q6j0Var = (q6j0) obj;
        return u890.j(this.c, q6j0Var.c) && u890.j(this.d, q6j0Var.d) && u890.j(this.e, q6j0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
    }
}
