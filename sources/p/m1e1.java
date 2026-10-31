package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m1e1 implements o1e1 {
    public final t1e1 a;
    public final llg b;

    public m1e1(t1e1 t1e1Var, llg llgVar) {
        this.a = t1e1Var;
        this.b = llgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1e1)) {
            return false;
        }
        m1e1 m1e1Var = (m1e1) obj;
        return this.a.equals(m1e1Var.a) && u890.j(this.b, m1e1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        llg llgVar = this.b;
        return iHashCode + (llgVar == null ? 0 : llgVar.hashCode());
    }
}
