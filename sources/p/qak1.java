package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qak1 extends rak1 {
    public final pih1 a;
    public final Message b;

    public qak1(pih1 pih1Var, Message.CreativeMessage creativeMessage) {
        this.a = pih1Var;
        this.b = creativeMessage;
    }

    public final Message a() {
        return this.b;
    }

    public final pih1 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qak1)) {
            return false;
        }
        qak1 qak1Var = (qak1) obj;
        return this.a.equals(qak1Var.a) && this.b.equals(qak1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
