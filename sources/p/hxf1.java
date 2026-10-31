package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hxf1 {
    public final int a;
    public final String b;
    public final List c;
    public final g07 d;
    public final k4m e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final o1v k;
    public final fxf1 l;
    public final uez0 m;
    public final String n;
    public final int o;

    public hxf1(int i, String str, List list, g07 g07Var, k4m k4mVar, int i2, boolean z, boolean z2, boolean z3, boolean z4, o1v o1vVar, fxf1 fxf1Var, uez0 uez0Var, String str2, int i3) {
        this.a = i;
        this.b = str;
        this.c = list;
        this.d = g07Var;
        this.e = k4mVar;
        this.f = i2;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = o1vVar;
        this.l = fxf1Var;
        this.m = uez0Var;
        this.n = str2;
        this.o = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxf1)) {
            return false;
        }
        hxf1 hxf1Var = (hxf1) obj;
        return this.a == hxf1Var.a && this.b.equals(hxf1Var.b) && u890.j(this.c, hxf1Var.c) && this.d.equals(hxf1Var.d) && this.e == hxf1Var.e && this.f == hxf1Var.f && this.g == hxf1Var.g && this.h == hxf1Var.h && this.i == hxf1Var.i && this.j == hxf1Var.j && this.k == hxf1Var.k && this.l == hxf1Var.l && u890.j(this.m, hxf1Var.m) && u890.j(this.n, hxf1Var.n) && this.o == hxf1Var.o;
    }

    public final int hashCode() {
        int iHashCode = (this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(ab80.k(this.f, p3d1.g(this.e, (this.d.hashCode() + f4i1.b(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31, 31), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j)) * 31)) * 31)) * 31;
        String str = this.n;
        return Integer.hashCode(this.o) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
