package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mnp0 {
    public final nnp0 a;
    public final int b;

    public mnp0(nnp0 nnp0Var, int i) {
        this.a = nnp0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mnp0)) {
            return false;
        }
        mnp0 mnp0Var = (mnp0) obj;
        return this.a.equals(mnp0Var.a) && this.b == mnp0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
