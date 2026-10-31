package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class aum1 {
    public final et90 a;
    public final boolean b;

    public aum1(e690 e690Var) {
        et90 et90Var;
        jf4 jf4Var = e690Var.a.a;
        if (jf4Var.v() && jf4Var.l()) {
            o581 o581Var = (o581) e690Var.b.get();
            et90Var = new et90(o581Var.a, o581Var.b, o581Var.c);
        } else {
            et90Var = null;
        }
        this.a = et90Var;
        this.b = et90Var != null;
    }

    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-95042565);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            et90 et90Var = this.a;
            if (et90Var == null) {
                x340Var.i0(-1029576586);
            } else {
                x340Var.i0(-1029576585);
                otw.c(et90Var, l581.a, (qim0) null, (ipb1) null, x340Var, 0, 12);
            }
            x340Var.r(false);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fak1(this, i, (byte) 23);
        }
    }
}
