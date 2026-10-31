package p;

import android.net.Uri;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.idj.v1.MicPermissionPageResponse;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class loi0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ loi0(Object obj, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0209  */
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        dwj0 dwj0Var;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        z50 z50Var = z50.c;
        byte b2 = 23;
        j2i j2iVarR = null;
        byte b3 = 1;
        rih1 rih1Var = rih1.a;
        Object obj10 = this.c;
        Object obj11 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                kto1.m((tni0) obj11, (qim0) obj10, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var2).g;
                    qim0 qim0VarR = u291.r(nim0Var, 64.0f);
                    cua cuaVar = cbx.b(x340Var2).f;
                    qim0 qim0VarF = dug.f(i1p1.q(qim0VarR, er31.b(4.0f)), cbx.a(x340Var2).c.a, d4o1.a);
                    cvx cvxVar = cbx.b(x340Var2).b;
                    qim0 qim0VarX = uyn1.x(qim0VarF, 4.0f);
                    String str = (String) obj11;
                    evi0 evi0Var = (evi0) obj10;
                    gfh0 gfh0VarC = t1c.c(een.h, false);
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
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    eso1.e(Uri.parse(str), new jsl(evi0Var.b), (qim0) null, (p3v) null, (zvx) null, (ecx) null, mif1.Q0, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var2, 27648, 0, 4004);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                fvi0 fvi0Var = (fvi0) obj11;
                iu30 iu30Var = (iu30) obj10;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String strO0 = cwl1.o0(x340Var4, 2131958562);
                    j2i j2iVar = fvi0Var.b ? fvi0Var.c : null;
                    boolean zG = x340Var4.g(iu30Var);
                    Object objT = x340Var4.T();
                    if (zG || objT == fkj0.X) {
                        obj3 = objT;
                        edi0 edi0Var = new edi0(iu30Var, (byte) 14);
                        x340Var4.s0(edi0Var);
                        obj3 = edi0Var;
                    }
                    obj3 = objT;
                    g0p1.o(strO0, (qim0) null, j2iVar, (Function0) obj3, apo.r(1052017257, new x9g0(fvi0Var, iu30Var, b2), x340Var4), x340Var4, 196608);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                gyo1.p((rcj0) obj11, (Function0) obj10, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                arj0 arj0Var = (arj0) obj10;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    MicPermissionPageResponse micPermissionPageResponse = (MicPermissionPageResponse) obj11;
                    boolean zI = x340Var6.i(arj0Var);
                    Object objT2 = x340Var6.T();
                    if (zI || objT2 == m4cVar) {
                        obj4 = objT2;
                        zqj0 zqj0Var = new zqj0(arj0Var, false ? (byte) 1 : (byte) 0);
                        x340Var6.s0(zqj0Var);
                        obj4 = zqj0Var;
                    }
                    Function0 function0 = (Function0) obj4;
                    boolean zI2 = x340Var6.i(arj0Var);
                    Object objT3 = x340Var6.T();
                    Object obj12 = objT3;
                    if (zI2 || objT3 == m4cVar) {
                        zqj0 zqj0Var2 = new zqj0(arj0Var, b3);
                        x340Var6.s0(zqj0Var2);
                        obj12 = zqj0Var2;
                    }
                    Function0 function1 = (Function0) obj12;
                    boolean zI3 = x340Var6.i(arj0Var);
                    Object objT4 = x340Var6.T();
                    if (zI3 || objT4 == m4cVar) {
                        objT4 = new n0g0(0, arj0Var, arj0.class, "onLinkClicked", "onLinkClicked()V", 0, (byte) 8);
                        x340Var6.s0(objT4);
                    }
                    m0p1.k(micPermissionPageResponse, function0, function1, (Function0) objT4, x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 5:
                tv80 tv80Var = (tv80) obj2;
                iu30 iu30Var2 = (iu30) ((ven0) obj10).getValue();
                int iOrdinal = ((raj0) obj).ordinal();
                if (iOrdinal == 0) {
                    dwj0Var = hwj0.a;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    dwj0Var = new dwj0((saj0) obj11, tv80Var);
                }
                iu30Var2.invoke(dwj0Var);
                return rih1Var;
            case 6:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                iu30 iu30Var3 = (iu30) obj10;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    r4k0 r4k0Var = (r4k0) obj11;
                    boolean zG2 = x340Var8.g(iu30Var3);
                    Object objT5 = x340Var8.T();
                    if (zG2 || objT5 == fkj0.X) {
                        obj5 = objT5;
                        stj0 stj0Var = new stj0(iu30Var3, (byte) 6);
                        x340Var8.s0(stj0Var);
                        obj5 = stj0Var;
                    }
                    obj5 = objT5;
                    r4k0Var.f(0, (Function0) obj5, x340Var8, (qim0) null);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ((r4k0) obj11).a(0, (Function0) obj10, x340Var10, (qim0) null);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    nim0 nim0Var2 = nim0.a;
                    qim0 qim0VarB = uyn1.B(nim0Var2, 0.0f, 0.0f, 0.0f, 3.0f, 7);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var12).b;
                    s7k0 s7k0Var = (s7k0) obj11;
                    String str2 = (String) obj10;
                    jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), een.N0, x340Var12, 0);
                    int iHashCode2 = Long.hashCode(x340Var12.T);
                    xos0 xos0VarM2 = x340Var12.m();
                    qim0 qim0VarE2 = zr7.E(x340Var12, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var12.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var12.m0();
                    if (x340Var12.S) {
                        x340Var12.l(n4kVar);
                    } else {
                        x340Var12.v0();
                    }
                    nko1.H(jw31VarA, x340Var12, y580.O0);
                    nko1.H(xos0VarM2, x340Var12, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var12, y580.R0);
                    nko1.F(x340Var12);
                    nko1.H(qim0VarE2, x340Var12, y580.Y);
                    if (s7k0Var.f) {
                        x340Var12.i0(951051294);
                        cnx cnxVar = cnx.c;
                        zov0 zov0Var2 = cbx.b(x340Var12).g;
                        w0h1.a(cnxVar, isl.a, u291.r(nim0Var2, 12.0f), 0L, 0L, true, x340Var12, cnx.d | 196656, 24);
                        x340Var12.r(false);
                    } else {
                        x340Var12.i0(951359775);
                        x340Var12.r(false);
                    }
                    jo31.c(s7k0Var.h, x340Var12, 0);
                    uwo1.e(str2, anm1.N("mixing_bpm_text_with_" + s7k0Var.a, nim0Var2), cbx.d(x340Var12).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var12, 0, 0, 2040);
                    x340Var12.r(true);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 9:
                fn31.T((c9n) obj11, (o8n) null, 0, new l4f0((cej0) obj, (j9k0) obj10, (tv80) obj2, (lnm) null, (byte) 9), 3);
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                r2p1.e((xkk1) obj11, (qim0) obj10, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 11:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ((pek0) obj11).b(0, (Function0) obj10, x340Var14, (qim0) null);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 12:
                int iIntValue8 = ((Number) obj).intValue();
                ((Boolean) obj2).getClass();
                ((t4h1) obj11).c((ijf1) obj10, Integer.valueOf(iIntValue8));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                bfm0.a((svh0) obj11, (j2i) obj10, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 14:
                x340 x340Var15 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                iu30 iu30Var4 = (iu30) obj10;
                uqm0 uqm0Var = (uqm0) obj11;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    int i = uqm0Var.g;
                    if (i == 1) {
                        x340Var16.i0(-702394802);
                        qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                        boolean zG3 = x340Var16.g(iu30Var4);
                        Object objT6 = x340Var16.T();
                        if (zG3 || objT6 == fkj0.X) {
                            obj6 = objT6;
                            nfk0 nfk0Var = new nfk0(iu30Var4, (byte) 4);
                            x340Var16.s0(nfk0Var);
                            obj6 = nfk0Var;
                        }
                        obj6 = objT6;
                        gbx gbxVar = new gbx(z50Var, (Function0) obj6);
                        uwr uwrVar3 = cbx.a;
                        cvx cvxVar3 = cbx.b(x340Var16).b;
                        cvx cvxVar4 = cbx.b(x340Var16).b;
                        cvx cvxVar5 = cbx.b(x340Var16).b;
                        cvx cvxVar6 = cbx.b(x340Var16).b;
                        if (!(((((12.0f > 0.0f ? 1 : (12.0f == 0.0f ? 0 : -1)) >= 0) & ((12.0f > 0.0f ? 1 : (12.0f == 0.0f ? 0 : -1)) >= 0) ? 1 : 0) & ((12.0f > 0.0f ? 1 : (12.0f == 0.0f ? 0 : -1)) >= 0) ? 1 : 0) & (12.0f >= 0.0f))) {
                            of80.a("Padding must be non-negative");
                        }
                        ydx ydxVar = new ydx(4.0f, 12.0f, 8.0f, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), vdx.a);
                        cua cuaVar2 = cbx.b(x340Var16).f;
                        cr31 cr31VarB = er31.b(4.0f);
                        if (uqm0Var.b.length() > 0) {
                            x340Var16.i0(-701360425);
                            j2iVarR = apo.r(1464406173, new xqm0(uqm0Var, (byte) 0), x340Var16);
                            x340Var16.r(false);
                        } else {
                            x340Var16.i0(-700800844);
                            x340Var16.r(false);
                        }
                        ioo1.c(qim0VarF2, (pgx) null, ydxVar, cr31VarB, (max) null, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(463098604, new xqm0(uqm0Var, (byte) 1), x340Var16), (xu30) null, (xu30) null, j2iVarR, (xu30) null, (xu30) null, (xu30) null, apo.r(1347450278, new xqm0(uqm0Var, (byte) 2), x340Var16), x340Var16, 805306880, 1572864, 60786);
                        x340Var16.r(false);
                    } else if (i == 2) {
                        x340Var16.i0(-700693088);
                        crm0.h(uqm0Var, iu30Var4, null, x340Var16, 0);
                        x340Var16.r(false);
                    } else if (i == 3) {
                        x340Var16.i0(-700554208);
                        u7n0.i(uqm0Var, iu30Var4, null, x340Var16, 0);
                        x340Var16.r(false);
                    } else {
                        x340Var16.i0(-700471562);
                        x340Var16.r(false);
                    }
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                fn31.a((wx) obj11, (qim0) obj10, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 16:
                x340 x340Var17 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ((oyx) obj11).a(64, (j2i) obj10, x340Var18);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                ((m0n0) obj11).b(czo1.p(7), (j2i) obj10, (b0k) obj);
                return rih1Var;
            case 18:
                x340 x340Var19 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    mod.b(aon0.a.a(((t1n0) obj11).d2), (vu30) obj10, x340Var20, 8);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 19:
                x340 x340Var21 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                iu30 iu30Var5 = (iu30) obj10;
                j3n0 j3n0Var = (j3n0) obj11;
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    boolean zG4 = x340Var22.g(j3n0Var) | x340Var22.g(iu30Var5);
                    Object objT7 = x340Var22.T();
                    if (zG4 || objT7 == fkj0.X) {
                        obj7 = objT7;
                        s2n0 s2n0Var = new s2n0(j3n0Var, iu30Var5, (byte) 2);
                        x340Var22.s0(s2n0Var);
                        obj7 = s2n0Var;
                    }
                    obj7 = objT7;
                    foo1.f(new gbx(z50Var, (Function0) obj7), (qim0) null, (max) null, yla.s(x340Var22), (idn0) null, (vu30) null, (vu30) null, apo.r(-569577863, new fhk0(j3n0Var, (byte) 7), x340Var22), x340Var22, 12582912, 118);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 20:
                kpc.e((kpc) obj, "", new y9n0((p1f0) obj11, (d0r) obj10, (byte) 1), 6);
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                anm1.d((dt71) obj11, (qim0) obj10, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                x340 x340Var23 = (b0k) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    x340 x340Var24 = x340Var23;
                    if (x340Var24.H()) {
                        x340Var24.b0();
                    } else {
                        hnn0 hnn0Var = (hnn0) obj11;
                        hnn0Var.b.Y.J((wa5) obj10, hnn0Var, x340Var23, 0);
                    }
                } else {
                    hnn0 hnn0Var2 = (hnn0) obj11;
                    hnn0Var2.b.Y.J((wa5) obj10, hnn0Var2, x340Var23, 0);
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                epn0 epn0Var = (epn0) obj11;
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    mpn0 mpn0Var = (mpn0) ((tob1) obj10).getValue();
                    boolean zI4 = x340Var26.i(epn0Var);
                    Object objT8 = x340Var26.T();
                    if (zI4 || objT8 == m4cVar2) {
                        obj8 = objT8;
                        dpn0 dpn0Var = new dpn0(epn0Var, (byte) 0);
                        x340Var26.s0(dpn0Var);
                        obj8 = dpn0Var;
                    }
                    Function0 function2 = (Function0) obj8;
                    boolean zI5 = x340Var26.i(epn0Var);
                    Object objT9 = x340Var26.T();
                    Object obj13 = objT9;
                    if (zI5 || objT9 == m4cVar2) {
                        dpn0 dpn0Var2 = new dpn0(epn0Var, (byte) 1);
                        x340Var26.s0(dpn0Var2);
                        obj13 = dpn0Var2;
                    }
                    bqn1.m(mpn0Var, (qim0) null, function2, (Function0) obj13, x340Var26, 0);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                ern1.h((stn0) obj11, (qim0) obj10, (b0k) obj, czo1.p(1));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((Number) obj2).intValue();
                ((stn0) obj11).a(czo1.p(7), (j2i) obj10, (b0k) obj);
                return rih1Var;
            case 26:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                t7q0 t7q0Var = ((dp71) obj10).b;
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    jwf0 jwf0Var = (jwf0) obj11;
                    String uri = t7q0Var.getUri();
                    t7q0Var.getClass();
                    otw.c(jwf0Var, new fwf0(uri, t7q0Var instanceof g7q0), (qim0) null, (ipb1) null, x340Var28, 0, 12);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                h4o1.g((String) obj11, (r8x) obj10, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                l4o1.g((uvg1) obj11, (qim0) obj10, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                x340 x340Var29 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                m4c m4cVar3 = fkj0.X;
                hdo0 hdo0Var = (hdo0) obj11;
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    xm41 xm41Var = hdo0Var.c;
                    xm41 xm41Var2 = hdo0Var.g;
                    jxa jxaVar = hdo0Var.h;
                    kge kgeVar = hdo0Var.d;
                    mr20 mr20Var = hdo0Var.e;
                    ViewGroup viewGroup = (ViewGroup) obj10;
                    boolean zG5 = x340Var30.g(hdo0Var);
                    Object objT10 = x340Var30.T();
                    if (zG5 || objT10 == m4cVar3) {
                        obj9 = objT10;
                        gdo0 gdo0Var = new gdo0(hdo0Var, (byte) 0);
                        x340Var30.s0(gdo0Var);
                        obj9 = gdo0Var;
                    }
                    Function0 function3 = (Function0) obj9;
                    LinkedHashSet linkedHashSet = hdo0Var.O0;
                    vxf0 vxf0Var = hdo0Var.f;
                    boolean zG6 = x340Var30.g(hdo0Var);
                    Object objT11 = x340Var30.T();
                    Object obj14 = objT11;
                    if (zG6 || objT11 == m4cVar3) {
                        fhk0 fhk0Var = new fhk0(hdo0Var, (byte) 23);
                        x340Var30.s0(fhk0Var);
                        obj14 = fhk0Var;
                    }
                    vu30 vu30Var = (vu30) obj14;
                    boolean zG7 = x340Var30.g(hdo0Var);
                    Object objT12 = x340Var30.T();
                    Object obj15 = objT12;
                    if (zG7 || objT12 == m4cVar3) {
                        gdo0 gdo0Var2 = new gdo0(hdo0Var, (byte) 1);
                        x340Var30.s0(gdo0Var2);
                        obj15 = gdo0Var2;
                    }
                    Function0 function4 = (Function0) obj15;
                    boolean zG8 = x340Var30.g(hdo0Var);
                    Object objT13 = x340Var30.T();
                    Object obj16 = objT13;
                    if (zG8 || objT13 == m4cVar3) {
                        y3o0 y3o0Var = new y3o0(hdo0Var, (byte) 4);
                        x340Var30.s0(y3o0Var);
                        obj16 = y3o0Var;
                    }
                    iu30 iu30Var6 = (iu30) obj16;
                    boolean zG9 = x340Var30.g(hdo0Var);
                    Object objT14 = x340Var30.T();
                    Object obj17 = objT14;
                    if (zG9 || objT14 == m4cVar3) {
                        gdo0 gdo0Var3 = new gdo0(hdo0Var, (byte) 2);
                        x340Var30.s0(gdo0Var3);
                        obj17 = gdo0Var3;
                    }
                    r4o1.x(xm41Var, xm41Var2, jxaVar, kgeVar, mr20Var, viewGroup, function3, linkedHashSet, vxf0Var, vu30Var, function4, iu30Var6, (Function0) obj17, x340Var30, 0);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ loi0(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
