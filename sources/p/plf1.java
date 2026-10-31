package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class plf1 {
    public final String A;
    public final Integer B;
    public final String C;
    public final String D;
    public final boolean E;
    public final boolean F;
    public final int G;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final d8r0 h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final p7w l;
    public final List m;
    public final q8b n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f33p;
    public final aql q;
    public final int r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final List z;

    public plf1(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, d8r0 d8r0Var, String str8, boolean z, boolean z2, p7w p7wVar, List list, q8b q8bVar, boolean z3, boolean z4, aql aqlVar, int i2, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, ArrayList arrayList, String str9, Integer num, String str10, String str11, boolean z12, int i3, int i4) {
        boolean z13 = (i3 & 4194304) != 0 ? false : z8;
        boolean z14 = (i3 & 8388608) != 0 ? false : z9;
        boolean z15 = (i3 & 16777216) != 0 ? false : z10;
        ArrayList arrayList2 = (i3 & 67108864) != 0 ? z6x.a : arrayList;
        Integer num2 = (i3 & 268435456) != 0 ? null : num;
        String str12 = (i3 & 536870912) == 0 ? str10 : null;
        String str13 = (i3 & 1073741824) != 0 ? "" : str11;
        boolean z16 = (i3 & Integer.MIN_VALUE) == 0;
        boolean z17 = (i4 & 1) == 0 ? z12 : false;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.G = i;
        this.h = d8r0Var;
        this.i = str8;
        this.j = z;
        this.k = z2;
        this.l = p7wVar;
        this.m = list;
        this.n = q8bVar;
        this.o = z3;
        this.f33p = z4;
        this.q = aqlVar;
        this.r = i2;
        this.s = z5;
        this.t = z6;
        this.u = z7;
        this.v = z13;
        this.w = z14;
        this.x = z15;
        this.y = z11;
        this.z = arrayList2;
        this.A = str9;
        this.B = num2;
        this.C = str12;
        this.D = str13;
        this.E = z16;
        this.F = z17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof plf1)) {
            return false;
        }
        plf1 plf1Var = (plf1) obj;
        return u890.j(this.a, plf1Var.a) && u890.j(this.b, plf1Var.b) && u890.j(this.c, plf1Var.c) && u890.j(this.d, plf1Var.d) && u890.j(this.e, plf1Var.e) && u890.j(this.f, plf1Var.f) && u890.j(this.g, plf1Var.g) && this.G == plf1Var.G && this.h.equals(plf1Var.h) && u890.j(this.i, plf1Var.i) && this.j == plf1Var.j && this.k == plf1Var.k && u890.j(this.l, plf1Var.l) && this.m.equals(plf1Var.m) && this.n.equals(plf1Var.n) && this.o == plf1Var.o && this.f33p == plf1Var.f33p && u890.j(this.q, plf1Var.q) && this.r == plf1Var.r && this.s == plf1Var.s && this.t == plf1Var.t && this.u == plf1Var.u && this.v == plf1Var.v && this.w == plf1Var.w && this.x == plf1Var.x && this.y == plf1Var.y && this.z.equals(plf1Var.z) && u890.j(this.A, plf1Var.A) && u890.j(this.B, plf1Var.B) && u890.j(this.C, plf1Var.C) && this.D.equals(plf1Var.D) && this.E == plf1Var.E && this.F == plf1Var.F;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int iG = xcg1.g(xcg1.g(cy30.d(hrt.i(this.h, ab80.k(this.G, (iD + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.i), 31, this.j), 31, this.k);
        p7w p7wVar = this.l;
        int iD2 = cy30.d(f4i1.b(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(kaa0.f(this.r, (this.q.hashCode() + xcg1.g(xcg1.g((this.n.hashCode() + f4i1.b((iG + (p7wVar == null ? 0 : p7wVar.hashCode())) * 31, 31, this.m)) * 31, 31, this.o), 31, this.f33p)) * 31, 31), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A);
        Integer num = this.B;
        int iHashCode = (iD2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.C;
        return Boolean.hashCode(this.F) + xcg1.g(cy30.d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.D), 31, this.E);
    }
}
