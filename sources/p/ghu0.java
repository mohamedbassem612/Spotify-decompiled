package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ghu0 {
    public final String a;
    public final String b;
    public final CharSequence c;
    public final String d;
    public final String e;
    public final d8r0 f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final List j;
    public final boolean k;
    public final boolean l;

    public ghu0(String str, String str2, CharSequence charSequence, String str3, String str4, d8r0 d8r0Var, boolean z, boolean z2, int i, List list, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = charSequence;
        this.d = str3;
        this.e = str4;
        this.f = d8r0Var;
        this.g = z;
        this.h = z2;
        this.i = i;
        this.j = list;
        this.k = z3;
        this.l = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghu0)) {
            return false;
        }
        ghu0 ghu0Var = (ghu0) obj;
        return u890.j(this.a, ghu0Var.a) && u890.j(this.b, ghu0Var.b) && u890.j(this.c, ghu0Var.c) && u890.j(this.d, ghu0Var.d) && u890.j(this.e, ghu0Var.e) && this.f.equals(ghu0Var.f) && this.g == ghu0Var.g && this.h == ghu0Var.h && this.i == ghu0Var.i && u890.j(this.j, ghu0Var.j) && this.k == ghu0Var.k && this.l == ghu0Var.l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + xcg1.g(f4i1.b(ab80.k(this.i, xcg1.g(xcg1.g(hrt.i(this.f, cy30.d(cy30.d((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31), 31, this.g), 31, this.h), 31), 31, this.j), 31, this.k);
    }
}
