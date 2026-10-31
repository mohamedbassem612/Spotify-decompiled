package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g1w0 {
    public final kh51 a;
    public final r3w0 b;

    public g1w0(kh51 kh51Var, r3w0 r3w0Var) {
        this.a = kh51Var;
        this.b = r3w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1w0)) {
            return false;
        }
        g1w0 g1w0Var = (g1w0) obj;
        return this.a.equals(g1w0Var.a) && this.b.equals(g1w0Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }
}
