package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r2e1 extends u2e1 {
    public final o571 a;
    public final q6q0 b;

    static {
        idd1 idd1Var = o571.c;
    }

    public r2e1(o571 o571Var, q6q0 q6q0Var) {
        this.a = o571Var;
        this.b = q6q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2e1)) {
            return false;
        }
        r2e1 r2e1Var = (r2e1) obj;
        return u890.j(this.a, r2e1Var.a) && u890.j(this.b, r2e1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        q6q0 q6q0Var = this.b;
        return iHashCode + (q6q0Var == null ? 0 : q6q0Var.hashCode());
    }
}
