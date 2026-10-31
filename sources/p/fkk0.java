package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fkk0 implements ikk0 {
    public final vaa0 a;
    public final int b;

    public fkk0(vaa0 vaa0Var, int i) {
        this.a = vaa0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fkk0)) {
            return false;
        }
        fkk0 fkk0Var = (fkk0) obj;
        return this.a == fkk0Var.a && this.b == fkk0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
