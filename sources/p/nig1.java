package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nig1 {
    public final lhg1 a;
    public final Float b;
    public final int c;
    public final int d;
    public final boolean e;
    public final lhg1 f;
    public final Boolean g;

    public nig1(lhg1 lhg1Var, Float f, int i, int i2, boolean z, lhg1 lhg1Var2, Boolean bool) {
        this.a = lhg1Var;
        this.b = f;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = lhg1Var2;
        this.g = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nig1)) {
            return false;
        }
        nig1 nig1Var = (nig1) obj;
        return this.a.equals(nig1Var.a) && u890.j(this.b, nig1Var.b) && this.c == nig1Var.c && this.d == nig1Var.d && this.e == nig1Var.e && u890.j(this.f, nig1Var.f) && u890.j(this.g, nig1Var.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Float f = this.b;
        int iG = xcg1.g(kaa0.f(this.d, kaa0.f(this.c, (iHashCode + (f == null ? 0 : f.hashCode())) * 31, 31), 31), 31, this.e);
        lhg1 lhg1Var = this.f;
        int iHashCode2 = (iG + (lhg1Var == null ? 0 : lhg1Var.hashCode())) * 31;
        Boolean bool = this.g;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }
}
