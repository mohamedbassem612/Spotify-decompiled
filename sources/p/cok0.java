package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cok0 {
    public final boolean A;
    public final Float B;
    public final float C;
    public final lhg1 a;
    public final azb b;
    public final hdl1 c;
    public final ycu0 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f3p;
    public final boolean q;
    public final Integer r;
    public final Integer s;
    public final vik0 t;
    public final pik0 u;
    public final pik0 v;
    public final vik0 w;
    public final int x;
    public final ArrayList y;
    public final boolean z;

    public cok0(lhg1 lhg1Var, azb azbVar, hdl1 hdl1Var, ycu0 ycu0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i, boolean z12, Integer num, Integer num2, vik0 vik0Var, pik0 pik0Var, pik0 pik0Var2, vik0 vik0Var2, int i2, ArrayList arrayList, boolean z13, boolean z14, Float f, float f2) {
        this.a = lhg1Var;
        this.b = azbVar;
        this.c = hdl1Var;
        this.d = ycu0Var;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = z9;
        this.n = z10;
        this.o = z11;
        this.f3p = i;
        this.q = z12;
        this.r = num;
        this.s = num2;
        this.t = vik0Var;
        this.u = pik0Var;
        this.v = pik0Var2;
        this.w = vik0Var2;
        this.x = i2;
        this.y = arrayList;
        this.z = z13;
        this.A = z14;
        this.B = f;
        this.C = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cok0) {
            cok0 cok0Var = (cok0) obj;
            if (u890.j(this.a, cok0Var.a) && this.b.equals(cok0Var.b) && this.c.equals(cok0Var.c) && u890.j(this.d, cok0Var.d) && this.e == cok0Var.e && this.f == cok0Var.f && this.g == cok0Var.g && this.h == cok0Var.h && this.i == cok0Var.i && this.j == cok0Var.j && this.k == cok0Var.k && this.l == cok0Var.l && this.m == cok0Var.m && this.n == cok0Var.n && this.o == cok0Var.o && this.f3p == cok0Var.f3p && this.q == cok0Var.q && u890.j(this.r, cok0Var.r) && u890.j(this.s, cok0Var.s) && this.t == cok0Var.t && this.u == cok0Var.u && this.v == cok0Var.v && this.w == cok0Var.w && this.x == cok0Var.x && this.y.equals(cok0Var.y) && this.z == cok0Var.z && this.A == cok0Var.A && u890.j(this.B, cok0Var.B) && Float.compare(this.C, cok0Var.C) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iG = xcg1.g(kaa0.f(this.f3p, xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((this.d.hashCode() + xcg1.g((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, false)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, false), 31, this.o), 31), 31, this.q);
        Integer num = this.r;
        int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.s;
        int iG2 = xcg1.g(xcg1.g(p3d1.f(this.y, kaa0.f(this.x, (this.w.hashCode() + ((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31, 31), 31), 31, this.z), 31, this.A);
        Float f = this.B;
        return Float.hashCode(this.C) + ((iG2 + (f != null ? f.hashCode() : 0)) * 31);
    }
}
