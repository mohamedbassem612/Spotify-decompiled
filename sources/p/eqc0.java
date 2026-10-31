package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class eqc0 implements gqc0 {
    public final rnc0 a;
    public final int b;

    public eqc0(rnc0 rnc0Var, int i) {
        this.a = rnc0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqc0)) {
            return false;
        }
        eqc0 eqc0Var = (eqc0) obj;
        return u890.j(this.a, eqc0Var.a) && this.b == eqc0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
