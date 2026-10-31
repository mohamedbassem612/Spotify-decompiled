package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q0e0 {
    public final l0e0 a;
    public final f0e0 b;

    public q0e0(l0e0 l0e0Var, f0e0 f0e0Var) {
        this.a = l0e0Var;
        this.b = f0e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0e0)) {
            return false;
        }
        q0e0 q0e0Var = (q0e0) obj;
        return this.a.equals(q0e0Var.a) && this.b.equals(q0e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
