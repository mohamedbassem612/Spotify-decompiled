package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mrm0 {
    public final krm0 a;
    public final lrm0 b;

    public mrm0(krm0 krm0Var, lrm0 lrm0Var) {
        this.a = krm0Var;
        this.b = lrm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mrm0)) {
            return false;
        }
        mrm0 mrm0Var = (mrm0) obj;
        return this.a == mrm0Var.a && this.b == mrm0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
