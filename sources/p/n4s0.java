package p;

import com.spotify.passkeys.v1.StartRegistrationResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n4s0 {
    public final String a;
    public final StartRegistrationResponse b;

    public n4s0(String str, StartRegistrationResponse startRegistrationResponse) {
        this.a = str;
        this.b = startRegistrationResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4s0)) {
            return false;
        }
        n4s0 n4s0Var = (n4s0) obj;
        return this.a.equals(n4s0Var.a) && this.b.equals(n4s0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
