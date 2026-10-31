package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class q1d0 {
    public final xtb0 a;
    public final zob1 b;
    public final Map c;
    public final Map d;
    public final h3h1 e;
    public final iu30 f;
    public ven0 g;

    public q1d0(xtb0 xtb0Var, zob1 zob1Var, Map map, Map map2, h3h1 h3h1Var, iu30 iu30Var) {
        this.a = xtb0Var;
        this.b = zob1Var;
        this.c = map;
        this.d = map2;
        this.e = h3h1Var;
        this.f = iu30Var;
    }

    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1743072891);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            ven0 ven0VarK = f4p1.k(this.b, (iac0) null, x340Var, 7);
            this.g = ven0VarK;
            rnc0 rnc0Var = (rnc0) ven0VarK.getValue();
            boolean zI = x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new xo8(this, (byte) 6);
                x340Var.s0(objT);
            }
            g9p1.i(rnc0Var, this.a, (iu30) objT, x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new s2c0(this, i, (byte) 8);
        }
    }
}
