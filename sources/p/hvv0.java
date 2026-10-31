package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hvv0 {
    public final etv0 a;
    public final int b;

    public hvv0(etv0 etv0Var, int i) {
        this.a = etv0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvv0)) {
            return false;
        }
        hvv0 hvv0Var = (hvv0) obj;
        return this.a.equals(hvv0Var.a) && this.b == hvv0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
