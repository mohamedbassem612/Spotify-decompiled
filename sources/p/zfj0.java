package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zfj0 {
    public final MessageResponseToken a;
    public final vfj0 b;

    public zfj0(MessageResponseToken messageResponseToken, vfj0 vfj0Var) {
        this.a = messageResponseToken;
        this.b = vfj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfj0)) {
            return false;
        }
        zfj0 zfj0Var = (zfj0) obj;
        return u890.j(this.a, zfj0Var.a) && this.b.equals(zfj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
