package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jy01 extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ ky01 b;
    public final /* synthetic */ gy01 c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy01(gy01 gy01Var, ky01 ky01Var, qim0 qim0Var) {
        super(3);
        this.c = gy01Var;
        this.b = ky01Var;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        x340 x340Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.d;
        gy01 gy01Var = this.c;
        ky01 ky01Var = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                ky01Var.f(0, gy01Var.m ? "" : gy01Var.f, b0kVar, qim0Var);
                return rih1Var;
            default:
                x340 x340Var2 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strK = f6o1.k(ky01Var.a.getResources(), gy01Var.n);
                if (gy01Var.l) {
                    i = 1;
                } else {
                    i = gy01Var.j ? 2 : 0;
                }
                fra fraVar = een.N0;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                jw31 jw31VarA = ew31.a(new d36(2.0f, true, new um5(false)), fraVar, x340Var2, 0);
                x340 x340Var3 = x340Var2;
                int iHashCode = Long.hashCode(x340Var3.T);
                xos0 xos0VarM = x340Var3.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
                hzj.A.getClass();
                x340 x340Var4 = x340Var2;
                if (x340Var4.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var4.m0();
                if (x340Var4.S) {
                    x340Var4.l(hmb0.t1);
                } else {
                    x340Var4.v0();
                }
                nko1.H(jw31VarA, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                if (i != 0) {
                    x340Var4.i0(-639406274);
                    kqn1.d(i, 0, 2, x340Var2, (qim0) null);
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(-639319784);
                    x340Var4.r(false);
                }
                if (ihc1.y0(strK)) {
                    x340Var = x340Var4;
                    x340Var.i0(-639057896);
                    x340Var.r(false);
                } else {
                    x340Var4.i0(-639262000);
                    x340Var = x340Var4;
                    uwo1.e(strK, (qim0) null, (lee1) null, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var2, 0, 0, 1718);
                    x340Var.r(false);
                }
                x340Var.r(true);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy01(ky01 ky01Var, gy01 gy01Var, qim0 qim0Var) {
        super(3);
        this.b = ky01Var;
        this.c = gy01Var;
        this.d = qim0Var;
    }
}
