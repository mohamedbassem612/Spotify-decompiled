package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class hhr0 {
    public static final kiv a = new kiv(v0r0.X, (byte) 1);

    public static final void a(iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1599228841);
        int i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            jc9 jc9Var = ((gzj) x340Var.k(a)).c;
            boolean zI = x340Var.i(jc9Var) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new ozp0(jc9Var, iu30Var, (byte) 21);
                x340Var.s0(objT);
            }
            qxd0.i(jc9Var, (iu30) objT, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k2g0(iu30Var, i, (byte) 25);
        }
    }
}
