package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ivv0 {
    public final ktv0 a;
    public final int b;

    public ivv0(ktv0 ktv0Var, int i) {
        this.a = ktv0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivv0)) {
            return false;
        }
        ivv0 ivv0Var = (ivv0) obj;
        return this.a.equals(ivv0Var.a) && this.b == ivv0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
