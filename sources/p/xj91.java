package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xj91 extends bk91 {
    public final int a;
    public final tv80 b;

    public xj91(int i, tv80 tv80Var) {
        this.a = i;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj91)) {
            return false;
        }
        xj91 xj91Var = (xj91) obj;
        return this.a == xj91Var.a && u890.j(this.b, xj91Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
