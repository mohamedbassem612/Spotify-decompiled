package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wky extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tky b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wky(tky tkyVar, byte b) {
        super(3);
        this.a = b;
        this.b = tkyVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tky tkyVar = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
                x340 x340Var2 = x340Var;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                nim0 nim0Var = nim0.a;
                qim0 qim0VarE = zr7.E(x340Var, nim0Var);
                hzj.A.getClass();
                x340 x340Var3 = x340Var;
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(hmb0.t1);
                } else {
                    x340Var3.v0();
                }
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                int iC = l1d.C(tkyVar.i);
                int i = 2;
                if (iC != 0) {
                    if (iC == 1) {
                        i = 1;
                    } else {
                        if (iC != 2) {
                            eg.o();
                            return null;
                        }
                        i = 0;
                    }
                }
                if (i == 0) {
                    x340Var3.i0(-761736798);
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(-761736797);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    kqn1.d(i, 0, 0, x340Var, uyn1.B(nim0Var, 0.0f, 0.0f, 4.0f, 0.0f, 11));
                    x340Var3.r(false);
                }
                uwo1.e(tkyVar.c, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1726);
                x340Var3.r(true);
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                uwo1.e(tkyVar.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, (b0k) obj2, 0, 0, 1726);
                return rih1Var;
        }
    }
}
