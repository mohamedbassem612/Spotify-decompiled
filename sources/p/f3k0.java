package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class f3k0 implements k4k0 {
    public final int a;
    public final tv80 b;

    public f3k0(int i, tv80 tv80Var) {
        this.a = i;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3k0)) {
            return false;
        }
        f3k0 f3k0Var = (f3k0) obj;
        return this.a == f3k0Var.a && u890.j(this.b, f3k0Var.b);
    }

    public final int hashCode() {
        int iC = l1d.C(this.a) * 31;
        tv80 tv80Var = this.b;
        return iC + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
