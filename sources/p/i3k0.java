package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class i3k0 implements k4k0 {
    public final int a;
    public final tv80 b;

    public i3k0(int i, tv80 tv80Var) {
        this.a = i;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3k0)) {
            return false;
        }
        i3k0 i3k0Var = (i3k0) obj;
        return this.a == i3k0Var.a && u890.j(this.b, i3k0Var.b);
    }

    public final int hashCode() {
        int iC = l1d.C(this.a) * 31;
        tv80 tv80Var = this.b;
        return iC + (tv80Var == null ? 0 : tv80Var.hashCode());
    }

    public /* synthetic */ i3k0() {
        this(2, null);
    }
}
