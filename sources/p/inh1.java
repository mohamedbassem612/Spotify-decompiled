package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class inh1 {
    public final jo70 a;
    public final xkk1 b;
    public final zoy0 c;
    public final iam d;
    public final zd3 e;

    public inh1(jo70 jo70Var, xkk1 xkk1Var, zoy0 zoy0Var, iam iamVar, zd3 zd3Var) {
        this.a = jo70Var;
        this.b = xkk1Var;
        this.c = zoy0Var;
        this.d = iamVar;
        this.e = zd3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof inh1)) {
            return false;
        }
        inh1 inh1Var = (inh1) obj;
        return this.a.equals(inh1Var.a) && this.b.equals(inh1Var.b) && this.c.equals(inh1Var.c) && this.d.equals(inh1Var.d) && u890.j(this.e, inh1Var.e);
    }

    public final int hashCode() {
        int iK = ab80.k(this.d.a, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31);
        zd3 zd3Var = this.e;
        return iK + (zd3Var == null ? 0 : zd3Var.hashCode());
    }
}
