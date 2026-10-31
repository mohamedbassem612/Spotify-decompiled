package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class q2r0 implements s2r0 {
    public final qz50 a;
    public final goc0 b;

    public q2r0(qz50 qz50Var, goc0 goc0Var) {
        this.a = qz50Var;
        this.b = goc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2r0)) {
            return false;
        }
        q2r0 q2r0Var = (q2r0) obj;
        return this.a.equals(q2r0Var.a) && this.b.equals(q2r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
