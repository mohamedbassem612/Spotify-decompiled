package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class umx0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final Long i;
    public final String j;
    public final String k;
    public final List l;
    public final String m;
    public final String n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f48p;
    public final boolean q;
    public final String r;
    public final x360 s;
    public final boolean t;
    public final boolean u;
    public final mgo0 v;

    public umx0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, String str9, String str10, List list, String str11, String str12, boolean z, boolean z2, boolean z3, String str13, x360 x360Var, boolean z4, boolean z5, mgo0 mgo0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = l;
        this.j = str9;
        this.k = str10;
        this.l = list;
        this.m = str11;
        this.n = str12;
        this.o = z;
        this.f48p = z2;
        this.q = z3;
        this.r = str13;
        this.s = x360Var;
        this.t = z4;
        this.u = z5;
        this.v = mgo0Var;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        String str;
        String str2 = this.b;
        return (str2.length() <= 0 || (str = this.h) == null) ? str2 : f4i1.f(str2, " • ", str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umx0)) {
            return false;
        }
        umx0 umx0Var = (umx0) obj;
        return this.a.equals(umx0Var.a) && this.b.equals(umx0Var.b) && u890.j(this.c, umx0Var.c) && u890.j(this.d, umx0Var.d) && u890.j(this.e, umx0Var.e) && this.f.equals(umx0Var.f) && u890.j(this.g, umx0Var.g) && u890.j(this.h, umx0Var.h) && u890.j(this.i, umx0Var.i) && u890.j(this.j, umx0Var.j) && u890.j(this.k, umx0Var.k) && u890.j(this.l, umx0Var.l) && u890.j(this.m, umx0Var.m) && u890.j(this.n, umx0Var.n) && this.o == umx0Var.o && this.f48p == umx0Var.f48p && this.q == umx0Var.q && u890.j(this.r, umx0Var.r) && u890.j(this.s, umx0Var.s) && this.t == umx0Var.t && this.u == umx0Var.u && u890.j(this.v, umx0Var.v);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.i;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.j;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        int iB = f4i1.b((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.l);
        String str5 = this.m;
        int iHashCode5 = (iB + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.n;
        int iG = xcg1.g(xcg1.g(xcg1.g((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.o), 31, this.f48p), 31, this.q);
        String str7 = this.r;
        int iHashCode6 = (iG + (str7 == null ? 0 : str7.hashCode())) * 31;
        x360 x360Var = this.s;
        int iG2 = xcg1.g(xcg1.g((iHashCode6 + (x360Var == null ? 0 : x360Var.hashCode())) * 31, 31, this.t), 31, this.u);
        mgo0 mgo0Var = this.v;
        return iG2 + (mgo0Var != null ? mgo0Var.hashCode() : 0);
    }
}
