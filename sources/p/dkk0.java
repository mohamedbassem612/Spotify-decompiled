package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dkk0 implements ikk0 {
    public final ha20 a;
    public final int b;

    public dkk0(ha20 ha20Var, int i) {
        this.a = ha20Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkk0)) {
            return false;
        }
        dkk0 dkk0Var = (dkk0) obj;
        return this.a == dkk0Var.a && this.b == dkk0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
