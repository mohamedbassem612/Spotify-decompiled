package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oey0 {
    public final String a;
    public final String b;
    public final String c;
    public final c380 d;
    public final boolean e;
    public final gm50 f;
    public final boolean g;
    public final String h;
    public final boolean i;
    public final String j;
    public final yq01 k;
    public final String l;
    public final String m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f27p;
    public final boolean q;
    public final String r;
    public final c380 s;
    public final br01 t;
    public final zq01 u;
    public final hxz0 v;
    public final int w;
    public final boolean x;

    public oey0(String str, String str2, String str3, c380 c380Var, boolean z, gm50 gm50Var, boolean z2, String str4, boolean z3, String str5, yq01 yq01Var, String str6, String str7, boolean z4, boolean z5, boolean z6, boolean z7, String str8, c380 c380Var2, br01 br01Var, zq01 zq01Var, hxz0 hxz0Var, int i, boolean z8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = c380Var;
        this.e = z;
        this.f = gm50Var;
        this.g = z2;
        this.h = str4;
        this.i = z3;
        this.j = str5;
        this.k = yq01Var;
        this.l = str6;
        this.m = str7;
        this.n = z4;
        this.o = z5;
        this.f27p = z6;
        this.q = z7;
        this.r = str8;
        this.s = c380Var2;
        this.t = br01Var;
        this.u = zq01Var;
        this.v = hxz0Var;
        this.w = i;
        this.x = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oey0)) {
            return false;
        }
        oey0 oey0Var = (oey0) obj;
        return u890.j(this.a, oey0Var.a) && u890.j(this.b, oey0Var.b) && u890.j(this.c, oey0Var.c) && this.d.equals(oey0Var.d) && this.e == oey0Var.e && this.f.equals(oey0Var.f) && this.g == oey0Var.g && u890.j(this.h, oey0Var.h) && this.i == oey0Var.i && u890.j(this.j, oey0Var.j) && u890.j(this.k, oey0Var.k) && this.l.equals(oey0Var.l) && u890.j(this.m, oey0Var.m) && this.n == oey0Var.n && this.o == oey0Var.o && this.f27p == oey0Var.f27p && this.q == oey0Var.q && u890.j(this.r, oey0Var.r) && this.s.equals(oey0Var.s) && this.t == oey0Var.t && this.u.equals(oey0Var.u) && u890.j(this.v, oey0Var.v) && this.w == oey0Var.w && this.x == oey0Var.x;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iG = xcg1.g(cy30.d(xcg1.g((this.f.hashCode() + xcg1.g(xcg1.g(xcg1.g(kk0.f(this.d, (iD + (str == null ? 0 : str.hashCode())) * 31, 31), 31, false), 31, this.e), 31, false)) * 961, 31, this.g), 31, this.h), 31, this.i);
        String str2 = this.j;
        int iHashCode = (iG + (str2 == null ? 0 : str2.hashCode())) * 31;
        yq01 yq01Var = this.k;
        int iG2 = xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.d(cy30.d((iHashCode + (yq01Var == null ? 0 : yq01Var.hashCode())) * 31, 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.f27p), 31, this.q);
        String str3 = this.r;
        int iHashCode2 = (this.u.hashCode() + ((this.t.hashCode() + kk0.f(this.s, (iG2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31)) * 31)) * 31;
        hxz0 hxz0Var = this.v;
        return Boolean.hashCode(this.x) + kaa0.f(this.w, (iHashCode2 + (hxz0Var != null ? hxz0Var.hashCode() : 0)) * 31, 31);
    }
}
