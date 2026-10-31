package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k3c0 extends rqo1 {
    public final String c;
    public final tv80 d;

    public k3c0(String str, tv80 tv80Var) {
        this.c = str;
        this.d = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3c0)) {
            return false;
        }
        k3c0 k3c0Var = (k3c0) obj;
        return this.c.equals(k3c0Var.c) && u890.j(this.d, k3c0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        tv80 tv80Var = this.d;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
