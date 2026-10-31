package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ly80 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final krm0 m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f27p;
    public final boolean q;
    public final String r;
    public final boolean s;
    public final boolean t;
    public final jy80 u;

    public ly80(String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, krm0 krm0Var, boolean z11, boolean z12, String str3, boolean z13, String str4, boolean z14, boolean z15, jy80 jy80Var) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str2;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = z8;
        this.k = z9;
        this.l = z10;
        this.m = krm0Var;
        this.n = z11;
        this.o = z12;
        this.f27p = str3;
        this.q = z13;
        this.r = str4;
        this.s = z14;
        this.t = z15;
        this.u = jy80Var;
    }

    public static ly80 a(ly80 ly80Var, String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, krm0 krm0Var, boolean z11, boolean z12, String str3, boolean z13, String str4, boolean z14, boolean z15, jy80 jy80Var, int i) {
        String str5 = (i & 1) != 0 ? ly80Var.a : str;
        return new ly80(str5, (i & 2) != 0 ? ly80Var.b : z, (i & 4) != 0 ? ly80Var.c : z2, (i & 8) != 0 ? ly80Var.d : z3, (i & 16) != 0 ? ly80Var.e : str2, (i & 32) != 0 ? ly80Var.f : z4, (i & 64) != 0 ? ly80Var.g : z5, (i & 128) != 0 ? ly80Var.h : z6, (i & 256) != 0 ? ly80Var.i : z7, (i & 512) != 0 ? ly80Var.j : z8, (i & 1024) != 0 ? ly80Var.k : z9, (i & 2048) != 0 ? ly80Var.l : z10, (i & 4096) != 0 ? ly80Var.m : krm0Var, (i & 8192) != 0 ? ly80Var.n : z11, (i & 16384) != 0 ? ly80Var.o : z12, (i & 32768) != 0 ? ly80Var.f27p : str3, (i & 65536) != 0 ? ly80Var.q : z13, (i & 131072) != 0 ? ly80Var.r : str4, (i & 262144) != 0 ? ly80Var.s : z14, (i & 524288) != 0 ? ly80Var.t : z15, (i & 1048576) != 0 ? ly80Var.u : jy80Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ly80)) {
            return false;
        }
        ly80 ly80Var = (ly80) obj;
        return u890.j(this.a, ly80Var.a) && this.b == ly80Var.b && this.c == ly80Var.c && this.d == ly80Var.d && u890.j(this.e, ly80Var.e) && this.f == ly80Var.f && this.g == ly80Var.g && this.h == ly80Var.h && this.i == ly80Var.i && this.j == ly80Var.j && this.k == ly80Var.k && this.l == ly80Var.l && this.m == ly80Var.m && this.n == ly80Var.n && this.o == ly80Var.o && u890.j(this.f27p, ly80Var.f27p) && this.q == ly80Var.q && u890.j(this.r, ly80Var.r) && this.s == ly80Var.s && this.t == ly80Var.t && this.u == ly80Var.u;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g((this.m.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.d(xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l)) * 31, 31, this.n), 31, this.o);
        String str = this.f27p;
        int iG2 = xcg1.g((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.q);
        String str2 = this.r;
        int iG3 = xcg1.g(xcg1.g((iG2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.s), 31, this.t);
        jy80 jy80Var = this.u;
        return iG3 + (jy80Var != null ? jy80Var.hashCode() : 0);
    }

    public /* synthetic */ ly80(String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, String str3, boolean z12, jy80 jy80Var) {
        this(str, z, z2, z3, str2, z4, z5, z6, z7, z8, z9, z10, krm0.a, false, false, null, z11, str3, z12, false, jy80Var);
    }
}
