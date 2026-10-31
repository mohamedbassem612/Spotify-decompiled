package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class neb1 {
    public final qxc0 a;
    public final vnb1 b;

    public neb1(qxc0 qxc0Var, vnb1 vnb1Var) {
        this.a = qxc0Var;
        this.b = vnb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof neb1)) {
            return false;
        }
        neb1 neb1Var = (neb1) obj;
        return this.a.equals(neb1Var.a) && u890.j(this.b, neb1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        vnb1 vnb1Var = this.b;
        return iHashCode + (vnb1Var == null ? 0 : vnb1Var.hashCode());
    }
}
