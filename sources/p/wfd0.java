package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wfd0 {
    public final xfd0 a;
    public final xkk1 b;

    public wfd0(xfd0 xfd0Var, xkk1 xkk1Var) {
        this.a = xfd0Var;
        this.b = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfd0)) {
            return false;
        }
        wfd0 wfd0Var = (wfd0) obj;
        return u890.j(this.a, wfd0Var.a) && u890.j(this.b, wfd0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xkk1 xkk1Var = this.b;
        return iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode());
    }
}
