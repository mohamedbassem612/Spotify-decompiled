package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zx extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx(Integer num, String str, vu30 vu30Var, String str2, vu30 vu30Var2, c380 c380Var, Function0 function0, m5a m5aVar, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 12;
        this.e = num;
        this.c = str;
        this.f = vu30Var;
        this.d = str2;
        this.g = vu30Var2;
        this.h = c380Var;
        this.i = function0;
        this.t = m5aVar;
        this.b = qim0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:100:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:102:0x0417  */
    /* JADX WARN: Code duplicated, block: B:105:0x0462  */
    /* JADX WARN: Code duplicated, block: B:96:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:98:0x03e4  */
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i;
        x340 x340Var;
        ihl ihlVarK;
        Object objT;
        boolean z;
        vu30 vu30Var;
        vu30 vu30Var2;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.i;
        Object obj4 = this.b;
        Object obj5 = this.f;
        Object obj6 = this.d;
        Object obj7 = this.t;
        Object obj8 = this.g;
        Object obj9 = this.c;
        Object obj10 = this.e;
        Object obj11 = this.h;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                myo1.f((String) obj9, (String) obj6, (String) obj10, (String) obj5, (String) obj8, (String) obj11, (String) obj3, (String) obj7, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                a8o.a((mdb1) obj9, (xfx) obj6, (cce) obj10, (sp00) obj5, (v1k) obj8, (v1k) obj11, (FlowableObserveOn) obj3, (fbm) obj7, (qim0) obj4, (b0k) obj, czo1.p(4609));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                pno1.a((String) obj9, (c380) obj6, (hvp0) obj10, (kba) obj5, (h3h1) obj8, (qim0) obj4, (yt11) obj11, (maa) obj3, (vzq0) obj7, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                oto1.b((String) obj9, (String) obj6, (c380) obj10, (c380) obj5, (dvp) obj8, (kko) obj11, (xj1) obj3, (h4l0) obj7, (qim0) obj4, (b0k) obj, czo1.p(100663297));
                return rih1Var;
            case 4:
                q811 q811Var = (q811) obj3;
                ven0 ven0Var = (ven0) obj8;
                ven0 ven0Var2 = (ven0) obj5;
                x340 x340Var2 = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var3 = x340Var2;
                if (x340Var3.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    jsw jswVar = (jsw) obj6;
                    Object value = ((tob1) obj10).getValue();
                    boolean zG = x340Var3.g(ven0Var2) | x340Var3.g(ven0Var) | x340Var3.i((q811) obj11) | x340Var3.i(q811Var) | x340Var3.g((String) obj9) | x340Var3.g((iu30) obj7);
                    q811 q811Var2 = (q811) obj11;
                    String str = (String) obj9;
                    iu30 iu30Var = (iu30) obj7;
                    Object objT2 = x340Var3.T();
                    if (zG || objT2 == fkj0.X) {
                        j96 j96Var = new j96(q811Var2, q811Var, str, iu30Var, ven0Var2, ven0Var);
                        x340Var3.s0(j96Var);
                        objT2 = j96Var;
                    }
                    jswVar.a(0, value, x340Var3, (ksw) obj4, (iu30) objT2);
                } else {
                    x340Var3.b0();
                }
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                smo1.f((ArrayList) obj5, (cmt) obj8, (String) obj9, (String) obj6, (String) obj10, (hjp) obj11, (kjp) obj3, (qim0) obj4, (List) obj7, (b0k) obj, czo1.p(134217729));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                e9k.h((uoa) obj9, (o2u0) obj6, (ji0) obj10, (op0) obj5, (xpw) obj8, (xpw) obj11, (Function0) obj3, (Function0) obj7, (qim0) obj4, (b0k) obj, czo1.p(1572865));
                return rih1Var;
            case 7:
                x340 x340Var4 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                thd0 thd0Var = (thd0) obj9;
                etj0 etj0Var = (etj0) thd0Var.c;
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var5).b;
                    cvx cvxVar2 = cbx.b(x340Var5).b;
                    cvx cvxVar3 = cbx.b(x340Var5).b;
                    cvx cvxVar4 = cbx.b(x340Var5).b;
                    boolean z2 = etj0Var.d != null;
                    qim0 qim0VarThen = vby0.p(u291.f(nim0Var, 1.0f), (lz20) obj6).then(c030.a);
                    Object objT3 = x340Var5.T();
                    m4c m4cVar = fkj0.X;
                    if (objT3 == m4cVar) {
                        objT3 = kmj0.U0;
                        x340Var5.s0(objT3);
                    }
                    htj0.b(1572864, apo.r(75866942, new ydi0((Object) thd0Var, obj10, obj5, obj8, obj11, obj3, obj7, (byte) 1), x340Var5), x340Var5, s161.b(qim0VarThen, true, (iu30) objT3), z2);
                    vu30 vu30Var3 = etj0Var.d;
                    if (vu30Var3 == null) {
                        x340Var5.i0(1038006725);
                        x340Var5.r(false);
                    } else {
                        x340Var5.i0(1038006726);
                        tob1 tob1Var = (tob1) obj10;
                        tob1 tob1Var2 = (tob1) obj4;
                        vnr0 vnr0Var = (vnr0) vu30Var3.invoke(x340Var5, 0);
                        qim0 qim0VarZ = uyn1.z(cbx.b(x340Var5).b.a, 0.0f, 2, u291.f(nim0Var, 1.0f));
                        Object objT4 = x340Var5.T();
                        if (objT4 == m4cVar) {
                            objT4 = kmj0.W0;
                            x340Var5.s0(objT4);
                        }
                        qim0 qim0VarB = s161.b(qim0VarZ, true, (iu30) objT4);
                        boolean zG2 = x340Var5.g(tob1Var2);
                        Object objT5 = x340Var5.T();
                        if (zG2 || objT5 == m4cVar) {
                            objT5 = new pak(tob1Var2, (byte) 29);
                            x340Var5.s0(objT5);
                        }
                        htj0.a(vnr0Var, tob1Var, i541.C(qim0VarB, (iu30) objT5), x340Var5, 8);
                        x340Var5.r(false);
                    }
                } else {
                    x340Var5.b0();
                }
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                jhc1.j((gon0) obj6, (String) obj9, (qim0) obj4, (tl3) obj10, (iu30) obj5, (iu30) obj8, (iu30) obj11, (iu30) obj3, (iu30) obj7, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                c2p1.k((ok71) obj9, (dl71) obj6, (y441) obj10, (flw0) obj5, (cfd) obj8, (xtb0) obj11, (q1d0) obj3, (iu30) obj7, (qim0) obj4, (b0k) obj, czo1.p(102760449));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                zko1.i((kgc1) obj5, (Function0) obj8, (Function0) obj11, (String) obj9, (String) obj6, (String) obj10, (j2i) obj3, (qim0) obj4, (j2i) obj7, (b0k) obj, czo1.p(102236161));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                x340 x340Var6 = (b0k) obj;
                Integer num = (Integer) obj8;
                xhl xhlVar = (xhl) obj10;
                if ((((Number) obj2).intValue() & 11) == 2) {
                    x340 x340Var7 = x340Var6;
                    if (x340Var7.H()) {
                        x340Var7.b0();
                    } else {
                        ((ven0) obj6).setValue(rih1Var);
                        i = ((uhl) xhlVar).b;
                        xhlVar.m();
                        x340Var = x340Var6;
                        x340Var.i0(-2107724417);
                        uwr uwrVar2 = cbx.a;
                        cvx cvxVar5 = cbx.b(x340Var).b;
                        cvx cvxVar6 = cbx.b(x340Var).b;
                        xhl xhlVar2 = (xhl) xhlVar.l().b;
                        ihlVarK = xhlVar2.k();
                        ihl ihlVarK2 = xhlVar2.k();
                        ihl ihlVarK3 = xhlVar2.k();
                        if (num != null) {
                            x340Var.i0(-2107642299);
                            objT = x340Var.T();
                            if (objT == fkj0.X) {
                                objT = vxd1.b;
                                x340Var.s0(objT);
                            }
                            qim0 qim0VarJ = xhl.j(nim0Var, ihlVarK, (iu30) objT);
                            u1p1.t(x340Var);
                            u1p1.t(x340Var);
                            u1p1.e(num, uyn1.x(u291.a(qim0VarJ, 48.0f, 48.0f), 12.0f), x340Var, 0);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(-2107347272);
                            x340Var.r(false);
                        }
                        gfx.b(u1p1.E((m5a) obj11), apo.r(1468552127, new o06((m5a) obj11, (Function0) obj3, xhlVar, ihlVarK2, (txd1) obj7, (String) obj9, (vu30) obj4, ihlVarK3, (Integer) obj8, ihlVarK, (byte) 5), x340Var), x340Var, 48);
                        x340Var.r(false);
                        if (((uhl) xhlVar).b != i) {
                            qxd0.S((su) obj5, x340Var);
                        }
                    }
                } else {
                    ((ven0) obj6).setValue(rih1Var);
                    i = ((uhl) xhlVar).b;
                    xhlVar.m();
                    x340Var = x340Var6;
                    x340Var.i0(-2107724417);
                    uwr uwrVar3 = cbx.a;
                    cvx cvxVar7 = cbx.b(x340Var).b;
                    cvx cvxVar8 = cbx.b(x340Var).b;
                    xhl xhlVar3 = (xhl) xhlVar.l().b;
                    ihlVarK = xhlVar3.k();
                    ihl ihlVarK4 = xhlVar3.k();
                    ihl ihlVarK5 = xhlVar3.k();
                    if (num != null) {
                        x340Var.i0(-2107642299);
                        objT = x340Var.T();
                        if (objT == fkj0.X) {
                            objT = vxd1.b;
                            x340Var.s0(objT);
                        }
                        qim0 qim0VarJ2 = xhl.j(nim0Var, ihlVarK, (iu30) objT);
                        u1p1.t(x340Var);
                        u1p1.t(x340Var);
                        u1p1.e(num, uyn1.x(u291.a(qim0VarJ2, 48.0f, 48.0f), 12.0f), x340Var, 0);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-2107347272);
                        x340Var.r(false);
                    }
                    gfx.b(u1p1.E((m5a) obj11), apo.r(1468552127, new o06((m5a) obj11, (Function0) obj3, xhlVar, ihlVarK4, (txd1) obj7, (String) obj9, (vu30) obj4, ihlVarK5, (Integer) obj8, ihlVarK, (byte) 5), x340Var), x340Var, 48);
                    x340Var.r(false);
                    if (((uhl) xhlVar).b != i) {
                        qxd0.S((su) obj5, x340Var);
                    }
                }
                return rih1Var;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                u1p1.q((Integer) obj10, (String) obj9, (vu30) obj5, (String) obj6, (vu30) obj8, (c380) obj11, (Function0) obj3, (m5a) obj7, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                r4o1.e((String) obj9, (d0r) obj6, (c380) obj10, (nm6) obj5, (vzq0) obj8, (fos) obj11, (kt91) obj3, (xzq) obj7, (qim0) obj4, (b0k) obj, czo1.p(100925441));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                wro1.E((coi1) obj9, (iu30) obj6, (Function0) obj10, (Function0) obj5, (Function0) obj8, (Function0) obj11, (qim0) obj4, (b5i1) obj3, (vu30) obj7, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                x340 x340Var8 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                jbj1 jbj1Var = (jbj1) obj10;
                fdj1 fdj1Var = (fdj1) obj9;
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    o2u0 o2u0Var = fdj1Var.b;
                    List list = fdj1Var.a.g.b;
                    boolean z3 = fdj1Var.e && fdj1Var.d;
                    boolean z4 = fdj1Var.c;
                    boolean z5 = fdj1Var.g;
                    iu30 iu30Var2 = (iu30) obj6;
                    int iC = l1d.C(jbj1Var.a);
                    if (iC != 0) {
                        if (iC == 1) {
                            z = false;
                            x340Var9.i0(659819738);
                            x340Var9.r(false);
                            vu30Var = null;
                        } else {
                            if (iC != 2) {
                                throw p3d1.k(x340Var9, -671463227, false);
                            }
                            x340Var9.i0(-671449194);
                            x340Var9.r(false);
                            eg.m("LEGACY_HOME is routed to ContentLegacyHome");
                        }
                        return null;
                    }
                    z = false;
                    x340Var9.i0(659520744);
                    vu30 vu30VarR = apo.r(1134278213, new wpg1((Object) fdj1Var, obj5, obj8, (byte) 26), x340Var9);
                    x340Var9.r(false);
                    vu30Var = vu30VarR;
                    int iC2 = l1d.C(jbj1Var.b);
                    if (iC2 == 0) {
                        x340Var9.i0(660069878);
                        vu30 vu30VarR2 = apo.r(-821868700, new tte1(fdj1Var, (Function0) obj11, (Function0) obj3, (Function0) obj7, (Function0) obj4, (byte) 12), x340Var9);
                        x340Var9.r(false);
                        vu30Var2 = vu30VarR2;
                    } else {
                        if (iC2 != 1) {
                            if (iC2 != 2) {
                                throw p3d1.k(x340Var9, -671445517, z);
                            }
                            x340Var9.i0(-671424106);
                            x340Var9.r(z);
                            eg.m("LEGACY_HOME is routed to ContentLegacyHome");
                            return null;
                        }
                        x340Var9.i0(660601434);
                        x340Var9.r(z);
                        vu30Var2 = null;
                    }
                    p1p1.v(o2u0Var, list, z3, z4, z5, iu30Var2, vu30Var, vu30Var2, null, x340Var9, 0);
                } else {
                    x340Var9.b0();
                }
                return rih1Var;
            case 16:
                x340 x340Var10 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                Function0 function0 = (Function0) obj10;
                String str2 = (String) obj9;
                zej1 zej1Var = (zej1) obj6;
                m4c m4cVar2 = fkj0.X;
                x340 x340Var11 = x340Var10;
                boolean zY = x340Var11.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2);
                j06 j06Var = x340Var11.a;
                if (zY) {
                    qim0 qim0VarV = u291.v(nim0Var, 300.0f);
                    boolean zI = x340Var11.i(zej1Var);
                    Object objT6 = x340Var11.T();
                    if (zI || objT6 == m4cVar2) {
                        objT6 = new xaj1(zej1Var, (byte) 5);
                        x340Var11.s0(objT6);
                    }
                    qim0 qim0VarC = i541.C(qim0VarV, (iu30) objT6);
                    boolean zG3 = x340Var11.g(str2);
                    Object objT7 = x340Var11.T();
                    if (zG3 || objT7 == m4cVar2) {
                        objT7 = new ysf1(str2, (byte) 25);
                        x340Var11.s0(objT7);
                    }
                    qim0 qim0VarB2 = s161.b(qim0VarC, false, (iu30) objT7);
                    boolean zG4 = x340Var11.g(function0);
                    Object objT8 = x340Var11.T();
                    if (zG4 || objT8 == m4cVar2) {
                        objT8 = new sah1(function0, (byte) 29);
                        x340Var11.s0(objT8);
                    }
                    qim0 qim0VarX = bin.x(qim0VarB2, false, null, null, null, (Function0) objT8, 15);
                    Function0 function1 = (Function0) obj5;
                    Function0 function2 = (Function0) obj8;
                    vu30 vu30Var4 = (vu30) obj11;
                    iu30 iu30Var3 = (iu30) obj3;
                    ven0 ven0Var3 = (ven0) obj7;
                    ven0 ven0Var4 = (ven0) obj4;
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var11, 0);
                    int iHashCode = Long.hashCode(x340Var11.T);
                    xos0 xos0VarM = x340Var11.m();
                    qim0 qim0VarE = zr7.E(x340Var11, qim0VarX);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var11.m0();
                    boolean z6 = x340Var11.S;
                    n4k n4kVar = hmb0.t1;
                    if (z6) {
                        x340Var11.l(n4kVar);
                    } else {
                        x340Var11.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(mbhVarA, x340Var11, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var11, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var11, lljVar3);
                    nko1.F(x340Var11);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var11, lljVar4);
                    qim0 qim0VarQ = i1p1.q(u291.h(nim0Var, 169.0f), er31.b(4.0f));
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(x340Var11.T);
                    xos0 xos0VarM2 = x340Var11.m();
                    qim0 qim0VarE2 = zr7.E(x340Var11, qim0VarQ);
                    x340Var11.m0();
                    if (x340Var11.S) {
                        x340Var11.l(n4kVar);
                    } else {
                        x340Var11.v0();
                    }
                    nko1.H(gfh0VarC, x340Var11, lljVar);
                    nko1.H(xos0VarM2, x340Var11, lljVar2);
                    x0d.q(iHashCode2, x340Var11, lljVar3, x340Var11);
                    nko1.H(qim0VarE2, x340Var11, lljVar4);
                    boolean zBooleanValue = ((Boolean) ven0Var4.getValue()).booleanValue();
                    boolean zI2 = x340Var11.i(ven0Var3);
                    Object objT9 = x340Var11.T();
                    if (zI2 || objT9 == m4cVar2) {
                        objT9 = new i2g1(ven0Var3, (byte) 8);
                        x340Var11.s0(objT9);
                    }
                    qej1.e(zej1Var, zBooleanValue, vu30Var4, iu30Var3, (iu30) objT9, x340Var11, 6);
                    x340Var11.r(true);
                    qej1.b(zej1Var, function1, function2, x340Var11, 0);
                    x340Var11.r(true);
                } else {
                    x340Var11.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                qej1.l((zej1) obj6, (Function0) obj10, (String) obj9, (Function0) obj5, (Function0) obj8, (Function0) obj11, (qim0) obj4, (vu30) obj3, (iu30) obj7, (b0k) obj, czo1.p(113246209));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zx(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.h = obj6;
        this.i = obj7;
        this.t = obj8;
        this.b = obj9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zx(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.h = obj6;
        this.i = obj7;
        this.t = obj8;
        this.b = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx(String str, c380 c380Var, hvp0 hvp0Var, kba kbaVar, h3h1 h3h1Var, qim0 qim0Var, yt11 yt11Var, maa maaVar, vzq0 vzq0Var, int i) {
        super(2);
        this.a = (byte) 2;
        this.c = str;
        this.d = c380Var;
        this.e = hvp0Var;
        this.f = kbaVar;
        this.g = h3h1Var;
        this.b = qim0Var;
        this.h = yt11Var;
        this.i = maaVar;
        this.t = vzq0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx(ArrayList arrayList, cmt cmtVar, String str, String str2, String str3, hjp hjpVar, kjp kjpVar, qim0 qim0Var, List list, int i) {
        super(2);
        this.a = (byte) 5;
        this.f = arrayList;
        this.g = cmtVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.h = hjpVar;
        this.i = kjpVar;
        this.b = qim0Var;
        this.t = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx(jsw jswVar, tob1 tob1Var, ven0 ven0Var, ven0 ven0Var2, q811 q811Var, q811 q811Var2, String str, iu30 iu30Var, ksw kswVar) {
        super(2);
        this.a = (byte) 4;
        this.d = jswVar;
        this.e = tob1Var;
        this.f = ven0Var;
        this.g = ven0Var2;
        this.h = q811Var;
        this.i = q811Var2;
        this.c = str;
        this.t = iu30Var;
        this.b = kswVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx(ven0 ven0Var, xhl xhlVar, su suVar, Integer num, m5a m5aVar, Function0 function0, txd1 txd1Var, String str, vu30 vu30Var) {
        super(2);
        this.a = (byte) 11;
        this.d = ven0Var;
        this.e = xhlVar;
        this.f = suVar;
        this.g = num;
        this.h = m5aVar;
        this.i = function0;
        this.t = txd1Var;
        this.c = str;
        this.b = vu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx(gon0 gon0Var, String str, qim0 qim0Var, tl3 tl3Var, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, iu30 iu30Var4, iu30 iu30Var5, int i) {
        super(2);
        this.a = (byte) 8;
        this.d = gon0Var;
        this.c = str;
        this.b = qim0Var;
        this.e = tl3Var;
        this.f = iu30Var;
        this.g = iu30Var2;
        this.h = iu30Var3;
        this.i = iu30Var4;
        this.t = iu30Var5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx(kgc1 kgc1Var, Function0 function0, Function0 function1, String str, String str2, String str3, j2i j2iVar, qim0 qim0Var, j2i j2iVar2, int i) {
        super(2);
        this.a = (byte) 10;
        this.f = kgc1Var;
        this.g = function0;
        this.h = function1;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.i = j2iVar;
        this.b = qim0Var;
        this.t = j2iVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx(coi1 coi1Var, iu30 iu30Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, qim0 qim0Var, b5i1 b5i1Var, vu30 vu30Var, int i) {
        super(2);
        this.a = (byte) 14;
        this.c = coi1Var;
        this.d = iu30Var;
        this.e = function0;
        this.f = function1;
        this.g = function2;
        this.h = function3;
        this.b = qim0Var;
        this.i = b5i1Var;
        this.t = vu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx(zej1 zej1Var, String str, Function0 function0, Function0 function1, Function0 function2, vu30 vu30Var, iu30 iu30Var, ven0 ven0Var, ven0 ven0Var2) {
        super(2);
        this.a = (byte) 16;
        this.d = zej1Var;
        this.c = str;
        this.e = function0;
        this.f = function1;
        this.g = function2;
        this.h = vu30Var;
        this.i = iu30Var;
        this.t = ven0Var;
        this.b = ven0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx(zej1 zej1Var, Function0 function0, String str, Function0 function1, Function0 function2, Function0 function3, qim0 qim0Var, vu30 vu30Var, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 17;
        this.d = zej1Var;
        this.e = function0;
        this.c = str;
        this.f = function1;
        this.g = function2;
        this.h = function3;
        this.b = qim0Var;
        this.i = vu30Var;
        this.t = iu30Var;
    }
}
