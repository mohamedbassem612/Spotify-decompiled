package p;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import j$.time.Instant;
import j$.time.OffsetDateTime;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qi6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi6(String str, Function0 function0, long j) {
        super(2);
        this.a = (byte) 20;
        this.d = str;
        this.c = function0;
        this.b = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        byte b = this.a;
        z50 z50Var = z50.c;
        u5j1 u5j1Var = d4o1.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        long j = this.b;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qim0 qim0VarY = u291.y(nim0Var, een.N0, true);
                    dj6 dj6Var = (dj6) obj3;
                    yux yuxVar = (yux) obj4;
                    jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarY);
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
                    nko1.H(jw31VarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    String str = dj6Var.b;
                    float f = vi6.d;
                    lee1 lee1VarA = lee1.a(vi6.d(vi6.g(yuxVar, 20.0f, 19.0f, 0.0f, f, x340Var2, 8)), 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 4, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16711679);
                    kiv kivVar = t4k.n;
                    Object objK = x340Var2.k(kivVar);
                    flb0 flb0Var = flb0.b;
                    int i = objK == flb0Var ? 2 : 1;
                    cjc0 cjc0Var = new cjc0(1);
                    uwr uwrVar = cbx.a;
                    yfu yfuVar = ajx.a;
                    Object obj5 = yfuVar.b;
                    FontWeight fontWeight = (FontWeight) ((bjx) yfuVar.c).e;
                    vq60 vq60Var = xl3.a;
                    vul1 vul1Var = new vul1(vq60Var);
                    a0e1 a0e1Var = new a0e1(i);
                    long j2 = this.b;
                    gxo1.c(str, vul1Var, lee1VarA, j2, a0e1Var, 2, false, cjc0Var, null, 50.0f, fontWeight, null, x340Var2, 196608, 0, 2368);
                    gxo1.c(dj6Var.c, new vul1(vq60Var), lee1.a(vi6.d(vi6.g(yuxVar, 12.0f, 19.0f, 0.0f, f, x340Var2, 8)), 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 4, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16711679), j2, new a0e1(x340Var2.k(kivVar) == flb0Var ? 2 : 1), 2, false, new cjc0(1), null, 50.0f, fontWeight, null, x340Var2, 196608, 0, 2368);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                eio1.l((fj6) obj3, this.b, (yux) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                dem1.b(this.b, (Function0) obj3, (Function0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    if (!((Boolean) ((tob1) obj3).getValue()).booleanValue()) {
                        j = u7h.j;
                    }
                    qim0 qim0VarF2 = dug.f(qim0VarF, j, u5j1Var);
                    u85 u85Var = (erl1) x340Var4.k(szf0.b);
                    if (u85Var == null) {
                        x340Var4.i0(-241884180);
                        WeakHashMap weakHashMap = osl1.x;
                        u85Var = lhc.g(x340Var4).g;
                        z = false;
                    } else {
                        z = false;
                        x340Var4.i0(-241885792);
                    }
                    x340Var4.r(z);
                    qim0 qim0VarY2 = too1.y(qim0VarF2, new bgc0(u85Var, 16));
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var4).b;
                    qim0 qim0VarZ = uyn1.z(4.0f, 0.0f, 2, qim0VarY2);
                    mta mtaVar = cbx.b(x340Var4).d;
                    qim0 qim0VarJ = u291.j(56.0f, 0.0f, 2, qim0VarZ);
                    iu30 iu30Var = (iu30) obj4;
                    jw31 jw31VarA2 = ew31.a(h36.b, een.Z, x340Var4, 0);
                    int iHashCode2 = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM2 = x340Var4.m();
                    qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarJ);
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
                    nko1.H(xos0VarM2, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE2, x340Var4, y580.Y);
                    boolean zG = x340Var4.g(iu30Var);
                    Object objT = x340Var4.T();
                    if (zG || objT == fkj0.X) {
                        objT = new frf(iu30Var, (byte) 12);
                        x340Var4.s0(objT);
                    }
                    wro1.h(new gbx(z50Var, (Function0) objT), ldx.c, null, null, null, null, false, null, null, lci.a, x340Var4, 0, 6, 1020);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    qim0 qim0VarN = anm1.N("compose-read-along-page-toolbar", dug.f(nim0Var, j, u5j1Var));
                    u060 u060Var = (u060) obj3;
                    lwj lwjVar = (lwj) obj4;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode3 = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM3 = x340Var6.m();
                    qim0 qim0VarE3 = zr7.E(x340Var6, qim0VarN);
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
                    nko1.H(xos0VarM3, x340Var6, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var6, y580.R0);
                    nko1.F(x340Var6);
                    nko1.H(qim0VarE3, x340Var6, y580.Y);
                    String str2 = lwjVar.e;
                    String str3 = lwjVar.f;
                    boolean z2 = lwjVar.b;
                    otw.c(u060Var, new l060(str2, str3, z2 ? 1 : 2, z2 ? 2 : 3), (qim0) null, (ipb1) null, x340Var6, 0, 12);
                    x340Var6.r(true);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    lwj lwjVar2 = (lwj) obj4;
                    otw.c(((owj) obj3).c, new vwt0(lwjVar2.a, !lwjVar2.b), dug.f(nim0Var, j, u5j1Var), (ipb1) null, x340Var8, 0, 8);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                sqe.d((f0u) obj3, (qim0) obj4, this.b, (b0k) obj, czo1.p(433));
                return rih1Var;
            case 7:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                Function0 function0 = (Function0) obj3;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    j2i j2iVarR = apo.r(1559413986, new hzw((pm10) obj4, (byte) 28), x340Var10);
                    qgr0 qgr0Var = new qgr0(j);
                    boolean zG2 = x340Var10.g(function0);
                    Object objT2 = x340Var10.T();
                    if (zG2 || objT2 == fkj0.X) {
                        objT2 = new in00(function0, (byte) 14);
                        x340Var10.s0(objT2);
                    }
                    bzn1.e(null, j2iVarR, false, null, qgr0Var, null, null, (Function0) objT2, x340Var10, 48, 109);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                poo1.o((ia60) obj3, this.b, (xd60) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                too1.h((ja60) obj3, this.b, (xd60) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                ((zpj0) obj3).j((String) obj, ((Number) obj2).doubleValue(), this.b, (List) obj4);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                lap1.c((qim0) obj3, this.b, (xu30) obj4, (b0k) obj, czo1.p(385));
                return rih1Var;
            case grn1.d /* 12 */:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    int size = ((ArrayList) obj3).size();
                    qim0 qim0Var = (qim0) obj4;
                    for (int i2 = 0; i2 < size; i2++) {
                        bzn1.a(0, j, x340Var12, qim0Var);
                    }
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                boolean zY = x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2);
                j06 j06Var = x340Var14.a;
                if (!zY) {
                    x340Var14.b0();
                    return rih1Var;
                }
                nim0 nim0Var2 = nim0.a;
                qim0 qim0VarB = uyn1.B(nim0Var2, 0.0f, 0.0f, 0.0f, 16.0f, 7);
                Brush brush = (Brush) obj3;
                ckm0 ckm0Var = (ckm0) obj4;
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var14, 0);
                int iHashCode4 = Long.hashCode(x340Var14.T);
                xos0 xos0VarM4 = x340Var14.m();
                qim0 qim0VarE4 = zr7.E(x340Var14, qim0VarB);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var14.m0();
                if (x340Var14.S) {
                    x340Var14.l(n4kVar);
                } else {
                    x340Var14.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var14, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM4, x340Var14, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode4);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var14, lljVar3);
                nko1.F(x340Var14);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE4, x340Var14, lljVar4);
                gra graVar = een.h;
                qim0 qim0VarF3 = dug.f(i1p1.q(uyn1.x(d7e.r(1.0f, u291.f(nim0Var2, 1.0f), false), ows0.e), er31.b(ows0.c)), j, u5j1Var);
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode5 = Long.hashCode(x340Var14.T);
                xos0 xos0VarM5 = x340Var14.m();
                qim0 qim0VarE5 = zr7.E(x340Var14, qim0VarF3);
                x340Var14.m0();
                if (x340Var14.S) {
                    x340Var14.l(n4kVar);
                } else {
                    x340Var14.v0();
                }
                nko1.H(gfh0VarC2, x340Var14, lljVar);
                nko1.H(xos0VarM5, x340Var14, lljVar2);
                x0d.q(iHashCode5, x340Var14, lljVar3, x340Var14);
                nko1.H(qim0VarE5, x340Var14, lljVar4);
                t1c.a(dug.e(h2c.a.b(nim0Var2), brush, null, 0.0f, 6), x340Var14, 0);
                String str4 = ckm0Var.b;
                uwr uwrVar3 = cbx.a;
                uwo1.e(str4, uyn1.z(16.0f, 0.0f, 2, nim0Var2), cbx.d(x340Var14).k, 0L, new a0e1(3), null, 2, false, new cjc0(3), 0, null, x340Var14, 0, 0, 1704);
                x340Var14.r(true);
                x340Var14.r(true);
                return rih1Var;
            case 14:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                iu30 iu30Var2 = (iu30) obj4;
                fr21 fr21Var = (fr21) obj3;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    Instant instant = fr21Var.b;
                    String str5 = fr21Var.a;
                    OffsetDateTime offsetDateTimeAtOffset = instant.atOffset(fr21Var.c);
                    pqk pqkVar = new pqk(str5, (af5) null, (u7h) null, fr21Var.d, f4i1.f(lfk.a(offsetDateTimeAtOffset), " • ", fr21Var.e), offsetDateTimeAtOffset.getMonth().getDisplayName(TextStyle.SHORT, Locale.getDefault()), String.valueOf(offsetDateTimeAtOffset.getDayOfMonth()), false, (String) null, false, true, false, true, new u7h(j), u7h.b(u7h.b, 0.72f, 0.0f, 0.0f, 0.0f, 14), 2310);
                    qim0 qim0VarN2 = anm1.N("reserved_onboarding_show_".concat(str5), nim0Var);
                    boolean zG3 = x340Var16.g(iu30Var2) | x340Var16.i(fr21Var);
                    Object objT3 = x340Var16.T();
                    if (zG3 || objT3 == fkj0.X) {
                        objT3 = new nt01(iu30Var2, fr21Var, (byte) 26);
                        x340Var16.s0(objT3);
                    }
                    h7w.e(pqkVar, (iu30) objT3, qim0VarN2, x340Var16, 8, 0);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                irn1.n(this.b, (sm51) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                u1p1.d((Function0) obj3, this.b, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                rje1.a((lte1) obj3, this.b, (Function0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                leh1 leh1Var = (leh1) obj4;
                whb1 whb1Var = (whb1) obj3;
                x340 x340Var18 = x340Var17;
                if (!x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x340Var18.b0();
                } else if (p3v.b(s3v.b(j), 240.0f) >= 0) {
                    x340Var18.i0(-841338007);
                    ggo1.q(whb1Var, leh1Var, x340Var18, 0);
                    x340Var18.r(false);
                } else {
                    x340Var18.i0(-841335524);
                    ggo1.c(whb1Var, leh1Var, x340Var18, 0);
                    x340Var18.r(false);
                }
                return rih1Var;
            case 19:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    String strO0 = cwl1.o0(x340Var20, (((hek1) obj3).a && ((i5y0) ((pt) obj4).e).e()) ? 2131958047 : 2131958050);
                    uwr uwrVar4 = cbx.a;
                    uwo1.e(strO0, null, cbx.d(x340Var20).k, this.b, null, null, 0, false, null, 0, null, x340Var20, 0, 0, 2034);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            default:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                Function0 function1 = (Function0) obj4;
                String str6 = (String) obj3;
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    Object objT4 = x340Var22.T();
                    m4c m4cVar = fkj0.X;
                    if (objT4 == m4cVar) {
                        objT4 = m5m1.S0;
                        x340Var22.s0(objT4);
                    }
                    qim0 qim0VarQ = d9y0.q(nim0Var, (iu30) objT4);
                    boolean zG4 = x340Var22.g(str6);
                    Object objT5 = x340Var22.T();
                    if (zG4 || objT5 == m4cVar) {
                        objT5 = new bek1(str6, (byte) 15);
                        x340Var22.s0(objT5);
                    }
                    qim0 qim0VarA = s161.a(qim0VarQ, (iu30) objT5);
                    boolean zG5 = x340Var22.g(function1);
                    Object objT6 = x340Var22.T();
                    if (zG5 || objT6 == m4cVar) {
                        objT6 = new tpj1(function1, (byte) 29);
                        x340Var22.s0(objT6);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT6), new idx(19), qim0VarA, null, yla.s(x340Var22), null, null, null, null, null, apo.r(1056952615, new icc((byte) 10, j, str6), x340Var22), x340Var22, 0, 48, 2008);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qi6(long j, Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = j;
        this.d = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qi6(Object obj, long j, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qi6(Object obj, long j, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qi6(Object obj, Object obj2, long j, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.c = obj2;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qi6(long j, Object obj, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.b = j;
        this.d = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi6(f0u f0uVar, qim0 qim0Var, long j, int i) {
        super(2);
        this.a = (byte) 6;
        this.d = f0uVar;
        this.c = qim0Var;
        this.b = j;
    }
}
