package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sjr0 implements esb0 {
    public final jkr0 a;
    public final mmo1 b;
    public final mgc c;

    public sjr0(jkr0 jkr0Var, rjr0 rjr0Var, mgc mgcVar) {
        this.a = jkr0Var;
        this.b = rjr0Var;
        this.c = mgcVar;
    }

    @Override // p.esb0
    public final int a() {
        return this.b.C();
    }

    @Override // p.esb0
    public final int c(Object obj) {
        return this.c.x(obj);
    }

    @Override // p.esb0
    public final Object d(int i) {
        Object objY = this.c.y(i);
        return objY == null ? this.b.D(i) : objY;
    }

    @Override // p.esb0
    public final void e(int i, Object obj, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1201380429);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2 | (x340Var.i(obj) ? 32 : 16) | (x340Var.g(this) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            wmo1.d(obj, i, this.a.A, apo.r(1142237095, new r1c(this, i, (byte) 4), x340Var), x340Var, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cf5(this, i, obj, i2, (byte) 9);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sjr0)) {
            return false;
        }
        return u890.j(this.b, ((sjr0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
