package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p2z {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final String j;
    public final ArrayList k;
    public final String l;
    public final d8r0 m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f32p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final Integer t;
    public final String u;

    public p2z(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, ArrayList arrayList, String str10, d8r0 d8r0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Integer num, String str11) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = i;
        this.j = str9;
        this.k = arrayList;
        this.l = str10;
        this.m = d8r0Var;
        this.n = z;
        this.o = z2;
        this.f32p = z3;
        this.q = z4;
        this.r = z5;
        this.s = z6;
        this.t = num;
        this.u = str11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2z)) {
            return false;
        }
        p2z p2zVar = (p2z) obj;
        return u890.j(this.a, p2zVar.a) && u890.j(this.b, p2zVar.b) && u890.j(this.c, p2zVar.c) && u890.j(this.d, p2zVar.d) && u890.j(this.e, p2zVar.e) && u890.j(this.f, p2zVar.f) && u890.j(this.g, p2zVar.g) && u890.j(this.h, p2zVar.h) && this.i == p2zVar.i && u890.j(this.j, p2zVar.j) && this.k.equals(p2zVar.k) && u890.j(this.l, p2zVar.l) && this.m.equals(p2zVar.m) && this.n == p2zVar.n && this.o == p2zVar.o && this.f32p == p2zVar.f32p && this.q == p2zVar.q && this.r == p2zVar.r && this.s == p2zVar.s && u890.j(this.t, p2zVar.t) && this.u.equals(p2zVar.u);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(hrt.i(this.m, cy30.d(p3d1.f(this.k, cy30.d(ab80.k(this.i, cy30.d(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.g), 31, this.h), 31), 31, this.j), 31), 31, this.l), 31), 31, this.n), 31, this.o), 31, this.f32p), 31, this.q), 31, this.r), 31, this.s);
        Integer num = this.t;
        return this.u.hashCode() + ((iG + (num != null ? num.hashCode() : 0)) * 31);
    }
}
