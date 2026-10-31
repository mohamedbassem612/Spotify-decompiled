package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cm11 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zl11 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cm11(zl11 zl11Var, byte b) {
        super(3);
        this.a = b;
        this.b = zl11Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zl11 zl11Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
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
                if (zl11Var.e) {
                    x340Var3.i0(-109982160);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    kqn1.d(2, 6, 0, x340Var, uyn1.B(nim0Var, 0.0f, 0.0f, 4.0f, 0.0f, 11));
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(-109786116);
                    x340Var3.r(false);
                }
                if (zl11Var.f) {
                    x340Var3.i0(-109750962);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    kqn1.d(1, 6, 0, x340Var, uyn1.B(nim0Var, 0.0f, 0.0f, 4.0f, 0.0f, 11));
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(-109552996);
                    x340Var3.r(false);
                }
                String str = zl11Var.c;
                uwr uwrVar3 = cbx.a;
                uwo1.e(str, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1714);
                x340Var3.r(true);
                return rih1Var;
            default:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str2 = zl11Var.b;
                uwr uwrVar4 = cbx.a;
                uwo1.e(str2, (qim0) null, cbx.d(b0kVar).g, cbx.a(b0kVar).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar, 0, 0, 1714);
                return rih1Var;
        }
    }
}
