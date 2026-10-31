package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p7c0 {
    public final int a;
    public final int b;
    public final fab0 c;
    public final boolean d;
    public final boolean e;
    public final dia1 f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final mml j;
    public final List k;
    public final List l;
    public final boolean m;

    public /* synthetic */ p7c0(int i, int i2, fab0 fab0Var, boolean z, boolean z2, dia1 dia1Var, boolean z3, boolean z4, boolean z5, mml mmlVar, List list, List list2, boolean z6, int i3) {
        this(i, i2, fab0Var, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, dia1Var, z3, z4, z5, (i3 & 512) != 0 ? jml.a : mmlVar, list, list2, (i3 & 4096) != 0 ? false : z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7c0)) {
            return false;
        }
        p7c0 p7c0Var = (p7c0) obj;
        return this.a == p7c0Var.a && this.b == p7c0Var.b && u890.j(this.c, p7c0Var.c) && this.d == p7c0Var.d && this.e == p7c0Var.e && this.f == p7c0Var.f && this.g == p7c0Var.g && this.h == p7c0Var.h && this.i == p7c0Var.i && u890.j(this.j, p7c0Var.j) && u890.j(this.k, p7c0Var.k) && u890.j(this.l, p7c0Var.l) && this.m == p7c0Var.m;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g((this.c.hashCode() + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31)) * 31, 31, this.d), 31, this.e);
        dia1 dia1Var = this.f;
        return Boolean.hashCode(this.m) + f4i1.b(f4i1.b((this.j.hashCode() + xcg1.g(xcg1.g(xcg1.g((iG + (dia1Var == null ? 0 : dia1Var.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31, 31, this.k), 31, this.l);
    }

    public p7c0(int i, int i2, fab0 fab0Var, boolean z, boolean z2, dia1 dia1Var, boolean z3, boolean z4, boolean z5, mml mmlVar, List list, List list2, boolean z6) {
        this.a = i;
        this.b = i2;
        this.c = fab0Var;
        this.d = z;
        this.e = z2;
        this.f = dia1Var;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = mmlVar;
        this.k = list;
        this.l = list2;
        this.m = z6;
    }
}
