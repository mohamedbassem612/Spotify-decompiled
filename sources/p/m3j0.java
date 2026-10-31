package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m3j0 implements q3j0 {
    public final l3j0 a;
    public final qim b;

    public m3j0(l3j0 l3j0Var, qim qimVar) {
        this.a = l3j0Var;
        this.b = qimVar;
    }

    public final l3j0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3j0)) {
            return false;
        }
        m3j0 m3j0Var = (m3j0) obj;
        return u890.j(this.a, m3j0Var.a) && u890.j(this.b, m3j0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        qim qimVar = this.b;
        return iHashCode + (qimVar == null ? 0 : qimVar.hashCode());
    }
}
