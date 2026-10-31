package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class p7t0 {
    public final String a;
    public final String b;
    public final String c;
    public final hux d;
    public final String e;
    public final String f;
    public final String g;
    public final List h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;

    public p7t0(String str, String str2, String str3, hux huxVar, String str4, String str5, String str6, List list, String str7, String str8, String str9, String str10, String str11) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = huxVar;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = list;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = str10;
        this.m = str11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7t0)) {
            return false;
        }
        p7t0 p7t0Var = (p7t0) obj;
        return this.a.equals(p7t0Var.a) && this.b.equals(p7t0Var.b) && this.c.equals(p7t0Var.c) && u890.j(this.d, p7t0Var.d) && this.e.equals(p7t0Var.e) && this.f.equals(p7t0Var.f) && this.g.equals(p7t0Var.g) && u890.j(this.h, p7t0Var.h) && this.i.equals(p7t0Var.i) && this.j.equals(p7t0Var.j) && this.k.equals(p7t0Var.k) && this.l.equals(p7t0Var.l) && this.m.equals(p7t0Var.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(f4i1.b(cy30.d(cy30.d(cy30.d(eqq.k(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }
}
