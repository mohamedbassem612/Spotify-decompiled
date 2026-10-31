package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vsd1 {
    public final jo70 a;
    public final xkk1 b;

    public vsd1(jo70 jo70Var, xkk1 xkk1Var) {
        this.a = jo70Var;
        this.b = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsd1)) {
            return false;
        }
        vsd1 vsd1Var = (vsd1) obj;
        return this.a.equals(vsd1Var.a) && u890.j(this.b, vsd1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xkk1 xkk1Var = this.b;
        return iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode());
    }
}
