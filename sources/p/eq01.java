package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eq01 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final m9m f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final Integer j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final m87 n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f13p;

    public eq01(String str, String str2, String str3, List list, String str4, m9m m9mVar, boolean z, boolean z2, boolean z3, Integer num, boolean z4, boolean z5, boolean z6, m87 m87Var, boolean z7, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = str4;
        this.f = m9mVar;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = num;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = m87Var;
        this.o = z7;
        this.f13p = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq01)) {
            return false;
        }
        eq01 eq01Var = (eq01) obj;
        return u890.j(this.a, eq01Var.a) && u890.j(this.b, eq01Var.b) && u890.j(this.c, eq01Var.c) && u890.j(this.d, eq01Var.d) && u890.j(this.e, eq01Var.e) && this.f == eq01Var.f && this.g == eq01Var.g && this.h == eq01Var.h && this.i == eq01Var.i && u890.j(this.j, eq01Var.j) && this.k == eq01Var.k && this.l == eq01Var.l && this.m == eq01Var.m && u890.j(this.n, eq01Var.n) && this.o == eq01Var.o && this.f13p == eq01Var.f13p;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iB = f4i1.b((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        String str3 = this.e;
        int iHashCode3 = (iB + (str3 == null ? 0 : str3.hashCode())) * 31;
        m9m m9mVar = this.f;
        int iG = xcg1.g(xcg1.g(xcg1.g((iHashCode3 + (m9mVar == null ? 0 : m9mVar.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i);
        Integer num = this.j;
        int iG2 = xcg1.g(xcg1.g(xcg1.g((iG + (num == null ? 0 : num.hashCode())) * 31, 31, this.k), 31, this.l), 31, this.m);
        m87 m87Var = this.n;
        return l1d.C(this.f13p) + xcg1.g((iG2 + (m87Var != null ? m87Var.hashCode() : 0)) * 31, 31, this.o);
    }
}
