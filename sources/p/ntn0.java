package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ntn0 {
    public final hux a;
    public final int b;
    public final lik1 c;
    public final mtn0 d;
    public final zob1 e;

    public ntn0(hux huxVar, int i, lik1 lik1Var, mtn0 mtn0Var, zob1 zob1Var) {
        this.a = huxVar;
        this.b = i;
        this.c = lik1Var;
        this.d = mtn0Var;
        this.e = zob1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ntn0)) {
            return false;
        }
        ntn0 ntn0Var = (ntn0) obj;
        return u890.j(this.a, ntn0Var.a) && this.b == ntn0Var.b && u890.j(this.c, ntn0Var.c) && this.d.equals(ntn0Var.d) && this.e.equals(ntn0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c.a)) * 31);
    }
}
