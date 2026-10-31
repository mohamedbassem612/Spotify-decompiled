package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rca1 {
    public final r6h1 a;
    public final qca1 b;

    public rca1(r6h1 r6h1Var, qca1 qca1Var) {
        this.a = r6h1Var;
        this.b = qca1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rca1)) {
            return false;
        }
        rca1 rca1Var = (rca1) obj;
        return u890.j(this.a, rca1Var.a) && this.b.equals(rca1Var.b);
    }

    public final int hashCode() {
        r6h1 r6h1Var = this.a;
        return this.b.hashCode() + ((r6h1Var == null ? 0 : r6h1Var.hashCode()) * 31);
    }
}
