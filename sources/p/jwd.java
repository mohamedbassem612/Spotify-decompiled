package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jwd extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k0e b;
    public final /* synthetic */ umf0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwd(k0e k0eVar, umf0 umf0Var) {
        super(2);
        this.a = (byte) 1;
        this.b = k0eVar;
        this.c = umf0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        String strK;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        umf0 umf0Var = this.c;
        k0e k0eVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                xfo1.c(k0eVar, umf0Var, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    long jA = cbx.a(x340Var2).a.a.a();
                    cua cuaVar = cbx.b(x340Var2).f;
                    cr31 cr31VarB = er31.b(16.0f);
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarF = u291.f(dug.f(nim0Var, jA, cr31VarB), 1.0f);
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
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
                    t0e t0eVar = k0eVar.a;
                    if (t0eVar instanceof s0e) {
                        x340Var2.i0(-1107714387);
                        x340Var2.r(false);
                        strK = ((s0e) t0eVar).a;
                    } else {
                        if (!(t0eVar instanceof r0e)) {
                            throw p3d1.k(x340Var2, -1107716319, false);
                        }
                        strK = x0d.k(x340Var2, -1107712547, 2131961028, x340Var2, false);
                    }
                    lee1 lee1Var = cbx.d(x340Var2).h;
                    long j = cbx.a(x340Var2).b.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    cvx cvxVar3 = cbx.b(x340Var2).b;
                    uwo1.e(strK, uyn1.B(nim0Var, 16.0f, 16.0f, 16.0f, 0.0f, 8), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2032);
                    cvx cvxVar4 = cbx.b(x340Var2).b;
                    op71.g(x340Var2, u291.r(nim0Var, 8.0f));
                    cvx cvxVar5 = cbx.b(x340Var2).b;
                    d36 d36Var = new d36(12.0f, true, new um5(false));
                    cvx cvxVar6 = cbx.b(x340Var2).b;
                    zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
                    boolean zI = x340Var2.i(k0eVar) | x340Var2.i(umf0Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        objT = new ztb(k0eVar, umf0Var, (byte) 17);
                        x340Var2.s0(objT);
                    }
                    s3o1.e((qim0) null, (xtb0) null, zzq0VarH, d36Var, (pl3) null, (iq20) null, (h3h1) null, (iu30) objT, x340Var2, 0, 235);
                    cvx cvxVar7 = cbx.b(x340Var2).b;
                    ywx0.n(nim0Var, 8.0f, x340Var2, true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                xfo1.c(k0eVar, umf0Var, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jwd(k0e k0eVar, umf0 umf0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = k0eVar;
        this.c = umf0Var;
    }
}
