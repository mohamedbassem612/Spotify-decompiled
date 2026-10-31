package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w07 extends o17 {
    public final g07 a;
    public final rk70 b;
    public final y5t0 c;

    public w07(g07 g07Var, rk70 rk70Var) {
        this.a = g07Var;
        this.b = rk70Var;
        this.c = rk70Var != null ? new y5t0(rk70Var) : null;
    }

    public final g07 a() {
        return this.a;
    }

    public final m5n1 b() {
        return this.c;
    }

    public final boolean c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w07)) {
            return false;
        }
        w07 w07Var = (w07) obj;
        return this.a.equals(w07Var.a) && u890.j(this.b, w07Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        rk70 rk70Var = this.b;
        return iHashCode + (rk70Var == null ? 0 : rk70Var.hashCode());
    }
}
