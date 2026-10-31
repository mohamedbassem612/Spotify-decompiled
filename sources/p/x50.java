package p;

import com.spotify.wrapped.v1.proto.Action;
import com.spotify.wrapped.v1.proto.Paragraph;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x50 {
    public final String a;
    public final Action b;
    public final String c;
    public final long d;
    public final long e;
    public final gqb f;
    public final Paragraph g;
    public final zd60 h;

    public x50(String str, Action action, String str2, long j, long j2, gqb gqbVar, Paragraph paragraph, zd60 zd60Var) {
        this.a = str;
        this.b = action;
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = gqbVar;
        this.g = paragraph;
        this.h = zd60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x50)) {
            return false;
        }
        x50 x50Var = (x50) obj;
        if (!this.a.equals(x50Var.a) || !this.b.equals(x50Var.b) || !this.c.equals(x50Var.c)) {
            return false;
        }
        long j = x50Var.d;
        int i = u7h.l;
        return z4h1.b(this.d, j) && z4h1.b(this.e, x50Var.e) && u890.j(this.f, x50Var.f) && u890.j(this.g, x50Var.g) && u890.j(this.h, x50Var.h);
    }

    public final int hashCode() {
        int iD = cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        int i = u7h.l;
        int iF = cy30.f(cy30.f(iD, this.d, 31), this.e, 31);
        gqb gqbVar = this.f;
        int iHashCode = (iF + (gqbVar == null ? 0 : gqbVar.hashCode())) * 31;
        Paragraph paragraph = this.g;
        int iHashCode2 = (iHashCode + (paragraph == null ? 0 : paragraph.hashCode())) * 31;
        zd60 zd60Var = this.h;
        return iHashCode2 + (zd60Var != null ? zd60Var.hashCode() : 0);
    }
}
