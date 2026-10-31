package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fjf1 implements lkj0 {
    public final xif1 a;
    public final List b;
    public final boolean c;
    public final boolean d;
    public final ltt0 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final int j;

    public fjf1(xif1 xif1Var, List list, boolean z, boolean z2, ltt0 ltt0Var, boolean z3, boolean z4, boolean z5, String str, int i) {
        this.a = xif1Var;
        this.b = list;
        this.c = z;
        this.d = z2;
        this.e = ltt0Var;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = str;
        this.j = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjf1)) {
            return false;
        }
        fjf1 fjf1Var = (fjf1) obj;
        return this.a.equals(fjf1Var.a) && this.b.equals(fjf1Var.b) && this.c == fjf1Var.c && this.d == fjf1Var.d && this.e == fjf1Var.e && this.f == fjf1Var.f && this.g == fjf1Var.g && this.h == fjf1Var.h && u890.j(this.i, fjf1Var.i) && this.j == fjf1Var.j;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g((this.e.hashCode() + xcg1.g(xcg1.g(f4i1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g), 31, this.h);
        String str = this.i;
        return Integer.hashCode(this.j) + ((iG + (str == null ? 0 : str.hashCode())) * 31);
    }
}
