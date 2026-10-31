package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iob1 {
    public final e6p1 A;
    public final m4m B;
    public final y2u0 C;
    public final m9g1 D;
    public final String E;
    public final d2k1 F;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final cr00 h;
    public final String i;
    public final x360 j;
    public final r4p1 k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f10p;
    public final String q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final String w;
    public final Long x;
    public final sbw0 y;
    public final boolean z;

    public iob1(String str, String str2, String str3, String str4, String str5, String str6, String str7, cr00 cr00Var, String str8, x360 x360Var, r4p1 r4p1Var, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str15, Long l, sbw0 sbw0Var, boolean z6, e6p1 e6p1Var, m4m m4mVar, y2u0 y2u0Var, m9g1 m9g1Var, String str16, d2k1 d2k1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = cr00Var;
        this.i = str8;
        this.j = x360Var;
        this.k = r4p1Var;
        this.l = str9;
        this.m = str10;
        this.n = str11;
        this.o = str12;
        this.f10p = str13;
        this.q = str14;
        this.r = z;
        this.s = z2;
        this.t = z3;
        this.u = z4;
        this.v = z5;
        this.w = str15;
        this.x = l;
        this.y = sbw0Var;
        this.z = z6;
        this.A = e6p1Var;
        this.B = m4mVar;
        this.C = y2u0Var;
        this.D = m9g1Var;
        this.E = str16;
        this.F = d2k1Var;
    }

    public final String a() {
        return this.a;
    }

    public final sbw0 b() {
        return this.y;
    }

    public final boolean c() {
        return this.v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iob1)) {
            return false;
        }
        iob1 iob1Var = (iob1) obj;
        return u890.j(this.a, iob1Var.a) && this.b.equals(iob1Var.b) && u890.j(this.c, iob1Var.c) && this.d.equals(iob1Var.d) && u890.j(this.e, iob1Var.e) && u890.j(this.f, iob1Var.f) && u890.j(this.g, iob1Var.g) && this.h.equals(iob1Var.h) && u890.j(this.i, iob1Var.i) && u890.j(this.j, iob1Var.j) && this.k.equals(iob1Var.k) && u890.j(this.l, iob1Var.l) && u890.j(this.m, iob1Var.m) && u890.j(this.n, iob1Var.n) && this.o.equals(iob1Var.o) && this.f10p.equals(iob1Var.f10p) && u890.j(this.q, iob1Var.q) && this.r == iob1Var.r && this.s == iob1Var.s && this.t == iob1Var.t && this.u == iob1Var.u && this.v == iob1Var.v && u890.j(this.w, iob1Var.w) && u890.j(this.x, iob1Var.x) && this.y.equals(iob1Var.y) && this.z == iob1Var.z && u890.j(this.A, iob1Var.A) && this.B == iob1Var.B && u890.j(this.C, iob1Var.C) && u890.j(this.D, iob1Var.D) && u890.j(this.E, iob1Var.E) && u890.j(this.F, iob1Var.F);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode2 = (this.h.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.i;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        x360 x360Var = this.j;
        int iHashCode4 = (this.k.hashCode() + ((iHashCode3 + (x360Var == null ? 0 : x360Var.hashCode())) * 31)) * 31;
        String str4 = this.l;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.m;
        int iD2 = cy30.d(cy30.d(cy30.d((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.n), 31, this.o), 31, this.f10p);
        String str6 = this.q;
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((iD2 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v);
        String str7 = this.w;
        int iHashCode6 = (iG + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l = this.x;
        int iG2 = xcg1.g(xcg1.g((this.y.hashCode() + ((iHashCode6 + (l == null ? 0 : l.hashCode())) * 31)) * 31, 31, this.z), 31, false);
        e6p1 e6p1Var = this.A;
        int iHashCode7 = (this.B.hashCode() + ((iG2 + (e6p1Var == null ? 0 : e6p1Var.hashCode())) * 31)) * 31;
        y2u0 y2u0Var = this.C;
        int iHashCode8 = (iHashCode7 + (y2u0Var == null ? 0 : y2u0Var.hashCode())) * 31;
        m9g1 m9g1Var = this.D;
        int iG3 = xcg1.g((iHashCode8 + (m9g1Var == null ? 0 : m9g1Var.hashCode())) * 31, 31, false);
        String str8 = this.E;
        int iHashCode9 = (iG3 + (str8 == null ? 0 : str8.hashCode())) * 31;
        d2k1 d2k1Var = this.F;
        return iHashCode9 + (d2k1Var != null ? d2k1Var.hashCode() : 0);
    }
}
