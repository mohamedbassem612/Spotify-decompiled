package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gbt0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ if5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbt0(if5 if5Var) {
        super(2);
        this.b = if5Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 0.0f, 0.0f, 4.0f, 7);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(hmb0.t1);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    j2i j2iVarB = this.b.b((qim0) null, (lee1) null, (u7h) null, x340Var2, 4096, 7);
                    if (j2iVarB == null) {
                        x340Var2.i0(228769826);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-823904321);
                        ywx0.l(6, j2iVarB, h2c.a, x340Var2, false);
                    }
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                byo1.h(this.b, (b0k) obj, czo1.p(9));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbt0(if5 if5Var, int i) {
        super(2);
        this.b = if5Var;
    }
}
