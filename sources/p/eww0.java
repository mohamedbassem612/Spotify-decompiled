package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class eww0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final String f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final String o;

    public eww0(String str, String str2, String str3, String str4, List list, String str5, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = str5;
        this.g = i;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = z7;
        this.o = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eww0)) {
            return false;
        }
        eww0 eww0Var = (eww0) obj;
        return this.a.equals(eww0Var.a) && this.b.equals(eww0Var.b) && u890.j(this.c, eww0Var.c) && this.d.equals(eww0Var.d) && u890.j(this.e, eww0Var.e) && u890.j(this.f, eww0Var.f) && this.g == eww0Var.g && this.h == eww0Var.h && this.i == eww0Var.i && this.j == eww0Var.j && this.k == eww0Var.k && this.l == eww0Var.l && this.m == eww0Var.m && this.n == eww0Var.n && u890.j(this.o, eww0Var.o);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iB = f4i1.b(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
        String str2 = this.f;
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(kaa0.f(this.g, (iB + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
        String str3 = this.o;
        return iG + (str3 != null ? str3.hashCode() : 0);
    }
}
