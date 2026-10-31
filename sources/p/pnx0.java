package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pnx0 implements ez00 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final Long g;
    public final String h;
    public final List i;
    public final String j;
    public final String k;
    public final boolean l;
    public final int m;
    public final String n;
    public final boolean o;

    public pnx0(String str, String str2, String str3, String str4, String str5, List list, Long l, String str6, List list2, String str7, String str8, boolean z, int i, String str9, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = list;
        this.g = l;
        this.h = str6;
        this.i = list2;
        this.j = str7;
        this.k = str8;
        this.l = z;
        this.m = i;
        this.n = str9;
        this.o = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnx0)) {
            return false;
        }
        pnx0 pnx0Var = (pnx0) obj;
        return this.a.equals(pnx0Var.a) && this.b.equals(pnx0Var.b) && u890.j(this.c, pnx0Var.c) && u890.j(this.d, pnx0Var.d) && this.e.equals(pnx0Var.e) && this.f.equals(pnx0Var.f) && u890.j(this.g, pnx0Var.g) && this.h.equals(pnx0Var.h) && this.i.equals(pnx0Var.i) && u890.j(this.j, pnx0Var.j) && this.k.equals(pnx0Var.k) && this.l == pnx0Var.l && this.m == pnx0Var.m && this.n.equals(pnx0Var.n) && this.o == pnx0Var.o;
    }

    public final int hashCode() {
        int iB = f4i1.b(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        Long l = this.g;
        return Boolean.hashCode(this.o) + cy30.d(kaa0.f(this.m, xcg1.g(cy30.d(cy30.d(f4i1.b(cy30.d((iB + (l == null ? 0 : l.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31), 31, this.n);
    }
}
