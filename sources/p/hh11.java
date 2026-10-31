package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hh11 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final List k;
    public final boolean l;

    public hh11(String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str4, List list, boolean z6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = str4;
        this.k = list;
        this.l = z6;
    }

    public static hh11 a(hh11 hh11Var, boolean z) {
        return new hh11(hh11Var.a, hh11Var.b, hh11Var.c, hh11Var.d, z, hh11Var.f, hh11Var.g, hh11Var.h, hh11Var.i, hh11Var.j, hh11Var.k, hh11Var.l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh11)) {
            return false;
        }
        hh11 hh11Var = (hh11) obj;
        return this.a.equals(hh11Var.a) && this.b.equals(hh11Var.b) && this.c.equals(hh11Var.c) && this.d == hh11Var.d && this.e == hh11Var.e && this.f == hh11Var.f && this.g == hh11Var.g && this.h == hh11Var.h && this.i == hh11Var.i && this.j.equals(hh11Var.j) && this.k.equals(hh11Var.k) && this.l == hh11Var.l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + f4i1.b(cy30.d(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(kaa0.f(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }
}
