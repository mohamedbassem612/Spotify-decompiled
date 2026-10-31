package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ea6 {
    public final rxx0 a;
    public final l2r0 b;
    public final String c;
    public final boolean d;
    public final mvh1 e;
    public final boolean f;
    public final String g;
    public final String h;
    public final boolean i;
    public final Set j;
    public final List k;
    public final z740 l;
    public final boolean m;
    public final nmu0 n;
    public final boolean o;

    public ea6(rxx0 rxx0Var, l2r0 l2r0Var, String str, boolean z, mvh1 mvh1Var, boolean z2, String str2, String str3, boolean z3, Set set, List list, z740 z740Var, boolean z4, nmu0 nmu0Var, boolean z5) {
        this.a = rxx0Var;
        this.b = l2r0Var;
        this.c = str;
        this.d = z;
        this.e = mvh1Var;
        this.f = z2;
        this.g = str2;
        this.h = str3;
        this.i = z3;
        this.j = set;
        this.k = list;
        this.l = z740Var;
        this.m = z4;
        this.n = nmu0Var;
        this.o = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea6)) {
            return false;
        }
        ea6 ea6Var = (ea6) obj;
        return this.a == ea6Var.a && this.b == ea6Var.b && u890.j(this.c, ea6Var.c) && this.d == ea6Var.d && u890.j(this.e, ea6Var.e) && this.f == ea6Var.f && u890.j(this.g, ea6Var.g) && u890.j(this.h, ea6Var.h) && this.i == ea6Var.i && u890.j(this.j, ea6Var.j) && this.k.equals(ea6Var.k) && u890.j(this.l, ea6Var.l) && this.m == ea6Var.m && this.n == ea6Var.n && this.o == ea6Var.o;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int iG = xcg1.g((this.e.hashCode() + xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31, 31, this.f);
        String str2 = this.g;
        int iHashCode2 = (iG + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int iB = f4i1.b(gvg.c(xcg1.g((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 961, 31, this.i), 31, this.j), 31, this.k);
        z740 z740Var = this.l;
        return Boolean.hashCode(this.o) + ((this.n.hashCode() + xcg1.g((iB + (z740Var != null ? z740Var.hashCode() : 0)) * 31, 31, this.m)) * 31);
    }
}
