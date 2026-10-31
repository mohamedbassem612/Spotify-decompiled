package p;

import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jbz {
    public final boolean A;
    public final h131 B;
    public final String C;
    public final boolean D;
    public final k540 E;
    public final String F;
    public final n5a1 G;
    public final boolean H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final long h;
    public final iix0 i;
    public final long j;
    public final boolean k;
    public final poz0 l;
    public final String m;
    public final boolean n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f13p;
    public final d1z q;
    public final Date r;
    public final ArrayList s;
    public final xwp0 t;
    public final boolean u;
    public final boolean v;
    public final fap1 w;
    public final boolean x;
    public final boolean y;
    public final String z;

    public jbz(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, iix0 iix0Var, long j2, boolean z, int i, int i2, int i3, poz0 poz0Var, String str8, boolean z2, int i4, String str9, d1z d1zVar, Date date, ArrayList arrayList, xwp0 xwp0Var, boolean z3, boolean z4, fap1 fap1Var, boolean z5, int i5, boolean z6, String str10, boolean z7, h131 h131Var, String str11, boolean z8, k540 k540Var, String str12, n5a1 n5a1Var, boolean z9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = j;
        this.i = iix0Var;
        this.j = j2;
        this.k = z;
        this.I = i;
        this.J = i2;
        this.K = i3;
        this.l = poz0Var;
        this.m = str8;
        this.n = z2;
        this.o = i4;
        this.f13p = str9;
        this.q = d1zVar;
        this.r = date;
        this.s = arrayList;
        this.t = xwp0Var;
        this.u = z3;
        this.v = z4;
        this.w = fap1Var;
        this.x = z5;
        this.L = i5;
        this.y = z6;
        this.z = str10;
        this.A = z7;
        this.B = h131Var;
        this.C = str11;
        this.D = z8;
        this.E = k540Var;
        this.F = str12;
        this.G = n5a1Var;
        this.H = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbz)) {
            return false;
        }
        jbz jbzVar = (jbz) obj;
        return this.a.equals(jbzVar.a) && u890.j(this.b, jbzVar.b) && u890.j(this.c, jbzVar.c) && u890.j(this.d, jbzVar.d) && u890.j(this.e, jbzVar.e) && u890.j(this.f, jbzVar.f) && u890.j(this.g, jbzVar.g) && this.h == jbzVar.h && u890.j(this.i, jbzVar.i) && this.j == jbzVar.j && this.k == jbzVar.k && this.I == jbzVar.I && this.J == jbzVar.J && this.K == jbzVar.K && this.l.equals(jbzVar.l) && u890.j(this.m, jbzVar.m) && this.n == jbzVar.n && this.o == jbzVar.o && this.f13p.equals(jbzVar.f13p) && this.q == jbzVar.q && this.r.equals(jbzVar.r) && this.s.equals(jbzVar.s) && u890.j(this.t, jbzVar.t) && this.u == jbzVar.u && this.v == jbzVar.v && this.w.equals(jbzVar.w) && this.x == jbzVar.x && this.L == jbzVar.L && this.y == jbzVar.y && this.z.equals(jbzVar.z) && this.A == jbzVar.A && this.B.equals(jbzVar.B) && u890.j(this.C, jbzVar.C) && this.D == jbzVar.D && u890.j(this.E, jbzVar.E) && u890.j(this.F, jbzVar.F) && u890.j(this.G, jbzVar.G) && this.H == jbzVar.H;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iF = cy30.f(cy30.d(cy30.d((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f), 31, this.g), this.h, 31);
        iix0 iix0Var = this.i;
        int iHashCode5 = (this.l.hashCode() + ab80.k(this.K, ab80.k(this.J, ab80.k(this.I, xcg1.g(cy30.f((iF + (iix0Var == null ? 0 : iix0Var.hashCode())) * 31, this.j, 31), 31, this.k), 31), 31), 31)) * 31;
        String str5 = this.m;
        int iG = xcg1.g((this.w.hashCode() + xcg1.g(xcg1.g((this.t.hashCode() + p3d1.f(this.s, (this.r.hashCode() + ((this.q.hashCode() + cy30.d(kaa0.f(this.o, xcg1.g((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.n), 31), 31, this.f13p)) * 31)) * 31, 31)) * 31, 31, this.u), 31, this.v)) * 31, 31, this.x);
        int i = this.L;
        int iG2 = xcg1.g(cy30.d((this.B.hashCode() + xcg1.g(cy30.d(xcg1.g(xcg1.g(xcg1.g((iG + (i == 0 ? 0 : l1d.C(i))) * 31, 31, true), 31, this.y), 31, false), 31, this.z), 31, this.A)) * 31, 31, this.C), 31, this.D);
        k540 k540Var = this.E;
        int iHashCode6 = (iG2 + (k540Var == null ? 0 : k540Var.hashCode())) * 31;
        String str6 = this.F;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        n5a1 n5a1Var = this.G;
        return Boolean.hashCode(this.H) + ((iHashCode7 + (n5a1Var != null ? n5a1Var.hashCode() : 0)) * 31);
    }
}
