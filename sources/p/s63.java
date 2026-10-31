package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s63 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ArrayList f;
    public final q8b g;
    public final String h;
    public final d8r0 i;
    public final int j;
    public final boolean k;
    public final int l;
    public final String m;
    public final Integer n;
    public final String o;

    public s63(String str, String str2, String str3, String str4, String str5, ArrayList arrayList, q8b q8bVar, String str6, d8r0 d8r0Var, int i, boolean z, int i2, String str7, Integer num, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = arrayList;
        this.g = q8bVar;
        this.h = str6;
        this.i = d8r0Var;
        this.j = i;
        this.k = z;
        this.l = i2;
        this.m = str7;
        this.n = num;
        this.o = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s63)) {
            return false;
        }
        s63 s63Var = (s63) obj;
        return u890.j(this.a, s63Var.a) && u890.j(this.b, s63Var.b) && u890.j(this.c, s63Var.c) && u890.j(this.d, s63Var.d) && u890.j(this.e, s63Var.e) && this.f.equals(s63Var.f) && this.g.equals(s63Var.g) && u890.j(this.h, s63Var.h) && this.i.equals(s63Var.i) && this.j == s63Var.j && this.k == s63Var.k && this.l == s63Var.l && u890.j(this.m, s63Var.m) && u890.j(this.n, s63Var.n) && u890.j(this.o, s63Var.o);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iD2 = cy30.d(ab80.k(this.l, xcg1.g(kaa0.f(this.j, hrt.i(this.i, cy30.d((this.g.hashCode() + p3d1.f(this.f, (iD + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31, this.h), 31), 31), 31, this.k), 31), 31, this.m);
        Integer num = this.n;
        int iHashCode = (iD2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.o;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
