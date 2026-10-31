package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xdw0 implements kew0 {
    public final boolean a;
    public final tv80 b;

    public xdw0(tv80 tv80Var, boolean z) {
        this.a = z;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdw0)) {
            return false;
        }
        xdw0 xdw0Var = (xdw0) obj;
        return this.a == xdw0Var.a && u890.j(this.b, xdw0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
