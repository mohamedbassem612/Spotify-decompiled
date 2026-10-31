package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y4j0 extends a5j0 {
    public final pih1 a;
    public final Message b;

    public y4j0(pih1 pih1Var, Message message) {
        this.a = pih1Var;
        this.b = message;
    }

    @Override // p.a5j0
    public final pih1 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4j0)) {
            return false;
        }
        y4j0 y4j0Var = (y4j0) obj;
        return this.a.equals(y4j0Var.a) && this.b.equals(y4j0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
