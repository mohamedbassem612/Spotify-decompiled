package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e1w0 {
    public final kh51 a;
    public final mui0 b;

    public e1w0(kh51 kh51Var, mui0 mui0Var) {
        this.a = kh51Var;
        this.b = mui0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1w0)) {
            return false;
        }
        e1w0 e1w0Var = (e1w0) obj;
        return this.a.equals(e1w0Var.a) && this.b.equals(e1w0Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }
}
