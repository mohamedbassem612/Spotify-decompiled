package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d4o {
    public final xpw a;
    public final Object b;

    public d4o(Object obj, xpw xpwVar) {
        this.a = xpwVar;
        this.b = obj;
    }

    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1071717027);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            otw.c(this.a, this.b, (qim0) null, (ipb1) null, x340Var, 0, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h1m(this, i, (byte) 29);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4o)) {
            return false;
        }
        d4o d4oVar = (d4o) obj;
        return u890.j(this.a, d4oVar.a) && this.b.equals(d4oVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
