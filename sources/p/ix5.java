package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ix5 {
    public final double a;
    public final boolean b;
    public final l0l c;
    public final nnr d;
    public final String e;
    public final boolean f;

    public ix5(double d, boolean z, l0l l0lVar, nnr nnrVar, String str, boolean z2) {
        this.a = d;
        this.b = z;
        this.c = l0lVar;
        this.d = nnrVar;
        this.e = str;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix5)) {
            return false;
        }
        ix5 ix5Var = (ix5) obj;
        return Double.compare(this.a, ix5Var.a) == 0 && this.b == ix5Var.b && u890.j(this.c, ix5Var.c) && u890.j(this.d, ix5Var.d) && u890.j(this.e, ix5Var.e) && this.f == ix5Var.f;
    }

    public final int hashCode() {
        int iG = xcg1.g(Double.hashCode(this.a) * 31, 31, this.b);
        l0l l0lVar = this.c;
        int iHashCode = (iG + (l0lVar == null ? 0 : l0lVar.hashCode())) * 31;
        nnr nnrVar = this.d;
        return Boolean.hashCode(this.f) + cy30.d((iHashCode + (nnrVar != null ? nnrVar.hashCode() : 0)) * 31, 31, this.e);
    }
}
