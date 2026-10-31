package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m0g0 {
    public final siq a;
    public final m7p0 b;
    public final boolean c;

    public m0g0(siq siqVar, m7p0 m7p0Var, boolean z) {
        this.a = siqVar;
        this.b = m7p0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0g0)) {
            return false;
        }
        m0g0 m0g0Var = (m0g0) obj;
        return u890.j(this.a, m0g0Var.a) && u890.j(this.b, m0g0Var.b) && this.c == m0g0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
