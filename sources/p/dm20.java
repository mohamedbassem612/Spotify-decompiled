package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dm20 {
    public final String a;
    public final String b;
    public final kl20 c;
    public final hn21 d;
    public final sgg e;
    public final vdj1 f;
    public final li40 g;
    public final int h;
    public final jtl i;
    public final d8r0 j;
    public final q8b k;
    public final int l;
    public final String m;
    public final String n;

    public dm20(String str, String str2, kl20 kl20Var, hn21 hn21Var, sgg sggVar, vdj1 vdj1Var, li40 li40Var, int i, jtl jtlVar, d8r0 d8r0Var, q8b q8bVar, int i2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = kl20Var;
        this.d = hn21Var;
        this.e = sggVar;
        this.f = vdj1Var;
        this.g = li40Var;
        this.h = i;
        this.i = jtlVar;
        this.j = d8r0Var;
        this.k = q8bVar;
        this.l = i2;
        this.m = str3;
        this.n = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm20)) {
            return false;
        }
        dm20 dm20Var = (dm20) obj;
        return u890.j(this.a, dm20Var.a) && u890.j(this.b, dm20Var.b) && this.c == dm20Var.c && this.d.equals(dm20Var.d) && this.e.equals(dm20Var.e) && u890.j(this.f, dm20Var.f) && this.g.equals(dm20Var.g) && this.h == dm20Var.h && this.i.equals(dm20Var.i) && u890.j(this.j, dm20Var.j) && this.k.equals(dm20Var.k) && this.l == dm20Var.l && u890.j(this.m, dm20Var.m) && u890.j(this.n, dm20Var.n);
    }

    public final int hashCode() {
        int iK = ab80.k(this.e.a, (this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31);
        vdj1 vdj1Var = this.f;
        return this.n.hashCode() + cy30.d(kaa0.f(this.l, (this.k.hashCode() + hrt.i(this.j, xcg1.g(ab80.k(this.h, (this.g.hashCode() + ((iK + (vdj1Var == null ? 0 : vdj1Var.hashCode())) * 31)) * 31, 31), 31, this.i.a), 31)) * 31, 31), 31, this.m);
    }
}
