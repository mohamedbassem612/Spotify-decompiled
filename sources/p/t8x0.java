package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class t8x0 extends w361 {
    public final qbx0 c;
    public final obx0 d;
    public final tv80 e;

    public t8x0(qbx0 qbx0Var, obx0 obx0Var, tv80 tv80Var) {
        this.c = qbx0Var;
        this.d = obx0Var;
        this.e = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8x0)) {
            return false;
        }
        t8x0 t8x0Var = (t8x0) obj;
        return this.c.equals(t8x0Var.c) && this.d.equals(t8x0Var.d) && u890.j(this.e, t8x0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + (this.c.hashCode() * 31)) * 31;
        tv80 tv80Var = this.e;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
