package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fhu0 {
    public final String a;
    public final String b;
    public final CharSequence c;
    public final String d;
    public final String e;
    public final d8r0 f;
    public final int g;
    public final List h;
    public final Integer i;
    public final String j;
    public final boolean k;
    public final o940 l;

    public fhu0(String str, String str2, CharSequence charSequence, String str3, String str4, d8r0 d8r0Var, int i, List list, Integer num, String str5, boolean z, o940 o940Var) {
        this.a = str;
        this.b = str2;
        this.c = charSequence;
        this.d = str3;
        this.e = str4;
        this.f = d8r0Var;
        this.g = i;
        this.h = list;
        this.i = num;
        this.j = str5;
        this.k = z;
        this.l = o940Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhu0)) {
            return false;
        }
        fhu0 fhu0Var = (fhu0) obj;
        return u890.j(this.a, fhu0Var.a) && u890.j(this.b, fhu0Var.b) && u890.j(this.c, fhu0Var.c) && u890.j(this.d, fhu0Var.d) && u890.j(this.e, fhu0Var.e) && this.f.equals(fhu0Var.f) && this.g == fhu0Var.g && this.h.equals(fhu0Var.h) && u890.j(this.i, fhu0Var.i) && u890.j(this.j, fhu0Var.j) && this.k == fhu0Var.k && u890.j(this.l, fhu0Var.l);
    }

    public final int hashCode() {
        int iB = f4i1.b(kaa0.f(this.g, hrt.i(this.f, cy30.d(cy30.d((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31), 31), 31, this.h);
        Integer num = this.i;
        int iHashCode = (iB + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.j;
        int iG = xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.k);
        o940 o940Var = this.l;
        return iG + (o940Var != null ? o940Var.hashCode() : 0);
    }
}
