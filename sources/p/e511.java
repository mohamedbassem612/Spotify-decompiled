package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e511 {
    public final void a(int i, String str, b0k b0kVar, iu30 iu30Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-979790107);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).k;
            long j = cbx.a(x340Var).b.a;
            boolean zF = x340Var.f(j) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (zF || objT == fkj0.X) {
                ye5 ye5Var = new ye5();
                btg0.a(ye5Var, str, lee1Var, iu30Var, j, false, 16);
                objT = ye5Var.p();
                x340Var.s0(objT);
            }
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            cua cuaVar = cbx.b(x340Var).f;
            w3d1.a(qim0VarF, er31.b(8.0f), cbx.a(x340Var).a.b.a(), 0L, 0.0f, 0.0f, (qqb) null, apo.r(745217834, new ziz0((af5) objT, (byte) 15), x340Var), x340Var, 12582912, 120);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ffx0(this, str, iu30Var, i, (byte) 25);
        }
    }
}
