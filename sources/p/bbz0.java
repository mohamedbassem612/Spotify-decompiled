package p;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bbz0 {
    public final boolean a;
    public final int b;
    public final zaz0 c;
    public final Set d;
    public final Set e;
    public final Set f;
    public final Set g;
    public final Set h;
    public final boolean i;
    public final Set j;
    public final Set k;
    public final boolean l;
    public final boolean m;
    public final Set n;

    public /* synthetic */ bbz0(boolean z, int i, Set set, Set set2, Set set3, Set set4, Set set5, boolean z2, Set set6, Set set7, boolean z3, boolean z4, t380 t380Var, int i2) {
        this(z, i, zaz0.c, set, set2, set3, set4, set5, z2, set6, set7, (i2 & 2048) != 0 ? false : z3, (i2 & 4096) != 0 ? false : z4, (Set) ((i2 & 8192) != 0 ? w7x.a : t380Var));
    }

    public static bbz0 a(bbz0 bbz0Var, zaz0 zaz0Var, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, int i) {
        return new bbz0(bbz0Var.a, bbz0Var.b, zaz0Var, bbz0Var.d, bbz0Var.e, bbz0Var.f, bbz0Var.g, bbz0Var.h, bbz0Var.i, (i & 512) != 0 ? bbz0Var.j : linkedHashSet, (i & 1024) != 0 ? bbz0Var.k : linkedHashSet2, bbz0Var.l, bbz0Var.m, bbz0Var.n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbz0)) {
            return false;
        }
        bbz0 bbz0Var = (bbz0) obj;
        return this.a == bbz0Var.a && this.b == bbz0Var.b && this.c == bbz0Var.c && u890.j(this.d, bbz0Var.d) && u890.j(this.e, bbz0Var.e) && u890.j(this.f, bbz0Var.f) && u890.j(this.g, bbz0Var.g) && u890.j(this.h, bbz0Var.h) && this.i == bbz0Var.i && u890.j(this.j, bbz0Var.j) && u890.j(this.k, bbz0Var.k) && this.l == bbz0Var.l && this.m == bbz0Var.m && u890.j(this.n, bbz0Var.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + xcg1.g(xcg1.g(gvg.c(gvg.c(xcg1.g(gvg.c(gvg.c(gvg.c(gvg.c(gvg.c((this.c.hashCode() + ab80.k(this.b, Boolean.hashCode(this.a) * 31, 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
    }

    public bbz0(boolean z, int i, zaz0 zaz0Var, Set set, Set set2, Set set3, Set set4, Set set5, boolean z2, Set set6, Set set7, boolean z3, boolean z4, Set set8) {
        this.a = z;
        this.b = i;
        this.c = zaz0Var;
        this.d = set;
        this.e = set2;
        this.f = set3;
        this.g = set4;
        this.h = set5;
        this.i = z2;
        this.j = set6;
        this.k = set7;
        this.l = z3;
        this.m = z4;
        this.n = set8;
    }
}
