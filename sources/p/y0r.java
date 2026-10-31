package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y0r {
    public final String a;
    public final String b;
    public final jx11 c;
    public final Set d;
    public final g3d0 e;
    public final List f;

    public y0r(String str, String str2, jx11 jx11Var, Set set, g3d0 g3d0Var, List list) {
        this.a = str;
        this.b = str2;
        this.c = jx11Var;
        this.d = set;
        this.e = g3d0Var;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0r)) {
            return false;
        }
        y0r y0rVar = (y0r) obj;
        return this.a.equals(y0rVar.a) && u890.j(this.b, y0rVar.b) && this.c == y0rVar.c && u890.j(this.d, y0rVar.d) && u890.j(this.e, y0rVar.e) && u890.j(this.f, y0rVar.f);
    }

    public final int hashCode() {
        int iC = gvg.c((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        g3d0 g3d0Var = this.e;
        return this.f.hashCode() + ((iC + (g3d0Var == null ? 0 : g3d0Var.hashCode())) * 31);
    }
}
