package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c671 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i671 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c671(i671 i671Var, byte b) {
        super(2);
        this.a = b;
        this.b = i671Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        x340 x340Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        i671 i671Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var2 = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var3 = x340Var2;
                if (x340Var3.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String str = i671Var.a;
                    uwr uwrVar = cbx.a;
                    uwo1.e(str, (qim0) null, cbx.d(x340Var3).e, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var3, 0, 0, 2026);
                } else {
                    x340Var3.b0();
                }
                return rih1Var;
            default:
                x340 x340Var4 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var5, 0);
                    int iHashCode = Long.hashCode(x340Var5.T);
                    xos0 xos0VarM = x340Var5.m();
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarE = zr7.E(x340Var5, nim0Var);
                    hzj.A.getClass();
                    if (x340Var5.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var5.m0();
                    if (x340Var5.S) {
                        x340Var5.l(hmb0.t1);
                    } else {
                        x340Var5.v0();
                    }
                    nko1.H(mbhVarA, x340Var5, y580.O0);
                    nko1.H(xos0VarM, x340Var5, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var5, y580.R0);
                    nko1.F(x340Var5);
                    nko1.H(qim0VarE, x340Var5, y580.Y);
                    String str2 = i671Var.b;
                    if (str2 == null) {
                        x340Var5.i0(331224224);
                        x340Var5.r(false);
                        x340Var = x340Var5;
                    } else {
                        x340Var5.i0(331224225);
                        uwr uwrVar2 = cbx.a;
                        uwo1.e(str2, (qim0) null, cbx.d(x340Var5).j, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var5, 0, 0, 2026);
                        x340Var = x340Var5;
                        x340Var.r(false);
                    }
                    h671 h671Var = i671Var.c;
                    if (h671Var.equals(g671.a)) {
                        x340Var.i0(703430154);
                        x340Var.r(false);
                    } else if (h671Var.equals(f671.a)) {
                        x340Var.i0(331563675);
                        uwr uwrVar3 = cbx.a;
                        cvx cvxVar = cbx.b(x340Var).b;
                        qim0 qim0VarO = ab80.o(nim0Var, 8.0f, x340Var, nim0Var, 1.0f);
                        cvx cvxVar2 = cbx.b(x340Var).b;
                        x340 x340Var6 = x340Var;
                        tto1.c(0, 2, 0L, cbx.a(x340Var).a.e, x340Var6, u291.h(qim0VarO, 4.0f));
                        x340Var = x340Var6;
                        x340Var.r(false);
                    } else {
                        if (!(h671Var instanceof e671)) {
                            throw p3d1.k(x340Var, 703428458, false);
                        }
                        x340Var.i0(331936357);
                        uwr uwrVar4 = cbx.a;
                        cvx cvxVar3 = cbx.b(x340Var).b;
                        op71.g(x340Var, u291.h(nim0Var, 8.0f));
                        float f = ((e671) h671Var).a / 100.0f;
                        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                        cvx cvxVar4 = cbx.b(x340Var).b;
                        tto1.d(f, 0, 4, 0L, cbx.a(x340Var).a.e, x340Var, u291.h(qim0VarF, 4.0f));
                        x340Var.r(false);
                    }
                    x340Var.r(true);
                } else {
                    x340Var5.b0();
                }
                return rih1Var;
        }
    }
}
