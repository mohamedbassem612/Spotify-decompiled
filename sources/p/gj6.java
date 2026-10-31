package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gj6 {
    public final uf6 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final yj41 g;
    public final yj41 h;
    public final dj6 i;
    public final bj6 j;
    public final long k;
    public final yj41 l;
    public final yj41 m;
    public final yj41 n;
    public final List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f18p;
    public final cj6 q;
    public final rx7 r;
    public final ej6 s;
    public final hg6 t;

    public gj6(uf6 uf6Var, String str, String str2, String str3, String str4, boolean z, yj41 yj41Var, yj41 yj41Var2, dj6 dj6Var, bj6 bj6Var, long j, yj41 yj41Var3, yj41 yj41Var4, yj41 yj41Var5, List list, List list2, cj6 cj6Var, rx7 rx7Var, ej6 ej6Var, hg6 hg6Var) {
        this.a = uf6Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = yj41Var;
        this.h = yj41Var2;
        this.i = dj6Var;
        this.j = bj6Var;
        this.k = j;
        this.l = yj41Var3;
        this.m = yj41Var4;
        this.n = yj41Var5;
        this.o = list;
        this.f18p = list2;
        this.q = cj6Var;
        this.r = rx7Var;
        this.s = ej6Var;
        this.t = hg6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj6)) {
            return false;
        }
        gj6 gj6Var = (gj6) obj;
        if (this.a != gj6Var.a || !u890.j(this.b, gj6Var.b) || !u890.j(this.c, gj6Var.c) || !u890.j(this.d, gj6Var.d) || !u890.j(this.e, gj6Var.e) || this.f != gj6Var.f || !u890.j(this.g, gj6Var.g) || !u890.j(this.h, gj6Var.h) || !u890.j(this.i, gj6Var.i) || !u890.j(this.j, gj6Var.j)) {
            return false;
        }
        long j = gj6Var.k;
        int i = u7h.l;
        return z4h1.b(this.k, j) && u890.j(this.l, gj6Var.l) && u890.j(this.m, gj6Var.m) && u890.j(this.n, gj6Var.n) && u890.j(this.o, gj6Var.o) && u890.j(this.f18p, gj6Var.f18p) && u890.j(this.q, gj6Var.q) && u890.j(this.r, gj6Var.r) && u890.j(this.s, gj6Var.s) && u890.j(this.t, gj6Var.t);
    }

    public final int hashCode() {
        uf6 uf6Var = this.a;
        int iHashCode = (uf6Var == null ? 0 : uf6Var.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + xcg1.g(cy30.d(cy30.d(cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31)) * 31)) * 31;
        int i = u7h.l;
        int iF = cy30.f(iHashCode2, this.k, 31);
        yj41 yj41Var = this.l;
        int iHashCode3 = (this.m.hashCode() + ((iF + (yj41Var == null ? 0 : yj41Var.hashCode())) * 31)) * 31;
        yj41 yj41Var2 = this.n;
        int iB = f4i1.b((iHashCode3 + (yj41Var2 == null ? 0 : yj41Var2.hashCode())) * 31, 31, this.o);
        List list = this.f18p;
        int iHashCode4 = (this.q.hashCode() + ((iB + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        rx7 rx7Var = this.r;
        int iHashCode5 = (iHashCode4 + (rx7Var == null ? 0 : rx7Var.hashCode())) * 31;
        ej6 ej6Var = this.s;
        int iHashCode6 = (iHashCode5 + (ej6Var == null ? 0 : ej6Var.hashCode())) * 31;
        hg6 hg6Var = this.t;
        return iHashCode6 + (hg6Var != null ? hg6Var.hashCode() : 0);
    }
}
