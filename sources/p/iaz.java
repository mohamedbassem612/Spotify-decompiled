package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class iaz {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final d8r0 l;
    public final boolean m;
    public final boolean n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f6p;
    public final boolean q;
    public final Integer r;
    public final String s;

    public iaz(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, boolean z, boolean z2, String str8, d8r0 d8r0Var, boolean z3, boolean z4, int i2, List list, boolean z5, Integer num, String str9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = i;
        this.i = z;
        this.j = z2;
        this.k = str8;
        this.l = d8r0Var;
        this.m = z3;
        this.n = z4;
        this.o = i2;
        this.f6p = list;
        this.q = z5;
        this.r = num;
        this.s = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iaz)) {
            return false;
        }
        iaz iazVar = (iaz) obj;
        return u890.j(this.a, iazVar.a) && u890.j(this.b, iazVar.b) && u890.j(this.c, iazVar.c) && u890.j(this.d, iazVar.d) && u890.j(this.e, iazVar.e) && u890.j(this.f, iazVar.f) && this.g.equals(iazVar.g) && this.h == iazVar.h && this.i == iazVar.i && this.j == iazVar.j && u890.j(this.k, iazVar.k) && this.l.equals(iazVar.l) && this.m == iazVar.m && this.n == iazVar.n && this.o == iazVar.o && this.f6p.equals(iazVar.f6p) && this.q == iazVar.q && u890.j(this.r, iazVar.r) && this.s.equals(iazVar.s);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iG = xcg1.g(f4i1.b(ab80.k(this.o, xcg1.g(xcg1.g(hrt.i(this.l, cy30.d(xcg1.g(xcg1.g(ab80.k(this.h, cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.g), 31), 31, this.i), 31, this.j), 31, this.k), 31), 31, this.m), 31, this.n), 31), 31, this.f6p), 31, this.q);
        Integer num = this.r;
        return this.s.hashCode() + ((iG + (num != null ? num.hashCode() : 0)) * 31);
    }
}
