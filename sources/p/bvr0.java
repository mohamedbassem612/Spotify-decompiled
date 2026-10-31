package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bvr0 extends rjo1 {
    public final String b;
    public final tv80 c;

    public bvr0(String str, tv80 tv80Var) {
        this.b = str;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvr0)) {
            return false;
        }
        bvr0 bvr0Var = (bvr0) obj;
        return u890.j(this.b, bvr0Var.b) && u890.j(this.c, bvr0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        tv80 tv80Var = this.c;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
