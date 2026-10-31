package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class va81 implements ez00 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ArrayList f;
    public final den g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final String l;
    public final int m;

    public va81(String str, String str2, String str3, String str4, String str5, ArrayList arrayList, den denVar, boolean z, boolean z2, boolean z3, int i, String str6, int i2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = arrayList;
        this.g = denVar;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = i;
        this.l = str6;
        this.m = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof va81)) {
            return false;
        }
        va81 va81Var = (va81) obj;
        return this.a.equals(va81Var.a) && this.b.equals(va81Var.b) && this.c.equals(va81Var.c) && this.d.equals(va81Var.d) && this.e.equals(va81Var.e) && this.f.equals(va81Var.f) && this.g.equals(va81Var.g) && this.h == va81Var.h && this.i == va81Var.i && this.j == va81Var.j && this.k == va81Var.k && u890.j(this.l, va81Var.l) && this.m == va81Var.m;
    }

    public final int hashCode() {
        int iK = ab80.k(this.k, xcg1.g(xcg1.g(xcg1.g((this.g.hashCode() + p3d1.f(this.f, cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31)) * 31, 31, this.h), 31, this.i), 31, this.j), 31);
        String str = this.l;
        return l1d.C(this.m) + ((iK + (str == null ? 0 : str.hashCode())) * 31);
    }
}
