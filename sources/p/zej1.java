package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zej1 {
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final long h;
    public final long i;
    public final bfj1 j;
    public final String k;
    public final int l;
    public final m4m m;
    public final boolean n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f57p;
    public final long q;
    public final int r;
    public final boolean s;
    public final String t;
    public final int u;
    public final boolean v;

    public zej1(String str, boolean z, String str2, String str3, String str4, String str5, String str6, long j, long j2, bfj1 bfj1Var, String str7, int i, m4m m4mVar, boolean z2, String str8, String str9, long j3, int i2, boolean z3, String str10, int i3, boolean z4) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = j;
        this.i = j2;
        this.j = bfj1Var;
        this.k = str7;
        this.l = i;
        this.m = m4mVar;
        this.n = z2;
        this.o = str8;
        this.f57p = str9;
        this.q = j3;
        this.r = i2;
        this.s = z3;
        this.t = str10;
        this.u = i3;
        this.v = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zej1)) {
            return false;
        }
        zej1 zej1Var = (zej1) obj;
        return u890.j(this.a, zej1Var.a) && this.b == zej1Var.b && u890.j(this.c, zej1Var.c) && u890.j(this.d, zej1Var.d) && u890.j(this.e, zej1Var.e) && u890.j(this.f, zej1Var.f) && u890.j(this.g, zej1Var.g) && this.h == zej1Var.h && this.i == zej1Var.i && u890.j(this.j, zej1Var.j) && u890.j(this.k, zej1Var.k) && this.l == zej1Var.l && this.m == zej1Var.m && this.n == zej1Var.n && u890.j(this.o, zej1Var.o) && u890.j(this.f57p, zej1Var.f57p) && this.q == zej1Var.q && this.r == zej1Var.r && this.s == zej1Var.s && this.t.equals(zej1Var.t) && this.u == zej1Var.u && this.v == zej1Var.v;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iF = cy30.f(cy30.f(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.g), this.h, 31), this.i, 31);
        bfj1 bfj1Var = this.j;
        int iG = xcg1.g((this.m.hashCode() + ab80.k(this.l, cy30.d((iF + (bfj1Var == null ? 0 : bfj1Var.hashCode())) * 31, 31, this.k), 31)) * 31, 31, this.n);
        String str2 = this.o;
        int iHashCode = (iG + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57p;
        return Boolean.hashCode(this.v) + ab80.k(this.u, cy30.d(xcg1.g(ab80.k(this.r, cy30.f((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31, this.q, 31), 31), 31, this.s), 31, this.t), 31);
    }
}
