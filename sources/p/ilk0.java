package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ilk0 {
    public final ntf1 a;
    public final long b;
    public final lhg1 c;
    public final lhg1 d;
    public final List e;
    public final List f;
    public final Float g;
    public final lhg1 h;
    public final int i;
    public final int j;
    public final int k;
    public final uia l;
    public final uia m;
    public final Float n;
    public final Float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Float f5p;
    public final Float q;
    public final String r;
    public final boolean s;
    public final lhg1 t;
    public final Boolean u;
    public final boolean v;
    public final boolean w;

    public ilk0(ntf1 ntf1Var, long j, lhg1 lhg1Var, lhg1 lhg1Var2, List list, List list2, Float f, lhg1 lhg1Var3, int i, int i2, int i3, uia uiaVar, uia uiaVar2, Float f2, Float f3, Float f4, Float f5, String str, boolean z, lhg1 lhg1Var4, Boolean bool, boolean z2, boolean z3) {
        this.a = ntf1Var;
        this.b = j;
        this.c = lhg1Var;
        this.d = lhg1Var2;
        this.e = list;
        this.f = list2;
        this.g = f;
        this.h = lhg1Var3;
        this.i = i;
        this.j = i2;
        this.k = i3;
        this.l = uiaVar;
        this.m = uiaVar2;
        this.n = f2;
        this.o = f3;
        this.f5p = f4;
        this.q = f5;
        this.r = str;
        this.s = z;
        this.t = lhg1Var4;
        this.u = bool;
        this.v = z2;
        this.w = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ilk0)) {
            return false;
        }
        ilk0 ilk0Var = (ilk0) obj;
        return this.a.equals(ilk0Var.a) && this.b == ilk0Var.b && u890.j(this.c, ilk0Var.c) && u890.j(this.d, ilk0Var.d) && u890.j(this.e, ilk0Var.e) && u890.j(this.f, ilk0Var.f) && u890.j(this.g, ilk0Var.g) && u890.j(this.h, ilk0Var.h) && this.i == ilk0Var.i && this.j == ilk0Var.j && this.k == ilk0Var.k && u890.j(this.l, ilk0Var.l) && u890.j(this.m, ilk0Var.m) && u890.j(this.n, ilk0Var.n) && u890.j(this.o, ilk0Var.o) && u890.j(this.f5p, ilk0Var.f5p) && u890.j(this.q, ilk0Var.q) && u890.j(this.r, ilk0Var.r) && this.s == ilk0Var.s && u890.j(this.t, ilk0Var.t) && u890.j(this.u, ilk0Var.u) && this.v == ilk0Var.v && this.w == ilk0Var.w;
    }

    public final int hashCode() {
        int iF = cy30.f(this.a.hashCode() * 31, this.b, 31);
        lhg1 lhg1Var = this.c;
        int iHashCode = (iF + (lhg1Var == null ? 0 : lhg1Var.hashCode())) * 31;
        lhg1 lhg1Var2 = this.d;
        int iB = f4i1.b(f4i1.b((iHashCode + (lhg1Var2 == null ? 0 : lhg1Var2.hashCode())) * 31, 31, this.e), 31, this.f);
        Float f = this.g;
        int iHashCode2 = (iB + (f == null ? 0 : f.hashCode())) * 31;
        lhg1 lhg1Var3 = this.h;
        int iF2 = kaa0.f(this.k, kaa0.f(this.j, kaa0.f(this.i, (iHashCode2 + (lhg1Var3 == null ? 0 : lhg1Var3.hashCode())) * 31, 31), 31), 31);
        uia uiaVar = this.l;
        int iHashCode3 = (iF2 + (uiaVar == null ? 0 : uiaVar.hashCode())) * 31;
        uia uiaVar2 = this.m;
        int iHashCode4 = (iHashCode3 + (uiaVar2 == null ? 0 : uiaVar2.hashCode())) * 31;
        Float f2 = this.n;
        int iHashCode5 = (iHashCode4 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.o;
        int iHashCode6 = (iHashCode5 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.f5p;
        int iHashCode7 = (iHashCode6 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Float f5 = this.q;
        int iHashCode8 = (iHashCode7 + (f5 == null ? 0 : f5.hashCode())) * 31;
        String str = this.r;
        int iG = xcg1.g((iHashCode8 + (str == null ? 0 : str.hashCode())) * 31, 31, this.s);
        lhg1 lhg1Var4 = this.t;
        int iHashCode9 = (iG + (lhg1Var4 == null ? 0 : lhg1Var4.hashCode())) * 31;
        Boolean bool = this.u;
        return Boolean.hashCode(this.w) + xcg1.g((iHashCode9 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.v);
    }
}
