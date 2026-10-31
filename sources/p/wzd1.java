package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wzd1 {
    public final boolean a;
    public final long b;
    public final ArrayList c;
    public final int d;
    public final List e;
    public final iu30 f;
    public final g7i0 g;

    public wzd1(boolean z, long j, ArrayList arrayList, int i, List list, iu30 iu30Var, g7i0 g7i0Var) {
        this.a = z;
        this.b = j;
        this.c = arrayList;
        this.d = i;
        this.e = list;
        this.f = iu30Var;
        this.g = g7i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzd1)) {
            return false;
        }
        wzd1 wzd1Var = (wzd1) obj;
        return this.a == wzd1Var.a && this.b == wzd1Var.b && this.c.equals(wzd1Var.c) && this.d == wzd1Var.d && this.e.equals(wzd1Var.e) && u890.j(this.f, wzd1Var.f) && u890.j(this.g, wzd1Var.g);
    }

    public final int hashCode() {
        int iB = f4i1.b(kaa0.f(this.d, p3d1.f(this.c, cy30.f(Boolean.hashCode(this.a) * 31, this.b, 31), 31), 31), 31, this.e);
        iu30 iu30Var = this.f;
        int iHashCode = (iB + (iu30Var == null ? 0 : iu30Var.hashCode())) * 31;
        g7i0 g7i0Var = this.g;
        return iHashCode + (g7i0Var != null ? g7i0Var.hashCode() : 0);
    }
}
