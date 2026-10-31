package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class x3h1 {
    public static final df41 a = new df41(hzg1.c, lbg1.Z);

    public static final void a(v3h1 v3h1Var, xtb0 xtb0Var, e4h1 e4h1Var, dp5 dp5Var, wxl wxlVar, b0k b0kVar, int i) {
        int i2;
        xtb0 xtb0Var2;
        e4h1 e4h1Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-948875513);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(v3h1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            xtb0Var2 = xtb0Var;
            i2 |= x340Var.g(xtb0Var2) ? 32 : 16;
        } else {
            xtb0Var2 = xtb0Var;
        }
        if ((i & 384) == 0) {
            e4h1Var2 = e4h1Var;
            i2 |= x340Var.g(e4h1Var2) ? 256 : 128;
        } else {
            e4h1Var2 = e4h1Var;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(dp5Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(wxlVar) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            boolean zE = x340Var.e(v3h1Var.k());
            Object objT = x340Var.T();
            if (zE || objT == m4cVar) {
                v3h1Var.p(e4h1Var2.a());
                x340Var.s0(rih1.a);
            }
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = bb00.h(0, x340Var);
            }
            hdn0 hdn0Var = (hdn0) objT2;
            boolean zI = ((i2 & 112) == 32) | ((57344 & i2) == 16384) | x340Var.i(dp5Var) | ((i2 & 896) == 256) | x340Var.i(v3h1Var);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                qt61 qt61Var = new qt61(xtb0Var2, wxlVar, dp5Var, e4h1Var, v3h1Var, hdn0Var, (lnm) null, (byte) 10);
                x340Var.s0(qt61Var);
                objT3 = qt61Var;
            }
            qxd0.t(wxlVar, x340Var, (vu30) objT3);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ay71((byte) 15, i, v3h1Var, xtb0Var, e4h1Var, dp5Var, wxlVar);
        }
    }
}
