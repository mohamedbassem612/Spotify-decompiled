package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class yhm1 {
    public static final kiv a = new kiv(wam1.e, (byte) 0);

    public static final void a(Object obj, iu30 iu30Var, iu30 iu30Var2, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1014068712);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var2) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            xhm1 xhm1Var = (xhm1) x340Var.k(a);
            ven0 ven0VarS = v8r.s(iu30Var, x340Var);
            ven0 ven0VarS2 = v8r.s(iu30Var2, x340Var);
            boolean zI = x340Var.i(xhm1Var) | x340Var.i(ven0VarS) | x340Var.i(ven0VarS2);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new jyi1(xhm1Var, ven0VarS, ven0VarS2, false, (byte) 20);
                x340Var.s0(objT);
            }
            qxd0.h(xhm1Var, obj, (iu30) objT, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ixi1(obj, iu30Var, iu30Var2, i, (byte) 22);
        }
    }
}
