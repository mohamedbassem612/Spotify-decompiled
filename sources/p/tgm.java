package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tgm {
    public final p860 A;
    public final mgo0 B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final int F;
    public final int G;
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final yh10 i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f115p;
    public final boolean q;
    public final iu30 r;
    public final boolean s;
    public final boolean t;
    public final g371 u;
    public final c821 v;
    public final boolean w;
    public final String x;
    public final sgm y;
    public final iu30 z;

    public /* synthetic */ tgm(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, yh10 yh10Var, boolean z7, boolean z8, int i, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, iu30 iu30Var, boolean z14, boolean z15, g371 g371Var, c821 c821Var, boolean z16, String str2, iu30 iu30Var2, p860 p860Var, mgo0 mgo0Var, boolean z17, boolean z18, int i2, int i3) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? true : z3, (i2 & 16) != 0, (i2 & 32) != 0 ? true : z4, (i2 & 64) != 0 ? true : z5, (i2 & 128) != 0 ? false : z6, (i2 & 256) != 0 ? null : yh10Var, (i2 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? false : z7, (i2 & 1024) != 0 ? true : z8, (i2 & 2048) != 0 ? 3 : i, (i2 & 4096) != 0, (i2 & 8192) != 0 ? false : z9, (i2 & 16384) != 0 ? true : z10, (32768 & i2) != 0 ? false : z11, (65536 & i2) != 0 ? false : z12, (131072 & i2) != 0 ? false : z13, (262144 & i2) != 0 ? 2 : 1, (524288 & i2) != 0 ? null : iu30Var, (1048576 & i2) != 0 ? false : z14, (2097152 & i2) != 0 ? false : z15, (4194304 & i2) != 0 ? new g371() : g371Var, (8388608 & i2) != 0 ? b821.a : c821Var, (16777216 & i2) != 0 ? false : z16, (33554432 & i2) != 0 ? null : str2, null, (134217728 & i2) != 0 ? null : iu30Var2, (268435456 & i2) != 0 ? null : p860Var, (536870912 & i2) != 0 ? null : mgo0Var, (1073741824 & i2) != 0 ? false : z17, (i2 & Integer.MIN_VALUE) != 0 ? false : z18, (i3 & 1) != 0);
    }

    public static tgm a(tgm tgmVar, boolean z, boolean z2, int i, boolean z3, sgm sgmVar, iu30 iu30Var, p860 p860Var, boolean z4, int i2) {
        String str = tgmVar.a;
        boolean z5 = tgmVar.b;
        boolean z6 = (i2 & 4) != 0 ? tgmVar.c : false;
        boolean z7 = tgmVar.d;
        boolean z8 = z6;
        boolean z9 = tgmVar.e;
        boolean z10 = tgmVar.f;
        boolean z11 = (i2 & 64) != 0 ? tgmVar.g : z;
        boolean z12 = tgmVar.h;
        boolean z13 = z11;
        yh10 yh10Var = tgmVar.i;
        boolean z14 = tgmVar.j;
        boolean z15 = (i2 & 1024) != 0 ? tgmVar.k : z2;
        int i3 = (i2 & 2048) != 0 ? tgmVar.F : i;
        boolean z16 = tgmVar.l;
        boolean z17 = z15;
        int i4 = i3;
        boolean z18 = tgmVar.m;
        boolean z19 = tgmVar.n;
        boolean z20 = tgmVar.o;
        boolean z21 = tgmVar.f115p;
        boolean z22 = (i2 & 131072) != 0 ? tgmVar.q : z3;
        int i5 = tgmVar.G;
        iu30 iu30Var2 = tgmVar.r;
        boolean z23 = tgmVar.s;
        boolean z24 = tgmVar.t;
        g371 g371Var = tgmVar.u;
        c821 c821Var = tgmVar.v;
        boolean z25 = tgmVar.w;
        String str2 = tgmVar.x;
        sgm sgmVar2 = (i2 & 67108864) != 0 ? tgmVar.y : sgmVar;
        iu30 iu30Var3 = (i2 & 134217728) != 0 ? tgmVar.z : iu30Var;
        p860 p860Var2 = (i2 & 268435456) != 0 ? tgmVar.A : p860Var;
        mgo0 mgo0Var = tgmVar.B;
        boolean z26 = tgmVar.C;
        boolean z27 = (i2 & Integer.MIN_VALUE) != 0 ? tgmVar.D : z4;
        boolean z28 = tgmVar.E;
        tgmVar.getClass();
        return new tgm(str, z5, z8, z7, z9, z10, z13, z12, yh10Var, z14, z17, i4, z16, z18, z19, z20, z21, z22, i5, iu30Var2, z23, z24, g371Var, c821Var, z25, str2, sgmVar2, iu30Var3, p860Var2, mgo0Var, z26, z27, z28);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgm)) {
            return false;
        }
        tgm tgmVar = (tgm) obj;
        return u890.j(this.a, tgmVar.a) && this.b == tgmVar.b && this.c == tgmVar.c && this.d == tgmVar.d && this.e == tgmVar.e && this.f == tgmVar.f && this.g == tgmVar.g && this.h == tgmVar.h && u890.j(this.i, tgmVar.i) && this.j == tgmVar.j && this.k == tgmVar.k && this.F == tgmVar.F && this.l == tgmVar.l && this.m == tgmVar.m && this.n == tgmVar.n && this.o == tgmVar.o && this.f115p == tgmVar.f115p && this.q == tgmVar.q && this.G == tgmVar.G && u890.j(this.r, tgmVar.r) && this.s == tgmVar.s && this.t == tgmVar.t && u890.j(this.u, tgmVar.u) && u890.j(this.v, tgmVar.v) && this.w == tgmVar.w && u890.j(this.x, tgmVar.x) && u890.j(this.y, tgmVar.y) && u890.j(this.z, tgmVar.z) && u890.j(this.A, tgmVar.A) && u890.j(this.B, tgmVar.B) && this.C == tgmVar.C && this.D == tgmVar.D && this.E == tgmVar.E;
    }

    public final int hashCode() {
        String str = this.a;
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        yh10 yh10Var = this.i;
        int iK = ab80.k(this.G, xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(ab80.k(this.F, xcg1.g(xcg1.g((iG + (yh10Var == null ? 0 : yh10Var.hashCode())) * 31, 31, this.j), 31, this.k), 31), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.f115p), 31, this.q), 31);
        iu30 iu30Var = this.r;
        int iG2 = xcg1.g((this.v.hashCode() + ((this.u.hashCode() + xcg1.g(xcg1.g((iK + (iu30Var == null ? 0 : iu30Var.hashCode())) * 31, 31, this.s), 31, this.t)) * 31)) * 31, 31, this.w);
        String str2 = this.x;
        int iHashCode = (iG2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        sgm sgmVar = this.y;
        int iHashCode2 = (iHashCode + (sgmVar == null ? 0 : sgmVar.hashCode())) * 31;
        iu30 iu30Var2 = this.z;
        int iHashCode3 = (iHashCode2 + (iu30Var2 == null ? 0 : iu30Var2.hashCode())) * 31;
        p860 p860Var = this.A;
        int iHashCode4 = (iHashCode3 + (p860Var == null ? 0 : p860Var.hashCode())) * 31;
        mgo0 mgo0Var = this.B;
        return Boolean.hashCode(this.E) + xcg1.g(xcg1.g((iHashCode4 + (mgo0Var != null ? mgo0Var.hashCode() : 0)) * 31, 31, this.C), 31, this.D);
    }

    public tgm(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, yh10 yh10Var, boolean z8, boolean z9, int i, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i2, iu30 iu30Var, boolean z16, boolean z17, g371 g371Var, c821 c821Var, boolean z18, String str2, sgm sgmVar, iu30 iu30Var2, p860 p860Var, mgo0 mgo0Var, boolean z19, boolean z20, boolean z21) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = yh10Var;
        this.j = z8;
        this.k = z9;
        this.F = i;
        this.l = z10;
        this.m = z11;
        this.n = z12;
        this.o = z13;
        this.f115p = z14;
        this.q = z15;
        this.G = i2;
        this.r = iu30Var;
        this.s = z16;
        this.t = z17;
        this.u = g371Var;
        this.v = c821Var;
        this.w = z18;
        this.x = str2;
        this.y = sgmVar;
        this.z = iu30Var2;
        this.A = p860Var;
        this.B = mgo0Var;
        this.C = z19;
        this.D = z20;
        this.E = z21;
    }
}
