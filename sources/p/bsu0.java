package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bsu0 {
    public final String a;
    public final String b;
    public final CharSequence c;
    public final String d;
    public final String e;
    public final d8r0 f;
    public final List g;
    public final boolean h;
    public final boolean i;
    public final o940 j;

    public bsu0(String str, String str2, CharSequence charSequence, String str3, String str4, d8r0 d8r0Var, List list, boolean z, boolean z2, o940 o940Var) {
        this.a = str;
        this.b = str2;
        this.c = charSequence;
        this.d = str3;
        this.e = str4;
        this.f = d8r0Var;
        this.g = list;
        this.h = z;
        this.i = z2;
        this.j = o940Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsu0)) {
            return false;
        }
        bsu0 bsu0Var = (bsu0) obj;
        return u890.j(this.a, bsu0Var.a) && u890.j(this.b, bsu0Var.b) && u890.j(this.c, bsu0Var.c) && u890.j(this.d, bsu0Var.d) && u890.j(this.e, bsu0Var.e) && this.f.equals(bsu0Var.f) && this.g.equals(bsu0Var.g) && this.h == bsu0Var.h && this.i == bsu0Var.i && u890.j(this.j, bsu0Var.j);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(f4i1.b(hrt.i(this.f, cy30.d(cy30.d((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i);
        o940 o940Var = this.j;
        return iG + (o940Var == null ? 0 : o940Var.hashCode());
    }
}
