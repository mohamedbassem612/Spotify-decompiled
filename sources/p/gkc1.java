package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gkc1 {
    public final w8w0 a;
    public final boolean b;
    public final buk1 c;
    public final hez d;
    public final fa20 e;
    public final px30 f;
    public final k7f0 g;
    public final taa0 h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    public gkc1(w8w0 w8w0Var, boolean z, buk1 buk1Var, hez hezVar, fa20 fa20Var, px30 px30Var, k7f0 k7f0Var, taa0 taa0Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = w8w0Var;
        this.b = z;
        this.c = buk1Var;
        this.d = hezVar;
        this.e = fa20Var;
        this.f = px30Var;
        this.g = k7f0Var;
        this.h = taa0Var;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gkc1)) {
            return false;
        }
        gkc1 gkc1Var = (gkc1) obj;
        return u890.j(this.a, gkc1Var.a) && this.b == gkc1Var.b && u890.j(this.c, gkc1Var.c) && u890.j(this.d, gkc1Var.d) && u890.j(this.e, gkc1Var.e) && u890.j(this.f, gkc1Var.f) && u890.j(this.g, gkc1Var.g) && u890.j(this.h, gkc1Var.h) && this.i == gkc1Var.i && this.j == gkc1Var.j && this.k == gkc1Var.k && this.l == gkc1Var.l && this.m == gkc1Var.m;
    }

    public final int hashCode() {
        w8w0 w8w0Var = this.a;
        int iG = xcg1.g((w8w0Var == null ? 0 : w8w0Var.hashCode()) * 31, 31, this.b);
        buk1 buk1Var = this.c;
        int iHashCode = (iG + (buk1Var == null ? 0 : buk1Var.a.hashCode())) * 31;
        hez hezVar = this.d;
        int iHashCode2 = (iHashCode + (hezVar == null ? 0 : hezVar.a.hashCode())) * 31;
        fa20 fa20Var = this.e;
        int iHashCode3 = (iHashCode2 + (fa20Var == null ? 0 : fa20Var.a.hashCode())) * 31;
        px30 px30Var = this.f;
        int iHashCode4 = (iHashCode3 + (px30Var == null ? 0 : px30Var.a.hashCode())) * 31;
        k7f0 k7f0Var = this.g;
        int iHashCode5 = (iHashCode4 + (k7f0Var == null ? 0 : k7f0Var.a.hashCode())) * 31;
        taa0 taa0Var = this.h;
        return Boolean.hashCode(this.m) + xcg1.g(xcg1.g(xcg1.g(xcg1.g((iHashCode5 + (taa0Var != null ? taa0Var.a.hashCode() : 0)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }
}
