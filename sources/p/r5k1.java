package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r5k1 {
    public final String a;
    public final jlw0 b;
    public final jlw0 c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final s171 h;
    public final u771 i;
    public final long j;
    public final vve1 k;
    public final Uri l;
    public final boolean m;
    public final String n;
    public final String o;

    public r5k1(String str, jlw0 jlw0Var, jlw0 jlw0Var2, int i, int i2, String str2, String str3, s171 s171Var, u771 u771Var, long j, vve1 vve1Var, Uri uri, boolean z, String str4, String str5) {
        this.a = str;
        this.b = jlw0Var;
        this.c = jlw0Var2;
        this.d = i;
        this.e = i2;
        this.f = str2;
        this.g = str3;
        this.h = s171Var;
        this.i = u771Var;
        this.j = j;
        this.k = vve1Var;
        this.l = uri;
        this.m = z;
        this.n = str4;
        this.o = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5k1)) {
            return false;
        }
        r5k1 r5k1Var = (r5k1) obj;
        return u890.j(this.a, r5k1Var.a) && u890.j(this.b, r5k1Var.b) && u890.j(this.c, r5k1Var.c) && this.d == r5k1Var.d && this.e == r5k1Var.e && u890.j(this.f, r5k1Var.f) && u890.j(this.g, r5k1Var.g) && u890.j(this.h, r5k1Var.h) && u890.j(this.i, r5k1Var.i) && vve1.a(this.j, r5k1Var.j) && u890.j(this.k, r5k1Var.k) && u890.j(this.l, r5k1Var.l) && this.m == r5k1Var.m && u890.j(this.n, r5k1Var.n) && u890.j(this.o, r5k1Var.o);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jlw0 jlw0Var = this.b;
        int iF = cy30.f(cfm0.g(this.i, (this.h.hashCode() + cy30.d(cy30.d(kaa0.f(this.e, kaa0.f(this.d, (this.c.hashCode() + ((iHashCode + (jlw0Var == null ? 0 : jlw0Var.hashCode())) * 31)) * 31, 31), 31), 31, this.f), 31, this.g)) * 31, 31), this.j, 31);
        vve1 vve1Var = this.k;
        int iG = xcg1.g(hrt.h(this.l, (iF + (vve1Var == null ? 0 : Long.hashCode(vve1Var.a))) * 31, 31), 31, this.m);
        String str = this.n;
        int iHashCode2 = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.o;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
