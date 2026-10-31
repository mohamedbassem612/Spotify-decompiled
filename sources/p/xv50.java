package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xv50 {
    public final String a;
    public final boolean b;
    public final z2a c;
    public final qn30 d;
    public final List e;

    public xv50(String str, boolean z, z2a z2aVar, qn30 qn30Var, List list) {
        this.a = str;
        this.b = z;
        this.c = z2aVar;
        this.d = qn30Var;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv50)) {
            return false;
        }
        xv50 xv50Var = (xv50) obj;
        return u890.j(this.a, xv50Var.a) && this.b == xv50Var.b && u890.j(this.c, xv50Var.c) && u890.j(this.d, xv50Var.d) && u890.j(this.e, xv50Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b)) * 31;
        qn30 qn30Var = this.d;
        return this.e.hashCode() + ((iHashCode + (qn30Var == null ? 0 : qn30Var.a.hashCode())) * 31);
    }
}
