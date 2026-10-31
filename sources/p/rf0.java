package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class rf0 {
    public static final ceo a = new ceo(0.0f, 0.0f, 0.58f, 1.0f);

    public static final void a(lf0 lf0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1900660429);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(lf0Var) : x340Var.i(lf0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = v8r.q(lf0Var instanceof jf0 ? (jf0) lf0Var : null);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean z = lf0Var instanceof jf0;
            if (z) {
                ven0Var.setValue((jf0) lf0Var);
            }
            qim0 qim0Var2 = nim0.a;
            fq7.g(z, qim0Var2, xay.e(2, irn1.o0(200, 0, (dlv) null, 6)), xay.f(2, irn1.o0(200, 0, (dlv) null, 6)), (String) null, apo.r(-1827989595, new nf0(ven0Var, (byte) 0), x340Var), x340Var, (i3 & 112) | 196608, 16);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g90(lf0Var, qim0Var, i, (byte) 1);
        }
    }

    public static final void b(hcx hcxVar, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-28400166);
        int i2 = (x340Var.e(hcxVar.ordinal()) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0Var = nim0.a;
            if (z) {
                x340Var.i0(-1522751107);
                c(hcxVar, qim0Var, x340Var, (i2 & 14) | 48);
            } else {
                x340Var.i0(-1522749798);
                d(hcxVar, qim0Var, x340Var, (i2 & 14) | 48);
            }
            x340Var.r(false);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zs(hcxVar, z, qim0Var2, i, (byte) 1);
        }
    }

    public static final void c(hcx hcxVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-68698055);
        if ((i & 6) == 0) {
            i2 = (x340Var.e(hcxVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).c.f;
            cb80 cb80VarG = t5p1.g(t5p1.r("active-users-pulse", x340Var, 0), 0.0f, 1.0f, irn1.Y(irn1.o0(2000, 0, a, 2), 1, 0L, 4), "pulse-progress", x340Var, 29112, 0);
            float fA = hcxVar.a(x340Var);
            qim0 qim0VarR = u291.r(qim0Var, 12.0f + fA);
            boolean zI = x340Var.i(cb80VarG) | x340Var.f(j) | x340Var.d(fA);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                of0 of0Var = new of0(cb80VarG, j, fA, (byte) 0);
                x340Var.s0(of0Var);
                objT = of0Var;
            }
            t1c.a(exd0.q(qim0VarR, (iu30) objT), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pf0(hcxVar, qim0Var, i, (byte) 0);
        }
    }

    public static final void d(hcx hcxVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(398380381);
        if ((i & 6) == 0) {
            i2 = (x340Var.e(hcxVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).c.f;
            float fA = hcxVar.a(x340Var);
            qim0 qim0VarR = u291.r(qim0Var, 12.0f + fA);
            boolean zF = x340Var.f(j) | x340Var.d(fA);
            Object objT = x340Var.T();
            if (zF || objT == fkj0.X) {
                objT = new qf0(j, fA, (byte) 0);
                x340Var.s0(objT);
            }
            t1c.a(exd0.q(qim0VarR, (iu30) objT), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pf0(hcxVar, qim0Var, i, (byte) 1);
        }
    }
}
