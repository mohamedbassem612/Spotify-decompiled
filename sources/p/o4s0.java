package p;

import com.spotify.passkeys.v1.StartAuthenticationResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o4s0 {
    public final String a;
    public final StartAuthenticationResponse b;

    public o4s0(String str, StartAuthenticationResponse startAuthenticationResponse) {
        this.a = str;
        this.b = startAuthenticationResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4s0)) {
            return false;
        }
        o4s0 o4s0Var = (o4s0) obj;
        return this.a.equals(o4s0Var.a) && this.b.equals(o4s0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
