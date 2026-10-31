package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class haz {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final d8r0 h;
    public final String i;
    public final String j;
    public final boolean k;
    public final List l;
    public final boolean m;
    public final String n;

    public haz(String str, String str2, String str3, String str4, String str5, String str6, int i, d8r0 d8r0Var, String str7, String str8, boolean z, List list, boolean z2, String str9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = i;
        this.h = d8r0Var;
        this.i = str7;
        this.j = str8;
        this.k = z;
        this.l = list;
        this.m = z2;
        this.n = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof haz)) {
            return false;
        }
        haz hazVar = (haz) obj;
        return u890.j(this.a, hazVar.a) && u890.j(this.b, hazVar.b) && u890.j(this.c, hazVar.c) && u890.j(this.d, hazVar.d) && u890.j(this.e, hazVar.e) && u890.j(this.f, hazVar.f) && this.g == hazVar.g && this.h.equals(hazVar.h) && u890.j(this.i, hazVar.i) && this.j.equals(hazVar.j) && this.k == hazVar.k && this.l.equals(hazVar.l) && this.m == hazVar.m && this.n.equals(hazVar.n);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return this.n.hashCode() + xcg1.g(f4i1.b(xcg1.g(cy30.d(cy30.d(hrt.i(this.h, ab80.k(this.g, (iD + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
    }
}
