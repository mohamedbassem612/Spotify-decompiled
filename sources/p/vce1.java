package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vce1 {
    public final uce1 a;
    public final q061 b;

    public vce1(uce1 uce1Var, q061 q061Var) {
        this.a = uce1Var;
        this.b = q061Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vce1)) {
            return false;
        }
        vce1 vce1Var = (vce1) obj;
        return this.a.equals(vce1Var.a) && this.b == vce1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
