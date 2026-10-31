package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ktb0 implements esb0 {
    public final xtb0 a;
    public final jtb0 b;
    public final aqb0 c;
    public final mgc d;

    public ktb0(xtb0 xtb0Var, jtb0 jtb0Var, aqb0 aqb0Var, mgc mgcVar) {
        this.a = xtb0Var;
        this.b = jtb0Var;
        this.c = aqb0Var;
        this.d = mgcVar;
    }

    @Override // p.esb0
    public final int a() {
        return this.b.C();
    }

    @Override // p.esb0
    public final Object b(int i) {
        return this.b.w(i);
    }

    @Override // p.esb0
    public final int c(Object obj) {
        return this.d.x(obj);
    }

    @Override // p.esb0
    public final Object d(int i) {
        Object objY = this.d.y(i);
        return objY == null ? this.b.D(i) : objY;
    }

    @Override // p.esb0
    public final void e(int i, Object obj, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-462424778);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2 | (x340Var.i(obj) ? 32 : 16) | (x340Var.g(this) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            wmo1.d(obj, i, this.a.s, apo.r(-824725566, new r1c(this, i, (byte) 2), x340Var), x340Var, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cf5(this, i, obj, i2, (byte) 7);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ktb0)) {
            return false;
        }
        return u890.j(this.b, ((ktb0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
