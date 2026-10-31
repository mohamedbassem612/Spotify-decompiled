package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d4m1 {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final gj4 E;
    public final qu61 F;
    public final String a;
    public final boolean b;
    public final boolean c;
    public final ws61 d;
    public final String e;
    public final boolean f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final boolean l;
    public final puc m;
    public final int n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f7p;
    public final boolean q;
    public final String r;
    public final List s;
    public final Set t;
    public final Integer u;
    public final boolean v;
    public final gzl1 w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public d4m1(String str, boolean z, boolean z2, ws61 ws61Var, String str2, boolean z3, int i, int i2, int i3, int i4, int i5, boolean z4, puc pucVar, int i6, int i7, int i8, boolean z5, String str3, List list, Set set, Integer num, boolean z6, gzl1 gzl1Var, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, gj4 gj4Var, qu61 qu61Var) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = ws61Var;
        this.e = str2;
        this.f = z3;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.l = z4;
        this.m = pucVar;
        this.n = i6;
        this.o = i7;
        this.f7p = i8;
        this.q = z5;
        this.r = str3;
        this.s = list;
        this.t = set;
        this.u = num;
        this.v = z6;
        this.w = gzl1Var;
        this.x = z7;
        this.y = z8;
        this.z = z9;
        this.A = z10;
        this.B = z11;
        this.C = z12;
        this.D = z13;
        this.E = gj4Var;
        this.F = qu61Var;
    }

    public static d4m1 a(d4m1 d4m1Var, ws61 ws61Var, String str, boolean z, int i, int i2, int i3, int i4, int i5, boolean z2, puc pucVar, int i6, int i7, int i8, boolean z3, String str2, List list, Set set, Integer num, boolean z4, gzl1 gzl1Var, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, qu61 qu61Var, int i9) {
        String str3 = d4m1Var.a;
        boolean z12 = (i9 & 2) != 0 ? d4m1Var.b : true;
        boolean z13 = (i9 & 4) != 0 ? d4m1Var.c : true;
        ws61 ws61Var2 = (i9 & 8) != 0 ? d4m1Var.d : ws61Var;
        String str4 = (i9 & 16) != 0 ? d4m1Var.e : str;
        boolean z14 = (i9 & 32) != 0 ? d4m1Var.f : z;
        int i10 = (i9 & 64) != 0 ? d4m1Var.g : i;
        int i11 = (i9 & 128) != 0 ? d4m1Var.h : i2;
        int i12 = (i9 & 256) != 0 ? d4m1Var.i : i3;
        int i13 = (i9 & 512) != 0 ? d4m1Var.j : i4;
        int i14 = (i9 & 1024) != 0 ? d4m1Var.k : i5;
        boolean z15 = (i9 & 2048) != 0 ? d4m1Var.l : z2;
        puc pucVar2 = (i9 & 4096) != 0 ? d4m1Var.m : pucVar;
        int i15 = (i9 & 8192) != 0 ? d4m1Var.n : i6;
        int i16 = (i9 & 16384) != 0 ? d4m1Var.o : i7;
        int i17 = (i9 & 32768) != 0 ? d4m1Var.f7p : i8;
        boolean z16 = (i9 & 65536) != 0 ? d4m1Var.q : z3;
        String str5 = (i9 & 131072) != 0 ? d4m1Var.r : str2;
        List list2 = (i9 & 262144) != 0 ? d4m1Var.s : list;
        Set set2 = (i9 & 524288) != 0 ? d4m1Var.t : set;
        Integer num2 = (i9 & 1048576) != 0 ? d4m1Var.u : num;
        boolean z17 = (i9 & 2097152) != 0 ? d4m1Var.v : z4;
        gzl1 gzl1Var2 = (i9 & 4194304) != 0 ? d4m1Var.w : gzl1Var;
        boolean z18 = (i9 & 8388608) != 0 ? d4m1Var.x : z5;
        boolean z19 = (i9 & 16777216) != 0 ? d4m1Var.y : z6;
        boolean z20 = (i9 & 33554432) != 0 ? d4m1Var.z : z7;
        boolean z21 = (i9 & 67108864) != 0 ? d4m1Var.A : z8;
        boolean z22 = (i9 & 134217728) != 0 ? d4m1Var.B : z9;
        boolean z23 = (i9 & 268435456) != 0 ? d4m1Var.C : z10;
        boolean z24 = (i9 & 536870912) != 0 ? d4m1Var.D : z11;
        gj4 gj4Var = d4m1Var.E;
        qu61 qu61Var2 = (i9 & Integer.MIN_VALUE) != 0 ? d4m1Var.F : qu61Var;
        d4m1Var.getClass();
        return new d4m1(str3, z12, z13, ws61Var2, str4, z14, i10, i11, i12, i13, i14, z15, pucVar2, i15, i16, i17, z16, str5, list2, set2, num2, z17, gzl1Var2, z18, z19, z20, z21, z22, z23, z24, gj4Var, qu61Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4m1)) {
            return false;
        }
        d4m1 d4m1Var = (d4m1) obj;
        return u890.j(this.a, d4m1Var.a) && this.b == d4m1Var.b && this.c == d4m1Var.c && this.d == d4m1Var.d && this.e.equals(d4m1Var.e) && this.f == d4m1Var.f && this.g == d4m1Var.g && this.h == d4m1Var.h && this.i == d4m1Var.i && this.j == d4m1Var.j && this.k == d4m1Var.k && this.l == d4m1Var.l && u890.j(this.m, d4m1Var.m) && this.n == d4m1Var.n && this.o == d4m1Var.o && this.f7p == d4m1Var.f7p && this.q == d4m1Var.q && this.r.equals(d4m1Var.r) && u890.j(this.s, d4m1Var.s) && u890.j(this.t, d4m1Var.t) && u890.j(this.u, d4m1Var.u) && this.v == d4m1Var.v && this.w == d4m1Var.w && this.x == d4m1Var.x && this.y == d4m1Var.y && this.z == d4m1Var.z && this.A == d4m1Var.A && this.B == d4m1Var.B && this.C == d4m1Var.C && this.D == d4m1Var.D && this.E == d4m1Var.E && u890.j(this.F, d4m1Var.F);
    }

    public final int hashCode() {
        int iC = gvg.c(f4i1.b(cy30.d(xcg1.g(kaa0.f(this.f7p, kaa0.f(this.o, kaa0.f(this.n, (this.m.hashCode() + xcg1.g(kaa0.f(this.k, kaa0.f(this.j, kaa0.f(this.i, kaa0.f(this.h, kaa0.f(this.g, xcg1.g(cy30.d((this.d.hashCode() + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31), 31), 31), 31), 31), 31, this.l)) * 31, 31), 31), 31), 31, this.q), 31, this.r), 31, this.s), 31, this.t);
        Integer num = this.u;
        int iHashCode = (this.E.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((this.w.hashCode() + xcg1.g((iC + (num == null ? 0 : num.hashCode())) * 31, 31, this.v)) * 31, 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31, this.C), 31, this.D)) * 31;
        qu61 qu61Var = this.F;
        return iHashCode + (qu61Var != null ? qu61Var.hashCode() : 0);
    }
}
