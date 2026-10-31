package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fvv0 {
    public final ktv0 a;
    public final int b;

    public fvv0(ktv0 ktv0Var, int i) {
        this.a = ktv0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvv0)) {
            return false;
        }
        fvv0 fvv0Var = (fvv0) obj;
        return this.a.equals(fvv0Var.a) && this.b == fvv0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
