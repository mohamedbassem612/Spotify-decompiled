package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o2z {
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
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f24p;
    public final boolean q;
    public final String r;
    public final Integer s;
    public final String t;

    public o2z(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, ArrayList arrayList, String str10, d8r0 d8r0Var, boolean z, int i2, boolean z2, boolean z3, String str11, Integer num, String str12) {
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
        this.o = i2;
        this.f24p = z2;
        this.q = z3;
        this.r = str11;
        this.s = num;
        this.t = str12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2z)) {
            return false;
        }
        o2z o2zVar = (o2z) obj;
        return u890.j(this.a, o2zVar.a) && u890.j(this.b, o2zVar.b) && u890.j(this.c, o2zVar.c) && u890.j(this.d, o2zVar.d) && u890.j(this.e, o2zVar.e) && u890.j(this.f, o2zVar.f) && u890.j(this.g, o2zVar.g) && u890.j(this.h, o2zVar.h) && this.i == o2zVar.i && u890.j(this.j, o2zVar.j) && this.k.equals(o2zVar.k) && u890.j(this.l, o2zVar.l) && this.m.equals(o2zVar.m) && this.n == o2zVar.n && this.o == o2zVar.o && this.f24p == o2zVar.f24p && this.q == o2zVar.q && this.r.equals(o2zVar.r) && u890.j(this.s, o2zVar.s) && u890.j(this.t, o2zVar.t);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iD2 = cy30.d(xcg1.g(xcg1.g(kaa0.f(this.o, xcg1.g(hrt.i(this.m, cy30.d(p3d1.f(this.k, cy30.d(ab80.k(this.i, cy30.d(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.g), 31, this.h), 31), 31, this.j), 31), 31, this.l), 31), 31, this.n), 31), 31, this.f24p), 31, this.q), 31, this.r);
        Integer num = this.s;
        int iHashCode = (iD2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.t;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
