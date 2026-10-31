package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gy01 {
    public final int a;
    public final String b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final urt0 k;
    public final boolean l;
    public final boolean m;
    public final List n;

    public gy01(int i, String str, boolean z, String str2, boolean z2, String str3, boolean z3, boolean z4, boolean z5, boolean z6, urt0 urt0Var, boolean z7, boolean z8, List list) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = z2;
        this.f = str3;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = urt0Var;
        this.l = z7;
        this.m = z8;
        this.n = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy01)) {
            return false;
        }
        gy01 gy01Var = (gy01) obj;
        return this.a == gy01Var.a && u890.j(this.b, gy01Var.b) && this.c == gy01Var.c && u890.j(this.d, gy01Var.d) && this.e == gy01Var.e && u890.j(this.f, gy01Var.f) && this.g == gy01Var.g && this.h == gy01Var.h && this.i == gy01Var.i && this.j == gy01Var.j && u890.j(this.k, gy01Var.k) && this.l == gy01Var.l && this.m == gy01Var.m && u890.j(this.n, gy01Var.n);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(xcg1.g(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return this.n.hashCode() + xcg1.g(xcg1.g((this.k.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j)) * 31, 31, this.l), 31, this.m);
    }
}
