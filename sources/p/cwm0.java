package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cwm0 {
    public final String a;
    public final int b;
    public final ArrayList c;
    public final int d;
    public final String e;
    public final String f;
    public final w4g0 g;
    public final boolean h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n = "";

    public cwm0(String str, int i, ArrayList arrayList, int i2, String str2, String str3, w4g0 w4g0Var, boolean z, String str4, String str5, String str6, String str7, String str8) {
        this.a = str;
        this.b = i;
        this.c = arrayList;
        this.d = i2;
        this.e = str2;
        this.f = str3;
        this.g = w4g0Var;
        this.h = z;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwm0)) {
            return false;
        }
        cwm0 cwm0Var = (cwm0) obj;
        return this.a.equals(cwm0Var.a) && this.b == cwm0Var.b && this.c.equals(cwm0Var.c) && this.d == cwm0Var.d && this.e.equals(cwm0Var.e) && this.f.equals(cwm0Var.f) && this.g.equals(cwm0Var.g) && this.h == cwm0Var.h && this.i.equals(cwm0Var.i) && this.j.equals(cwm0Var.j) && this.k.equals(cwm0Var.k) && this.l.equals(cwm0Var.l) && this.m.equals(cwm0Var.m) && this.n.equals(cwm0Var.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(xcg1.g((this.g.hashCode() + cy30.d(cy30.d(kaa0.f(this.d, p3d1.f(this.c, cy30.f(cy30.f(kaa0.f(this.b, this.a.hashCode() * 31, 31), 0L, 961), 0L, 31), 31), 31), 31, this.e), 31, this.f)) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
    }
}
