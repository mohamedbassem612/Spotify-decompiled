package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ey extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey(List list, boolean z, String str, Function0 function0, xtb0 xtb0Var) {
        super(2);
        this.a = (byte) 22;
        this.d = list;
        this.c = z;
        this.b = str;
        this.e = function0;
        this.f = xtb0Var;
    }

    private final Object a(Object obj, Object obj2) {
        nrt0 irt0Var;
        String str;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            if (this.c) {
                irt0Var = nrt0.a;
            } else {
                String str2 = (String) this.b;
                irt0Var = new irt0((str2 == null || (str = (String) this.d) == null) ? null : new frt0(str2, str));
            }
            d0p1.g(irt0Var, (String) this.e, (String) this.f, null, x340Var2, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        iu30 iu30Var = (iu30) this.b;
        Function0 function0 = (Function0) this.d;
        Function0 function1 = (Function0) this.e;
        i9p1.g(czo1.p(1), function0, function1, (b0k) obj, iu30Var, (qim0) this.f, this.c);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object e(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        lnm lnmVar;
        Object v4e0Var;
        vu30 vu30Var;
        o95 o95Var;
        String strK;
        String strN0;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
        j06 j06Var = x340Var2.a;
        rih1 rih1Var = rih1.a;
        if (!zY) {
            x340Var2.b0();
            return rih1Var;
        }
        nim0 nim0Var = nim0.a;
        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var2).b;
        qim0 qim0VarB = uyn1.B(uyn1.z(16.0f, 0.0f, 2, qim0VarF), 0.0f, 0.0f, 0.0f, ((vzq0) this.b).a(), 7);
        lye0 lye0Var = (lye0) this.d;
        iu30 iu30Var = (iu30) this.e;
        na9 na9Var = (na9) this.f;
        era eraVar = een.P0;
        mbh mbhVarA = jbh.a(h36.e, eraVar, x340Var2, 6);
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
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
        vu30 vu30Var2 = y580.N0;
        nko1.H(xos0VarM, x340Var2, vu30Var2);
        Integer numValueOf = Integer.valueOf(iHashCode);
        llj lljVar2 = y580.R0;
        nko1.H(numValueOf, x340Var2, lljVar2);
        nko1.F(x340Var2);
        llj lljVar3 = y580.Y;
        nko1.H(qim0VarE, x340Var2, lljVar3);
        Object objT = x340Var2.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = c97.b(30.0f);
            x340Var2.s0(objT);
        }
        o95 o95Var2 = (o95) objT;
        Object objT2 = x340Var2.T();
        if (objT2 == m4cVar) {
            objT2 = c97.b(0.0f);
            x340Var2.s0(objT2);
        }
        o95 o95Var3 = (o95) objT2;
        boolean zI = x340Var2.i(o95Var2) | x340Var2.i(lye0Var);
        Object objT3 = x340Var2.T();
        if (zI || objT3 == m4cVar) {
            lnmVar = null;
            objT3 = new tfe0(o95Var2, lye0Var, (lnm) null, (byte) 6);
            x340Var2.s0(objT3);
        } else {
            lnmVar = null;
        }
        qxd0.t(rih1Var, x340Var2, (vu30) objT3);
        boolean zI2 = x340Var2.i(o95Var3) | x340Var2.i(lye0Var) | x340Var2.g(iu30Var);
        Object objT4 = x340Var2.T();
        if (zI2 || objT4 == m4cVar) {
            lnm lnmVar2 = lnmVar;
            vu30Var = vu30Var2;
            o95Var = o95Var3;
            v4e0Var = new v4e0(o95Var, lye0Var, iu30Var, lnmVar2, (byte) 5);
            x340Var2.s0(v4e0Var);
        } else {
            v4e0Var = objT4;
            vu30Var = vu30Var2;
            o95Var = o95Var3;
        }
        qxd0.t(rih1Var, x340Var2, (vu30) v4e0Var);
        boolean zI3 = x340Var2.i(o95Var2);
        Object objT5 = x340Var2.T();
        if (zI3 || objT5 == m4cVar) {
            objT5 = new wqe(o95Var2, (byte) 11);
            x340Var2.s0(objT5);
        }
        qim0 qim0VarK = d9y0.k(eqr0.B(nim0Var, (iu30) objT5), ((Number) o95Var.e()).floatValue());
        mbh mbhVarA2 = jbh.a(h36.c, eraVar, x340Var2, 0);
        int iHashCode2 = Long.hashCode(x340Var2.T);
        xos0 xos0VarM2 = x340Var2.m();
        qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarK);
        x340Var2.m0();
        if (x340Var2.S) {
            x340Var2.l(n4kVar);
        } else {
            x340Var2.v0();
        }
        nko1.H(mbhVarA2, x340Var2, lljVar);
        nko1.H(xos0VarM2, x340Var2, vu30Var);
        x0d.q(iHashCode2, x340Var2, lljVar2, x340Var2);
        nko1.H(qim0VarE2, x340Var2, lljVar3);
        zzy zzyVar = lye0Var.c;
        String str = lye0Var.b;
        if (u890.j(zzyVar, uzy.b) || u890.j(zzyVar, vzy.b)) {
            strK = x0d.k(x340Var2, -1701063630, 2131957671, x340Var2, false);
        } else if (u890.j(zzyVar, xzy.b)) {
            x340Var2.i0(-1701060037);
            strK = cwl1.n0(2131957674, new Object[]{str}, x340Var2);
            x340Var2.r(false);
        } else {
            if (!u890.j(zzyVar, yzy.b)) {
                throw p3d1.k(x340Var2, -1701066343, false);
            }
            x340Var2.i0(-1701056098);
            strK = cwl1.n0(2131957676, new Object[]{str}, x340Var2);
            x340Var2.r(false);
        }
        String str2 = strK;
        long j = cbx.a(x340Var2).b.a;
        lee1 lee1Var = cbx.d(x340Var2).c;
        qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
        cvx cvxVar2 = cbx.b(x340Var2).b;
        qim0 qim0VarB2 = uyn1.B(qim0VarF2, 0.0f, 0.0f, 0.0f, 16.0f, 7);
        Object objT6 = x340Var2.T();
        if (objT6 == m4cVar) {
            objT6 = gje0.Y0;
            x340Var2.s0(objT6);
        }
        uwo1.e(str2, s161.b(qim0VarB2, false, (iu30) objT6), lee1Var, j, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2016);
        if (this.c) {
            strN0 = x0d.k(x340Var2, -1192648566, 2131957675, x340Var2, false);
        } else {
            x340Var2.i0(-1192545553);
            strN0 = cwl1.n0(2131957673, new Object[]{str}, x340Var2);
            x340Var2.r(false);
        }
        String str3 = strN0;
        long j2 = cbx.a(x340Var2).b.a;
        lee1 lee1Var2 = cbx.d(x340Var2).j;
        qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
        cvx cvxVar3 = cbx.b(x340Var2).b;
        uwo1.e(str3, uyn1.B(qim0VarF3, 0.0f, 0.0f, 0.0f, 16.0f, 7), lee1Var2, j2, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2016);
        otw.c(na9Var, new xxe0(cwl1.o0(x340Var2, 2131957672), lye0Var.g, 2, lye0Var.c, lye0Var.d), (qim0) null, (ipb1) null, x340Var2, 0, 12);
        cvx cvxVar4 = cbx.b(x340Var2).b;
        op71.g(x340Var2, u291.h(nim0Var, 16.0f));
        otw.c(na9Var, new xxe0(cwl1.o0(x340Var2, 2131957677), lye0Var.h, 1, lye0Var.c, lye0Var.d), (qim0) null, (ipb1) null, x340Var2, 0, 12);
        cvx cvxVar5 = cbx.b(x340Var2).b;
        op71.g(x340Var2, u291.h(nim0Var, 16.0f));
        x340Var2.r(true);
        x340Var2.r(true);
        return rih1Var;
    }

    private final Object f(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        String str = (String) this.b;
        dzf0 dzf0Var = (dzf0) this.d;
        vzq0 vzq0Var = (vzq0) this.e;
        qim0 qim0Var = (qim0) this.f;
        cgj1.c(str, dzf0Var, this.c, vzq0Var, qim0Var, (b0k) obj, czo1.p(1));
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:363:0x0d9c  */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v9 */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        fqg0 fqg0VarU;
        goj0 goj0VarA;
        f7l1 f7l1Var;
        laa laaVar;
        ?? r15;
        String strK;
        float f;
        Object objI;
        boolean z;
        Object obj3;
        Object obj4;
        Object obj5;
        byte b;
        qim0 qim0VarC;
        float f2;
        boolean z2;
        boolean z3;
        boolean z4;
        float fE;
        Object objO;
        float fE2;
        Object objO2;
        Object obj6;
        Integer num;
        Object obj7;
        Object obj8;
        byte b2 = this.a;
        b36 b36Var = h36.a;
        f36 f36Var = h36.c;
        nim0 nim0Var = nim0.a;
        n4k n4kVar = hmb0.t1;
        boolean z5 = this.c;
        rih1 rih1Var = rih1.a;
        Object obj9 = this.f;
        Object obj10 = this.d;
        Object obj11 = this.b;
        Object obj12 = this.e;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                nyo1.b((String) obj11, (String) obj10, (String) obj12, this.c, (qim0) obj9, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                y1c1 y1c1Var = (y1c1) obj;
                iac0 iac0Var = (iac0) obj2;
                vu30 vu30Var = (vu30) obj9;
                String str = (String) obj11;
                w6e0 w6e0Var = ((t90) obj10).h;
                xe01 xe01Var = (xe01) w6e0Var.c;
                vu30 vu30Var2 = (vu30) obj12;
                boolean z6 = vu30Var2 != null;
                if (vu30Var2 == null) {
                    vu30Var2 = vu30Var;
                }
                if (vu30Var2 == null) {
                    hhg1.n("Required value was null.");
                    return null;
                }
                fqg0 fqg0VarU2 = q1o1.u((laa) vu30Var2.invoke(y1c1Var, iac0Var), null, null, 7);
                if (vu30Var == null) {
                    fqg0VarU = null;
                } else {
                    if (!z6) {
                        vu30Var = null;
                    }
                    if (vu30Var == null || (laaVar = (laa) vu30Var.invoke(y1c1Var, iac0Var)) == null) {
                        fqg0VarU = null;
                    } else {
                        fqg0VarU = q1o1.u(laaVar, null, null, 7);
                    }
                }
                s90 s90Var = new s90(xe01Var, str, z6);
                hoj0 hoj0VarC = ((ioj0) xe01Var.a.getValue()).c(f7l1.class, str);
                qtw qtwVarA = f6o1.A(new umf0(fqg0VarU2, fqg0VarU, s90Var, (((hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null || (f7l1Var = (f7l1) goj0VarA.a) == null) ? null : f7l1Var.a) instanceof y6l1) == z6), null, null, 3);
                return z5 ? new ug3(new mhg0(new v1(str, (byte) 6), (byte) 29), Collections.singletonMap(rih1Var, c13.i(f7l1.class)), qtwVarA, w6e0Var) : qtwVarA;
            case 2:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                dq50 dq50Var = (eq50) obj10;
                v081 v081Var = (v081) obj11;
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                j06 j06Var = x340Var2.a;
                if (zY) {
                    fra fraVar = een.Z;
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    nim0 nim0Var2 = nim0.a;
                    qim0 qim0VarX = uyn1.x(nim0Var2, 16.0f);
                    yv31 yv31Var = (yv31) obj12;
                    vu30 vu30Var3 = (vu30) obj9;
                    jw31 jw31VarA = ew31.a(b36Var, fraVar, x340Var2, 48);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
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
                    nko1.H(jw31VarA, x340Var2, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var2, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var2, lljVar3);
                    nko1.F(x340Var2);
                    llj lljVar4 = y580.Y;
                    wnb0 wnb0VarQ = kk0.q(x340Var2, qim0VarE, lljVar4, 1.0f, true);
                    mbh mbhVarA = jbh.a(f36Var, een.P0, x340Var2, 0);
                    int iHashCode2 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM2 = x340Var2.m();
                    qim0 qim0VarE2 = zr7.E(x340Var2, wnb0VarQ);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(mbhVarA, x340Var2, lljVar);
                    nko1.H(xos0VarM2, x340Var2, lljVar2);
                    x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                    nko1.H(qim0VarE2, x340Var2, lljVar4);
                    j1p1.i(yv31Var, vu30Var3, x340Var2, 0);
                    if (yv31Var.h != null) {
                        x340Var2.i0(-1212896855);
                        cvx cvxVar2 = cbx.b(x340Var2).b;
                        op71.g(x340Var2, u291.h(nim0Var2, 8.0f));
                        boo1.o(yv31Var.h, yv31Var.f, null, x340Var2, 0);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1212649878);
                        x340Var2.r(false);
                    }
                    x340Var2.r(true);
                    cvx cvxVar3 = cbx.b(x340Var2).b;
                    op71.g(x340Var2, u291.v(nim0Var2, 8.0f));
                    j1p1.j(yv31Var, x340Var2, 0);
                    x340Var2.r(true);
                    if (v081Var != null) {
                        x340Var2.i0(1335030885);
                        j6p1.c(v081Var.b, x340Var2, 0);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(1335091428);
                        x340Var2.r(false);
                    }
                    if (dq50Var instanceof dq50) {
                        x340Var2.i0(1335162046);
                        cvx cvxVar4 = cbx.b(x340Var2).b;
                        r15 = 0;
                        j1p1.b(0, 0, x340Var2, uyn1.B(nim0Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13));
                        dv20.l(0, dq50Var.a, x340Var2, false);
                    } else {
                        r15 = 0;
                        x340Var2.i0(1335321572);
                        x340Var2.r(false);
                    }
                    if (z5) {
                        x340Var2.i0(1335356633);
                        j1p1.b(r15, 1, x340Var2, null);
                        x340Var2.r((boolean) r15);
                    } else {
                        x340Var2.i0(1335397956);
                        x340Var2.r((boolean) r15);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                lvx.a((String) obj11, (iu30) obj10, (ven0) obj12, this.c, (qim0) obj9, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                c680.d((ee3) obj11, this.c, (iu30) obj10, (iu30) obj12, (yqg) obj9, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                hxo1.d(this.c, (String) obj11, (maa) obj10, (qim0) obj9, (Function0) obj12, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                l2p1.b((c380) obj11, (Function0) obj10, (qim0) obj9, (u7h) obj12, this.c, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                rpo1.b((Function0) obj11, (iu30) obj10, (iu30) obj12, (qim0) obj9, this.c, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                zso1.t((uef) obj11, (w4i1) obj10, (f5f) obj12, (yyh) obj9, this.c, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                Function0 function0 = (Function0) obj12;
                w4i1 w4i1Var = (w4i1) obj11;
                iu30 iu30Var = (iu30) obj10;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String strN0 = cwl1.n0(z5 ? 2131953615 : 2131953782, new Object[]{w4i1Var.b}, x340Var4);
                    if (z5) {
                        strK = x0d.k(x340Var4, 1475711942, 2131953783, x340Var4, false);
                    } else {
                        x340Var4.i0(-1497514966);
                        x340Var4.r(false);
                        strK = null;
                    }
                    Object objT = x340Var4.T();
                    m4c m4cVar = fkj0.X;
                    Object objN = objT;
                    if (objT == m4cVar) {
                        objN = ktd.n(x340Var4);
                    }
                    idn0 idn0Var = (idn0) objN;
                    float fK = wwo1.K(idn0Var, x340Var4);
                    Object objT2 = x340Var4.T();
                    Object objN2 = objT2;
                    if (objT2 == m4cVar) {
                        objN2 = ktd.n(x340Var4);
                    }
                    idn0 idn0Var2 = (idn0) objN2;
                    float fK2 = wwo1.K(idn0Var2, x340Var4);
                    boolean zG = x340Var4.g(iu30Var);
                    Object objT3 = x340Var4.T();
                    if (zG || objT3 == m4cVar) {
                        objT3 = new ggf(iu30Var, (byte) 29);
                        x340Var4.s0(objT3);
                    }
                    ven0 ven0VarS = v8r.s(objT3, x340Var4);
                    ven0 ven0VarS2 = v8r.s(function0, x340Var4);
                    Object objT4 = x340Var4.T();
                    if (objT4 == m4cVar) {
                        f = 0.0f;
                        objI = us71.i(0.0f, x340Var4);
                    } else {
                        f = 0.0f;
                        objI = objT4;
                    }
                    drr0 drr0Var = (drr0) objI;
                    Object objT5 = x340Var4.T();
                    Object objI2 = objT5;
                    if (objT5 == m4cVar) {
                        objI2 = us71.i(f, x340Var4);
                    }
                    drr0 drr0Var2 = (drr0) objI2;
                    Object objT6 = x340Var4.T();
                    Object objI3 = objT6;
                    if (objT6 == m4cVar) {
                        objI3 = us71.i(Float.POSITIVE_INFINITY, x340Var4);
                    }
                    drr0 drr0Var3 = (drr0) objI3;
                    Object objT7 = x340Var4.T();
                    Object objI4 = objT7;
                    if (objT7 == m4cVar) {
                        objI4 = us71.i(Float.NEGATIVE_INFINITY, x340Var4);
                    }
                    drr0 drr0Var4 = (drr0) objI4;
                    Object objT8 = x340Var4.T();
                    Object objI5 = objT8;
                    if (objT8 == m4cVar) {
                        objI5 = us71.i(Float.POSITIVE_INFINITY, x340Var4);
                    }
                    drr0 drr0Var5 = (drr0) objI5;
                    ven0 ven0VarS3 = v8r.s(x340Var4.k(t4k.n), x340Var4);
                    qim0 qim0VarN = anm1.N("chat-toolbar-test-tag", u291.f(nim0Var, 1.0f));
                    boolean zI = x340Var4.i(drr0Var) | x340Var4.i(drr0Var2);
                    Object objT9 = x340Var4.T();
                    if (zI || objT9 == m4cVar) {
                        z = false;
                        crf crfVar = new crf(drr0Var, drr0Var2, false ? 1 : 0);
                        x340Var4.s0(crfVar);
                        obj3 = crfVar;
                    } else {
                        z = false;
                        obj3 = objT9;
                    }
                    qim0 qim0VarX2 = ern1.x(qim0VarN, (iu30) obj3);
                    if (z5) {
                        x340Var4.i0(-1496137728);
                        x340Var4.r(z);
                        qim0VarC = f8d1.c(nim0Var, idn0Var, idn0Var2, new mrf(idn0Var2, idn0Var, drr0Var, ven0VarS3, drr0Var3, drr0Var4, ven0VarS2, drr0Var2, drr0Var5, ven0VarS));
                        fK2 = fK2;
                        function0 = function0;
                        b = 0;
                    } else {
                        x340Var4.i0(-1495464594);
                        boolean zG2 = x340Var4.g(iu30Var);
                        Object objT10 = x340Var4.T();
                        if (zG2 || objT10 == m4cVar) {
                            ggf ggfVar = new ggf(iu30Var, (byte) 27);
                            x340Var4.s0(ggfVar);
                            obj4 = ggfVar;
                        } else {
                            obj4 = objT10;
                        }
                        Function0 function1 = (Function0) obj4;
                        boolean zG3 = x340Var4.g(iu30Var);
                        Object objT11 = x340Var4.T();
                        if (zG3 || objT11 == m4cVar) {
                            ggf ggfVar2 = new ggf(iu30Var, (byte) 28);
                            x340Var4.s0(ggfVar2);
                            obj5 = ggfVar2;
                        } else {
                            obj5 = objT11;
                        }
                        Function0 function2 = (Function0) obj5;
                        b = 0;
                        qim0VarC = f8d1.c(nim0Var, function1, function2, new nrf(function2, function1, b));
                        x340Var4.r(false);
                    }
                    qim0 qim0VarThen = qim0VarX2.then(qim0VarC);
                    fra fraVar2 = een.N0;
                    boolean z7 = this.c;
                    if (!z7) {
                        b36Var = h36.e;
                    }
                    vu30 vu30Var4 = (vu30) obj9;
                    jw31 jw31VarA2 = ew31.a(b36Var, fraVar2, x340Var4, b);
                    int iHashCode3 = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM3 = x340Var4.m();
                    qim0 qim0VarE3 = zr7.E(x340Var4, qim0VarThen);
                    hzj.A.getClass();
                    if (x340Var4.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(jw31VarA2, x340Var4, y580.O0);
                    nko1.H(xos0VarM3, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE3, x340Var4, y580.Y);
                    hcx hcxVar = (!z7 || vu30Var4 == null) ? hcx.b : hcx.c;
                    String str2 = w4i1Var.b;
                    j2i j2iVarR = apo.r(1041067297, new l3a(w4i1Var, z7, fK, hcxVar), x340Var4);
                    vu30 vu30Var5 = z7 ? vu30Var4 : null;
                    float f3 = z7 ? fK : 1.0f;
                    float f4 = z7 ? fK2 : 1.0f;
                    Function0 function3 = (Function0) ven0VarS.getValue();
                    Function0 function4 = z7 ? function0 : null;
                    boolean zI2 = x340Var4.i(drr0Var3) | x340Var4.i(drr0Var5) | x340Var4.i(drr0Var4);
                    Object objT12 = x340Var4.T();
                    Object obj13 = objT12;
                    if (zI2 || objT12 == m4cVar) {
                        drf drfVar = new drf(drr0Var3, drr0Var5, drr0Var4, (byte) 0);
                        x340Var4.s0(drfVar);
                        obj13 = drfVar;
                    }
                    wwo1.m(str2, j2iVarR, 8.0f, z7, vu30Var5, f3, f4, strN0, strK, function3, function4, (xu30) obj13, x340Var4, 390, 0);
                    if (z7) {
                        x340Var4.i0(-437754005);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(-437849144);
                        uwr uwrVar2 = cbx.a;
                        cvx cvxVar5 = cbx.b(x340Var4).b;
                        wwo1.a(uyn1.x(nim0Var, 8.0f), x340Var4, 0);
                        x340Var4.r(false);
                    }
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                l3p1.g((String) obj11, this.c, (Function0) obj10, (qim0) obj9, (Integer) obj12, (b0k) obj, czo1.p(1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                s9p1.c((adj1) obj11, (iu30) obj10, (qim0) obj9, (paj1) obj12, this.c, (b0k) obj, czo1.p(1));
                return rih1Var;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                w6k.e((wr21) obj11, this.c, (iu30) obj10, (Function0) obj12, (qim0) obj9, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                a6o1.b((List) obj11, this.c, (wet0) obj10, (odh0) obj12, (qim0) obj9, (b0k) obj, czo1.p(4609));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                xpn1.c((String) obj11, this.c, (Function0) obj10, (iu30) obj12, (Function0) obj9, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                ((msy) obj12).d(czo1.p(24577), (String) obj11, (String) obj10, (b0k) obj, (c380) obj9, this.c);
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                ((fty) obj10).f(czo1.p(1), (String) obj11, (Function0) obj12, (b0k) obj, (qim0) obj9, this.c);
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                guo1.m((lk10) obj11, (iu30) obj10, (qim0) obj9, this.c, (Function0) obj12, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                ((uu0) obj11).b((ne91) obj10, this.c, (cxc0) obj12, (v260) obj9, (b0k) obj, czo1.p(4097));
                return rih1Var;
            case 19:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                x340 x340Var6 = x340Var5;
                boolean zY2 = x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2);
                j06 j06Var2 = x340Var6.a;
                if (!zY2) {
                    x340Var6.b0();
                    return rih1Var;
                }
                qim0 qim0Var = nim0.a;
                qim0 qim0VarZ = u291.z(u291.f(qim0Var, 1.0f), (fra) null, 3);
                nt70 nt70Var = (nt70) obj10;
                wat watVar = (wat) obj12;
                String str3 = (String) obj11;
                ven0 ven0Var = (ven0) obj9;
                gra graVar = een.d;
                gfh0 gfh0VarC = t1c.c(graVar, false);
                int iHashCode4 = Long.hashCode(x340Var6.T);
                xos0 xos0VarM4 = x340Var6.m();
                qim0 qim0VarE4 = zr7.E(x340Var6, qim0VarZ);
                hzj.A.getClass();
                if (j06Var2 == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                llj lljVar5 = y580.O0;
                nko1.H(gfh0VarC, x340Var6, lljVar5);
                llj lljVar6 = y580.N0;
                nko1.H(xos0VarM4, x340Var6, lljVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode4);
                llj lljVar7 = y580.R0;
                nko1.H(numValueOf2, x340Var6, lljVar7);
                nko1.F(x340Var6);
                llj lljVar8 = y580.Y;
                nko1.H(qim0VarE4, x340Var6, lljVar8);
                h2c h2cVar = h2c.a;
                l4o1.e(h2cVar.b(qim0Var), 0.0f, 0.75f, null, x340Var6, 432, 8);
                Object objT13 = x340Var6.T();
                ven0 ven0Var2 = (ven0) (objT13 == m4cVar2 ? ktd.o(0.0f, x340Var6) : objT13);
                if (p3v.b(((p3v) ven0Var2.getValue()).a, 0.0f) > 0) {
                    x340Var6.i0(1152734909);
                    float f5 = ((p3v) ven0Var2.getValue()).a;
                    uwr uwrVar3 = cbx.a;
                    cvx cvxVar6 = cbx.b(x340Var6).b;
                    x340Var6.r(false);
                    f2 = f5 + 16.0f;
                } else {
                    x340Var6.i0(1152822763);
                    x340Var6.r(false);
                    f2 = 0.0f;
                }
                qim0 qim0VarZ2 = u291.z(qim0Var, (fra) null, 3);
                mbh mbhVarA2 = jbh.a(f36Var, een.P0, x340Var6, 48);
                int iHashCode5 = Long.hashCode(x340Var6.T);
                xos0 xos0VarM5 = x340Var6.m();
                qim0 qim0VarE5 = zr7.E(x340Var6, qim0VarZ2);
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(mbhVarA2, x340Var6, lljVar5);
                nko1.H(xos0VarM5, x340Var6, lljVar6);
                x0d.q(iHashCode5, x340Var6, lljVar7, x340Var6);
                nko1.H(qim0VarE5, x340Var6, lljVar8);
                if (str3 != null) {
                    x340Var6.i0(-1173609571);
                    boolean zG4 = x340Var6.g(ven0Var) | x340Var6.g(watVar);
                    Object objT14 = x340Var6.T();
                    if (zG4 || objT14 == m4cVar2) {
                        obj6 = objT14;
                        kxl kxlVar = new kxl(watVar, ven0Var, (byte) 2);
                        x340Var6.s0(kxlVar);
                        obj6 = kxlVar;
                    }
                    zgo1.e(str3, lrn1.u(qim0Var, (iu30) obj6), nt70Var.f25p, f2, x340Var6, 6);
                    x340Var6.r(false);
                } else {
                    x340Var6.i0(-1173288101);
                    x340Var6.r(false);
                }
                if (!(((double) 1.0f) > 0.0d)) {
                    of80.a("invalid weight; must be greater than zero");
                }
                qim0 qim0VarZ3 = u291.z(new wnb0(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, false), (fra) null, 3);
                String str4 = nt70Var.b;
                boolean z8 = nt70Var.f25p;
                if (str4 == null) {
                    str4 = "";
                }
                zgo1.f(str4, qim0VarZ3, z8, f2, x340Var6, 6);
                float f6 = f2;
                if (z5) {
                    x340Var6.i0(-1172748050);
                    qim0 qim0VarN2 = anm1.N("verified_row", qim0Var);
                    uwr uwrVar4 = cbx.a;
                    cvx cvxVar7 = cbx.b(x340Var6).b;
                    qim0 qim0VarB = uyn1.B(qim0VarN2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    gfh0 gfh0VarC2 = t1c.c(graVar, false);
                    z2 = z8;
                    int iHashCode6 = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM6 = x340Var6.m();
                    qim0 qim0VarE6 = zr7.E(x340Var6, qim0VarB);
                    x340Var6.m0();
                    if (x340Var6.S) {
                        x340Var6.l(n4kVar);
                    } else {
                        x340Var6.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var6, lljVar5);
                    nko1.H(xos0VarM6, x340Var6, lljVar6);
                    x0d.q(iHashCode6, x340Var6, lljVar7, x340Var6);
                    nko1.H(qim0VarE6, x340Var6, lljVar8);
                    if (z2) {
                        x340Var6.i0(-2020503203);
                        Object objT15 = x340Var6.T();
                        if (objT15 == m4cVar2) {
                            objO2 = objT15;
                            objO2 = ktd.o(0.0f, x340Var6);
                        }
                        objO2 = objT15;
                        ven0 ven0Var3 = (ven0) objO2;
                        w2g0.c((qim0) null, (tl3) null, apo.r(-1531405060, new nf0(ven0Var3, (byte) 1), x340Var6), x340Var6, 3072, 7);
                        fE2 = ((p3v) ven0Var3.getValue()).a;
                        x340Var6.r(false);
                    } else {
                        fE2 = z5c.e(x340Var6, -2020427811, 2131165289, x340Var6, false);
                    }
                    cvx cvxVar8 = cbx.b(x340Var6).b;
                    float f7 = fE2 + 16.0f;
                    qim0 qim0VarB2 = uyn1.B(qim0Var, f7, 0.0f, f7 + f6, 0.0f, 10);
                    qim0Var = qim0Var;
                    otw.c(nt70Var.h, nt70Var.a, qim0VarB2, (ipb1) null, x340Var6, 0, 8);
                    z3 = true;
                    x340Var6.r(true);
                    x340Var6.r(false);
                } else {
                    z2 = z8;
                    z3 = true;
                    x340Var6.i0(-1171905253);
                    x340Var6.r(false);
                }
                x340Var6.r(z3);
                if (nt70Var.l != null) {
                    x340Var6.i0(1154887177);
                    otw.c(nt70Var.l, nt70Var.a, (qim0) null, (ipb1) null, x340Var6, 0, 12);
                    x340Var6.r(false);
                } else {
                    x340Var6.i0(1154987121);
                    x340Var6.r(false);
                }
                if (nt70Var.j != null) {
                    x340Var6.i0(1155064776);
                    qim0 qim0VarN3 = anm1.N("corner_badge", h2cVar.a(qim0Var, een.Y));
                    if (z2) {
                        x340Var6.i0(1155303011);
                        Object objT16 = x340Var6.T();
                        if (objT16 == m4cVar2) {
                            objO = objT16;
                            objO = ktd.o(0.0f, x340Var6);
                        }
                        objO = objT16;
                        ven0 ven0Var4 = (ven0) objO;
                        w2g0.c((qim0) null, (tl3) null, apo.r(-1531405060, new nf0(ven0Var4, (byte) 1), x340Var6), x340Var6, 3072, 7);
                        fE = ((p3v) ven0Var4.getValue()).a;
                        x340Var6.r(false);
                    } else {
                        fE = z5c.e(x340Var6, 1155386339, 2131165289, x340Var6, false);
                    }
                    uwr uwrVar5 = cbx.a;
                    cvx cvxVar9 = cbx.b(x340Var6).b;
                    float f8 = fE + 16.0f;
                    cvx cvxVar10 = cbx.b(x340Var6).b;
                    qim0 qim0VarB3 = uyn1.B(qim0VarN3, 0.0f, 0.0f, f8, 12.0f, 3);
                    boolean zG5 = x340Var6.g(watVar);
                    Object objT17 = x340Var6.T();
                    Object obj14 = objT17;
                    if (zG5 || objT17 == m4cVar2) {
                        kxl kxlVar2 = new kxl(watVar, ven0Var2, (byte) 3);
                        x340Var6.s0(kxlVar2);
                        obj14 = kxlVar2;
                    }
                    qim0 qim0VarU = lrn1.u(qim0VarB3, (iu30) obj14);
                    gfh0 gfh0VarC3 = t1c.c(graVar, false);
                    int iHashCode7 = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM7 = x340Var6.m();
                    qim0 qim0VarE7 = zr7.E(x340Var6, qim0VarU);
                    x340Var6.m0();
                    if (x340Var6.S) {
                        x340Var6.l(n4kVar);
                    } else {
                        x340Var6.v0();
                    }
                    nko1.H(gfh0VarC3, x340Var6, lljVar5);
                    nko1.H(xos0VarM7, x340Var6, lljVar6);
                    x0d.q(iHashCode7, x340Var6, lljVar7, x340Var6);
                    nko1.H(qim0VarE7, x340Var6, lljVar8);
                    otw.c(nt70Var.j, nt70Var.a, (qim0) null, (ipb1) null, x340Var6, 0, 12);
                    z4 = true;
                    x340Var6.r(true);
                    x340Var6.r(false);
                } else {
                    z4 = true;
                    x340Var6.i0(1155903729);
                    x340Var6.r(false);
                }
                x340Var6.r(z4);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                cr31 cr31Var = (cr31) obj10;
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    qim0 qim0VarQ = i1p1.q(sto1.o(d7e.r(0.5625f, anm1.N((String) obj11, nim0Var), false), 4.0f, cr31Var, false, 0L, 0L, 28), cr31Var);
                    uwr uwrVar6 = cbx.a;
                    w2g0.c(dug.f(qim0VarQ, cbx.a(x340Var8).a.a.c(), d4o1.a), (tl3) null, apo.r(371094645, new o3(obj12, z5, obj9, (byte) 18), x340Var8), x340Var8, 3072, 6);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                y7y0.f((qc0) obj11, this.c, (iu30) obj10, (qim0) obj9, (j2i) obj12, (b0k) obj, czo1.p(24577));
                return rih1Var;
            case 22:
                tlc1 tlc1Var = (tlc1) obj;
                long j = ((hjl) obj2).a;
                long jB = jjl.b(0, tlc1Var.i0(316.0f), 0, 0, 13);
                int iI0 = tlc1Var.i0(12.0f);
                List list = (List) obj10;
                List listP = tlc1Var.P("measure", new j2i(-1171961239, new qy90(list, z5, (String) obj11, (Function0) obj12), true));
                ArrayList arrayList = new ArrayList(q7h.U(listP, 10));
                Iterator it = listP.iterator();
                while (it.hasNext()) {
                    arrayList.add(((afh0) it.next()).H(jB));
                }
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    Integer numValueOf3 = Integer.valueOf(((q5t0) it2.next()).b);
                    while (it2.hasNext()) {
                        Integer numValueOf4 = Integer.valueOf(((q5t0) it2.next()).b);
                        if (numValueOf3.compareTo(numValueOf4) < 0) {
                            numValueOf3 = numValueOf4;
                        }
                    }
                    num = numValueOf3;
                } else {
                    num = null;
                }
                List listP2 = tlc1Var.P("content", new j2i(-1502839736, new si2(tlc1Var, (xtb0) obj9, list, (Function0) obj12, this.c, (String) obj11, (iI0 * 2) + (num != null ? num.intValue() : 0)), true));
                ArrayList arrayList2 = new ArrayList(q7h.U(listP2, 10));
                Iterator it3 = listP2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((afh0) it3.next()).H(j));
                }
                int i = hjl.i(j);
                Iterator it4 = arrayList2.iterator();
                int i2 = 0;
                while (it4.hasNext()) {
                    i2 += ((q5t0) it4.next()).b;
                }
                return tlc1Var.S(i, i2, b7x.a, new ib5(arrayList2, (byte) 22));
            case 23:
                ((Number) obj2).intValue();
                oqo1.d((c380) obj11, (vu30) obj10, (cqs0) obj12, this.c, (qim0) obj9, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                gbx gbxVar = (gbx) obj12;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                    qim0 qim0VarQ2 = k8p1.q((qim0) obj9, z5, (qim0) obj10);
                    lex lexVarZ = yoo1.z(x340Var10);
                    nex nexVar = new nex(4);
                    boolean zG6 = x340Var10.g(gbxVar);
                    Object objT18 = x340Var10.T();
                    if (zG6 || objT18 == fkj0.X) {
                        obj7 = objT18;
                        o70 o70Var = new o70(gbxVar, (byte) 2);
                        x340Var10.s0(o70Var);
                        obj7 = o70Var;
                    }
                    obj7 = objT18;
                    poo1.g(this.c, (iu30) obj7, nexVar, lexVarZ, qim0VarQ2, 0, null, null, null, null, null, null, null, false, null, apo.r(2017576647, new dz40((String) obj11, (byte) 29), x340Var10), x340Var10, 0, 196608, 24416);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 25:
                return a(obj, obj2);
            case 26:
                return d(obj, obj2);
            case 27:
                return e(obj, obj2);
            case 28:
                return f(obj, obj2);
            default:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                i091 i091Var = (i091) obj10;
                hob1 hob1Var = (hob1) obj11;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean zG7 = x340Var12.g(hob1Var.w) | x340Var12.g(i091Var) | x340Var12.h(z5);
                    yqg yqgVar = (yqg) obj9;
                    Object objT19 = x340Var12.T();
                    if (zG7 || objT19 == fkj0.X) {
                        obj8 = objT19;
                        m9g1 m9g1VarY = rpo1.y(hob1Var.w, i091Var, z5, yqgVar);
                        x340Var12.s0(m9g1VarY);
                        obj8 = m9g1VarY;
                    }
                    obj8 = objT19;
                    m9g1 m9g1Var = (m9g1) obj8;
                    if (((xpw) obj12) == null || m9g1Var == null) {
                        x340Var12.i0(1435342600);
                    } else {
                        x340Var12.i0(-92248376);
                        otw.c((xpw) obj12, m9g1Var, (qim0) null, (ipb1) null, x340Var12, 0, 12);
                    }
                    x340Var12.r(false);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ey(Object obj, Object obj2, Object obj3, Object obj4, boolean z, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.c = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ey(Object obj, Object obj2, Object obj3, boolean z, Object obj4, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = z;
        this.f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ey(Object obj, Object obj2, boolean z, Object obj3, Object obj4, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = z;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ey(Object obj, Object obj2, boolean z, Object obj3, Object obj4, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = z;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ey(Object obj, cv30 cv30Var, qim0 qim0Var, Object obj2, boolean z, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.d = cv30Var;
        this.f = qim0Var;
        this.e = obj2;
        this.c = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ey(Object obj, boolean z, Object obj2, Object obj3, Object obj4, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = z;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ey(Object obj, boolean z, cv30 cv30Var, qim0 qim0Var, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = z;
        this.d = cv30Var;
        this.f = qim0Var;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ey(byte b, int i, Object obj, Object obj2, Object obj3, qim0 qim0Var, boolean z) {
        super(2);
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = z;
        this.f = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey(t90 t90Var, vu30 vu30Var, vu30 vu30Var2, String str, boolean z) {
        super(2);
        this.a = (byte) 1;
        this.d = t90Var;
        this.e = vu30Var;
        this.f = vu30Var2;
        this.b = str;
        this.c = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey(msy msyVar, String str, c380 c380Var, String str2, boolean z, int i) {
        super(2);
        this.a = (byte) 15;
        this.e = msyVar;
        this.b = str;
        this.f = c380Var;
        this.d = str2;
        this.c = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey(fty ftyVar, Function0 function0, qim0 qim0Var, boolean z, String str, int i) {
        super(2);
        this.a = (byte) 16;
        this.d = ftyVar;
        this.e = function0;
        this.f = qim0Var;
        this.c = z;
        this.b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey(lk10 lk10Var, iu30 iu30Var, qim0 qim0Var, boolean z, Function0 function0, int i) {
        super(2);
        this.a = (byte) 17;
        this.b = lk10Var;
        this.d = iu30Var;
        this.f = qim0Var;
        this.c = z;
        this.e = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey(nt70 nt70Var, wat watVar, String str, ven0 ven0Var, boolean z) {
        super(2);
        this.a = (byte) 19;
        this.d = nt70Var;
        this.e = watVar;
        this.b = str;
        this.f = ven0Var;
        this.c = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey(qim0 qim0Var, boolean z, qim0 qim0Var2, gbx gbxVar, String str) {
        super(2);
        this.a = (byte) 24;
        this.f = qim0Var;
        this.c = z;
        this.d = qim0Var2;
        this.e = gbxVar;
        this.b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ey(boolean z, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(2);
        this.a = b;
        this.c = z;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey(boolean z, String str, maa maaVar, qim0 qim0Var, Function0 function0, int i) {
        super(2);
        this.a = (byte) 5;
        this.c = z;
        this.b = str;
        this.d = maaVar;
        this.f = qim0Var;
        this.e = function0;
    }
}
