package p;

import com.spotify.passkeys.v1.PasskeyCredential;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m4s0 {
    public final PasskeyCredential a;

    public m4s0(PasskeyCredential passkeyCredential) {
        this.a = passkeyCredential;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m4s0) && this.a.equals(((m4s0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
