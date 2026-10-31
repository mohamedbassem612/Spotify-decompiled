package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mc30 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pc30 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mc30(pc30 pc30Var, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = pc30Var;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i;
        String strK;
        byte b = this.a;
        z50 z50Var = z50.c;
        n4k n4kVar = hmb0.t1;
        f36 f36Var = h36.c;
        qti1 qti1Var = voo1.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        pc30 pc30Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                j06 j06Var = x340Var2.a;
                if (zY) {
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarY = voo1.y(u291.f(nim0Var, 1.0f), qti1Var);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    cvx cvxVar3 = cbx.b(x340Var2).b;
                    qim0 qim0VarN = anm1.N("forced_graduation_lock_element_test_tag", uyn1.B(qim0VarY, 16.0f, 0.0f, 16.0f, 16.0f, 2));
                    mbh mbhVarA = jbh.a(f36Var, een.Q0, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
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
                    qim0 qim0VarO = ab80.o(nim0Var, cbx.b(x340Var2).b.b, x340Var2, nim0Var, 1.0f);
                    jw31 jw31VarA = ew31.a(h36.e, een.Z, x340Var2, 0);
                    int iHashCode2 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM2 = x340Var2.m();
                    qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarO);
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
                    cnx cnxVar = cnx.c;
                    zov0 zov0Var = cbx.b(x340Var2).g;
                    w0h1.a(cnxVar, isl.a, u291.r(nim0Var, 48.0f), cbx.a(x340Var2).b.d, 0L, false, x340Var2, cnx.d | 48, 48);
                    x340Var2.r(true);
                    String strO0 = cwl1.o0(x340Var2, 2131956100);
                    lee1 lee1Var = cbx.d(x340Var2).d;
                    qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, cbx.b(x340Var2).b.b, 0.0f, 0.0f, 13);
                    Object objT = x340Var2.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = m830.Z;
                        x340Var2.s0(objT);
                    }
                    uwo1.e(strO0, s161.b(qim0VarB, false, (iu30) objT), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2040);
                    String strK2 = pc30Var.a ? x0d.k(x340Var2, 1983078861, 2131956098, x340Var2, false) : x0d.k(x340Var2, 1983170280, 2131956097, x340Var2, false);
                    lee1 lee1Var2 = cbx.d(x340Var2).g;
                    cvx cvxVar4 = cbx.b(x340Var2).b;
                    uwo1.e(strK2, uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), lee1Var2, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2040);
                    kk0.s(1.0f, true, x340Var2);
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT2 = x340Var2.T();
                    if (zG || objT2 == m4cVar) {
                        objT2 = new bb30(iu30Var, (byte) 1);
                        x340Var2.s0(objT2);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT2), new idx(4), uyn1.B(nim0Var, 0.0f, cbx.b(x340Var2).b.b, 0.0f, 0.0f, 13), null, null, null, null, null, null, null, kpi.b, x340Var2, 0, 48, 2040);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                v9p1.g(pc30Var, iu30Var, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else if (pc30Var.b) {
                    x340Var4.i0(86006511);
                    v9p1.q(pc30Var, iu30Var, x340Var4, 0);
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(86102828);
                    v9p1.g(pc30Var, iu30Var, x340Var4, 0);
                    x340Var4.r(false);
                }
                return rih1Var;
            case 3:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    nim0 nim0Var2 = nim0.a;
                    qim0 qim0VarY2 = voo1.y(u291.f(nim0Var2, 1.0f), qti1Var);
                    uwr uwrVar2 = cbx.a;
                    qim0 qim0VarN2 = anm1.N("forced_graduation_lock_element_test_tag", uyn1.B(qim0VarY2, cbx.b(x340Var6).b.b, 0.0f, cbx.b(x340Var6).b.b, cbx.b(x340Var6).b.b, 2));
                    mbh mbhVarA2 = jbh.a(f36Var, een.P0, x340Var6, 0);
                    int iHashCode3 = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM3 = x340Var6.m();
                    qim0 qim0VarE3 = zr7.E(x340Var6, qim0VarN2);
                    hzj.A.getClass();
                    if (x340Var6.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var6.m0();
                    if (x340Var6.S) {
                        x340Var6.l(n4kVar);
                    } else {
                        x340Var6.v0();
                    }
                    nko1.H(mbhVarA2, x340Var6, y580.O0);
                    nko1.H(xos0VarM3, x340Var6, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var6, y580.R0);
                    nko1.F(x340Var6);
                    nko1.H(qim0VarE3, x340Var6, y580.Y);
                    float f = cbx.b(x340Var6).b.c;
                    cvx cvxVar5 = cbx.b(x340Var6).b;
                    op71.g(x340Var6, u291.h(nim0Var2, f + 16.0f));
                    v9p1.p(x340Var6, 0);
                    men1.e(cwl1.o0(x340Var6, 2131956108), (qim0) null, cbx.b(x340Var6).b.b, x340Var6, 0, 2);
                    String strO1 = cwl1.o0(x340Var6, 2131956107);
                    lee1 lee1Var3 = cbx.d(x340Var6).e;
                    cvx cvxVar6 = cbx.b(x340Var6).b;
                    vvm1.f(strO1, (qim0) null, lee1Var3, 8.0f, x340Var6, 0, 2);
                    boolean z = pc30Var.a;
                    Integer num = pc30Var.c;
                    if (!z && num != null) {
                        i = 2131956103;
                    } else if (z) {
                        i = num != null ? 2131956105 : 2131956104;
                    } else {
                        i = 2131956102;
                    }
                    if (num != null) {
                        x340Var6.i0(-1473931541);
                        strK = cwl1.n0(i, new Object[]{num}, x340Var6);
                        x340Var6.r(false);
                    } else {
                        strK = x0d.k(x340Var6, -1473930298, i, x340Var6, false);
                    }
                    vvm1.f(strK, (qim0) null, (lee1) null, 0.0f, x340Var6, 0, 14);
                    vvm1.f(cwl1.o0(x340Var6, 2131956101), (qim0) null, (lee1) null, 0.0f, x340Var6, 0, 14);
                    boolean zG2 = x340Var6.g(iu30Var);
                    Object objT3 = x340Var6.T();
                    if (zG2 || objT3 == fkj0.X) {
                        objT3 = new bb30(iu30Var, (byte) 2);
                        x340Var6.s0(objT3);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT3), new idx(4), uyn1.B(new tq60(een.Q0), 0.0f, cbx.b(x340Var6).b.c, 0.0f, 0.0f, 13), null, null, null, null, null, null, null, kpi.a, x340Var6, 0, 48, 2040);
                    x340Var6.r(true);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                v9p1.q(pc30Var, iu30Var, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mc30(pc30 pc30Var, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = pc30Var;
        this.c = iu30Var;
    }
}
