package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ppc0 implements rpc0 {
    public final tr80 a;
    public final yvg1 b;

    public ppc0(tr80 tr80Var, yvg1 yvg1Var) {
        this.a = tr80Var;
        this.b = yvg1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppc0)) {
            return false;
        }
        ppc0 ppc0Var = (ppc0) obj;
        return this.a.equals(ppc0Var.a) && this.b.equals(ppc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
