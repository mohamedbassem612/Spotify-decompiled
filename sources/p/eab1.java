package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class eab1 {
    public final c380 a;
    public final m87 b;

    public eab1(c380 c380Var, m87 m87Var) {
        this.a = c380Var;
        this.b = m87Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eab1)) {
            return false;
        }
        eab1 eab1Var = (eab1) obj;
        return u890.j(this.a, eab1Var.a) && u890.j(this.b, eab1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        m87 m87Var = this.b;
        return iHashCode + (m87Var == null ? 0 : m87Var.hashCode());
    }
}
