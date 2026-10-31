package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class b8b1 {
    public static final k960 a = new k960(0.87000006f, 0.45000002f);

    public static final void a(k37 k37Var, k37 k37Var2, k37 k37Var3, float f, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        cr31 zvxVar;
        cr31 zvxVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1985086670);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(k37Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(k37Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(k37Var3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(qim0Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            float f2 = 0.33f * f;
            flb0 flb0Var = (flb0) x340Var.k(t4k.n);
            float f3 = 0.04f * f;
            qim0 qim0VarS = u291.s(qim0Var, 0.87000006f * f, 0.45000002f * f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarS);
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
            nim0 nim0Var = nim0.a;
            float f4 = (f * 0.0f) + f3;
            float f5 = f3 + f3;
            yoo1.b(k37Var, f2, k1u.u(eqr0.C(u291.r(nim0Var, f2), f4, f5), nko1.G(-10.0f, flb0Var)), x340Var, i2 & 14);
            qim0 qim0VarU = k1u.u(eqr0.C(u291.r(nim0Var, f2), (0.23f * f) + f3, f4), nko1.G(0.0f, flb0Var));
            if (k37Var2.b) {
                x340Var.i0(-1536164073);
                x340Var.r(false);
                zvxVar = er31.a;
            } else {
                x340Var.i0(-1536162989);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(x340Var).f;
                cua cuaVar2 = cbx.b(x340Var).f;
                zvxVar = new zvx();
                x340Var.r(false);
            }
            yoo1.b(k37Var2, f2, sto1.o(qim0VarU, 8.0f, zvxVar, false, 0L, 0L, 28), x340Var, (i2 >> 3) & 14);
            qim0 qim0VarU2 = k1u.u(eqr0.C(u291.r(nim0Var, f2), (0.46f * f) + f3, f5), nko1.G(10.0f, flb0Var));
            if (k37Var3.b) {
                x340Var.i0(-1536150665);
                x340Var.r(false);
                zvxVar2 = er31.a;
            } else {
                x340Var.i0(-1536149581);
                uwr uwrVar2 = cbx.a;
                cua cuaVar3 = cbx.b(x340Var).f;
                cua cuaVar4 = cbx.b(x340Var).f;
                zvxVar2 = new zvx();
                x340Var.r(false);
            }
            yoo1.b(k37Var3, f2, sto1.o(qim0VarU2, 8.0f, zvxVar2, false, 0L, 0L, 28), x340Var, (i2 >> 6) & 14);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new a8b1(k37Var, k37Var2, k37Var3, f, qim0Var, i, (byte) 0);
        }
    }
}
