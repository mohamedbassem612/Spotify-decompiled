package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hv70 {
    public final String a;
    public final x360 b;
    public final List c;
    public final String d;
    public final boolean e;
    public final n1x f;

    public hv70(String str, x360 x360Var, List list, boolean z, n1x n1xVar, int i) {
        z = (i & 32) != 0 ? false : z;
        n1xVar = (i & 64) != 0 ? null : n1xVar;
        this.a = str;
        this.b = x360Var;
        this.c = list;
        this.d = "";
        this.e = z;
        this.f = n1xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv70)) {
            return false;
        }
        hv70 hv70Var = (hv70) obj;
        return u890.j(this.a, hv70Var.a) && u890.j(this.b, hv70Var.b) && u890.j(this.c, hv70Var.c) && this.d.equals(hv70Var.d) && this.e == hv70Var.e && u890.j(this.f, hv70Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        x360 x360Var = this.b;
        int iG = xcg1.g(cy30.d(ab80.k(1, f4i1.b((iHashCode + (x360Var == null ? 0 : x360Var.hashCode())) * 31, 31, this.c), 31), 31, this.d), 31, this.e);
        n1x n1xVar = this.f;
        return iG + (n1xVar != null ? n1xVar.hashCode() : 0);
    }
}
