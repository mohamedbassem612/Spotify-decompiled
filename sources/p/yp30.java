package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yp30 implements aq30 {
    public final wp30 a;
    public final xkk1 b;

    public yp30(wp30 wp30Var, xkk1 xkk1Var) {
        this.a = wp30Var;
        this.b = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp30)) {
            return false;
        }
        yp30 yp30Var = (yp30) obj;
        return u890.j(this.a, yp30Var.a) && u890.j(this.b, yp30Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xkk1 xkk1Var = this.b;
        return iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode());
    }
}
