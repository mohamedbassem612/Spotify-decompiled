package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u1g0 {
    public final n1g0 a;
    public final m1g0 b;

    public u1g0(n1g0 n1g0Var, m1g0 m1g0Var) {
        this.a = n1g0Var;
        this.b = m1g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1g0)) {
            return false;
        }
        u1g0 u1g0Var = (u1g0) obj;
        return u890.j(this.a, u1g0Var.a) && this.b.equals(u1g0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
