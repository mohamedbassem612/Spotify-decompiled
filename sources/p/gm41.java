package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gm41 {
    public final xk41 a;
    public final Boolean b;

    public /* synthetic */ gm41(int i, Boolean bool) {
        this((xk41) null, (i & 2) != 0 ? null : bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm41)) {
            return false;
        }
        gm41 gm41Var = (gm41) obj;
        return u890.j(this.a, gm41Var.a) && u890.j(this.b, gm41Var.b);
    }

    public final int hashCode() {
        xk41 xk41Var = this.a;
        int iHashCode = (xk41Var == null ? 0 : xk41Var.hashCode()) * 31;
        Boolean bool = this.b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public gm41(xk41 xk41Var, Boolean bool) {
        this.a = xk41Var;
        this.b = bool;
    }
}
