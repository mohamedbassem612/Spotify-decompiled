package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tk90 {
    public final /* synthetic */ xk90 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ hwq c;

    public tk90(xk90 xk90Var, String str, hwq hwqVar) {
        this.a = xk90Var;
        this.b = str;
        this.c = hwqVar;
    }

    public final void a(hwq hwqVar, b0k b0kVar, int i) {
        h311 h311VarV;
        sk90 sk90Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-422036479);
        int i2 = (x340Var.g(this) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 17) != 16)) {
            xk90 xk90Var = this.a;
            rk90 rk90Var = (rk90) xk90Var.d.get(this.b);
            if (rk90Var == null) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    sk90Var = new sk90(this, hwqVar, i, (byte) 1);
                }
            } else {
                i1o1.d(rk90Var.a, this.c, (rzq) xk90Var.a.d, new joa0(this.c.g.a()), (qim0) null, apo.r(-34723836, new jj50(rk90Var, xk90Var, (byte) 25), x340Var), apo.r(628588395, new yy80(rk90Var, (byte) 4), x340Var), 0, (xu30) null, x340Var, 1769472, 200);
            }
            h311VarV.d = sk90Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            sk90Var = new sk90(this, hwqVar, i, (byte) 0);
            h311VarV.d = sk90Var;
        }
    }
}
