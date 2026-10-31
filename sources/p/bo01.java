package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class bo01 {
    public static final float a;
    public static final float b;

    static {
        float f = (1.0f * 2.0f) + 8.0f;
        a = f;
        b = f / 2.0f;
    }

    public static final void a(qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-344558605);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            qim0 qim0VarA = h2c.a.a(nim0.a, een.f);
            float f = b;
            qim0 qim0VarR = u291.r(eqr0.C(qim0VarA, f, -f), a);
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).a.c;
            cr31 cr31Var = er31.a;
            t1c.a(anm1.N("recently_added_indicator", dug.f(uyn1.x(dug.f(qim0VarR, j, cr31Var), 1.0f), cbx.a(x340Var).c.g, cr31Var)), x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mq2(qim0Var, i, (byte) 26);
        }
    }

    public static final void b(co01 co01Var, boolean z, yqg yqgVar, mmw0 mmw0Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        tob1 tob1Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2133786182);
        int i2 = i | (x340Var.g(co01Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.g(yqgVar) ? 256 : 128) | (x340Var.g(mmw0Var) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            m4c m4cVar = fkj0.X;
            int i3 = (i2 & 14) ^ 6;
            int i4 = (i2 & 896) ^ 384;
            boolean z2 = ((((i2 & 112) ^ 48) > 32 && x340Var.h(z)) || (i2 & 48) == 32) | ((i3 > 4 && x340Var.g(co01Var)) || (i2 & 6) == 4) | ((i4 > 256 && x340Var.g(yqgVar)) || (i2 & 384) == 256) | ((((i2 & 7168) ^ 3072) > 2048 && x340Var.g(mmw0Var)) || (i2 & 3072) == 2048);
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = v8r.q(Boolean.valueOf(do01.b(co01Var, z, yqgVar.b(), mmw0Var)));
                x340Var.s0(objT);
            }
            tob1 tob1Var2 = (ven0) objT;
            if (((Boolean) tob1Var2.getValue()).booleanValue()) {
                x340Var.i0(634694499);
                Object[] objArr = {co01Var, Boolean.valueOf(z), yqgVar, mmw0Var};
                boolean zG = ((i4 > 256 && x340Var.g(yqgVar)) || (i2 & 384) == 256) | ((i3 > 4 && x340Var.g(co01Var)) || (i2 & 6) == 4) | x340Var.g(tob1Var2);
                Object objT2 = x340Var.T();
                if (zG || objT2 == m4cVar) {
                    tob1Var = tob1Var2;
                    glu0 glu0Var = new glu0(yqgVar, co01Var, tob1Var, (lnm) null, (byte) 28);
                    x340Var.s0(glu0Var);
                    objT2 = glu0Var;
                } else {
                    tob1Var = tob1Var2;
                }
                qxd0.u(objArr, (vu30) objT2, x340Var);
                x340Var.r(false);
            } else {
                tob1Var = tob1Var2;
                x340Var.i0(634975111);
                x340Var.r(false);
            }
            boolean zBooleanValue = ((Boolean) tob1Var.getValue()).booleanValue();
            qim0 qim0Var3 = nim0.a;
            if (zBooleanValue) {
                x340Var.i0(-2107910108);
                a(qim0Var3, x340Var, 6);
                x340Var.r(false);
            } else {
                x340Var.i0(-2107875512);
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ofi0(co01Var, z, yqgVar, mmw0Var, qim0Var2, i, (byte) 9);
        }
    }
}
