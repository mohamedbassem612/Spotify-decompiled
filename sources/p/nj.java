package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nj extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ mj b;
    public final /* synthetic */ gw70 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj(mj mjVar, iu30 iu30Var, gw70 gw70Var) {
        super(3);
        this.b = mjVar;
        this.d = iu30Var;
        this.c = gw70Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                dxo1.d(this.b, this.d, this.c, (qim0) null, (b0k) obj2, 0);
                return rih1Var;
            default:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                nim0 nim0Var = nim0.a;
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarZ = u291.z(uyn1.x(qim0VarF, 16.0f), (fra) null, 3);
                x340 x340Var2 = x340Var;
                Object objT = x340Var2.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = p4.e;
                    x340Var2.s0(objT);
                }
                qim0 qim0VarX = bin.x(qim0VarZ, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15);
                era eraVar = een.Q0;
                mj mjVar = this.b;
                String str = mjVar.a;
                mbh mbhVarA = jbh.a(h36.d, eraVar, x340Var2, 0);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
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
                String str2 = mjVar.b;
                if (str != null) {
                    x340Var2.i0(1934086695);
                    qim0 qim0VarJ = u291.j(0.0f, 180.0f, 1, u291.f(nim0Var, 1.0f));
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    dxo1.i(str, this.c, uyn1.z(0.0f, 8.0f, 1, qim0VarJ), x340Var2, 0);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(1934347374);
                    x340Var2.r(false);
                }
                if (str2 != null) {
                    x340Var2.i0(1934393750);
                    qim0 qim0VarH = u291.h(u291.f(nim0Var, 1.0f), 180.0f);
                    cvx cvxVar3 = cbx.b(x340Var2).b;
                    dxo1.b(0, str2, x340Var2, uyn1.z(0.0f, 8.0f, 1, qim0VarH));
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(1934632078);
                    x340Var2.r(false);
                }
                cvx cvxVar4 = cbx.b(x340Var2).b;
                uwo1.e(cwl1.o0(x340Var2, mjVar.c), uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), cbx.d(x340Var2).d, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2024);
                qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, cbx.b(x340Var2).b.c, 7);
                int i = mjVar.d;
                String str3 = mjVar.f;
                if (str3 == null) {
                    str3 = "";
                }
                uwo1.e(cwl1.n0(i, new Object[]{str3}, x340Var2), qim0VarB, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2016);
                qim0 qim0VarB2 = uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, cbx.b(x340Var2).b.c, 7);
                String strO0 = cwl1.o0(x340Var2, mjVar.e);
                iu30 iu30Var = this.d;
                boolean zG = x340Var2.g(iu30Var);
                Object objT2 = x340Var2.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new p1(iu30Var, (byte) 5);
                    x340Var2.s0(objT2);
                }
                Function0 function0 = (Function0) objT2;
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                foo1.c(new gbx(new y50(strO0), function0), new idx(4), qim0VarB2, (max) null, yla.r(x340Var2), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1969836141, new ab(mjVar, (byte) 1), x340Var2), x340Var2, 0, 48, 2008);
                x340Var2.r(true);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj(mj mjVar, gw70 gw70Var, iu30 iu30Var) {
        super(3);
        this.b = mjVar;
        this.c = gw70Var;
        this.d = iu30Var;
    }
}
