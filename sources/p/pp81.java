package p;

import com.spotify.signup.signup.v2.proto.CreateAccountResponse;
import com.spotify.signup.signup.v2.proto.EmailAndPasswordIdentifier;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pp81 extends sn81 {
    public final CreateAccountResponse a;
    public final EmailAndPasswordIdentifier b;

    public pp81(CreateAccountResponse createAccountResponse, EmailAndPasswordIdentifier emailAndPasswordIdentifier) {
        this.a = createAccountResponse;
        this.b = emailAndPasswordIdentifier;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp81)) {
            return false;
        }
        pp81 pp81Var = (pp81) obj;
        return this.a.equals(pp81Var.a) && u890.j(this.b, pp81Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        EmailAndPasswordIdentifier emailAndPasswordIdentifier = this.b;
        return iHashCode + (emailAndPasswordIdentifier == null ? 0 : emailAndPasswordIdentifier.hashCode());
    }
}
