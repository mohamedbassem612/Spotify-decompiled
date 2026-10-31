package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nhf0 implements phf0 {
    public final fcb0 a;
    public final tv80 b;

    public nhf0(fcb0 fcb0Var, tv80 tv80Var) {
        this.a = fcb0Var;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhf0)) {
            return false;
        }
        nhf0 nhf0Var = (nhf0) obj;
        return this.a.equals(nhf0Var.a) && u890.j(this.b, nhf0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
