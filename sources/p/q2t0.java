package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q2t0 {
    public final boolean a;
    public final a3t0 b;

    public q2t0(a3t0 a3t0Var, boolean z) {
        this.a = z;
        this.b = a3t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2t0)) {
            return false;
        }
        q2t0 q2t0Var = (q2t0) obj;
        return this.a == q2t0Var.a && this.b == q2t0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
