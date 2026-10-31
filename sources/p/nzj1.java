package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nzj1 {
    public final jo70 a;
    public final xkk1 b;

    public nzj1(jo70 jo70Var, xkk1 xkk1Var) {
        this.a = jo70Var;
        this.b = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nzj1)) {
            return false;
        }
        nzj1 nzj1Var = (nzj1) obj;
        return this.a.equals(nzj1Var.a) && u890.j(this.b, nzj1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xkk1 xkk1Var = this.b;
        return iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode());
    }
}
