package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.FormatType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mxv0 extends qtg {
    public final gmc d;
    public final Message e;
    public final r4j0 f;
    public final FormatType g;

    public mxv0(gmc gmcVar, Message.CreativeMessage creativeMessage, r4j0 r4j0Var, FormatType formatType) {
        this.d = gmcVar;
        this.e = creativeMessage;
        this.f = r4j0Var;
        this.g = formatType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxv0)) {
            return false;
        }
        mxv0 mxv0Var = (mxv0) obj;
        return this.d.equals(mxv0Var.d) && this.e.equals(mxv0Var.e) && this.f.equals(mxv0Var.f) && this.g == mxv0Var.g;
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31)) * 31);
    }

    public final gmc n() {
        return this.d;
    }
}
