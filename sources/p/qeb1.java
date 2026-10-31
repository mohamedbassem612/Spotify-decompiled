package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qeb1 {
    public final qxc0 a;
    public final vnb1 b;

    public qeb1(qxc0 qxc0Var, vnb1 vnb1Var) {
        this.a = qxc0Var;
        this.b = vnb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qeb1)) {
            return false;
        }
        qeb1 qeb1Var = (qeb1) obj;
        return this.a.equals(qeb1Var.a) && u890.j(this.b, qeb1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        vnb1 vnb1Var = this.b;
        return iHashCode + (vnb1Var == null ? 0 : vnb1Var.hashCode());
    }
}
