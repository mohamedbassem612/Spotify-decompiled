package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d5d0 {
    public final ddd1 a;
    public final boolean b;
    public final boolean c;
    public final Set d;
    public final Set e;
    public final int f;
    public final vcd1 g;

    public d5d0(ddd1 ddd1Var, boolean z, boolean z2, Set set, Set set2, int i, vcd1 vcd1Var) {
        this.a = ddd1Var;
        this.b = z;
        this.c = z2;
        this.d = set;
        this.e = set2;
        this.f = i;
        this.g = vcd1Var;
    }

    public static d5d0 a(d5d0 d5d0Var, boolean z, boolean z2, Set set, Set set2, int i) {
        ddd1 ddd1Var = d5d0Var.a;
        if ((i & 2) != 0) {
            z = d5d0Var.b;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = d5d0Var.c;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            set = d5d0Var.d;
        }
        Set set3 = set;
        if ((i & 16) != 0) {
            set2 = d5d0Var.e;
        }
        return new d5d0(ddd1Var, z3, z4, set3, set2, d5d0Var.f, d5d0Var.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5d0)) {
            return false;
        }
        d5d0 d5d0Var = (d5d0) obj;
        return this.a == d5d0Var.a && this.b == d5d0Var.b && this.c == d5d0Var.c && u890.j(this.d, d5d0Var.d) && this.e.equals(d5d0Var.e) && this.f == d5d0Var.f && this.g.equals(d5d0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + kaa0.f(this.f, gvg.c(gvg.c(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
    }
}
