package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fhd0 {
    public final tcd0 a;

    public fhd0(tcd0 tcd0Var) {
        this.a = tcd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fhd0) && u890.j(this.a, ((fhd0) obj).a);
    }

    public final int hashCode() {
        tcd0 tcd0Var = this.a;
        if (tcd0Var == null) {
            return 0;
        }
        return tcd0Var.hashCode();
    }
}
