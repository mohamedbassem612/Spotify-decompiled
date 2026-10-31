package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class e2k0 implements k4k0 {
    public final int a;
    public final tv80 b;

    public e2k0(int i, tv80 tv80Var) {
        this.a = i;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2k0)) {
            return false;
        }
        e2k0 e2k0Var = (e2k0) obj;
        return this.a == e2k0Var.a && u890.j(this.b, e2k0Var.b);
    }

    public final int hashCode() {
        int iC = l1d.C(this.a) * 31;
        tv80 tv80Var = this.b;
        return iC + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
