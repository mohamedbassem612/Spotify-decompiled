package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r6z {
    public final p860 A;
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
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
    public final boolean f34p;
    public final ugo0 q;
    public final c821 r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final ok51 w;
    public final boolean x;
    public final String y;
    public final boolean z;

    public r6z(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, ugo0 ugo0Var, c821 c821Var, boolean z16, boolean z17, boolean z18, boolean z19, ok51 ok51Var, boolean z20, String str2, boolean z21, p860 p860Var, int i) {
        String str3 = (i & 1) != 0 ? null : str;
        boolean z22 = (i & 4) != 0 ? false : z2;
        boolean z23 = (i & 8) != 0 ? false : z3;
        boolean z24 = (i & 16) != 0 ? false : z4;
        boolean z25 = (i & 32) != 0 ? false : z5;
        boolean z26 = (i & 64) != 0 ? false : z6;
        boolean z27 = (i & 128) != 0 ? false : z7;
        boolean z28 = (i & 256) != 0 ? false : z8;
        boolean z29 = (i & 512) != 0 ? false : z9;
        boolean z30 = (i & 1024) != 0 ? false : z10;
        boolean z31 = (i & 2048) != 0 ? false : z11;
        boolean z32 = (i & 4096) != 0 ? false : z12;
        boolean z33 = (i & 8192) != 0 ? false : z13;
        boolean z34 = (i & 16384) != 0 ? false : z14;
        boolean z35 = (i & 32768) != 0 ? false : z15;
        ugo0 ugo0Var2 = (i & 65536) != 0 ? null : ugo0Var;
        c821 c821Var2 = (i & 131072) != 0 ? b821.a : c821Var;
        boolean z36 = (i & 262144) != 0 ? false : z16;
        boolean z37 = (i & 524288) != 0 ? false : z17;
        boolean z38 = (i & 4194304) != 0 ? false : z18;
        boolean z39 = (i & 16777216) != 0 ? false : z19;
        ok51 ok51Var2 = (i & 33554432) != 0 ? null : ok51Var;
        boolean z40 = (i & 67108864) != 0 ? false : z20;
        String str4 = (i & 134217728) != 0 ? null : str2;
        boolean z41 = (i & 268435456) != 0 ? false : z21;
        p860 p860Var2 = (i & 536870912) != 0 ? null : p860Var;
        this.a = str3;
        this.b = z;
        this.c = z22;
        this.d = z23;
        this.e = z24;
        this.f = z25;
        this.g = z26;
        this.h = z27;
        this.i = z28;
        this.j = z29;
        this.k = z30;
        this.l = z31;
        this.m = z32;
        this.n = z33;
        this.o = z34;
        this.f34p = z35;
        this.q = ugo0Var2;
        this.r = c821Var2;
        this.s = z36;
        this.t = z37;
        this.u = z38;
        this.v = z39;
        this.w = ok51Var2;
        this.x = z40;
        this.y = str4;
        this.z = z41;
        this.A = p860Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6z)) {
            return false;
        }
        r6z r6zVar = (r6z) obj;
        return u890.j(this.a, r6zVar.a) && this.b == r6zVar.b && this.c == r6zVar.c && this.d == r6zVar.d && this.e == r6zVar.e && this.f == r6zVar.f && this.g == r6zVar.g && this.h == r6zVar.h && this.i == r6zVar.i && this.j == r6zVar.j && this.k == r6zVar.k && this.l == r6zVar.l && this.m == r6zVar.m && this.n == r6zVar.n && this.o == r6zVar.o && this.f34p == r6zVar.f34p && u890.j(this.q, r6zVar.q) && this.r.equals(r6zVar.r) && this.s == r6zVar.s && this.t == r6zVar.t && this.u == r6zVar.u && this.v == r6zVar.v && u890.j(this.w, r6zVar.w) && this.x == r6zVar.x && u890.j(this.y, r6zVar.y) && this.z == r6zVar.z && u890.j(this.A, r6zVar.A);
    }

    public final int hashCode() {
        String str = this.a;
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.f34p);
        ugo0 ugo0Var = this.q;
        int iG2 = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((this.r.hashCode() + ((iG + (ugo0Var == null ? 0 : ugo0Var.hashCode())) * 31)) * 31, 31, this.s), 31, this.t), 31, false), 31, false), 31, this.u), 31, false), 31, this.v);
        ok51 ok51Var = this.w;
        int iG3 = xcg1.g((iG2 + (ok51Var == null ? 0 : ok51Var.hashCode())) * 31, 31, this.x);
        String str2 = this.y;
        int iG4 = xcg1.g((iG3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.z);
        p860 p860Var = this.A;
        return iG4 + (p860Var != null ? p860Var.hashCode() : 0);
    }
}
