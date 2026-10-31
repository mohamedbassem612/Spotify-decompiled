package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class g0k0 implements k1k0 {
    public final Boolean a;
    public final tv80 b;

    public g0k0(Boolean bool, tv80 tv80Var) {
        this.a = bool;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0k0)) {
            return false;
        }
        g0k0 g0k0Var = (g0k0) obj;
        return u890.j(this.a, g0k0Var.a) && u890.j(this.b, g0k0Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var != null ? tv80Var.hashCode() : 0);
    }
}
