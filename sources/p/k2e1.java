package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k2e1 extends l2p1 {
    public final o571 c;
    public final q6q0 d;

    static {
        idd1 idd1Var = o571.c;
    }

    public k2e1(o571 o571Var, q6q0 q6q0Var) {
        this.c = o571Var;
        this.d = q6q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2e1)) {
            return false;
        }
        k2e1 k2e1Var = (k2e1) obj;
        return u890.j(this.c, k2e1Var.c) && u890.j(this.d, k2e1Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        q6q0 q6q0Var = this.d;
        return iHashCode + (q6q0Var == null ? 0 : q6q0Var.hashCode());
    }
}
