package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cij1 {
    public final String a;
    public final boolean b;
    public final le30 c;
    public final List d;
    public final x7i1 e;
    public final Map f;

    public cij1(String str, boolean z, le30 le30Var, List list, x7i1 x7i1Var, Map map) {
        this.a = str;
        this.b = z;
        this.c = le30Var;
        this.d = list;
        this.e = x7i1Var;
        this.f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cij1)) {
            return false;
        }
        cij1 cij1Var = (cij1) obj;
        return this.a.equals(cij1Var.a) && this.b == cij1Var.b && this.c == cij1Var.c && u890.j(this.d, cij1Var.d) && u890.j(this.e, cij1Var.e) && u890.j(this.f, cij1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + f4i1.b((this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d)) * 31);
    }
}
