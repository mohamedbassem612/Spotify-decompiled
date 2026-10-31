package p;

import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gmf1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ c380 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ iu30 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmf1(c380 c380Var, c380 c380Var2, String str, iu30 iu30Var) {
        super(2);
        this.b = c380Var;
        this.c = c380Var2;
        this.d = str;
        this.e = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i;
        Function0 function0;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                no80.b(this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                j06 j06Var = x340Var2.a;
                if (!zY) {
                    x340Var2.b0();
                    return rih1Var;
                }
                i6o0 i6o0VarQ = k1o1.q(x340Var2);
                nim0 nim0Var = nim0.a;
                qim0 qim0VarH = l6o1.H(bmq0.L(nim0Var, i6o0VarQ, (g6o0) null), l6o1.C(0, 0, 1, x340Var2), false, 14);
                WeakHashMap weakHashMap = osl1.x;
                qim0 qim0VarP = x0d.p(lhc.g(x340Var2).g, 32, qim0VarH);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                d36 d36Var = new d36(16.0f, true, new um5(false));
                era eraVar = een.P0;
                mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var2, 0);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarP);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                boolean z = x340Var2.S;
                Function0 function1 = hmb0.t1;
                if (z) {
                    x340Var2.l(function1);
                } else {
                    x340Var2.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var2, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var2, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var2, lljVar3);
                nko1.F(x340Var2);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var2, lljVar4);
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                era eraVar2 = een.Q0;
                f36 f36Var = h36.c;
                mbh mbhVarA2 = jbh.a(f36Var, eraVar2, x340Var2, 48);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(function1);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA2, x340Var2, lljVar);
                nko1.H(xos0VarM2, x340Var2, lljVar2);
                x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar4);
                uwo1.e(cwl1.o0(x340Var2, 2131963336), (qim0) null, cbx.d(x340Var2).g, cbx.a(x340Var2).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2034);
                cvx cvxVar2 = cbx.b(x340Var2).b;
                rqo1.g(6, 0, x340Var2, ab80.o(nim0Var, 16.0f, x340Var2, nim0Var, 1.0f));
                x340Var2.r(true);
                c380 c380Var = this.b;
                boolean zIsEmpty = c380Var.isEmpty();
                c380 c380Var2 = this.c;
                iu30 iu30Var = this.e;
                if (zIsEmpty && c380Var2.isEmpty()) {
                    x340Var2.i0(2086215860);
                    i = 0;
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(2085950624);
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == m4cVar) {
                        objT = new b1c1(iu30Var, (byte) 24);
                        x340Var2.s0(objT);
                    }
                    no80.b(c380Var, c380Var2, this.d, (iu30) objT, x340Var2, 0);
                    i = 0;
                    x340Var2.r(false);
                }
                mbh mbhVarA3 = jbh.a(f36Var, eraVar, x340Var2, i);
                int iHashCode3 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM3 = x340Var2.m();
                qim0 qim0VarE3 = zr7.E(x340Var2, nim0Var);
                x340Var2.m0();
                if (x340Var2.S) {
                    function0 = function1;
                    x340Var2.l(function0);
                } else {
                    function0 = function1;
                    x340Var2.v0();
                }
                nko1.H(mbhVarA3, x340Var2, lljVar);
                nko1.H(xos0VarM3, x340Var2, lljVar2);
                x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE3, x340Var2, lljVar4);
                String strO0 = cwl1.o0(x340Var2, 2131963328);
                boolean zG2 = x340Var2.g(iu30Var);
                Object objT2 = x340Var2.T();
                if (zG2 || objT2 == m4cVar) {
                    objT2 = new fgf1(iu30Var, (byte) 2);
                    x340Var2.s0(objT2);
                }
                no80.a(0, strO0, (Function0) objT2, x340Var2);
                String strO1 = cwl1.o0(x340Var2, 2131963326);
                boolean zG3 = x340Var2.g(iu30Var);
                Object objT3 = x340Var2.T();
                if (zG3 || objT3 == m4cVar) {
                    objT3 = new fgf1(iu30Var, (byte) 3);
                    x340Var2.s0(objT3);
                }
                no80.a(0, strO1, (Function0) objT3, x340Var2);
                String strO2 = cwl1.o0(x340Var2, 2131963327);
                boolean zG4 = x340Var2.g(iu30Var);
                Object objT4 = x340Var2.T();
                if (zG4 || objT4 == m4cVar) {
                    objT4 = new fgf1(iu30Var, (byte) 4);
                    x340Var2.s0(objT4);
                }
                no80.a(0, strO2, (Function0) objT4, x340Var2);
                x340Var2.r(true);
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                cvx cvxVar3 = cbx.b(x340Var2).b;
                rqo1.g(0, 0, x340Var2, uyn1.z(16.0f, 0.0f, 2, qim0VarF2));
                qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                cvx cvxVar4 = cbx.b(x340Var2).b;
                qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF3);
                cvx cvxVar5 = cbx.b(x340Var2).b;
                mbh mbhVarA4 = jbh.a(new d36(4.0f, true, new um5(false)), eraVar, x340Var2, 0);
                int iHashCode4 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM4 = x340Var2.m();
                qim0 qim0VarE4 = zr7.E(x340Var2, qim0VarZ);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(function0);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA4, x340Var2, lljVar);
                nko1.H(xos0VarM4, x340Var2, lljVar2);
                x0d.q(iHashCode4, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE4, x340Var2, lljVar4);
                uwo1.e(cwl1.o0(x340Var2, 2131963335), (qim0) null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2034);
                qim0 qim0VarF4 = u291.f(nim0Var, 1.0f);
                vzq0.a.getClass();
                tzq0 tzq0Var = uzq0.b;
                boolean zG5 = x340Var2.g(iu30Var);
                Object objT5 = x340Var2.T();
                if (zG5 || objT5 == m4cVar) {
                    objT5 = new fgf1(iu30Var, (byte) 5);
                    x340Var2.s0(objT5);
                }
                cwl1.b(qim0VarF4, (tl3) null, d4o1.a, (pgx) null, tzq0Var, (max) null, false, (idn0) null, ny3.a, new gbx(z50.c, (Function0) objT5), (gbx) null, snj.a, x340Var2, 100688262, 48, 1258);
                x340Var2.r(true);
                cvx cvxVar6 = cbx.b(x340Var2).b;
                x0d.s(nim0Var, 16.0f, x340Var2, true);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmf1(c380 c380Var, c380 c380Var2, String str, iu30 iu30Var, int i) {
        super(2);
        this.b = c380Var;
        this.c = c380Var2;
        this.d = str;
        this.e = iu30Var;
    }
}
