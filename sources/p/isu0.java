package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class isu0 {
    public final u061 a;
    public final xkk1 b;

    public isu0(u061 u061Var, xkk1 xkk1Var) {
        this.a = u061Var;
        this.b = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isu0)) {
            return false;
        }
        isu0 isu0Var = (isu0) obj;
        return u890.j(this.a, isu0Var.a) && u890.j(this.b, isu0Var.b);
    }

    public final int hashCode() {
        u061 u061Var = this.a;
        int iHashCode = (u061Var == null ? 0 : Boolean.hashCode(u061Var.a)) * 31;
        xkk1 xkk1Var = this.b;
        return iHashCode + (xkk1Var != null ? xkk1Var.hashCode() : 0);
    }
}
