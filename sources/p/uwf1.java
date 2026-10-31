package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uwf1 {
    public final String a;
    public final List b;
    public final o1v c;
    public final k4m d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final uez0 i;
    public final String j;
    public final String k;
    public final boolean l;
    public final int m;

    public uwf1(String str, List list, o1v o1vVar, k4m k4mVar, boolean z, boolean z2, boolean z3, boolean z4, uez0 uez0Var, String str2, String str3, boolean z5, int i) {
        this.a = str;
        this.b = list;
        this.c = o1vVar;
        this.d = k4mVar;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = uez0Var;
        this.j = str2;
        this.k = str3;
        this.l = z5;
        this.m = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uwf1)) {
            return false;
        }
        uwf1 uwf1Var = (uwf1) obj;
        return u890.j(this.a, uwf1Var.a) && u890.j(this.b, uwf1Var.b) && this.c == uwf1Var.c && this.d == uwf1Var.d && this.e == uwf1Var.e && this.f == uwf1Var.f && this.g == uwf1Var.g && this.h == uwf1Var.h && this.i.equals(uwf1Var.i) && this.j.equals(uwf1Var.j) && u890.j(this.k, uwf1Var.k) && this.l == uwf1Var.l && this.m == uwf1Var.m;
    }

    public final int hashCode() {
        int iD = cy30.d((this.i.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(p3d1.g(this.d, (this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, false)) * 31, 31, this.j);
        String str = this.k;
        return Integer.hashCode(this.m) + xcg1.g((iD + (str != null ? str.hashCode() : 0)) * 31, 31, this.l);
    }
}
