package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class z1g1 implements ez00 {
    public final String a;
    public final String b;
    public final den c;
    public final int d;
    public final String e;
    public final boolean f;
    public final ArrayList g;
    public final String h;
    public final String i;
    public final ArrayList j;
    public final ArrayList k;
    public final ArrayList l;
    public final ArrayList m;
    public final ArrayList n;
    public final Integer o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f105p;
    public final String q;
    public final String r;
    public final ArrayList s;

    public z1g1(String str, String str2, den denVar, int i, String str3, boolean z, ArrayList arrayList, String str4, String str5, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, Integer num, Integer num2, String str6, String str7, ArrayList arrayList7) {
        this.a = str;
        this.b = str2;
        this.c = denVar;
        this.d = i;
        this.e = str3;
        this.f = z;
        this.g = arrayList;
        this.h = str4;
        this.i = str5;
        this.j = arrayList2;
        this.k = arrayList3;
        this.l = arrayList4;
        this.m = arrayList5;
        this.n = arrayList6;
        this.o = num;
        this.f105p = num2;
        this.q = str6;
        this.r = str7;
        this.s = arrayList7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1g1)) {
            return false;
        }
        z1g1 z1g1Var = (z1g1) obj;
        return this.a.equals(z1g1Var.a) && this.b.equals(z1g1Var.b) && this.c.equals(z1g1Var.c) && this.d == z1g1Var.d && this.e.equals(z1g1Var.e) && this.f == z1g1Var.f && this.g.equals(z1g1Var.g) && this.h.equals(z1g1Var.h) && this.i.equals(z1g1Var.i) && this.j.equals(z1g1Var.j) && this.k.equals(z1g1Var.k) && this.l.equals(z1g1Var.l) && this.m.equals(z1g1Var.m) && this.n.equals(z1g1Var.n) && u890.j(this.o, z1g1Var.o) && u890.j(this.f105p, z1g1Var.f105p) && this.q.equals(z1g1Var.q) && this.r.equals(z1g1Var.r) && this.s.equals(z1g1Var.s);
    }

    public final int hashCode() {
        int iF = p3d1.f(this.n, p3d1.f(this.m, p3d1.f(this.l, p3d1.f(this.k, p3d1.f(this.j, cy30.d(cy30.d(p3d1.f(this.g, xcg1.g(cy30.d(kaa0.f(this.d, (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31), 31, this.e), 31, this.f), 31), 31, this.h), 31, this.i), 31), 31), 31), 31), 31);
        Integer num = this.o;
        int iHashCode = (iF + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f105p;
        return this.s.hashCode() + cy30.d(cy30.d((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.q), 31, this.r);
    }
}
