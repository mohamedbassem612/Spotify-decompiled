package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class lfe1 {
    public static final long a = z4p1.g(4294505959L);
    public static final float b = 8.0f;

    public static final void a(String str, String str2, String str3, qim0 qim0Var, boolean z, vu30 vu30Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        vu30 vu30Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1230988160);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.g(str3) ? 256 : 128) | 3072 | (x340Var.h(z) ? 16384 : 8192) | 196608;
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            vu30 vu30VarR = apo.r(1272867450, new b4(str, str2, (byte) 21), x340Var);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(8.0f);
            float f = cvxVar.b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarX = uyn1.x(qim0Var3, f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            l4o1.b(exd0.q(qim0Var3, new qf0(b, u7h.b(u7h.b, 0.25f, 0.0f, 0.0f, 0.0f, 14), (byte) 5)), cr31VarB, s3o1.m(a, x340Var, 6), new ltd(0.0f, 1.0f, 6.0f), (qqb) null, apo.r(1840578680, new tf(cvxVar, vu30VarR, str2, z, str3), x340Var), x340Var, 196608, 16);
            x340Var.r(true);
            vu30Var2 = vu30VarR;
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            vu30Var2 = vu30Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wr1(str, str2, str3, qim0Var2, z, vu30Var2, i, (byte) 27);
        }
    }
}
