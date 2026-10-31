package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class z4j0 extends a5j0 {
    public final pih1 a;
    public final Message b;

    public z4j0(pih1 pih1Var, Message.CreativeMessage creativeMessage) {
        this.a = pih1Var;
        this.b = creativeMessage;
    }

    @Override // p.a5j0
    public final pih1 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4j0)) {
            return false;
        }
        z4j0 z4j0Var = (z4j0) obj;
        return this.a.equals(z4j0Var.a) && this.b.equals(z4j0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
