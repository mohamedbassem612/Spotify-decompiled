package p;

import com.spotify.signup.signup.v2.proto.ClientInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mp81 extends sn81 {
    public final ClientInfo a;

    public mp81(ClientInfo clientInfo) {
        this.a = clientInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mp81) && this.a.equals(((mp81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() - 416248148;
    }
}
