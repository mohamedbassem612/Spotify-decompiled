package p;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mb50 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qb50 b;
    public final /* synthetic */ nb50 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb50(iu30 iu30Var, qb50 qb50Var, nb50 nb50Var) {
        super(2);
        this.a = (byte) 0;
        this.d = iu30Var;
        this.b = qb50Var;
        this.c = nb50Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        iu30 iu30Var = this.d;
        nb50 nb50Var = this.c;
        qb50 qb50Var = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
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
                nim0 nim0Var = nim0.a;
                qim0 qim0VarY = voo1.y(u291.f(nim0Var, 1.0f), voo1.b);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                cvx cvxVar2 = cbx.b(x340Var2).b;
                cvx cvxVar3 = cbx.b(x340Var2).b;
                qim0 qim0VarN = anm1.N("graduation_terms_test_tag", uyn1.B(qim0VarY, 16.0f, 0.0f, 16.0f, 16.0f, 2));
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
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
                iu30 iu30Var2 = this.d;
                boolean zG = x340Var2.g(iu30Var2);
                Object objT = x340Var2.T();
                if (zG || objT == m4cVar) {
                    objT = new g850(iu30Var2, (byte) 5);
                    x340Var2.s0(objT);
                }
                q3p1.b(6, 0, (Function0) objT, x340Var2, true);
                men1.e(cwl1.o0(x340Var2, 2131956427), (qim0) null, 0.0f, x340Var2, 0, 6);
                qb50 qb50Var2 = this.b;
                p950 p950Var = qb50Var2.a;
                boolean zJ = u890.j(p950Var, l950.a);
                nb50 nb50Var2 = this.c;
                if (zJ) {
                    x340Var2.i0(-476907829);
                    don1.d(qb50Var2, nb50Var2, iu30Var2, x340Var2, 0);
                    x340Var2.r(false);
                } else if (u890.j(p950Var, m950.a)) {
                    x340Var2.i0(-476904853);
                    don1.e(qb50Var2, nb50Var2, iu30Var2, x340Var2, 0);
                    x340Var2.r(false);
                } else {
                    if (!u890.j(p950Var, n950.a)) {
                        if (!u890.j(p950Var, o950.a)) {
                            throw p3d1.k(x340Var2, -476909510, false);
                        }
                        x340Var2.i0(-476893863);
                        x340Var2.r(false);
                        hhg1.n("Unspecified market type for the privacy policy");
                        return null;
                    }
                    x340Var2.i0(-476902042);
                    don1.f(qb50Var2, nb50Var2, iu30Var2, x340Var2, 0);
                    x340Var2.r(false);
                }
                op71.g(x340Var2, new wnb0(0.75f, true));
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                jw31 jw31VarA = ew31.a(h36.e, een.Z, x340Var2, 0);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(jw31VarA, x340Var2, lljVar);
                nko1.H(xos0VarM2, x340Var2, lljVar2);
                x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar4);
                don1.a(qb50Var2, nb50Var2, iu30Var2, (qim0) null, x340Var2, 0);
                x340Var2.r(true);
                if (qb50Var2.f) {
                    x340Var2.i0(-1898453843);
                    boolean zI = x340Var2.i(nb50Var2);
                    Object objT2 = x340Var2.T();
                    if (zI || objT2 == m4cVar) {
                        objT2 = new n3s(nb50Var2, (lnm) null, (byte) 23);
                        x340Var2.s0(objT2);
                    }
                    qxd0.t(rih1Var, x340Var2, (vu30) objT2);
                    boolean zI2 = x340Var2.i(nb50Var2) | x340Var2.g(iu30Var2);
                    Object objT3 = x340Var2.T();
                    if (zI2 || objT3 == m4cVar) {
                        objT3 = new ib50(nb50Var2, iu30Var2, (byte) 1);
                        x340Var2.s0(objT3);
                    }
                    Function0 function0 = (Function0) objT3;
                    boolean zI3 = x340Var2.i(nb50Var2) | x340Var2.g(iu30Var2);
                    Object objT4 = x340Var2.T();
                    if (zI3 || objT4 == m4cVar) {
                        objT4 = new ib50(nb50Var2, iu30Var2, (byte) 2);
                        x340Var2.s0(objT4);
                    }
                    nmn1.c((String) null, (String) null, function0, (Function0) objT4, x340Var2, 0);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-1898073287);
                    x340Var2.r(false);
                }
                x340Var2.r(true);
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                don1.d(qb50Var, nb50Var, iu30Var, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                don1.e(qb50Var, nb50Var, iu30Var, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                don1.f(qb50Var, nb50Var, iu30Var, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mb50(qb50 qb50Var, nb50 nb50Var, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = qb50Var;
        this.c = nb50Var;
        this.d = iu30Var;
    }
}
