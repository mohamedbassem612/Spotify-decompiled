package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xuj1 {
    public final wuj1 a;
    public final bm31 b;
    public final oi31 c;
    public final int d;
    public final boolean e;
    public final boolean f;

    public xuj1(wuj1 wuj1Var, bm31 bm31Var, oi31 oi31Var, int i, boolean z, boolean z2) {
        this.a = wuj1Var;
        this.b = bm31Var;
        this.c = oi31Var;
        this.d = i;
        this.e = z;
        this.f = z2;
    }

    public static xuj1 a(xuj1 xuj1Var, wuj1 wuj1Var, bm31 bm31Var, oi31 oi31Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            bm31Var = xuj1Var.b;
        }
        bm31 bm31Var2 = bm31Var;
        if ((i2 & 4) != 0) {
            oi31Var = xuj1Var.c;
        }
        oi31 oi31Var2 = oi31Var;
        if ((i2 & 8) != 0) {
            i = xuj1Var.d;
        }
        return new xuj1(wuj1Var, bm31Var2, oi31Var2, i, xuj1Var.e, (i2 & 32) != 0 ? xuj1Var.f : true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xuj1)) {
            return false;
        }
        xuj1 xuj1Var = (xuj1) obj;
        return u890.j(this.a, xuj1Var.a) && u890.j(this.b, xuj1Var.b) && u890.j(this.c, xuj1Var.c) && this.d == xuj1Var.d && this.e == xuj1Var.e && this.f == xuj1Var.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        bm31 bm31Var = this.b;
        int iHashCode2 = (iHashCode + (bm31Var == null ? 0 : bm31Var.hashCode())) * 31;
        oi31 oi31Var = this.c;
        return Boolean.hashCode(this.f) + xcg1.g(kaa0.f(this.d, (iHashCode2 + (oi31Var != null ? oi31Var.hashCode() : 0)) * 31, 31), 31, this.e);
    }
}
