package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class q6g1 implements t6g1 {
    public final xn70 a;
    public final bv11 b;

    public q6g1(xn70 xn70Var, bv11 bv11Var) {
        this.a = xn70Var;
        this.b = bv11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6g1)) {
            return false;
        }
        q6g1 q6g1Var = (q6g1) obj;
        return u890.j(this.a, q6g1Var.a) && u890.j(this.b, q6g1Var.b);
    }

    public final int hashCode() {
        xn70 xn70Var = this.a;
        return this.b.hashCode() + ((xn70Var == null ? 0 : xn70Var.hashCode()) * 31);
    }
}
