package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bds0 {
    public final cds0 a;
    public final ads0 b;

    public bds0(cds0 cds0Var, ads0 ads0Var) {
        this.a = cds0Var;
        this.b = ads0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bds0)) {
            return false;
        }
        bds0 bds0Var = (bds0) obj;
        return this.a.equals(bds0Var.a) && this.b.equals(bds0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
