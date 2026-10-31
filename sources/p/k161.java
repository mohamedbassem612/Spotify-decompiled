package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k161 extends hki0 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final String n;
    public final ArrayList o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f24p;
    public final boolean q;

    public k161(String str, String str2, int i, String str3, String str4, String str5, String str6, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str7, ArrayList arrayList, boolean z6, boolean z7) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = i2;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = str7;
        this.o = arrayList;
        this.f24p = z6;
        this.q = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k161)) {
            return false;
        }
        k161 k161Var = (k161) obj;
        return this.a.equals(k161Var.a) && this.b.equals(k161Var.b) && this.c == k161Var.c && this.d.equals(k161Var.d) && this.e.equals(k161Var.e) && this.f.equals(k161Var.f) && this.g.equals(k161Var.g) && this.h == k161Var.h && this.i == k161Var.i && this.j == k161Var.j && this.k == k161Var.k && this.l == k161Var.l && this.m == k161Var.m && this.n.equals(k161Var.n) && this.o.equals(k161Var.o) && this.f24p == k161Var.f24p && this.q == k161Var.q;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.q) + xcg1.g(p3d1.f(this.o, cy30.d(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(kaa0.f(this.h, cy30.d(cy30.d(cy30.d(cy30.d(kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31), 31, this.f24p);
    }
}
