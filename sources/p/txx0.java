package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class txx0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final ee11 f;
    public final nmu0 g;
    public final boolean h;
    public final List i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    public txx0(String str, String str2, boolean z, String str3, String str4, ee11 ee11Var, nmu0 nmu0Var, boolean z2, List list, boolean z3, boolean z4, boolean z5) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = ee11Var;
        this.g = nmu0Var;
        this.h = z2;
        this.i = list;
        this.j = z3;
        this.k = z4;
        this.l = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txx0)) {
            return false;
        }
        txx0 txx0Var = (txx0) obj;
        return u890.j(this.a, txx0Var.a) && this.b.equals(txx0Var.b) && this.c == txx0Var.c && u890.j(this.d, txx0Var.d) && this.e.equals(txx0Var.e) && this.f.equals(txx0Var.f) && this.g == txx0Var.g && this.h == txx0Var.h && u890.j(this.i, txx0Var.i) && this.j == txx0Var.j && this.k == txx0Var.k && this.l == txx0Var.l;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.l) + xcg1.g(xcg1.g(f4i1.b(xcg1.g((this.g.hashCode() + ((this.f.hashCode() + cy30.d(cy30.d(xcg1.g(cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }
}
