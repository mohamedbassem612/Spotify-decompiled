package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t4j0 extends a5j0 {
    public final pih1 a;
    public final Message b;

    public t4j0(pih1 pih1Var, Message.CreativeMessage creativeMessage) {
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
        if (!(obj instanceof t4j0)) {
            return false;
        }
        t4j0 t4j0Var = (t4j0) obj;
        return u890.j(this.a, t4j0Var.a) && this.b.equals(t4j0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
