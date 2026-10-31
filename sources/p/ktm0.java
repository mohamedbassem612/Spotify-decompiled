package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ktm0 {
    public final itm0 a;
    public final xsm0 b;

    public ktm0(itm0 itm0Var, xsm0 xsm0Var) {
        this.a = itm0Var;
        this.b = xsm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ktm0)) {
            return false;
        }
        ktm0 ktm0Var = (ktm0) obj;
        return u890.j(this.a, ktm0Var.a) && u890.j(this.b, ktm0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xsm0 xsm0Var = this.b;
        return iHashCode + (xsm0Var == null ? 0 : xsm0Var.hashCode());
    }
}
