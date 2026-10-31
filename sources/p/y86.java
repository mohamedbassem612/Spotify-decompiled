package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y86 {
    public final String A;
    public final bro1 B;
    public final boolean C;
    public final boolean D;
    public final Set E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final z740 I;
    public final z740 J;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final ie40 i;
    public final boolean j;
    public final boolean k;
    public final mvh1 l;
    public final mvh1 m;
    public final nmu0 n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f99p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final List u;
    public final List v;
    public final boolean w;
    public final xw51 x;
    public final xw51 y;
    public final String z;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ y86(String str, String str2, String str3, boolean z, String str4, boolean z2, boolean z3, mvh1 mvh1Var, nmu0 nmu0Var, boolean z4, boolean z5, boolean z6, boolean z7, ArrayList arrayList, List list, boolean z8, xw51 xw51Var, String str5, boolean z9, boolean z10, Set set, boolean z11, boolean z12, z740 z740Var, z740 z740Var2, int i, int i2) {
        boolean z13 = (i & 2048) != 0 ? false : z3;
        mvh1 mvh1Var2 = (65536 & i) != 0 ? jvh1.a : mvh1Var;
        nmu0 nmu0Var2 = (262144 & i) != 0 ? nmu0.a : nmu0Var;
        boolean z14 = (524288 & i) != 0 ? false : z4;
        boolean z15 = (2097152 & i) != 0 ? false : z5;
        boolean z16 = (4194304 & i) != 0 ? false : z6;
        boolean z17 = (16777216 & i) != 0 ? true : z7;
        int i3 = 33554432 & i;
        z6x z6xVar = z6x.a;
        List list2 = i3 != 0 ? z6xVar : arrayList;
        List list3 = (67108864 & i) != 0 ? z6xVar : list;
        boolean z18 = (134217728 & i) != 0 ? false : z8;
        xw51 xw51Var2 = (268435456 & i) != 0 ? null : xw51Var;
        String str6 = (i & 1073741824) != 0 ? null : str5;
        this(str, str2, str3, str3, z, str4, z2, z13, ge40.a, false, false, mvh1Var2, mvh1Var2, nmu0Var2, z14, false, z15, z16, false, z17, list2, list3, z18, xw51Var2, xw51Var2, str6, str6, yk7.b, (i2 & 2) != 0 ? false : z9, (i2 & 4) != 0 ? false : z10, (i2 & 8) != 0 ? w7x.a : set, false, (i2 & 32) != 0 ? false : z11, (i2 & 64) != 0 ? false : z12, (i2 & 128) != 0 ? null : z740Var, (i2 & 256) != 0 ? null : z740Var2);
    }

    public static y86 a(y86 y86Var, String str, boolean z, boolean z2, ie40 ie40Var, boolean z3, boolean z4, mvh1 mvh1Var, nmu0 nmu0Var, boolean z5, boolean z6, List list, xw51 xw51Var, String str2, bro1 bro1Var, Set set, boolean z7, z740 z740Var, z740 z740Var2, int i, int i2) {
        String str3 = y86Var.a;
        String str4 = y86Var.b;
        String str5 = (i & 4) != 0 ? y86Var.c : str;
        y86Var.getClass();
        y86Var.getClass();
        y86Var.getClass();
        y86Var.getClass();
        String str6 = y86Var.d;
        String str7 = str5;
        boolean z8 = y86Var.e;
        String str8 = y86Var.f;
        boolean z9 = (i & 1024) != 0 ? y86Var.g : z;
        boolean z10 = (i & 2048) != 0 ? y86Var.h : z2;
        ie40 ie40Var2 = (i & 4096) != 0 ? y86Var.i : ie40Var;
        boolean z11 = (i & 8192) != 0 ? y86Var.j : z3;
        boolean z12 = (i & 16384) != 0 ? y86Var.k : z4;
        y86Var.getClass();
        mvh1 mvh1Var2 = (65536 & i) != 0 ? y86Var.l : mvh1Var;
        boolean z13 = z9;
        ie40 ie40Var3 = ie40Var2;
        boolean z14 = z12;
        mvh1 mvh1Var3 = y86Var.m;
        nmu0 nmu0Var2 = (i & 262144) != 0 ? y86Var.n : nmu0Var;
        boolean z15 = y86Var.o;
        boolean z16 = (i & 1048576) != 0 ? y86Var.f99p : z5;
        boolean z17 = y86Var.q;
        boolean z18 = y86Var.r;
        boolean z19 = (i & 8388608) != 0 ? y86Var.s : true;
        boolean z20 = (i & 16777216) != 0 ? y86Var.t : z6;
        List list2 = (i & 33554432) != 0 ? y86Var.u : list;
        List list3 = y86Var.v;
        boolean z21 = y86Var.w;
        xw51 xw51Var2 = (i & 268435456) != 0 ? y86Var.x : xw51Var;
        xw51 xw51Var3 = y86Var.y;
        String str9 = (i & 1073741824) != 0 ? y86Var.z : str2;
        String str10 = y86Var.A;
        bro1 bro1Var2 = (i2 & 1) != 0 ? y86Var.B : bro1Var;
        boolean z22 = y86Var.C;
        boolean z23 = y86Var.D;
        Set set2 = (i2 & 8) != 0 ? y86Var.E : set;
        boolean z24 = (i2 & 16) != 0 ? y86Var.F : true;
        boolean z25 = y86Var.G;
        boolean z26 = (i2 & 64) != 0 ? y86Var.H : z7;
        z740 z740Var3 = (i2 & 128) != 0 ? y86Var.I : z740Var;
        z740 z740Var4 = (i2 & 256) != 0 ? y86Var.J : z740Var2;
        y86Var.getClass();
        y86Var.getClass();
        return new y86(str3, str4, str7, str6, z8, str8, z13, z10, ie40Var3, z11, z14, mvh1Var2, mvh1Var3, nmu0Var2, z15, z16, z17, z18, z19, z20, list2, list3, z21, xw51Var2, xw51Var3, str9, str10, bro1Var2, z22, z23, set2, z24, z25, z26, z740Var3, z740Var4);
    }

    public final boolean b() {
        if (this.q) {
            return true;
        }
        return this.e && this.v.contains("UPDATE_GENERATION_MODE");
    }

    public final z740 c() {
        if (this.G) {
            if (this.H) {
                return this.I;
            }
            return null;
        }
        if (this.h) {
            return this.J;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y86)) {
            return false;
        }
        y86 y86Var = (y86) obj;
        return u890.j(this.a, y86Var.a) && u890.j(this.b, y86Var.b) && u890.j(this.c, y86Var.c) && u890.j(this.d, y86Var.d) && this.e == y86Var.e && u890.j(this.f, y86Var.f) && this.g == y86Var.g && this.h == y86Var.h && u890.j(this.i, y86Var.i) && this.j == y86Var.j && this.k == y86Var.k && u890.j(this.l, y86Var.l) && u890.j(this.m, y86Var.m) && this.n == y86Var.n && this.o == y86Var.o && this.f99p == y86Var.f99p && this.q == y86Var.q && this.r == y86Var.r && this.s == y86Var.s && this.t == y86Var.t && u890.j(this.u, y86Var.u) && u890.j(this.v, y86Var.v) && this.w == y86Var.w && u890.j(this.x, y86Var.x) && u890.j(this.y, y86Var.y) && u890.j(this.z, y86Var.z) && u890.j(this.A, y86Var.A) && u890.j(this.B, y86Var.B) && this.C == y86Var.C && this.D == y86Var.D && u890.j(this.E, y86Var.E) && this.F == y86Var.F && this.G == y86Var.G && this.H == y86Var.H && u890.j(this.I, y86Var.I) && u890.j(this.J, y86Var.J);
    }

    public final int hashCode() {
        String str = this.a;
        int iG = xcg1.g(f4i1.b(f4i1.b(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + kaa0.f(0, xcg1.g(xcg1.g((this.i.hashCode() + xcg1.g(xcg1.g(cy30.d(xcg1.g(cy30.d(cy30.d(cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 28629151, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31, 31, this.j), 31, this.k), 31)) * 31)) * 31)) * 31, 31, this.o), 31, this.f99p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w);
        xw51 xw51Var = this.x;
        int iHashCode = (iG + (xw51Var == null ? 0 : xw51Var.hashCode())) * 31;
        xw51 xw51Var2 = this.y;
        int iHashCode2 = (iHashCode + (xw51Var2 == null ? 0 : xw51Var2.hashCode())) * 31;
        String str2 = this.z;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A;
        int iG2 = xcg1.g(xcg1.g(xcg1.g(gvg.c(xcg1.g(xcg1.g((this.B.hashCode() + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31, this.C), 31, this.D), 31, this.E), 31, this.F), 31, this.G), 31, this.H);
        z740 z740Var = this.I;
        int iHashCode4 = (iG2 + (z740Var == null ? 0 : z740Var.hashCode())) * 31;
        z740 z740Var2 = this.J;
        return (iHashCode4 + (z740Var2 != null ? z740Var2.hashCode() : 0)) * 31;
    }

    public y86(String str, String str2, String str3, String str4, boolean z, String str5, boolean z2, boolean z3, ie40 ie40Var, boolean z4, boolean z5, mvh1 mvh1Var, mvh1 mvh1Var2, nmu0 nmu0Var, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, List list, List list2, boolean z12, xw51 xw51Var, xw51 xw51Var2, String str6, String str7, bro1 bro1Var, boolean z13, boolean z14, Set set, boolean z15, boolean z16, boolean z17, z740 z740Var, z740 z740Var2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = str5;
        this.g = z2;
        this.h = z3;
        this.i = ie40Var;
        this.j = z4;
        this.k = z5;
        this.l = mvh1Var;
        this.m = mvh1Var2;
        this.n = nmu0Var;
        this.o = z6;
        this.f99p = z7;
        this.q = z8;
        this.r = z9;
        this.s = z10;
        this.t = z11;
        this.u = list;
        this.v = list2;
        this.w = z12;
        this.x = xw51Var;
        this.y = xw51Var2;
        this.z = str6;
        this.A = str7;
        this.B = bro1Var;
        this.C = z13;
        this.D = z14;
        this.E = set;
        this.F = z15;
        this.G = z16;
        this.H = z17;
        this.I = z740Var;
        this.J = z740Var2;
    }
}
