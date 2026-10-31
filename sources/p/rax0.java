package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rax0 extends yax0 {
    public final obx0 a;
    public final tv80 b;

    public rax0(obx0 obx0Var, tv80 tv80Var) {
        this.a = obx0Var;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rax0)) {
            return false;
        }
        rax0 rax0Var = (rax0) obj;
        return this.a.equals(rax0Var.a) && u890.j(this.b, rax0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
