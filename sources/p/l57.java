package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l57 {
    public final boolean a;
    public final pia1 b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final Boolean i;
    public final List j;
    public final Set k;
    public final Set l;
    public final Set m;
    public final Set n;
    public final boolean o;

    public l57(boolean z, pia1 pia1Var, boolean z2, boolean z3, String str, boolean z4, boolean z5, boolean z6, Boolean bool, List list, Set set, Set set2, Set set3, Set set4, boolean z7) {
        this.a = z;
        this.b = pia1Var;
        this.c = z2;
        this.d = z3;
        this.e = str;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = bool;
        this.j = list;
        this.k = set;
        this.l = set2;
        this.m = set3;
        this.n = set4;
        this.o = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l57)) {
            return false;
        }
        l57 l57Var = (l57) obj;
        return this.a == l57Var.a && this.b == l57Var.b && this.c == l57Var.c && this.d == l57Var.d && u890.j(this.e, l57Var.e) && this.f == l57Var.f && this.g == l57Var.g && this.h == l57Var.h && u890.j(this.i, l57Var.i) && u890.j(this.j, l57Var.j) && u890.j(this.k, l57Var.k) && u890.j(this.l, l57Var.l) && u890.j(this.m, l57Var.m) && u890.j(this.n, l57Var.n) && this.o == l57Var.o;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        int iG2 = xcg1.g(xcg1.g(xcg1.g((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h);
        Boolean bool = this.i;
        return Boolean.hashCode(this.o) + gvg.c(gvg.c(gvg.c(gvg.c(f4i1.b((iG2 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
    }
}
