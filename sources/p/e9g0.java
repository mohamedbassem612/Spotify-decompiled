package p;

import android.net.Uri;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class e9g0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9g0(rqm0 rqm0Var, d0r d0rVar, l7p l7pVar, h0p h0pVar, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 10;
        this.b = rqm0Var;
        this.d = d0rVar;
        this.c = l7pVar;
        this.e = h0pVar;
        this.f = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        rih1 rih1Var;
        String strK;
        int i;
        byte b = this.a;
        h2c h2cVar = h2c.a;
        f36 f36Var = h36.c;
        nim0 nim0Var = nim0.a;
        n4k n4kVar = hmb0.t1;
        rih1 rih1Var2 = rih1.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                jon1.a((ffs0) obj7, (a9g0) obj6, (d0r) obj5, (sjq0) obj4, (xx21) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 1:
                ((Number) obj2).intValue();
                lrn1.n((String) obj7, (c380) obj6, (Integer) obj5, (Integer) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 2:
                ((Number) obj2).intValue();
                ((ezg0) obj7).f((ksw) obj6, (uyg0) obj5, (iu30) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 3:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                bbh0 bbh0Var = (bbh0) obj7;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ryx ryxVar = (ryx) obj6;
                    ywo1.b(o4o1.n(bbh0Var, x340Var2), ryxVar, null, (mfv0) obj5, apo.r(-1816186069, new w0f0((Object) ryxVar, obj4, obj3, (Object) bbh0Var, (byte) 9), x340Var2), x340Var2, 24576, 4);
                } else {
                    x340Var2.b0();
                }
                return rih1Var2;
            case 4:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj4;
                hob1 hob1Var = (hob1) obj7;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (hob1Var.u != null) {
                        x340Var4.i0(1822492520);
                        znb0 znb0Var = (znb0) obj6;
                        znb0 znb0Var2 = (znb0) obj5;
                        x340Var4.i0(2112155872);
                        uiv0 uiv0Var = hob1Var.r;
                        if (uiv0Var == null || znb0Var == null) {
                            rih1Var = null;
                        } else {
                            otw.c((maa) znb0Var.getValue(), uiv0Var, (qim0) null, (ipb1) null, x340Var4, 0, 12);
                            rih1Var = rih1Var2;
                        }
                        x340Var4.r(false);
                        if (rih1Var == null) {
                            x340Var4.i0(1052475517);
                            wiv0 wiv0Var = hob1Var.q;
                            if (wiv0Var != null && znb0Var2 != null) {
                                maa maaVar = (maa) znb0Var2.getValue();
                                boolean zG = x340Var4.g(iu30Var);
                                Object objT = x340Var4.T();
                                if (zG || objT == fkj0.X) {
                                    objT = new mhg0(iu30Var, (byte) 21);
                                    x340Var4.s0(objT);
                                }
                                otw.c(maaVar, wiv0.a(wiv0Var, (iu30) objT), (qim0) null, (ipb1) null, x340Var4, 8, 12);
                            }
                            z = false;
                            x340Var4.r(false);
                        } else {
                            z = false;
                            x340Var4.i0(2112156124);
                            x340Var4.r(false);
                        }
                    } else {
                        z = false;
                        x340Var4.i0(1822493321);
                        rpo1.j(hob1Var, (znb0) obj3, iu30Var, x340Var4);
                    }
                    x340Var4.r(z);
                } else {
                    x340Var4.b0();
                }
                return rih1Var2;
            case 5:
                ((Number) obj2).intValue();
                ((r4k0) obj7).h((c380) obj6, (vzq0) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 6:
                ((Number) obj2).intValue();
                l3p1.n((String) obj7, (jo70) obj6, (xkk1) obj5, (qim0) obj4, (j2i) obj3, (b0k) obj, czo1.p(27649));
                return rih1Var2;
            case 7:
                iu30 iu30Var2 = (iu30) obj5;
                tv80 tv80Var = (tv80) obj2;
                iu30 iu30Var3 = (iu30) obj7;
                int iOrdinal = ((qek0) obj).ordinal();
                if (iOrdinal == 0) {
                    iu30Var3.invoke(new cek0(tv80Var));
                    fn31.T((c9n) obj6, (o8n) null, 0, new ary((jek0) obj4, (vdk0) obj3, (iu30) obj7, tv80Var, iu30Var2, (lnm) null), 3);
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    iu30Var3.invoke(dek0.a);
                    iu30Var2.invoke(rdk0.a);
                }
                return rih1Var2;
            case 8:
                ((Number) obj2).intValue();
                ((pfk0) obj7).e((bek0) obj6, (Function0) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 9:
                ((Number) obj2).intValue();
                t3p1.l((fkc1) obj7, (kkk0) obj6, (iu30) obj5, (xsk) obj4, (hvj0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 10:
                ((Number) obj2).intValue();
                yah0.g((rqm0) obj7, (d0r) obj5, (l7p) obj6, (h0p) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                iho1.h((xho0) obj7, (qim0) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                ajo1.f((mlo0) obj7, (iu30) obj6, (llo0) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 13:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    rpo0 rpo0Var = (rpo0) obj7;
                    iu30 iu30Var4 = (iu30) obj6;
                    res resVar = (res) obj5;
                    ven0 ven0Var = (ven0) obj4;
                    bs91 bs91Var = (bs91) obj3;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM = x340Var6.m();
                    qim0 qim0VarE = zr7.E(x340Var6, nim0Var);
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
                    nko1.H(gfh0VarC, x340Var6, y580.O0);
                    nko1.H(xos0VarM, x340Var6, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var6, y580.R0);
                    nko1.F(x340Var6);
                    nko1.H(qim0VarE, x340Var6, y580.Y);
                    qim0 qim0VarZ = u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3);
                    qti1 qti1Var = voo1.g;
                    qim0 qim0VarY = voo1.y(qim0VarZ, qti1Var);
                    boolean zG2 = x340Var6.g(rpo0Var) | x340Var6.g(iu30Var4) | x340Var6.i(resVar);
                    Object objT2 = x340Var6.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = new mvn0(resVar, rpo0Var, iu30Var4, (byte) 4);
                        x340Var6.s0(objT2);
                    }
                    iu30 iu30Var5 = (iu30) objT2;
                    boolean zG3 = x340Var6.g(rpo0Var) | x340Var6.i(ven0Var);
                    Object objT3 = x340Var6.T();
                    if (zG3 || objT3 == m4cVar) {
                        objT3 = new j9n0(rpo0Var, ven0Var, (byte) 18);
                        x340Var6.s0(objT3);
                    }
                    dm5.a(iu30Var5, qim0VarY, (iu30) objT3, x340Var6, 0, 0);
                    sok.k(bs91Var, voo1.y(h2cVar.a(nim0Var, een.X), qti1Var), e4j.a, x340Var6, 384, 0);
                    x340Var6.r(true);
                } else {
                    x340Var6.b0();
                }
                return rih1Var2;
            case 14:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ((rzo0) obj7).j((bab1) obj6, (th61) obj5, (ods) obj4, (wen0) obj3, (qim0) null, x340Var8, 0);
                } else {
                    x340Var8.b0();
                }
                return rih1Var2;
            case 15:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    qim0 qim0VarL = bmq0.L(nim0Var, (d6o0) obj7, (g6o0) null);
                    kvq0 kvq0Var = (kvq0) obj6;
                    Function0 function0 = (Function0) obj5;
                    iu30 iu30Var6 = (iu30) obj4;
                    ven0 ven0Var2 = (ven0) obj3;
                    gfh0 gfh0VarC2 = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(x340Var10.T);
                    xos0 xos0VarM2 = x340Var10.m();
                    qim0 qim0VarE2 = zr7.E(x340Var10, qim0VarL);
                    hzj.A.getClass();
                    if (x340Var10.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var10.m0();
                    if (x340Var10.S) {
                        x340Var10.l(n4kVar);
                    } else {
                        x340Var10.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var10, y580.O0);
                    nko1.H(xos0VarM2, x340Var10, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var10, y580.R0);
                    nko1.F(x340Var10);
                    nko1.H(qim0VarE2, x340Var10, y580.Y);
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    boolean zG4 = x340Var10.g(iu30Var6);
                    Object objT4 = x340Var10.T();
                    if (zG4 || objT4 == fkj0.X) {
                        objT4 = new gp0(iu30Var6, ven0Var2, (byte) 28);
                        x340Var10.s0(objT4);
                    }
                    obg1.i(kvq0Var, qim0VarF, function0, (iu30) objT4, x340Var10, 48);
                    x340Var10.r(true);
                } else {
                    x340Var10.b0();
                }
                return rih1Var2;
            case 16:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                vzq0 vzq0Var = (vzq0) obj7;
                x340 x340Var12 = x340Var11;
                boolean zY = x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2);
                j06 j06Var = x340Var12.a;
                if (zY) {
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var12).b;
                    cvx cvxVar2 = cbx.b(x340Var12).b;
                    float fA = vzq0Var.a();
                    nim0 nim0Var2 = nim0.a;
                    qim0 qim0VarF2 = u291.f(uyn1.B(nim0Var2, 16.0f, 0.0f, 16.0f, fA, 2), 1.0f);
                    mya0 mya0Var = (mya0) obj6;
                    yq00 yq00Var = mya0Var.f;
                    shg1 shg1Var = (shg1) obj5;
                    iu30 iu30Var7 = (iu30) obj4;
                    String str = (String) obj3;
                    mbh mbhVarA = jbh.a(f36Var, een.P0, x340Var12, 0);
                    int iHashCode3 = Long.hashCode(x340Var12.T);
                    xos0 xos0VarM3 = x340Var12.m();
                    qim0 qim0VarE3 = zr7.E(x340Var12, qim0VarF2);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var12.m0();
                    if (x340Var12.S) {
                        x340Var12.l(n4kVar);
                    } else {
                        x340Var12.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(mbhVarA, x340Var12, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM3, x340Var12, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode3);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var12, lljVar3);
                    nko1.F(x340Var12);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE3, x340Var12, lljVar4);
                    float fD = vzq0Var.d();
                    cvx cvxVar3 = cbx.b(x340Var12).b;
                    op71.g(x340Var12, u291.r(nim0Var2, fD + 16.0f));
                    String strO0 = cwl1.o0(x340Var12, 2131957089);
                    qim0 qim0VarF3 = u291.f(nim0Var2, 1.0f);
                    jw31 jw31VarA = ew31.a(h36.e, een.Z, x340Var12, 0);
                    int iHashCode4 = Long.hashCode(x340Var12.T);
                    xos0 xos0VarM4 = x340Var12.m();
                    qim0 qim0VarE4 = zr7.E(x340Var12, qim0VarF3);
                    x340Var12.m0();
                    if (x340Var12.S) {
                        x340Var12.l(n4kVar);
                    } else {
                        x340Var12.v0();
                    }
                    nko1.H(jw31VarA, x340Var12, lljVar);
                    nko1.H(xos0VarM4, x340Var12, lljVar2);
                    x0d.q(iHashCode4, x340Var12, lljVar3, x340Var12);
                    nko1.H(qim0VarE4, x340Var12, lljVar4);
                    String str2 = mya0Var.d;
                    Uri uri = str2 != null ? Uri.parse(str2) : Uri.EMPTY;
                    uri.getClass();
                    String str3 = mya0Var.c;
                    boolean zG5 = x340Var12.g(strO0);
                    Object objT5 = x340Var12.T();
                    if (zG5 || objT5 == m4cVar2) {
                        objT5 = new atp0(strO0, (byte) 8);
                        x340Var12.s0(objT5);
                    }
                    bmq0.a(uri, s161.b(nim0Var2, true, (iu30) objT5), hcx.d, str3, (String) null, 0L, 0L, false, x340Var12, 384, 240);
                    x340Var12.r(true);
                    cvx cvxVar4 = cbx.b(x340Var12).b;
                    op71.g(x340Var12, u291.r(nim0Var2, 8.0f));
                    String str4 = mya0Var.c;
                    lee1 lee1Var = cbx.d(x340Var12).d;
                    qim0 qim0VarF4 = u291.f(nim0Var2, 1.0f);
                    cvx cvxVar5 = cbx.b(x340Var12).b;
                    qim0 qim0VarZ2 = uyn1.z(16.0f, 0.0f, 2, qim0VarF4);
                    Object objT6 = x340Var12.T();
                    if (objT6 == m4cVar2) {
                        objT6 = q4r0.e1;
                        x340Var12.s0(objT6);
                    }
                    uwo1.e(str4, s161.b(qim0VarZ2, false, (iu30) objT6), lee1Var, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var12, 0, 0, 2024);
                    String strJ = kk0.j(cbx.b(x340Var12).b.a, 2131959608, x340Var12, x340Var12, nim0Var2);
                    lee1 lee1Var2 = cbx.d(x340Var12).e;
                    Object objT7 = x340Var12.T();
                    if (objT7 == m4cVar2) {
                        objT7 = wvr0.b;
                        x340Var12.s0(objT7);
                    }
                    uwo1.e(strJ, s161.b(nim0Var2, false, (iu30) objT7), lee1Var2, 0L, null, null, 0, false, null, 0, null, x340Var12, 0, 0, 2040);
                    cvx cvxVar6 = cbx.b(x340Var12).b;
                    op71.g(x340Var12, u291.r(nim0Var2, 16.0f));
                    dxo1.h(yq00Var, mya0Var.g, null, x340Var12, 0);
                    cvx cvxVar7 = cbx.b(x340Var12).b;
                    op71.g(x340Var12, u291.r(nim0Var2, 16.0f));
                    xq00 xq00Var = yq00Var instanceof xq00 ? (xq00) yq00Var : null;
                    if (xq00Var != null) {
                        x340Var12.i0(1938705095);
                        strK = cwl1.n0(2131959610, new Object[]{xq00Var.a}, x340Var12);
                        x340Var12.r(false);
                    } else {
                        strK = x0d.k(x340Var12, 1938883345, 2131959613, x340Var12, false);
                    }
                    uwo1.e(strK, null, cbx.d(x340Var12).j, 0L, null, null, 0, false, null, 0, null, x340Var12, 0, 0, 2042);
                    op71.g(x340Var12, u291.r(nim0Var2, cbx.b(x340Var12).b.c));
                    s110.d(mya0Var.e, apo.r(822671533, new qya0(shg1Var, str, iu30Var7, (byte) 1), x340Var12), x340Var12, 48);
                    String strN0 = cwl1.n0(2131957083, new Object[]{kk0.j(cbx.b(x340Var12).b.a, 2131957084, x340Var12, x340Var12, nim0Var2)}, x340Var12);
                    c9 c9VarS = mqo1.s(new mae1(cwl1.o0(x340Var12, 2131957084), "https://support.spotify.com/article/managed-accounts-for-premium-family/plain/"));
                    boolean zI = x340Var12.i(shg1Var) | x340Var12.g(iu30Var7);
                    Object objT8 = x340Var12.T();
                    if (zI || objT8 == m4cVar2) {
                        objT8 = new rya0(shg1Var, iu30Var7, (byte) 1);
                        x340Var12.s0(objT8);
                    }
                    i8p1.i(strN0, c9VarS, (iu30) objT8, null, null, 0L, 0L, x340Var12, 0, 120);
                    String strN1 = cwl1.n0(2131957081, new Object[]{cwl1.o0(x340Var12, 2131957082)}, x340Var12);
                    c9 c9VarS2 = mqo1.s(new mae1(cwl1.o0(x340Var12, 2131957082), "https://www.spotify.com/legal/managed-account-parent-guardian-privacy-policy/plain/"));
                    boolean zI2 = x340Var12.i(shg1Var) | x340Var12.g(iu30Var7);
                    Object objT9 = x340Var12.T();
                    if (zI2 || objT9 == m4cVar2) {
                        objT9 = new rya0(shg1Var, iu30Var7, (byte) 2);
                        x340Var12.s0(objT9);
                    }
                    i8p1.i(strN1, c9VarS2, (iu30) objT9, null, null, 0L, 0L, x340Var12, 0, 120);
                    cvx cvxVar8 = cbx.b(x340Var12).b;
                    ywx0.n(nim0Var2, 16.0f, x340Var12, true);
                } else {
                    x340Var12.b0();
                }
                return rih1Var2;
            case 17:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    Function0 function1 = (Function0) obj7;
                    String str5 = (String) obj6;
                    ccs0 ccs0Var = (ccs0) obj5;
                    iu30 iu30Var8 = (iu30) obj4;
                    Function0 function2 = (Function0) obj3;
                    mbh mbhVarA2 = jbh.a(f36Var, een.P0, x340Var14, 0);
                    int iHashCode5 = Long.hashCode(x340Var14.T);
                    xos0 xos0VarM5 = x340Var14.m();
                    qim0 qim0VarE5 = zr7.E(x340Var14, nim0Var);
                    hzj.A.getClass();
                    if (x340Var14.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var14.m0();
                    if (x340Var14.S) {
                        x340Var14.l(n4kVar);
                    } else {
                        x340Var14.v0();
                    }
                    nko1.H(mbhVarA2, x340Var14, y580.O0);
                    nko1.H(xos0VarM5, x340Var14, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode5), x340Var14, y580.R0);
                    nko1.F(x340Var14);
                    nko1.H(qim0VarE5, x340Var14, y580.Y);
                    yoo1.c(0, str5, function1, x340Var14);
                    tqw0 tqw0VarG = ccs0Var.g();
                    if (tqw0VarG == null) {
                        x340Var14.i0(-1375710270);
                        x340Var14.r(false);
                    } else {
                        x340Var14.i0(-1375710269);
                        i1k0.g(tqw0VarG, iu30Var8, (qim0) null, (mr20) null, (mr20) null, function2, (gpv0) null, x340Var14, 0, 92);
                        x340Var14.r(false);
                    }
                    x340Var14.r(true);
                } else {
                    x340Var14.b0();
                }
                return rih1Var2;
            case 18:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    i1k0.g((tqw0) obj7, (iu30) obj6, (qim0) null, (mr20) obj5, (mr20) obj4, (Function0) null, (gpv0) obj3, x340Var16, 0, 36);
                } else {
                    x340Var16.b0();
                }
                return rih1Var2;
            case 19:
                ((Number) obj2).intValue();
                wro1.v((String) obj7, (cns0) obj6, (Function0) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                suo1.q((z1t0) obj7, (swa0) obj6, (xk) obj5, (v1t0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 21:
                ((Number) obj2).intValue();
                axo1.c((w4t0) obj7, (a5t0) obj6, (pxp) obj5, (qxp) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 22:
                ((Number) obj2).intValue();
                t2p1.c((String) obj7, (String) obj6, (c380) obj5, (t0r0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 23:
                ((Number) obj2).intValue();
                ucp1.e((jlv0) obj7, (qim0) obj6, (Function0) obj5, (Function0) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 24:
                ((Number) obj2).intValue();
                lcc.r((String) obj7, (qim0) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 25:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                r8s r8sVar = (r8s) obj5;
                tob1 tob1Var = (tob1) obj6;
                m4c m4cVar3 = fkj0.X;
                fxv0 fxv0Var = (fxv0) obj7;
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    vuv0 vuv0Var = fxv0Var.a;
                    boolean zI3 = x340Var18.i(tob1Var);
                    Object objT10 = x340Var18.T();
                    if (zI3 || objT10 == m4cVar3) {
                        objT10 = new bu2(tob1Var, (byte) 16);
                        x340Var18.s0(objT10);
                    }
                    Function0 function3 = (Function0) objT10;
                    gw70 gw70Var = (gw70) r8sVar.c;
                    esv0 esv0Var = (esv0) r8sVar.e;
                    v760 v760Var = (v760) obj4;
                    boolean zI4 = x340Var18.i(r8sVar) | x340Var18.i(fxv0Var) | x340Var18.g(iu30Var9);
                    Object objT11 = x340Var18.T();
                    if (zI4 || objT11 == m4cVar3) {
                        objT11 = new ozu0(r8sVar, fxv0Var, iu30Var9, (byte) 5);
                        x340Var18.s0(objT11);
                    }
                    iu30 iu30Var10 = (iu30) objT11;
                    boolean zG6 = x340Var18.g(iu30Var9);
                    Object objT12 = x340Var18.T();
                    if (zG6 || objT12 == m4cVar3) {
                        objT12 = new ppv0(iu30Var9, (byte) 3);
                        x340Var18.s0(objT12);
                    }
                    upf.b(vuv0Var, function3, gw70Var, esv0Var, v760Var, iu30Var10, (iu30) objT12, null, x340Var18, 0);
                } else {
                    x340Var18.b0();
                }
                return rih1Var2;
            case 26:
                ((Number) obj2).intValue();
                kkn.g((e9w0) obj7, (ArrayList) obj6, (o8w0) obj5, (s8w0) obj4, (qim0) obj3, (b0k) obj, czo1.p(4097));
                return rih1Var2;
            case 27:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                boolean zY2 = x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2);
                j06 j06Var2 = x340Var20.a;
                if (!zY2) {
                    x340Var20.b0();
                    return rih1Var2;
                }
                uwr uwrVar2 = cbx.a;
                float f = cbx.b(x340Var20).e.b;
                long jA = cbx.a(x340Var20).a.a.a();
                yla.r(x340Var20);
                float f2 = 80.0f + f;
                qim0 qim0VarF5 = dug.f(u291.d(nim0Var, 1.0f), jA, d4o1.a);
                Function0 function4 = (Function0) obj7;
                t7w0 t7w0Var = (t7w0) obj6;
                Function0 function5 = (Function0) obj5;
                e9w0 e9w0Var = (e9w0) obj4;
                s8w0 s8w0Var = (s8w0) obj3;
                era eraVar = een.P0;
                mbh mbhVarA3 = jbh.a(f36Var, eraVar, x340Var20, 0);
                int iHashCode6 = Long.hashCode(x340Var20.T);
                xos0 xos0VarM6 = x340Var20.m();
                qim0 qim0VarE6 = zr7.E(x340Var20, qim0VarF5);
                hzj.A.getClass();
                if (j06Var2 == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var20.m0();
                if (x340Var20.S) {
                    x340Var20.l(n4kVar);
                } else {
                    x340Var20.v0();
                }
                llj lljVar5 = y580.O0;
                nko1.H(mbhVarA3, x340Var20, lljVar5);
                llj lljVar6 = y580.N0;
                nko1.H(xos0VarM6, x340Var20, lljVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode6);
                llj lljVar7 = y580.R0;
                nko1.H(numValueOf2, x340Var20, lljVar7);
                nko1.F(x340Var20);
                llj lljVar8 = y580.Y;
                nko1.H(qim0VarE6, x340Var20, lljVar8);
                crm0.j(cwl1.o0(x340Var20, 2131952910), (qim0) null, new ufq0(1, function4), (qfq0) null, x340Var20, 0, 10);
                qim0 qim0VarH = kx40.h(1.0f, u291.d(nim0Var, 1.0f), true);
                gfh0 gfh0VarC3 = t1c.c(een.d, false);
                int iHashCode7 = Long.hashCode(x340Var20.T);
                xos0 xos0VarM7 = x340Var20.m();
                qim0 qim0VarE7 = zr7.E(x340Var20, qim0VarH);
                x340Var20.m0();
                if (x340Var20.S) {
                    x340Var20.l(n4kVar);
                } else {
                    x340Var20.v0();
                }
                nko1.H(gfh0VarC3, x340Var20, lljVar5);
                nko1.H(xos0VarM7, x340Var20, lljVar6);
                x0d.q(iHashCode7, x340Var20, lljVar7, x340Var20);
                nko1.H(qim0VarE7, x340Var20, lljVar8);
                qim0 qim0VarA = uyn1.A(l6o1.H(u291.d(nim0Var, 1.0f), l6o1.C(0, 0, 1, x340Var20), false, 14), f, f, f, f2);
                mbh mbhVarA4 = jbh.a(new d36(cbx.b(x340Var20).b.b, true, new um5(false)), eraVar, x340Var20, 0);
                int iHashCode8 = Long.hashCode(x340Var20.T);
                xos0 xos0VarM8 = x340Var20.m();
                qim0 qim0VarE8 = zr7.E(x340Var20, qim0VarA);
                x340Var20.m0();
                if (x340Var20.S) {
                    x340Var20.l(n4kVar);
                } else {
                    x340Var20.v0();
                }
                nko1.H(mbhVarA4, x340Var20, lljVar5);
                nko1.H(xos0VarM8, x340Var20, lljVar6);
                x0d.q(iHashCode8, x340Var20, lljVar7, x340Var20);
                nko1.H(qim0VarE8, x340Var20, lljVar8);
                a8o.l(e9w0Var, x340Var20, 0);
                a8o.u(e9w0Var, s8w0Var, x340Var20, 64);
                ArrayList arrayList = e9w0Var.i;
                if (arrayList.isEmpty()) {
                    i = 0;
                    x340Var20.i0(-1261479079);
                    x340Var20.r(false);
                } else {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i = 0;
                            x340Var20.i0(-1261479079);
                            x340Var20.r(false);
                        } else if (!(((k9w0) it.next()) instanceof j9w0)) {
                            x340Var20.i0(-1261528090);
                            i = 0;
                            a8o.f(e9w0Var.i, x340Var20, 0);
                            x340Var20.r(false);
                        }
                    }
                }
                x340Var20.r(true);
                a8o.k(i, function5, x340Var20, h2cVar.a(nim0Var, een.X), t7w0Var.c);
                x340Var20.r(true);
                x340Var20.r(true);
                return rih1Var2;
            case 28:
                ((Number) obj2).intValue();
                pqo.d((e8w0) obj7, (smp0) obj6, (vu30) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            default:
                ((Number) obj2).intValue();
                nmn1.f((umx0) obj7, (j2i) obj6, (j2i) obj5, (j2i) obj4, (qim0) obj3, (b0k) obj, czo1.p(3505));
                return rih1Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e9g0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e9g0(byte b, int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
