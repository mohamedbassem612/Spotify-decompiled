package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d671 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ i671 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d671(i671 i671Var, iu30 iu30Var) {
        super(2);
        this.b = i671Var;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        i671 i671Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    era eraVar = een.Q0;
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var2, 48);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, nim0.a);
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
                    nko1.H(mbhVarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    String str = i671Var.d;
                    z50 z50Var = z50.c;
                    if (str == null) {
                        x340Var2.i0(-1456632113);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1456632112);
                        jdx jdxVar = jdx.c;
                        boolean zG = x340Var2.g(iu30Var);
                        Object objT = x340Var2.T();
                        if (zG || objT == m4cVar) {
                            objT = new m861(iu30Var, (byte) 4);
                            x340Var2.s0(objT);
                        }
                        foo1.c(new gbx(z50Var, (Function0) objT), jdxVar, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-752458719, new nl41(str, (byte) 9), x340Var2), x340Var2, 48, 48, 2044);
                        x340Var2.r(false);
                    }
                    String str2 = i671Var.e;
                    if (str2 == null) {
                        x340Var2.i0(-1456233391);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1456233390);
                        ldx ldxVar = ldx.c;
                        boolean zG2 = x340Var2.g(iu30Var);
                        Object objT2 = x340Var2.T();
                        if (zG2 || objT2 == m4cVar) {
                            objT2 = new m861(iu30Var, (byte) 5);
                            x340Var2.s0(objT2);
                        }
                        foo1.c(new gbx(z50Var, (Function0) objT2), ldxVar, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(2131075722, new nl41(str2, (byte) 10), x340Var2), x340Var2, 48, 48, 2044);
                        x340Var2.r(false);
                    }
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                ryo1.k(i671Var, iu30Var, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d671(i671 i671Var, iu30 iu30Var, int i) {
        super(2);
        this.b = i671Var;
        this.c = iu30Var;
    }
}
