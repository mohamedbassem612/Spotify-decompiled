package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xhc1 implements zhc1 {
    public final tka0 a;
    public final iu30 b;

    public xhc1(tka0 tka0Var, iu30 iu30Var) {
        this.a = tka0Var;
        this.b = iu30Var;
    }

    @Override // p.zhc1
    public final tka0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhc1)) {
            return false;
        }
        xhc1 xhc1Var = (xhc1) obj;
        return u890.j(this.a, xhc1Var.a) && u890.j(this.b, xhc1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
