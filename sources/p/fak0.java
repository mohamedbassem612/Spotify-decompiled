package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fak0 {
    public final eak0 a;
    public final zge1 b;

    public fak0(eak0 eak0Var, zge1 zge1Var) {
        this.a = eak0Var;
        this.b = zge1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fak0)) {
            return false;
        }
        fak0 fak0Var = (fak0) obj;
        return u890.j(this.a, fak0Var.a) && u890.j(this.b, fak0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        zge1 zge1Var = this.b;
        return iHashCode + (zge1Var == null ? 0 : zge1Var.hashCode());
    }
}
