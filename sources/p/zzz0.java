package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zzz0 implements b001 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final xzz0 e;
    public final boolean f;
    public final boolean g;
    public final uzz0 h;
    public final String i;
    public final String j;
    public final List k;
    public final qzz0 l;
    public final List m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f55p;

    public zzz0(String str, String str2, String str3, String str4, xzz0 xzz0Var, boolean z, boolean z2, uzz0 uzz0Var, String str5, String str6, List list, qzz0 qzz0Var, List list2, boolean z3, boolean z4, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = xzz0Var;
        this.f = z;
        this.g = z2;
        this.h = uzz0Var;
        this.i = str5;
        this.j = str6;
        this.k = list;
        this.l = qzz0Var;
        this.m = list2;
        this.n = z3;
        this.o = z4;
        this.f55p = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzz0)) {
            return false;
        }
        zzz0 zzz0Var = (zzz0) obj;
        return u890.j(this.a, zzz0Var.a) && u890.j(this.b, zzz0Var.b) && u890.j(this.c, zzz0Var.c) && this.d.equals(zzz0Var.d) && this.e.equals(zzz0Var.e) && this.f == zzz0Var.f && this.g == zzz0Var.g && this.h.equals(zzz0Var.h) && u890.j(this.i, zzz0Var.i) && u890.j(this.j, zzz0Var.j) && u890.j(this.k, zzz0Var.k) && this.l.equals(zzz0Var.l) && this.m.equals(zzz0Var.m) && this.n == zzz0Var.n && this.o == zzz0Var.o && u890.j(this.f55p, zzz0Var.f55p);
    }

    public final int hashCode() {
        return this.f55p.hashCode() + xcg1.g(xcg1.g(f4i1.b((this.l.hashCode() + f4i1.b(cy30.d(cy30.d((this.h.hashCode() + xcg1.g(xcg1.g((this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g)) * 31, 31, this.i), 31, this.j), 31, this.k)) * 31, 31, this.m), 31, this.n), 31, this.o);
    }
}
