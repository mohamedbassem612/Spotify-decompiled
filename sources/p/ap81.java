package p;

import com.spotify.signup.signup.v2.proto.AccountDetails;
import com.spotify.signup.signup.v2.proto.ClientInfo;
import com.spotify.signup.signup.v2.proto.Tracking;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ap81 extends t9p1 {
    public final AccountDetails c;
    public final ClientInfo d;
    public final Tracking e;
    public final jj01 f;

    public ap81(AccountDetails accountDetails, ClientInfo clientInfo, Tracking tracking, jj01 jj01Var) {
        this.c = accountDetails;
        this.d = clientInfo;
        this.e = tracking;
        this.f = jj01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap81)) {
            return false;
        }
        ap81 ap81Var = (ap81) obj;
        return this.c.equals(ap81Var.c) && this.d.equals(ap81Var.d) && this.e.equals(ap81Var.e) && u890.j(this.f, ap81Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() - 416248148) * 31)) * 31)) * 31;
        jj01 jj01Var = this.f;
        return iHashCode + (jj01Var == null ? 0 : jj01Var.hashCode());
    }
}
