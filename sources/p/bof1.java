package p;

import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin$IdentifyResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bof1 {
    public final String a;
    public final EsOfflinePlugin$IdentifyResponse.Result b;

    public bof1(String str, EsOfflinePlugin$IdentifyResponse.Result result) {
        this.a = str;
        this.b = result;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bof1)) {
            return false;
        }
        bof1 bof1Var = (bof1) obj;
        return this.a.equals(bof1Var.a) && this.b.equals(bof1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
