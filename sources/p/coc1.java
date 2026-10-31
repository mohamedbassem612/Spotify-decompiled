package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class coc1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final p60 h;
    public final List i;
    public final int j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f28p;
    public final String q;
    public final String r;

    public coc1(String str, String str2, String str3, String str4, String str5, String str6, List list, p60 p60Var, List list2, int i, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = list;
        this.h = p60Var;
        this.i = list2;
        this.j = i;
        this.k = str7;
        this.l = str8;
        this.m = str9;
        this.n = str10;
        this.o = str11;
        this.f28p = str12;
        this.q = str13;
        this.r = str14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof coc1)) {
            return false;
        }
        coc1 coc1Var = (coc1) obj;
        return this.a.equals(coc1Var.a) && this.b.equals(coc1Var.b) && this.c.equals(coc1Var.c) && this.d.equals(coc1Var.d) && this.e.equals(coc1Var.e) && this.f.equals(coc1Var.f) && u890.j(this.g, coc1Var.g) && this.h.equals(coc1Var.h) && u890.j(this.i, coc1Var.i) && this.j == coc1Var.j && this.k.equals(coc1Var.k) && this.l.equals(coc1Var.l) && this.m.equals(coc1Var.m) && this.n.equals(coc1Var.n) && this.o.equals(coc1Var.o) && u890.j(this.f28p, coc1Var.f28p) && this.q.equals(coc1Var.q) && this.r.equals(coc1Var.r);
    }

    public final int hashCode() {
        return this.r.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(ab80.k(this.j, f4i1.b((this.h.hashCode() + f4i1.b(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31, 31, this.i), 31), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.f28p), 31, this.q);
    }
}
