package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fm11 {
    public final jo70 a;
    public final xkk1 b;

    public fm11(jo70 jo70Var, xkk1 xkk1Var) {
        this.a = jo70Var;
        this.b = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm11)) {
            return false;
        }
        fm11 fm11Var = (fm11) obj;
        return this.a.equals(fm11Var.a) && u890.j(this.b, fm11Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xkk1 xkk1Var = this.b;
        return iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode());
    }
}
