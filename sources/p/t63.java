package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t63 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ArrayList f;
    public final q8b g;
    public final String h;
    public final d8r0 i;
    public final boolean j;
    public final int k;
    public final boolean l;
    public final boolean m;
    public final int n;
    public final String o;

    public t63(String str, String str2, String str3, String str4, String str5, ArrayList arrayList, q8b q8bVar, String str6, d8r0 d8r0Var, boolean z, int i, boolean z2, boolean z3, int i2, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = arrayList;
        this.g = q8bVar;
        this.h = str6;
        this.i = d8r0Var;
        this.j = z;
        this.k = i;
        this.l = z2;
        this.m = z3;
        this.n = i2;
        this.o = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t63)) {
            return false;
        }
        t63 t63Var = (t63) obj;
        return u890.j(this.a, t63Var.a) && u890.j(this.b, t63Var.b) && u890.j(this.c, t63Var.c) && u890.j(this.d, t63Var.d) && u890.j(this.e, t63Var.e) && this.f.equals(t63Var.f) && this.g.equals(t63Var.g) && u890.j(this.h, t63Var.h) && this.i.equals(t63Var.i) && this.j == t63Var.j && this.k == t63Var.k && this.l == t63Var.l && this.m == t63Var.m && this.n == t63Var.n && u890.j(this.o, t63Var.o);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return this.o.hashCode() + ab80.k(this.n, xcg1.g(xcg1.g(ab80.k(this.k, xcg1.g(hrt.i(this.i, cy30.d((this.g.hashCode() + p3d1.f(this.f, (iD + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31, this.h), 31), 31, this.j), 31), 31, this.l), 31, this.m), 31);
    }
}
