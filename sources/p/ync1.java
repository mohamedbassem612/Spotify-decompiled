package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ync1 extends hab0 implements vu30 {
    public final /* synthetic */ long a;
    public final /* synthetic */ cr31 b;
    public final /* synthetic */ wb81 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ync1(long j, cr31 cr31Var, wb81 wb81Var, long j2, String str, Function0 function0) {
        super(2);
        this.a = j;
        this.b = cr31Var;
        this.c = wb81Var;
        this.d = j2;
        this.e = str;
        this.f = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
        j06 j06Var = x340Var2.a;
        if (zY) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            cr31 cr31Var = this.b;
            long j = this.a;
            qim0 qim0VarF2 = dug.f(qim0VarF, j, cr31Var);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF2);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var2.l(n4kVar);
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
            uwr uwrVar = cbx.a;
            qim0 qim0VarX = uyn1.x(nim0Var, cbx.b(x340Var2).b.a);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarX);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA2, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            wb81 wb81Var = this.c;
            boolean z2 = wb81Var.h;
            String str = wb81Var.g;
            if (z2) {
                x340Var2.i0(-1896424079);
                bpo1.j(this.d, x340Var2, 0);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1896363536);
                x340Var2.r(false);
            }
            lee1 lee1Var = cbx.d(x340Var2).d;
            long j2 = cbx.a(x340Var2).b.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            uwo1.e(this.e, uyn1.B(nim0Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), lee1Var, j2, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2032);
            op71.g(x340Var2, u291.h(nim0Var, cbx.b(x340Var2).b.c));
            bpo1.a(wb81Var, this.f, x340Var2, 0);
            x340Var2.r(true);
            if (str == null || str.length() == 0) {
                x340Var2.i0(-1002805434);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1002885197);
                bpo1.f(str, j, x340Var2, 0);
                x340Var2.r(false);
            }
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
