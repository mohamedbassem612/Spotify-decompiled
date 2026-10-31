package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class b1k0 implements k1k0 {
    public final lhg1 a;
    public final w0k0 b;
    public final lhg1 c;
    public final lhg1 d;
    public final lhg1 e;
    public final double f;
    public final a1k0 g;
    public final ou80 h;

    public b1k0(lhg1 lhg1Var, w0k0 w0k0Var, lhg1 lhg1Var2, lhg1 lhg1Var3, lhg1 lhg1Var4, double d, a1k0 a1k0Var, ou80 ou80Var) {
        this.a = lhg1Var;
        this.b = w0k0Var;
        this.c = lhg1Var2;
        this.d = lhg1Var3;
        this.e = lhg1Var4;
        this.f = d;
        this.g = a1k0Var;
        this.h = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1k0)) {
            return false;
        }
        b1k0 b1k0Var = (b1k0) obj;
        return u890.j(this.a, b1k0Var.a) && this.b.equals(b1k0Var.b) && u890.j(this.c, b1k0Var.c) && u890.j(this.d, b1k0Var.d) && u890.j(this.e, b1k0Var.e) && Double.compare(this.f, b1k0Var.f) == 0 && this.g.equals(b1k0Var.g) && u890.j(this.h, b1k0Var.h);
    }

    public final int hashCode() {
        lhg1 lhg1Var = this.a;
        int iHashCode = (this.b.hashCode() + ((lhg1Var == null ? 0 : lhg1Var.hashCode()) * 31)) * 31;
        lhg1 lhg1Var2 = this.c;
        int iHashCode2 = (iHashCode + (lhg1Var2 == null ? 0 : lhg1Var2.hashCode())) * 31;
        lhg1 lhg1Var3 = this.d;
        int iHashCode3 = (this.g.hashCode() + xcg1.e(this.f, (this.e.hashCode() + ((iHashCode2 + (lhg1Var3 == null ? 0 : lhg1Var3.hashCode())) * 31)) * 31, 31)) * 31;
        ou80 ou80Var = this.h;
        return iHashCode3 + (ou80Var != null ? ou80Var.a.hashCode() : 0);
    }
}
