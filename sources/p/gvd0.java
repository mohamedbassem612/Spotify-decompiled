package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gvd0 {
    public final String a;
    public final String b;
    public final List c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final List h;
    public final int i;
    public final String j;
    public final List k;
    public final boolean l;
    public final int m;
    public final boolean n;
    public final String o;

    public gvd0(String str, String str2, List list, long j, long j2, String str3, String str4, List list2, int i, String str5, List list3, boolean z, int i2, boolean z2, String str6) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = j;
        this.e = j2;
        this.f = str3;
        this.g = str4;
        this.h = list2;
        this.i = i;
        this.j = str5;
        this.k = list3;
        this.l = z;
        this.m = i2;
        this.n = z2;
        this.o = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvd0)) {
            return false;
        }
        gvd0 gvd0Var = (gvd0) obj;
        return this.a.equals(gvd0Var.a) && this.b.equals(gvd0Var.b) && this.c.equals(gvd0Var.c) && this.d == gvd0Var.d && this.e == gvd0Var.e && this.f.equals(gvd0Var.f) && this.g.equals(gvd0Var.g) && this.h.equals(gvd0Var.h) && this.i == gvd0Var.i && u890.j(this.j, gvd0Var.j) && this.k.equals(gvd0Var.k) && this.l == gvd0Var.l && this.m == gvd0Var.m && this.n == gvd0Var.n && this.o.equals(gvd0Var.o);
    }

    public final int hashCode() {
        int iK = ab80.k(this.i, f4i1.b(cy30.d(cy30.d(cy30.f(cy30.f(f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31), this.e, 31), 31, this.f), 31, this.g), 31, this.h), 31);
        String str = this.j;
        return this.o.hashCode() + xcg1.g(ab80.k(this.m, xcg1.g(f4i1.b((iK + (str == null ? 0 : str.hashCode())) * 31, 31, this.k), 31, this.l), 31), 31, this.n);
    }
}
