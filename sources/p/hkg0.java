package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hkg0 {
    public final boolean a;
    public final fae1 b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final rrn1 g;
    public final List h;
    public final boolean i;
    public final boolean j;
    public final tb0 k;

    public hkg0(boolean z, fae1 fae1Var, boolean z2, boolean z3, String str, boolean z4, rrn1 rrn1Var, List list, boolean z5, boolean z6, tb0 tb0Var) {
        this.a = z;
        this.b = fae1Var;
        this.c = z2;
        this.d = z3;
        this.e = str;
        this.f = z4;
        this.g = rrn1Var;
        this.h = list;
        this.i = z5;
        this.j = z6;
        this.k = tb0Var;
    }

    public static hkg0 a(hkg0 hkg0Var, rrn1 rrn1Var, boolean z, tb0 tb0Var, int i) {
        boolean z2 = hkg0Var.a;
        fae1 fae1Var = hkg0Var.b;
        boolean z3 = hkg0Var.c;
        boolean z4 = (i & 8) != 0 ? hkg0Var.d : false;
        String str = hkg0Var.e;
        boolean z5 = hkg0Var.f;
        if ((i & 64) != 0) {
            rrn1Var = hkg0Var.g;
        }
        rrn1 rrn1Var2 = rrn1Var;
        List list = hkg0Var.h;
        boolean z6 = hkg0Var.i;
        if ((i & 512) != 0) {
            z = hkg0Var.j;
        }
        boolean z7 = z;
        tb0 tb0Var2 = (i & 1024) != 0 ? hkg0Var.k : tb0Var;
        hkg0Var.getClass();
        return new hkg0(z2, fae1Var, z3, z4, str, z5, rrn1Var2, list, z6, z7, tb0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkg0)) {
            return false;
        }
        hkg0 hkg0Var = (hkg0) obj;
        return this.a == hkg0Var.a && u890.j(this.b, hkg0Var.b) && this.c == hkg0Var.c && this.d == hkg0Var.d && u890.j(this.e, hkg0Var.e) && this.f == hkg0Var.f && this.g.equals(hkg0Var.g) && u890.j(this.h, hkg0Var.h) && this.i == hkg0Var.i && this.j == hkg0Var.j && this.k.equals(hkg0Var.k);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        fae1 fae1Var = this.b;
        int iG = xcg1.g(xcg1.g((iHashCode + (fae1Var == null ? 0 : fae1Var.hashCode())) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return this.k.hashCode() + xcg1.g(xcg1.g(f4i1.b((this.g.hashCode() + xcg1.g((iG + (str != null ? str.hashCode() : 0)) * 31, 31, this.f)) * 31, 31, this.h), 31, this.i), 31, this.j);
    }
}
