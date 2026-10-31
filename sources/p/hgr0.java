package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hgr0 implements dbr0 {
    public final ggr0 a;
    public final int b;

    public /* synthetic */ hgr0(ggr0 ggr0Var, int i, int i2) {
        this((i2 & 1) != 0 ? dgr0.a : ggr0Var, (i2 & 2) != 0 ? 1 : i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgr0)) {
            return false;
        }
        hgr0 hgr0Var = (hgr0) obj;
        return u890.j(this.a, hgr0Var.a) && this.b == hgr0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }

    public hgr0(ggr0 ggr0Var, int i) {
        this.a = ggr0Var;
        this.b = i;
    }
}
