package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vwk1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vwk1(iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                    return rih1Var;
                }
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                nim0 nim0Var = nim0.a;
                qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
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
                Object objT = x340Var2.T();
                if (objT == fkj0.X) {
                    objT = new izj1(iu30Var, (byte) 16);
                    x340Var2.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                if (ihc1.y0("navigate to premium upsell")) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                wro1.k(new gbx(new y50("navigate to premium upsell"), function0), u291.r(nim0Var, 24.0f), (max) null, yla.s(x340Var2), (idn0) null, srj.a, x340Var2, 196608, 20);
                x340Var2.r(true);
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objT2 = x340Var4.T();
                    if (objT2 == fkj0.X) {
                        objT2 = new e3n1();
                        x340Var4.s0(objT2);
                    }
                    otw.c((e3n1) objT2, new b3n1(iu30Var), (qim0) null, (ipb1) null, x340Var4, 8, 12);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
