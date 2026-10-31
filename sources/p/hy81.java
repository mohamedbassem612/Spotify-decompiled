package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hy81 {
    public final j47 a;
    public final m87 b;

    public hy81(j47 j47Var, m87 m87Var) {
        this.a = j47Var;
        this.b = m87Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy81)) {
            return false;
        }
        hy81 hy81Var = (hy81) obj;
        return u890.j(this.a, hy81Var.a) && u890.j(this.b, hy81Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        m87 m87Var = this.b;
        return iHashCode + (m87Var == null ? 0 : m87Var.hashCode());
    }
}
