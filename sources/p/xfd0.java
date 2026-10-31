package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xfd0 {
    public final xkk1 a;
    public final jo70 b;

    public xfd0(jo70 jo70Var, xkk1 xkk1Var) {
        this.a = xkk1Var;
        this.b = jo70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfd0)) {
            return false;
        }
        xfd0 xfd0Var = (xfd0) obj;
        return u890.j(this.a, xfd0Var.a) && u890.j(this.b, xfd0Var.b);
    }

    public final int hashCode() {
        xkk1 xkk1Var = this.a;
        int iHashCode = (xkk1Var == null ? 0 : xkk1Var.hashCode()) * 31;
        jo70 jo70Var = this.b;
        return iHashCode + (jo70Var != null ? jo70Var.hashCode() : 0);
    }
}
