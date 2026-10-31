package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ts00 {
    public final xkk1 a;
    public final pjw0 b;

    public ts00(xkk1 xkk1Var, pjw0 pjw0Var) {
        this.a = xkk1Var;
        this.b = pjw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ts00)) {
            return false;
        }
        ts00 ts00Var = (ts00) obj;
        return u890.j(this.a, ts00Var.a) && u890.j(this.b, ts00Var.b);
    }

    public final int hashCode() {
        xkk1 xkk1Var = this.a;
        int iHashCode = (xkk1Var == null ? 0 : xkk1Var.hashCode()) * 31;
        pjw0 pjw0Var = this.b;
        return iHashCode + (pjw0Var != null ? pjw0Var.hashCode() : 0);
    }
}
