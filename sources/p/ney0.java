package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ney0 {
    public final String a;
    public final String b;
    public final String c;
    public final c380 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final gm50 i;
    public final m87 j;
    public final String k;
    public final String l;
    public final yq01 m;
    public final boolean n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f26p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final String u;
    public final c380 v;
    public final br01 w;
    public final zq01 x;
    public final de71 y;
    public final boolean z;

    public ney0(String str, String str2, String str3, c380 c380Var, boolean z, boolean z2, boolean z3, boolean z4, gm50 gm50Var, m87 m87Var, String str4, String str5, yq01 yq01Var, boolean z5, String str6, String str7, boolean z6, boolean z7, boolean z8, boolean z9, String str8, c380 c380Var2, br01 br01Var, zq01 zq01Var, de71 de71Var, boolean z10) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = c380Var;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = gm50Var;
        this.j = m87Var;
        this.k = str4;
        this.l = str5;
        this.m = yq01Var;
        this.n = z5;
        this.o = str6;
        this.f26p = str7;
        this.q = z6;
        this.r = z7;
        this.s = z8;
        this.t = z9;
        this.u = str8;
        this.v = c380Var2;
        this.w = br01Var;
        this.x = zq01Var;
        this.y = de71Var;
        this.z = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ney0)) {
            return false;
        }
        ney0 ney0Var = (ney0) obj;
        return u890.j(this.a, ney0Var.a) && u890.j(this.b, ney0Var.b) && u890.j(this.c, ney0Var.c) && u890.j(this.d, ney0Var.d) && this.e == ney0Var.e && this.f == ney0Var.f && this.g == ney0Var.g && this.h == ney0Var.h && this.i.equals(ney0Var.i) && u890.j(this.j, ney0Var.j) && u890.j(this.k, ney0Var.k) && u890.j(this.l, ney0Var.l) && u890.j(this.m, ney0Var.m) && this.n == ney0Var.n && this.o.equals(ney0Var.o) && u890.j(this.f26p, ney0Var.f26p) && this.q == ney0Var.q && this.r == ney0Var.r && this.s == ney0Var.s && this.t == ney0Var.t && u890.j(this.u, ney0Var.u) && u890.j(this.v, ney0Var.v) && this.w == ney0Var.w && this.x.equals(ney0Var.x) && u890.j(this.y, ney0Var.y) && this.z == ney0Var.z;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (this.i.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(kk0.f(this.d, (iD + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31;
        m87 m87Var = this.j;
        int iD2 = cy30.d((iHashCode + (m87Var == null ? 0 : m87Var.hashCode())) * 31, 31, this.k);
        String str2 = this.l;
        int iHashCode2 = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        yq01 yq01Var = this.m;
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.d(cy30.d(xcg1.g((iHashCode2 + (yq01Var == null ? 0 : yq01Var.hashCode())) * 31, 31, this.n), 31, this.o), 31, this.f26p), 31, this.q), 31, this.r), 31, this.s), 31, this.t);
        String str3 = this.u;
        int iHashCode3 = (this.x.hashCode() + ((this.w.hashCode() + kk0.f(this.v, (iG + (str3 == null ? 0 : str3.hashCode())) * 31, 31)) * 31)) * 31;
        de71 de71Var = this.y;
        return Boolean.hashCode(this.z) + ((iHashCode3 + (de71Var != null ? de71Var.hashCode() : 0)) * 31);
    }
}
