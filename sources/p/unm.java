package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class unm {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    public final int h;
    public final String i;
    public final ArrayList j;
    public final int k;
    public final boolean l;
    public final boolean m;
    public final poz0 n;
    public final h131 o;

    public unm(String str, String str2, String str3, long j, long j2, int i, int i2, int i3, String str4, ArrayList arrayList, int i4, boolean z, boolean z2, poz0 poz0Var, h131 h131Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = j2;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = str4;
        this.j = arrayList;
        this.k = i4;
        this.l = z;
        this.m = z2;
        this.n = poz0Var;
        this.o = h131Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unm)) {
            return false;
        }
        unm unmVar = (unm) obj;
        return this.a.equals(unmVar.a) && this.b.equals(unmVar.b) && u890.j(this.c, unmVar.c) && this.d == unmVar.d && this.e == unmVar.e && this.f == unmVar.f && this.g == unmVar.g && this.h == unmVar.h && u890.j(this.i, unmVar.i) && this.j.equals(unmVar.j) && this.k == unmVar.k && this.l == unmVar.l && this.m == unmVar.m && this.n.equals(unmVar.n) && this.o.equals(unmVar.o);
    }

    public final int hashCode() {
        int iK = ab80.k(this.h, ab80.k(this.g, ab80.k(this.f, cy30.f(cy30.f(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31), this.e, 31), 31), 31), 31);
        String str = this.i;
        return this.o.hashCode() + ((this.n.hashCode() + xcg1.g(xcg1.g(kaa0.f(this.k, p3d1.f(this.j, (iK + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.l), 31, this.m)) * 31);
    }
}
