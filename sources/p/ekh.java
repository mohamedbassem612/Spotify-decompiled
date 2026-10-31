package p;

import com.spotify.userinteractivityservice.usercomments.v1.proto.Comment;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ekh extends pkh {
    public final Comment b;
    public final int c;
    public final boolean d;
    public final uwe1 e;

    public ekh(Comment comment, int i, boolean z, uwe1 uwe1Var) {
        super(fkh.b);
        this.b = comment;
        this.c = i;
        this.d = z;
        this.e = uwe1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ekh)) {
            return false;
        }
        ekh ekhVar = (ekh) obj;
        return u890.j(this.b, ekhVar.b) && this.c == ekhVar.c && this.d == ekhVar.d && this.e.equals(ekhVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g(kaa0.f(this.c, this.b.hashCode() * 31, 31), 31, this.d);
    }
}
