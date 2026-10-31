package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fng {
    public final jo70 a;
    public final xkk1 b;

    public fng(jo70 jo70Var, xkk1 xkk1Var) {
        this.a = jo70Var;
        this.b = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fng)) {
            return false;
        }
        fng fngVar = (fng) obj;
        return u890.j(this.a, fngVar.a) && u890.j(this.b, fngVar.b);
    }

    public final int hashCode() {
        jo70 jo70Var = this.a;
        int iHashCode = (jo70Var == null ? 0 : jo70Var.hashCode()) * 31;
        xkk1 xkk1Var = this.b;
        return iHashCode + (xkk1Var != null ? xkk1Var.hashCode() : 0);
    }
}
