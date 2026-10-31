package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fpc0 extends hpc0 {
    public final yvg1 a;

    public fpc0(yvg1 yvg1Var) {
        this.a = yvg1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fpc0) && this.a.equals(((fpc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
