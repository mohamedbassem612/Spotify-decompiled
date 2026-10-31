package p;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.wrapped.v1.proto.Paragraph;
import j$.time.ZoneId;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mb90 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb90(jx90 jx90Var, y5a0 y5a0Var, iu30 iu30Var) {
        super(2);
        this.a = (byte) 9;
        this.b = jx90Var;
        this.c = y5a0Var;
        this.d = iu30Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        byte b2 = 2;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                nln.f((Paragraph) obj5, (Paragraph) obj4, (tob1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    f490 f490Var = (f490) obj5;
                    f490 f490Var2 = (f490) obj4;
                    p350 p350Var = (p350) obj3;
                    mbh mbhVarA = jbh.a(new d36(4.0f, true, new um5(false)), een.P0, x340Var2, 0);
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
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(mbhVarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    s110.e(0, cwl1.o0(x340Var2, 2131956743), f490Var, x340Var2);
                    s110.e(0, cwl1.o0(x340Var2, 2131956758), f490Var2, x340Var2);
                    s110.e(0, cwl1.o0(x340Var2, 2131956742), p350Var, x340Var2);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                exd0.e((xp90) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 3:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    vx40 vx40Var = (vx40) obj5;
                    ((q3b1) vx40Var.c).b(70, apo.r(-1990012338, new iq90((j2i) obj4, vx40Var, (ViewGroup) obj3, (byte) 0), x340Var4), x340Var4);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ye90 ye90Var = (ye90) obj5;
                    ((q3b1) ye90Var.c).b(70, apo.r(1842568681, new iq90((j2i) obj4, ye90Var, (ViewGroup) obj3, (byte) 1), x340Var6), x340Var6);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                rqg0.g((wr90) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ouz ouzVar = (ouz) ((res) obj5).d;
                    tt90 tt90Var = (tt90) obj4;
                    boolean zG = x340Var8.g(iu30Var);
                    Object objT = x340Var8.T();
                    if (zG || objT == m4cVar) {
                        objT = new zi80(iu30Var, (byte) 20);
                        x340Var8.s0(objT);
                    }
                    Function0 function0 = (Function0) objT;
                    boolean zG2 = x340Var8.g(iu30Var);
                    Object objT2 = x340Var8.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = new zi80(iu30Var, (byte) 21);
                        x340Var8.s0(objT2);
                    }
                    Function0 function1 = (Function0) objT2;
                    boolean zG3 = x340Var8.g(iu30Var);
                    Object objT3 = x340Var8.T();
                    if (zG3 || objT3 == m4cVar) {
                        objT3 = new zi80(iu30Var, (byte) 22);
                        x340Var8.s0(objT3);
                    }
                    ouzVar.i(tt90Var, function0, function1, (Function0) objT3, x340Var8, 0);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                crm0.c((List) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                hqq0.i((hx90) obj5, (y5a0) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                hx90 hx90Var = (jx90) obj5;
                x340 x340Var10 = x340Var9;
                if (!x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x340Var10.b0();
                } else if (hx90Var instanceof hx90) {
                    x340Var10.i0(1405574861);
                    hqq0.i(hx90Var, (y5a0) obj4, iu30Var2, x340Var10, 0);
                    x340Var10.r(false);
                } else {
                    if (!(hx90Var instanceof fx90)) {
                        throw p3d1.k(x340Var10, 1405573872, false);
                    }
                    x340Var10.i0(1405577553);
                    hqq0.h(iu30Var2, x340Var10, 0);
                    x340Var10.r(false);
                }
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                rqt0.k((az90) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                iu30 iu30Var3 = (iu30) obj3;
                qc0 qc0Var = (qc0) obj4;
                st60 st60Var = (st60) obj5;
                x340 x340Var12 = x340Var11;
                boolean zY = x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2);
                rih1 rih1Var2 = rih1.a;
                if (zY) {
                    int iC = l1d.C(qc0Var.h ? (byte) 1 : (byte) 2);
                    if (iC == 0) {
                        x340Var12.i0(-418081412);
                        boolean zG4 = x340Var12.g(iu30Var3);
                        Object objT4 = x340Var12.T();
                        if (zG4 || objT4 == fkj0.X) {
                            objT4 = new ux90(iu30Var3, (byte) 3);
                            x340Var12.s0(objT4);
                        }
                        w2g0.f(0, (Function0) objT4, x340Var12, (qim0) null);
                        x340Var12.r(false);
                    } else {
                        if (iC != 1) {
                            throw p3d1.k(x340Var12, -418084503, false);
                        }
                        x340Var12.i0(-418075742);
                        otw.c((gmn) ((hl00) st60Var.b).b, rih1Var2, (qim0) null, (ipb1) null, x340Var12, 48, 12);
                        x340Var12.r(false);
                    }
                    if (qc0Var.m) {
                        x340Var12.i0(-75336992);
                        otw.c((yup0) st60Var.c, rih1Var2, (qim0) null, (ipb1) null, x340Var12, 56, 12);
                        x340Var12.r(false);
                    } else {
                        x340Var12.i0(-75247619);
                        x340Var12.r(false);
                    }
                } else {
                    x340Var12.b0();
                }
                return rih1Var2;
            case grn1.d /* 12 */:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    uic uicVar = (uic) ((z72) obj5).e;
                    kba0 kba0Var = (kba0) obj4;
                    boolean zG5 = x340Var14.g(iu30Var4);
                    Object objT5 = x340Var14.T();
                    if (zG5 || objT5 == m4cVar2) {
                        objT5 = new bv70(iu30Var4, (byte) 20);
                        x340Var14.s0(objT5);
                    }
                    iu30 iu30Var5 = (iu30) objT5;
                    boolean zG6 = x340Var14.g(iu30Var4);
                    Object objT6 = x340Var14.T();
                    if (zG6 || objT6 == m4cVar2) {
                        objT6 = new bv70(iu30Var4, (byte) 21);
                        x340Var14.s0(objT6);
                    }
                    iu30 iu30Var6 = (iu30) objT6;
                    boolean zG7 = x340Var14.g(iu30Var4);
                    Object objT7 = x340Var14.T();
                    if (zG7 || objT7 == m4cVar2) {
                        objT7 = new ux90(iu30Var4, (byte) 15);
                        x340Var14.s0(objT7);
                    }
                    uicVar.a(kba0Var, iu30Var5, iu30Var6, (Function0) objT7, (qim0) null, x340Var14, 0);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                m4c m4cVar3 = fkj0.X;
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ulc ulcVar = (ulc) ((pzw) obj5).d;
                    xca0 xca0Var = (xca0) obj4;
                    boolean zG8 = x340Var16.g(iu30Var7);
                    Object objT8 = x340Var16.T();
                    if (zG8 || objT8 == m4cVar3) {
                        objT8 = new ux90(iu30Var7, (byte) 16);
                        x340Var16.s0(objT8);
                    }
                    Function0 function2 = (Function0) objT8;
                    boolean zG9 = x340Var16.g(iu30Var7);
                    Object objT9 = x340Var16.T();
                    if (zG9 || objT9 == m4cVar3) {
                        objT9 = new ux90(iu30Var7, (byte) 17);
                        x340Var16.s0(objT9);
                    }
                    Function0 function3 = (Function0) objT9;
                    boolean zG10 = x340Var16.g(iu30Var7);
                    Object objT10 = x340Var16.T();
                    if (zG10 || objT10 == m4cVar3) {
                        objT10 = new ux90(iu30Var7, (byte) 18);
                        x340Var16.s0(objT10);
                    }
                    ulcVar.g(xca0Var, function2, function3, (Function0) objT10, (qim0) null, x340Var16, 0);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 14:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                m4c m4cVar4 = fkj0.X;
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    eoc eocVar = (eoc) ((dea0) obj5).e;
                    wda0 wda0Var = (wda0) obj4;
                    boolean zG11 = x340Var18.g(iu30Var8);
                    Object objT11 = x340Var18.T();
                    if (zG11 || objT11 == m4cVar4) {
                        objT11 = new ux90(iu30Var8, (byte) 19);
                        x340Var18.s0(objT11);
                    }
                    Function0 function4 = (Function0) objT11;
                    boolean zG12 = x340Var18.g(iu30Var8);
                    Object objT12 = x340Var18.T();
                    if (zG12 || objT12 == m4cVar4) {
                        objT12 = new ux90(iu30Var8, (byte) 20);
                        x340Var18.s0(objT12);
                    }
                    Function0 function5 = (Function0) objT12;
                    boolean zG13 = x340Var18.g(iu30Var8);
                    Object objT13 = x340Var18.T();
                    if (zG13 || objT13 == m4cVar4) {
                        objT13 = new ux90(iu30Var8, (byte) 21);
                        x340Var18.s0(objT13);
                    }
                    Function0 function6 = (Function0) objT13;
                    boolean zG14 = x340Var18.g(iu30Var8);
                    Object objT14 = x340Var18.T();
                    if (zG14 || objT14 == m4cVar4) {
                        objT14 = new ux90(iu30Var8, (byte) 22);
                        x340Var18.s0(objT14);
                    }
                    eocVar.a(wda0Var, function4, function5, function6, (Function0) objT14, (qim0) null, x340Var18, 0);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                d1o1.e((k9e) obj5, (v4b0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                o4o1.c((dab0) obj5, (qim0) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                l6o1.k((fcb0) obj5, (ecb0) obj4, (i8h1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                ((edb0) obj5).F((kcb0) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                too1.d((fwb0) obj5, (vu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    cxb0 cxb0Var = (cxb0) obj4;
                    ((kxb0) obj5).e(cxb0Var.a, cxb0Var.b, cxb0Var.c, (iu30) obj3, x340Var20, 0);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 21:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                m4c m4cVar5 = fkj0.X;
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    qim0 qim0VarB = uyn1.B(u291.f(nim0Var, 1.0f), 0.0f, 0.0f, 0.0f, ((vzq0) obj5).a(), 7);
                    n2c0 n2c0Var = (n2c0) obj4;
                    iu30 iu30Var9 = (iu30) obj3;
                    mbh mbhVarA2 = jbh.a(h36.c, een.P0, x340Var22, 0);
                    int iHashCode2 = Long.hashCode(x340Var22.T);
                    xos0 xos0VarM2 = x340Var22.m();
                    qim0 qim0VarE2 = zr7.E(x340Var22, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var22.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var22.m0();
                    if (x340Var22.S) {
                        x340Var22.l(n4kVar);
                    } else {
                        x340Var22.v0();
                    }
                    nko1.H(mbhVarA2, x340Var22, y580.O0);
                    nko1.H(xos0VarM2, x340Var22, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var22, y580.R0);
                    nko1.F(x340Var22);
                    nko1.H(qim0VarE2, x340Var22, y580.Y);
                    yq00 yq00Var = n2c0Var.e;
                    tpw0 tpw0Var = n2c0Var.c;
                    yxa0 yxa0Var = n2c0Var.d;
                    if (yq00Var instanceof wq00) {
                        x340Var22.i0(-185943291);
                        zod.c(0, x340Var22, iu30Var9, (qim0) null);
                        x340Var22.r(false);
                    } else {
                        if (!(yq00Var instanceof xq00)) {
                            throw p3d1.k(x340Var22, -185945551, false);
                        }
                        x340Var22.i0(-185940632);
                        aq8.l(0, x340Var22, iu30Var9, null);
                        x340Var22.r(false);
                    }
                    String strO0 = cwl1.o0(x340Var22, 2131957035);
                    boolean z = n2c0Var.g;
                    long jQ = f0o1.q(yxa0Var, x340Var22);
                    boolean zG15 = x340Var22.g(iu30Var9);
                    Object objT15 = x340Var22.T();
                    if (zG15 || objT15 == m4cVar5) {
                        objT15 = new jwa0(iu30Var9, (byte) 6);
                        x340Var22.s0(objT15);
                    }
                    yxo1.b(strO0, z, jQ, (iu30) objT15, anm1.N("parent_guardian_checkbox", nim0Var), x340Var22, 0);
                    if (tpw0Var == tpw0.e) {
                        x340Var22.i0(-1468701502);
                        String strO1 = cwl1.o0(x340Var22, 2131957033);
                        boolean z2 = n2c0Var.h;
                        long jQ2 = f0o1.q(yxa0Var, x340Var22);
                        boolean zG16 = x340Var22.g(iu30Var9);
                        Object objT16 = x340Var22.T();
                        if (zG16 || objT16 == m4cVar5) {
                            objT16 = new jwa0(iu30Var9, (byte) 7);
                            x340Var22.s0(objT16);
                        }
                        yxo1.b(strO1, z2, jQ2, (iu30) objT16, anm1.N("privacy_policy_checkbox", nim0Var), x340Var22, 0);
                        x340Var22.r(false);
                    } else {
                        x340Var22.i0(-1468208509);
                        x340Var22.r(false);
                    }
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var22).b;
                    op71.g(x340Var22, u291.h(nim0Var, 16.0f));
                    s110.d(yxa0Var, apo.r(668554849, new iwa0(iu30Var9, n2c0Var, b2), x340Var22), x340Var22, 48);
                    mqo1.k(iu30Var9, x340Var22, 0);
                    mqo1.i(tpw0Var, iu30Var9, x340Var22, 0);
                    mqo1.l(iu30Var9, x340Var22, 0);
                    x0d.s(nim0Var, cbx.b(x340Var22).b.a, x340Var22, true);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 22:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    bby bbyVar = oec0.a;
                    fq7.g(((Boolean) ((ven0) obj5).getValue()).booleanValue(), (qim0) null, oec0.a, ln00.b, (String) null, apo.r(-84399363, new h6a0((iu30) obj4, (Context) obj3, (byte) 9), x340Var24), x340Var24, 196992, 18);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                xto1.l((phm0) obj5, (qim0) obj4, (Function0) obj3, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                vyo1.h((z5d0) obj5, (Function0) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                xzo1.e((String) obj5, (wad0) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 26:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    boolean zJ = u890.j((djd0) obj5, bjd0.a);
                    ljd0 ljd0Var = (ljd0) obj4;
                    m0p1.i(ljd0Var.b, ljd0Var.c, ljd0Var.e, ljd0Var.f, zJ, zJ, ljd0Var.g, ljd0Var.d, (iu30) obj3, null, x340Var26, 0, 512);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 27:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    ojd0 ojd0Var = (ojd0) obj5;
                    rwj rwjVar = (rwj) obj4;
                    o0p1.f(ojd0Var.d, ojd0Var.b, (ZoneId) rwjVar.f, (Locale) rwjVar.g, ojd0Var.c, (iu30) obj3, null, x340Var28, 0);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                d3p1.g((wx60) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                x340 x340Var29 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    bzn1.b((lik1) obj5, ((zzz0) obj4).b, (idm) obj3, x340Var30, 0);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mb90(Object obj, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mb90(Object obj, Object obj2, Object obj3, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
