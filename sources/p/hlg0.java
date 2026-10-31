package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hlg0 {
    public final jo70 a;
    public final k1r b;
    public final jo70 c;
    public final xkk1 d;
    public final z6a1 e;
    public final xm6 f;

    public hlg0(jo70 jo70Var, k1r k1rVar, jo70 jo70Var2, xkk1 xkk1Var, z6a1 z6a1Var, xm6 xm6Var) {
        this.a = jo70Var;
        this.b = k1rVar;
        this.c = jo70Var2;
        this.d = xkk1Var;
        this.e = z6a1Var;
        this.f = xm6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlg0)) {
            return false;
        }
        hlg0 hlg0Var = (hlg0) obj;
        return this.a.equals(hlg0Var.a) && this.b.equals(hlg0Var.b) && this.c.equals(hlg0Var.c) && u890.j(this.d, hlg0Var.d) && u890.j(this.e, hlg0Var.e) && u890.j(this.f, hlg0Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        xkk1 xkk1Var = this.d;
        int iHashCode2 = (iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode())) * 31;
        z6a1 z6a1Var = this.e;
        int iHashCode3 = (iHashCode2 + (z6a1Var == null ? 0 : z6a1Var.hashCode())) * 31;
        xm6 xm6Var = this.f;
        return iHashCode3 + (xm6Var != null ? xm6Var.hashCode() : 0);
    }
}
