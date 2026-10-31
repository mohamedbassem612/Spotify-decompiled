package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bxd0 implements rxd0 {
    public final String a;
    public final tv80 b;

    public bxd0(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxd0)) {
            return false;
        }
        bxd0 bxd0Var = (bxd0) obj;
        return this.a.equals(bxd0Var.a) && u890.j(this.b, bxd0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
