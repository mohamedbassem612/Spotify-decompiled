package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qjc extends t3k1 {
    public final pih1 b;
    public final DismissReason c;

    public qjc(pih1 pih1Var, DismissReason.UserLoggingOut userLoggingOut) {
        this.b = pih1Var;
        this.c = userLoggingOut;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjc)) {
            return false;
        }
        qjc qjcVar = (qjc) obj;
        return u890.j(this.b, qjcVar.b) && u890.j(this.c, qjcVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        DismissReason dismissReason = this.c;
        return iHashCode + (dismissReason == null ? 0 : dismissReason.hashCode());
    }
}
