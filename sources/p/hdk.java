package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hdk implements jdk {
    public final String A;
    public final String B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final wck h;
    public final xck i;
    public final u7h j;
    public final u7h k;
    public final long l;
    public final d7d m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gnw f62p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final List t;
    public final String u;
    public final boolean v;
    public final String w;
    public final String x;
    public final String y;
    public final boolean z;

    public hdk(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, wck wckVar, xck xckVar, u7h u7hVar, u7h u7hVar2, long j, d7d d7dVar, boolean z, boolean z2, int i2, gnw gnwVar, boolean z3, boolean z4, boolean z5, int i3, List list, String str8, boolean z6, String str9, String str10, String str11, boolean z7, int i4, String str12, String str13, int i5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.C = i;
        this.h = wckVar;
        this.i = xckVar;
        this.j = u7hVar;
        this.k = u7hVar2;
        this.l = j;
        this.m = d7dVar;
        this.n = z;
        this.o = z2;
        this.D = i2;
        this.f62p = gnwVar;
        this.q = z3;
        this.r = z4;
        this.s = z5;
        this.E = i3;
        this.t = list;
        this.u = str8;
        this.v = z6;
        this.w = str9;
        this.x = str10;
        this.y = str11;
        this.z = z7;
        this.F = i4;
        this.A = str12;
        this.B = str13;
        this.G = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdk)) {
            return false;
        }
        hdk hdkVar = (hdk) obj;
        if (!u890.j(this.a, hdkVar.a) || !u890.j(this.b, hdkVar.b) || !u890.j(this.c, hdkVar.c) || !this.d.equals(hdkVar.d) || !u890.j(this.e, hdkVar.e) || !u890.j(this.f, hdkVar.f) || !u890.j(this.g, hdkVar.g) || this.C != hdkVar.C || !this.h.equals(hdkVar.h) || this.i != hdkVar.i || !u890.j(this.j, hdkVar.j) || !u890.j(this.k, hdkVar.k)) {
            return false;
        }
        long j = hdkVar.l;
        int i = u7h.l;
        return z4h1.b(this.l, j) && u890.j(this.m, hdkVar.m) && this.n == hdkVar.n && this.o == hdkVar.o && this.D == hdkVar.D && u890.j(this.f62p, hdkVar.f62p) && this.q == hdkVar.q && this.r == hdkVar.r && this.s == hdkVar.s && this.E == hdkVar.E && u890.j(this.t, hdkVar.t) && u890.j(this.u, hdkVar.u) && this.v == hdkVar.v && u890.j(this.w, hdkVar.w) && u890.j(this.x, hdkVar.x) && u890.j(this.y, hdkVar.y) && this.z == hdkVar.z && this.F == hdkVar.F && this.A.equals(hdkVar.A) && this.B.equals(hdkVar.B) && this.G == hdkVar.G;
    }

    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        int i = this.C;
        int iHashCode = (this.i.hashCode() + ((this.h.hashCode() + ((iD + (i == 0 ? 0 : l1d.C(i))) * 31)) * 31)) * 31;
        u7h u7hVar = this.j;
        int iHashCode2 = (iHashCode + (u7hVar == null ? 0 : Long.hashCode(u7hVar.a))) * 31;
        u7h u7hVar2 = this.k;
        int iHashCode3 = (iHashCode2 + (u7hVar2 == null ? 0 : Long.hashCode(u7hVar2.a))) * 31;
        int i2 = u7h.l;
        int iF = cy30.f(iHashCode3, this.l, 31);
        d7d d7dVar = this.m;
        int iB = f4i1.b(ab80.k(this.E, xcg1.g(xcg1.g(xcg1.g((this.f62p.hashCode() + ab80.k(this.D, xcg1.g(xcg1.g((iF + (d7dVar == null ? 0 : d7dVar.hashCode())) * 31, 31, this.n), 31, this.o), 31)) * 31, 31, this.q), 31, this.r), 31, this.s), 31), 31, this.t);
        String str = this.u;
        int iG = xcg1.g((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.v);
        String str2 = this.w;
        int iHashCode4 = (iG + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.x;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.y;
        return l1d.C(this.G) + cy30.d(cy30.d(ab80.k(this.F, xcg1.g((iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.z), 31), 31, this.A), 31, this.B);
    }
}
