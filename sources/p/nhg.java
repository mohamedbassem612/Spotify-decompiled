package p;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nhg extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nhg(vu30 vu30Var, String str, long j, String str2) {
        super(3);
        this.a = (byte) 7;
        this.e = vu30Var;
        this.d = str;
        this.c = j;
        this.b = str2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        long j;
        long jFloatToRawIntBits;
        qim0 qim0VarA;
        boolean z;
        lee1 lee1Var;
        String str;
        boolean z2;
        byte b = this.a;
        long j2 = this.c;
        n4k n4kVar = hmb0.t1;
        qim0 qim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.d;
        Object obj5 = this.b;
        Object obj6 = this.e;
        switch (b) {
            case 0:
                vu30 vu30Var = (vu30) obj;
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var.i(vu30Var) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    String str2 = (String) obj4;
                    lee1 lee1Var2 = (lee1) obj6;
                    ven0 ven0Var = (ven0) obj5;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
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
                    if (str2 == null || ((c8e1) ven0Var.getValue()).a.b.length() != 0) {
                        x340Var2.i0(1549674790);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(1549577729);
                        jch0.c(str2, (qim0) null, lee1.a(lee1Var2, this.c, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214), (iu30) null, 0, false, 0, 0, (x9h) null, (m0e1) null, x340Var2, 0, 1018);
                        x340Var2.r(false);
                    }
                    us71.j(iIntValue & 14, vu30Var, x340Var2, true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                float fFloatValue = ((Number) obj).floatValue();
                long j3 = ((Offset) obj2).a;
                ((Number) obj3).floatValue();
                drr0 drr0Var = (drr0) obj4;
                drr0Var.t(yoi1.o(drr0Var.s() * fFloatValue, 1.0f, 5.0f));
                ven0 ven0Var2 = (ven0) obj5;
                long jG = Offset.g(((Offset) ven0Var2.getValue()).a, j3);
                float fS = drr0Var.s();
                long jI = ((ni7) obj6).i();
                if (jI == 9205357640488583168L || Size.g(jI) || Size.g(j2)) {
                    j = 4294967295L;
                    jFloatToRawIntBits = j2;
                } else {
                    float fM = wqn1.m(jI, j2);
                    long jFloatToRawIntBits2 = Float.floatToRawIntBits(fM);
                    j = 4294967295L;
                    long jFloatToRawIntBits3 = ((long) Float.floatToRawIntBits(fM)) & 4294967295L;
                    int i = lg41.a;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) ((jFloatToRawIntBits3 | (jFloatToRawIntBits2 << 32)) >> 32));
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jI >> 32)) * fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jI & 4294967295L)) * fIntBitsToFloat)) & 4294967295L);
                }
                float fMax = Math.max(0.0f, ((Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) * fS) - Float.intBitsToFloat((int) (j2 >> 32))) / 2.0f);
                float fMax2 = Math.max(0.0f, ((Float.intBitsToFloat((int) (jFloatToRawIntBits & j)) * fS) - Float.intBitsToFloat((int) (j2 & j))) / 2.0f);
                kaa0.j((((long) Float.floatToRawIntBits(yoi1.o(Float.intBitsToFloat((int) (jG >> 32)), -fMax, fMax))) << 32) | (((long) Float.floatToRawIntBits(yoi1.o(Float.intBitsToFloat((int) (jG & j)), -fMax2, fMax2))) & j), ven0Var2);
                return rih1Var;
            case 2:
                i2c i2cVar = (i2c) obj;
                x340 x340Var3 = (b0k) obj2;
                ((Number) obj3).intValue();
                float fD = i2cVar.d();
                k960 k960Var = (k960) obj4;
                float f = k960Var.a;
                float f2 = k960Var.b;
                float f3 = fD / f;
                if (((List) obj6).isEmpty()) {
                    x340 x340Var4 = x340Var3;
                    x340Var4.i0(1114175468);
                    zko1.e((da60) obj5, f3, (qim0) null, x340Var4, 0, 4);
                    x340Var4.r(false);
                } else {
                    x340 x340Var5 = x340Var3;
                    x340Var5.i0(1114271568);
                    hcx hcxVar = hcx.c;
                    float fA = (fD - (hcxVar.a(x340Var5) + 8.0f)) + 8.0f;
                    if (p3v.b(f3 * f2, fA) <= 0) {
                        qim0VarA = qim0Var;
                    } else {
                        f3 = fA / f2;
                        qim0VarA = i2cVar.a(qim0Var, een.e);
                    }
                    zko1.e((da60) obj5, f3, qim0VarA, x340Var5, 0, 0);
                    voo1.a((List) obj6, hcxVar, 4.0f, 8.0f, this.c, i2cVar.a(qim0Var, een.X), x340Var5, 3504);
                    x340Var5.r(false);
                }
                return rih1Var;
            case 3:
                x340 x340Var6 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var6).b;
                d36 d36Var = new d36(4.0f, true, new g21(een.Q0, (byte) 29));
                fra fraVar = een.N0;
                qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                af5 af5Var = (af5) obj4;
                lee1 lee1Var3 = (lee1) obj6;
                Function0 function0 = (Function0) obj5;
                jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var6, 0);
                x340 x340Var7 = x340Var6;
                int iHashCode2 = Long.hashCode(x340Var7.T);
                xos0 xos0VarM2 = x340Var7.m();
                qim0 qim0VarE2 = zr7.E(x340Var6, qim0VarF);
                hzj.A.getClass();
                x340 x340Var8 = x340Var6;
                if (x340Var8.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var8.m0();
                if (x340Var8.S) {
                    x340Var8.l(n4kVar);
                } else {
                    x340Var8.v0();
                }
                nko1.H(jw31VarA, x340Var6, y580.O0);
                nko1.H(xos0VarM2, x340Var6, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var6, y580.R0);
                nko1.F(x340Var6);
                nko1.H(qim0VarE2, x340Var6, y580.Y);
                eox eoxVar = eox.c;
                zov0 zov0Var = cbx.b(x340Var6).g;
                w0h1.a(eoxVar, isl.a, u291.r(qim0Var, 12.0f), this.c, 0L, false, x340Var6, eox.d | 48, 48);
                qim0 qim0VarN = anm1.N("playback_settings_alert_settings_link", qim0Var);
                boolean zI = x340Var8.i(af5Var) | x340Var8.g(function0);
                Object objT = x340Var8.T();
                if (zI || objT == fkj0.X) {
                    z = true;
                    objT = new qeb(af5Var, function0, (byte) 1);
                    x340Var8.s0(objT);
                } else {
                    z = true;
                }
                l0p1.a(af5Var, qim0VarN, lee1Var3, false, 0, 0, (iu30) null, (iu30) objT, x340Var6, 0, 120);
                x340Var8.r(z);
                return rih1Var;
            case 4:
                x340 x340Var9 = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                lee1 lee1Var4 = (lee1) obj6;
                iu30 iu30Var = (iu30) obj5;
                for (pju pjuVar : (List) obj4) {
                    if (pjuVar instanceof qju) {
                        x340 x340Var10 = x340Var9;
                        x340Var10.i0(2015412004);
                        uwo1.e(((qju) pjuVar).a, (qim0) null, lee1Var4, this.c, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var10, 0, 0, 2034);
                        x340Var10.r(false);
                    } else {
                        if (!(pjuVar instanceof pju)) {
                            throw p3d1.k(x340Var9, 2015410819, false);
                        }
                        x340 x340Var11 = x340Var9;
                        x340Var11.i0(2015415709);
                        pju pjuVar2 = pjuVar;
                        String str3 = pjuVar2.a;
                        boolean zI2 = x340Var11.i(pjuVar) | x340Var11.g(iu30Var);
                        Object objT2 = x340Var11.T();
                        if (zI2 || objT2 == m4cVar) {
                            objT2 = new g1x0(iu30Var, pjuVar2, (byte) 10);
                            x340Var11.s0(objT2);
                        }
                        Function0 function1 = (Function0) objT2;
                        Object objT3 = x340Var11.T();
                        if (objT3 == m4cVar) {
                            objT3 = xox0.N0;
                            x340Var11.s0(objT3);
                        }
                        adg.a(0, str3, function1, x340Var11, i541.C(qim0Var, (iu30) objT3));
                        x340Var11.r(false);
                    }
                }
                return rih1Var;
            case 5:
                String str4 = (String) obj4;
                i2c i2cVar2 = (i2c) obj;
                x340 x340Var12 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                lee1 lee1Var5 = (lee1) obj6;
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var12.g(i2cVar2) ? 4 : 2;
                }
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    long jB = jjl.b(0, hjl.i(i2cVar2.b), 0, 0, 13);
                    boolean zG = x340Var13.g(str4) | x340Var13.g(lee1Var5) | x340Var13.f(jB);
                    yae1 yae1Var = (yae1) obj5;
                    Object objT4 = x340Var13.T();
                    if (zG || objT4 == fkj0.X) {
                        lee1Var = lee1Var5;
                        y9e1 y9e1VarA = yae1.a(yae1Var, str4, lee1Var, 0, false, 3, jB, (flb0) null, (xat) null, 972);
                        str = str4;
                        objT4 = Integer.valueOf(y9e1VarA.b.f);
                        x340Var13.s0(objT4);
                    } else {
                        lee1Var = lee1Var5;
                        str = str4;
                    }
                    lee1 lee1Var6 = lee1Var;
                    jch0.c(str, j9k1.x(u291.f(qim0Var, 1.0f), new t041(((Number) objT4).intValue(), lee1Var6.b.c)), lee1.a(lee1Var6, this.c, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214), (iu30) null, 0, false, 3, 0, (x9h) null, (m0e1) null, x340Var13, 1572864, 952);
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case 6:
                pv71 pv71Var = (pv71) obj;
                ((Number) obj3).intValue();
                m4c m4cVar2 = fkj0.X;
                aj81 aj81Var = (aj81) obj4;
                x340 x340Var14 = (b0k) obj2;
                boolean zF = x340Var14.f(j2);
                Object objT5 = x340Var14.T();
                if (zF || objT5 == m4cVar2) {
                    objT5 = new ps((byte) 23, j2);
                    x340Var14.s0(objT5);
                }
                iu30 iu30Var2 = (iu30) objT5;
                Object objT6 = x340Var14.T();
                if (objT6 == m4cVar2) {
                    objT6 = oa81.b1;
                    x340Var14.s0(objT6);
                }
                hm5.a(aj81Var, (qim0) null, iu30Var2, (tl3) null, (String) null, (iu30) objT6, apo.r(1485164140, new gk0(pv71Var, (res) obj6, (iu30) obj5, (byte) 23), x340Var14), x340Var14, 1769480, 26);
                return rih1Var;
            default:
                i2c i2cVar3 = (i2c) obj;
                x340 x340Var15 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    z2 = true;
                    iIntValue3 |= x340Var15.g(i2cVar3) ? 4 : 2;
                } else {
                    z2 = true;
                }
                x340 x340Var16 = x340Var15;
                boolean zY = x340Var16.Y(iIntValue3 & 1, (iIntValue3 & 19) != 18 ? z2 : false);
                j06 j06Var = x340Var16.a;
                if (!zY) {
                    x340Var16.b0();
                    return rih1Var;
                }
                qim0 qim0VarJ = u291.j(zjy.j(235.0f, new p3v(i2cVar3.d() * 0.412f)).a, 0.0f, 2, u291.f(qim0Var, 1.0f));
                vu30 vu30Var2 = (vu30) obj6;
                String str5 = (String) obj4;
                String str6 = (String) obj5;
                gfh0 gfh0VarC2 = t1c.c(een.h, false);
                int iHashCode3 = Long.hashCode(x340Var16.T);
                xos0 xos0VarM3 = x340Var16.m();
                qim0 qim0VarE3 = zr7.E(x340Var16, qim0VarJ);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var16.m0();
                if (x340Var16.S) {
                    x340Var16.l(n4kVar);
                } else {
                    x340Var16.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(gfh0VarC2, x340Var16, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM3, x340Var16, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode3);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var16, lljVar3);
                nko1.F(x340Var16);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE3, x340Var16, lljVar4);
                Object objT7 = x340Var16.T();
                m4c m4cVar3 = fkj0.X;
                if (objT7 == m4cVar3) {
                    objT7 = v8r.q(Boolean.FALSE);
                    x340Var16.s0(objT7);
                }
                ven0 ven0Var3 = (ven0) objT7;
                era eraVar = een.Q0;
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var16).b;
                d36 d36Var2 = new d36(8.0f, z2, new um5(false));
                qim0 qim0VarF2 = u291.f(qim0Var, 1.0f);
                boolean zG2 = x340Var16.g(vu30Var2);
                Object objT8 = x340Var16.T();
                if (zG2 || objT8 == m4cVar3) {
                    objT8 = new pm0(vu30Var2, (byte) 12);
                    x340Var16.s0(objT8);
                }
                qim0 qim0VarG0 = irn1.g0(qim0VarF2, (iu30) objT8);
                mbh mbhVarA = jbh.a(d36Var2, eraVar, x340Var16, 48);
                int iHashCode4 = Long.hashCode(x340Var16.T);
                xos0 xos0VarM4 = x340Var16.m();
                qim0 qim0VarE4 = zr7.E(x340Var16, qim0VarG0);
                x340Var16.m0();
                if (x340Var16.S) {
                    x340Var16.l(n4kVar);
                } else {
                    x340Var16.v0();
                }
                nko1.H(mbhVarA, x340Var16, lljVar);
                nko1.H(xos0VarM4, x340Var16, lljVar2);
                x0d.q(iHashCode4, x340Var16, lljVar3, x340Var16);
                nko1.H(qim0VarE4, x340Var16, lljVar4);
                lee1 lee1Var7 = cbx.d(x340Var16).e;
                yfu yfuVar = ajx.a;
                Object obj7 = yfuVar.b;
                FontWeight fontWeight = (FontWeight) ((bjx) yfuVar.c).e;
                px8 px8Var = new px8(cbx.d(x340Var16).g.a.b, cbx.d(x340Var16).e.a.b, 0L, new mx8(3), 4);
                Object objT9 = x340Var16.T();
                if (objT9 == m4cVar3) {
                    objT9 = new e7m1(ven0Var3, (byte) 0);
                    x340Var16.s0(objT9);
                }
                ajc0 ajc0Var = new ajc0((iu30) objT9);
                a0e1 a0e1Var = new a0e1(3);
                long j4 = this.c;
                gxo1.c(str5, (qim0) null, lee1Var7, j4, a0e1Var, 2, false, ajc0Var, px8Var, 150.0f, fontWeight, (iu30) null, x340Var16, 134414336, 0, 2114);
                if (((Boolean) ven0Var3.getValue()).booleanValue()) {
                    x340Var16.i0(-1359858828);
                    x340Var16.r(false);
                } else {
                    x340Var16.i0(-1360168580);
                    uwo1.e(str6, u291.f(qim0Var, 1.0f), cbx.d(x340Var16).j, j4, new a0e1(3), (iu30) null, 2, false, new zic0(2), 0, (qx8) null, x340Var16, 1572912, 0, 1696);
                    x340Var16.r(false);
                }
                x340Var16.r(true);
                x340Var16.r(true);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nhg(Object obj, lee1 lee1Var, long j, Object obj2, byte b) {
        super(3);
        this.a = b;
        this.d = obj;
        this.e = lee1Var;
        this.c = j;
        this.b = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nhg(long j, af5 af5Var, lee1 lee1Var, Function0 function0) {
        super(3);
        this.a = (byte) 3;
        this.c = j;
        this.d = af5Var;
        this.e = lee1Var;
        this.b = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nhg(k960 k960Var, List list, da60 da60Var, long j) {
        super(3);
        this.a = (byte) 2;
        this.d = k960Var;
        this.e = list;
        this.b = da60Var;
        this.c = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nhg(drr0 drr0Var, ven0 ven0Var, ni7 ni7Var, long j) {
        super(3);
        this.a = (byte) 1;
        this.d = drr0Var;
        this.b = ven0Var;
        this.e = ni7Var;
        this.c = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nhg(aj81 aj81Var, long j, res resVar, iu30 iu30Var) {
        super(3);
        this.a = (byte) 6;
        this.d = aj81Var;
        this.c = j;
        this.e = resVar;
        this.b = iu30Var;
    }
}
