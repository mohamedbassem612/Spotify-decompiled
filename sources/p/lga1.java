package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lga1 {
    public final yga1 a;
    public final int b;
    public final cga1 c;

    public lga1(yga1 yga1Var, int i, cga1 cga1Var) {
        this.a = yga1Var;
        this.b = i;
        this.c = cga1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lga1)) {
            return false;
        }
        lga1 lga1Var = (lga1) obj;
        return this.a.equals(lga1Var.a) && this.b == lga1Var.b && u890.j(this.c, lga1Var.c);
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, this.a.hashCode() * 31, 31);
        cga1 cga1Var = this.c;
        return iK + (cga1Var == null ? 0 : cga1Var.hashCode());
    }
}
