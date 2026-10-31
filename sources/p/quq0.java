package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class quq0 {
    public static final k960 a = new k960(0.84000003f, 0.74f);

    public static final void a(k37 k37Var, k37 k37Var2, float f, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        cr31 zvxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-308578319);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(k37Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(k37Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            float f2 = 0.51f * f;
            qim0 qim0VarS = u291.s(qim0Var, 0.84000003f * f, 0.74f * f);
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
            yoo1.b(k37Var, f2, u291.r(nim0Var, f2), x340Var, i2 & 14);
            qim0 qim0VarC = eqr0.C(u291.r(nim0Var, f2), 0.33f * f, 0.23f * f);
            if (k37Var2.b) {
                x340Var.i0(-869625534);
                x340Var.r(false);
                zvxVar = er31.a;
            } else {
                x340Var.i0(-869624450);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(x340Var).f;
                cua cuaVar2 = cbx.b(x340Var).f;
                zvxVar = new zvx();
                x340Var.r(false);
            }
            yoo1.b(k37Var2, f2, sto1.o(qim0VarC, 8.0f, zvxVar, false, 0L, 0L, 24), x340Var, (i2 >> 3) & 14);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new puq0(k37Var, k37Var2, f, qim0Var, i, (byte) 0);
        }
    }
}
