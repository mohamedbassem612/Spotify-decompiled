package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bry {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final boolean l;
    public final int m;
    public final boolean n;
    public final who0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f1p;
    public final int q;
    public final boolean r;

    public bry(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, int i, boolean z2, who0 who0Var, List list, int i2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = z;
        this.m = i;
        this.n = z2;
        this.o = who0Var;
        this.f1p = list;
        this.q = i2;
        this.r = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bry)) {
            return false;
        }
        bry bryVar = (bry) obj;
        return this.a.equals(bryVar.a) && this.b.equals(bryVar.b) && this.c.equals(bryVar.c) && this.d.equals(bryVar.d) && this.e.equals(bryVar.e) && this.f.equals(bryVar.f) && this.g.equals(bryVar.g) && u890.j(this.h, bryVar.h) && u890.j(this.i, bryVar.i) && u890.j(this.j, bryVar.j) && u890.j(this.k, bryVar.k) && this.l == bryVar.l && this.m == bryVar.m && this.n == bryVar.n && u890.j(this.o, bryVar.o) && this.f1p.equals(bryVar.f1p) && this.q == bryVar.q && this.r == bryVar.r;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        int iG = xcg1.g(ab80.k(this.m, xcg1.g((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.l), 31), 31, this.n);
        who0 who0Var = this.o;
        int iB = f4i1.b((iG + (who0Var == null ? 0 : who0Var.hashCode())) * 31, 31, this.f1p);
        int i = this.q;
        return Boolean.hashCode(this.r) + ((iB + (i != 0 ? l1d.C(i) : 0)) * 31);
    }
}
