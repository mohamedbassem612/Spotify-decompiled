package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x4j0 extends a5j0 {
    public final pih1 a;
    public final Message b;

    public x4j0(pih1 pih1Var, Message message) {
        this.a = pih1Var;
        this.b = message;
    }

    public final pih1 a() {
        return this.a;
    }

    public final Message d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4j0)) {
            return false;
        }
        x4j0 x4j0Var = (x4j0) obj;
        return u890.j(this.a, x4j0Var.a) && u890.j(this.b, x4j0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
