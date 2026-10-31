package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r16 {
    public final jo70 a;
    public final xkk1 b;

    public r16(jo70 jo70Var, xkk1 xkk1Var) {
        this.a = jo70Var;
        this.b = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r16)) {
            return false;
        }
        r16 r16Var = (r16) obj;
        return u890.j(this.a, r16Var.a) && u890.j(this.b, r16Var.b);
    }

    public final int hashCode() {
        jo70 jo70Var = this.a;
        int iHashCode = (jo70Var == null ? 0 : jo70Var.hashCode()) * 31;
        xkk1 xkk1Var = this.b;
        return iHashCode + (xkk1Var != null ? xkk1Var.hashCode() : 0);
    }
}
