package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xgd1 {
    public final kwc a;
    public final int b;
    public final int c;
    public final int d;
    public final wqn0 e;

    public xgd1(kwc kwcVar, int i, int i2, int i3, wqn0 wqn0Var) {
        this.a = kwcVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = wqn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgd1)) {
            return false;
        }
        xgd1 xgd1Var = (xgd1) obj;
        return this.a.equals(xgd1Var.a) && this.b == xgd1Var.b && this.c == xgd1Var.c && this.d == xgd1Var.d && this.e.equals(xgd1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ab80.k(this.d, kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }
}
