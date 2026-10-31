package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hb51 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final int m;

    public hb51(String str, String str2, String str3, String str4, List list, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, String str5, int i3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = i;
        this.g = i2;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = str5;
        this.m = i3;
    }

    public static hb51 a(hb51 hb51Var, String str, List list, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, int i3, int i4) {
        return new hb51(hb51Var.a, (i4 & 2) != 0 ? hb51Var.b : str, hb51Var.c, hb51Var.d, (i4 & 16) != 0 ? hb51Var.e : list, (i4 & 32) != 0 ? hb51Var.f : i, (i4 & 64) != 0 ? hb51Var.g : i2, (i4 & 128) != 0 ? hb51Var.h : z, (i4 & 256) != 0 ? hb51Var.i : z2, (i4 & 512) != 0 ? hb51Var.j : z3, (i4 & 1024) != 0 ? hb51Var.k : z4, hb51Var.l, (i4 & 4096) != 0 ? hb51Var.m : i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb51)) {
            return false;
        }
        hb51 hb51Var = (hb51) obj;
        return u890.j(this.a, hb51Var.a) && u890.j(this.b, hb51Var.b) && u890.j(this.c, hb51Var.c) && u890.j(this.d, hb51Var.d) && u890.j(this.e, hb51Var.e) && this.f == hb51Var.f && this.g == hb51Var.g && this.h == hb51Var.h && this.i == hb51Var.i && this.j == hb51Var.j && this.k == hb51Var.k && this.l.equals(hb51Var.l) && this.m == hb51Var.m;
    }

    public final int hashCode() {
        return Integer.hashCode(this.m) + cy30.d(xcg1.g(xcg1.g(xcg1.g(xcg1.g(kaa0.f(this.g, kaa0.f(this.f, f4i1.b(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }
}
