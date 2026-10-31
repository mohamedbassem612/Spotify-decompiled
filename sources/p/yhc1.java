package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yhc1 implements zhc1 {
    public final tka0 a;
    public final iu30 b;

    public yhc1(tka0 tka0Var, iu30 iu30Var) {
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
        if (!(obj instanceof yhc1)) {
            return false;
        }
        yhc1 yhc1Var = (yhc1) obj;
        return u890.j(this.a, yhc1Var.a) && this.b.equals(yhc1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
