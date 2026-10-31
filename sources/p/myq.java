package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class myq extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ myq(Function0 function0, Function0 function1, byte b) {
        super(3);
        this.a = b;
        this.b = function0;
        this.c = function1;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        Function0 function1 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                gfx.f(6, apo.r(857392501, new bvk(function0, (byte) 8), x340Var), x340Var);
                gdx gdxVarS = yla.s(x340Var);
                x340 x340Var2 = x340Var;
                boolean zG = x340Var2.g(function1);
                Object objT = x340Var2.T();
                if (zG || objT == fkj0.X) {
                    objT = new j3n(function1, (byte) 17);
                    x340Var2.s0(objT);
                }
                foo1.g(new gbx(z50.c, (Function0) objT), (qim0) null, (max) null, gdxVarS, (idn0) null, phi.g, (vu30) null, phi.h, x340Var2, 12779520, 86);
                return rih1Var;
            case 1:
                ((Number) obj3).intValue();
                lgo1.f(function1, function0, (qim0) null, (b0k) obj2, 0);
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj2;
                ((Number) obj3).intValue();
                nim0 nim0Var = nim0.a;
                qim0 qim0VarC = u291.c(u291.f(nim0Var, 1.0f), 0.5f);
                uwr uwrVar = cbx.a;
                k1u.h(0, ((xex) ((gmt) zex.a.c).b).D, x340Var3, qim0VarC);
                qim0 qim0VarH = l6o1.H(uyn1.w(u291.d(nim0Var, 1.0f), (vzq0) obj), l6o1.C(0, 0, 1, x340Var3), false, 14);
                cvx cvxVar = cbx.b(x340Var3).b;
                qim0 qim0VarX = uyn1.x(qim0VarH, 16.0f);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var3, 0);
                x340 x340Var4 = x340Var3;
                int iHashCode = Long.hashCode(x340Var4.T);
                xos0 xos0VarM = x340Var4.m();
                qim0 qim0VarE = zr7.E(x340Var3, qim0VarX);
                hzj.A.getClass();
                x340 x340Var5 = x340Var3;
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
                nko1.H(mbhVarA, x340Var3, y580.O0);
                nko1.H(xos0VarM, x340Var3, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
                nko1.F(x340Var3);
                nko1.H(qim0VarE, x340Var3, y580.Y);
                k1u.i(x340Var3, 0);
                op71.g(x340Var3, u291.h(nim0Var, cbx.b(x340Var3).b.b));
                k1u.c(x340Var3, 0);
                op71.g(x340Var3, new wnb0(1.0f, true));
                k1u.g(function1, function0, uyn1.B(u291.f(nim0Var, 1.0f), 0.0f, cbx.b(x340Var3).b.b, 0.0f, 0.0f, 13), x340Var3, 0);
                x340Var5.r(true);
                return rih1Var;
        }
    }
}
