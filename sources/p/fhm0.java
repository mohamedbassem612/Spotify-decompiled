package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fhm0 {
    public final msg1 a;
    public final zrg1 b;

    public fhm0(msg1 msg1Var, zrg1 zrg1Var) {
        this.a = msg1Var;
        this.b = zrg1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhm0)) {
            return false;
        }
        fhm0 fhm0Var = (fhm0) obj;
        return this.a.equals(fhm0Var.a) && this.b.equals(fhm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
