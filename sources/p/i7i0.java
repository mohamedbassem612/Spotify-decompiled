package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i7i0 {
    public final String a;
    public final boolean b;
    public final ArrayList c;
    public final h7i0 d;
    public final g7i0 e;

    public i7i0(String str, boolean z, ArrayList arrayList, h7i0 h7i0Var, g7i0 g7i0Var) {
        this.a = str;
        this.b = z;
        this.c = arrayList;
        this.d = h7i0Var;
        this.e = g7i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7i0)) {
            return false;
        }
        i7i0 i7i0Var = (i7i0) obj;
        return u890.j(this.a, i7i0Var.a) && this.b == i7i0Var.b && this.c.equals(i7i0Var.c) && u890.j(this.d, i7i0Var.d) && u890.j(this.e, i7i0Var.e);
    }

    public final int hashCode() {
        int iF = p3d1.f(this.c, xcg1.g(this.a.hashCode() * 31, 31, this.b), 31);
        h7i0 h7i0Var = this.d;
        int iHashCode = (iF + (h7i0Var == null ? 0 : h7i0Var.hashCode())) * 31;
        g7i0 g7i0Var = this.e;
        return iHashCode + (g7i0Var != null ? g7i0Var.hashCode() : 0);
    }
}
