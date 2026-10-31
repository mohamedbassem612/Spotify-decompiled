package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class he81 {
    public final String A;
    public final String B;
    public final sbw0 C;
    public final long D;
    public final String E;
    public final boolean F;
    public final int G;
    public final int H;
    public final int I;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final ud81 k;
    public final boolean l;
    public final mxh m;
    public final Boolean n;
    public final zau0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u7h f36p;
    public final String q;
    public final boolean r;
    public final int s;
    public final String t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final String z;

    public he81(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, String str7, ud81 ud81Var, boolean z4, int i, mxh mxhVar, Boolean bool, zau0 zau0Var, u7h u7hVar, String str8, int i2, boolean z5, int i3, String str9, int i4, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str10, String str11, String str12, sbw0 sbw0Var, long j, String str13, boolean z11) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = str7;
        this.k = ud81Var;
        this.l = z4;
        this.G = i;
        this.m = mxhVar;
        this.n = bool;
        this.o = zau0Var;
        this.f36p = u7hVar;
        this.q = str8;
        this.H = i2;
        this.r = z5;
        this.s = i3;
        this.t = str9;
        this.I = i4;
        this.u = z6;
        this.v = z7;
        this.w = z8;
        this.x = z9;
        this.y = z10;
        this.z = str10;
        this.A = str11;
        this.B = str12;
        this.C = sbw0Var;
        this.D = j;
        this.E = str13;
        this.F = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he81)) {
            return false;
        }
        he81 he81Var = (he81) obj;
        return this.a.equals(he81Var.a) && this.b.equals(he81Var.b) && this.c.equals(he81Var.c) && u890.j(this.d, he81Var.d) && u890.j(this.e, he81Var.e) && u890.j(this.f, he81Var.f) && this.g == he81Var.g && this.h == he81Var.h && this.i == he81Var.i && u890.j(this.j, he81Var.j) && this.k.equals(he81Var.k) && this.l == he81Var.l && this.G == he81Var.G && u890.j(this.m, he81Var.m) && u890.j(this.n, he81Var.n) && u890.j(this.o, he81Var.o) && u890.j(this.f36p, he81Var.f36p) && u890.j(this.q, he81Var.q) && this.H == he81Var.H && this.r == he81Var.r && this.s == he81Var.s && this.t.equals(he81Var.t) && this.I == he81Var.I && this.u == he81Var.u && this.v == he81Var.v && this.w == he81Var.w && this.x == he81Var.x && this.y == he81Var.y && u890.j(this.z, he81Var.z) && u890.j(this.A, he81Var.A) && u890.j(this.B, he81Var.B) && u890.j(this.C, he81Var.C) && this.D == he81Var.D && u890.j(this.E, he81Var.E) && this.F == he81Var.F;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iG = xcg1.g(xcg1.g(xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i);
        String str2 = this.j;
        int iK = ab80.k(this.G, xcg1.g((this.k.hashCode() + ((iG + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.l), 31);
        mxh mxhVar = this.m;
        int iHashCode = (iK + (mxhVar == null ? 0 : mxhVar.hashCode())) * 31;
        Boolean bool = this.n;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        zau0 zau0Var = this.o;
        int iHashCode3 = (iHashCode2 + (zau0Var == null ? 0 : zau0Var.hashCode())) * 31;
        u7h u7hVar = this.f36p;
        int iC = (iHashCode3 + (u7hVar == null ? 0 : z4h1.c(u7hVar.a))) * 31;
        String str3 = this.q;
        int iG2 = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(ab80.k(this.I, cy30.d(kaa0.f(this.s, xcg1.g(ab80.k(this.H, (iC + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31, this.r), 31), 31, this.t), 31), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y);
        String str4 = this.z;
        int iHashCode4 = (iG2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.B;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        sbw0 sbw0Var = this.C;
        int iF = cy30.f((iHashCode6 + (sbw0Var == null ? 0 : sbw0Var.hashCode())) * 31, this.D, 31);
        String str7 = this.E;
        return Boolean.hashCode(this.F) + ((iF + (str7 != null ? str7.hashCode() : 0)) * 31);
    }
}
