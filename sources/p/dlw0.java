package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dlw0 implements elw0 {
    public final o571 a;
    public final q6q0 b;

    public dlw0(o571 o571Var, q6q0 q6q0Var) {
        this.a = o571Var;
        this.b = q6q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlw0)) {
            return false;
        }
        dlw0 dlw0Var = (dlw0) obj;
        return u890.j(this.a, dlw0Var.a) && u890.j(this.b, dlw0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        q6q0 q6q0Var = this.b;
        return iHashCode + (q6q0Var == null ? 0 : q6q0Var.hashCode());
    }
}
