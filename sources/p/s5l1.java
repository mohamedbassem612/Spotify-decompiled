package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s5l1 {
    public final f7l1 a;
    public final xkk1 b;

    public s5l1(f7l1 f7l1Var, xkk1 xkk1Var) {
        this.a = f7l1Var;
        this.b = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5l1)) {
            return false;
        }
        s5l1 s5l1Var = (s5l1) obj;
        return u890.j(this.a, s5l1Var.a) && u890.j(this.b, s5l1Var.b);
    }

    public final int hashCode() {
        f7l1 f7l1Var = this.a;
        int iHashCode = (f7l1Var == null ? 0 : f7l1Var.a.hashCode()) * 31;
        xkk1 xkk1Var = this.b;
        return iHashCode + (xkk1Var != null ? xkk1Var.hashCode() : 0);
    }
}
