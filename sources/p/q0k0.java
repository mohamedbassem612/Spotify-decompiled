package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class q0k0 implements k1k0 {
    public final boolean a;
    public final tv80 b;

    public q0k0(tv80 tv80Var, boolean z) {
        this.a = z;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0k0)) {
            return false;
        }
        q0k0 q0k0Var = (q0k0) obj;
        return this.a == q0k0Var.a && u890.j(this.b, q0k0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
