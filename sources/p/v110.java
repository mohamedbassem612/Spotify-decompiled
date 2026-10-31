package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v110 {
    public final zc8 a;
    public final xkk1 b;

    public v110(zc8 zc8Var, xkk1 xkk1Var) {
        this.a = zc8Var;
        this.b = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v110)) {
            return false;
        }
        v110 v110Var = (v110) obj;
        return u890.j(this.a, v110Var.a) && u890.j(this.b, v110Var.b);
    }

    public final int hashCode() {
        zc8 zc8Var = this.a;
        int iHashCode = (zc8Var == null ? 0 : zc8Var.hashCode()) * 31;
        xkk1 xkk1Var = this.b;
        return iHashCode + (xkk1Var != null ? xkk1Var.hashCode() : 0);
    }
}
