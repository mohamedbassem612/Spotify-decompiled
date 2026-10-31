package p;

import com.spotify.userinteractivityservice.usercomments.v1.proto.Reply;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hkh extends pkh {
    public final Reply b;
    public final int c;
    public final uwe1 d;

    public hkh(Reply reply, int i, uwe1 uwe1Var) {
        super(fkh.d);
        this.b = reply;
        this.c = i;
        this.d = uwe1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkh)) {
            return false;
        }
        hkh hkhVar = (hkh) obj;
        return u890.j(this.b, hkhVar.b) && this.c == hkhVar.c && this.d.equals(hkhVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, this.b.hashCode() * 31, 31);
    }
}
