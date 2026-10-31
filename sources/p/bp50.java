package p;

import android.content.Intent;
import androidx.compose.ui.geometry.Offset;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import io.reactivex.rxjava3.core.Single;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bp50 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp50(iu30 iu30Var, drr0 drr0Var, ven0 ven0Var) {
        super(2);
        this.a = (byte) 20;
        this.b = iu30Var;
        this.c = drr0Var;
        this.d = ven0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        gbx gbxVar;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                ltn1.j((zv31) obj3, (iu30) obj4, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                vzn1.c((svh0) obj3, (iu30) obj4, (j2i) obj5, (b0k) obj, czo1.p(393));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                ago1.d(czo1.p(385), (Integer) obj4, (Function0) obj3, (b0k) obj, (qim0) obj5);
                return rih1Var;
            case 3:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    nt70 nt70Var = (nt70) obj3;
                    Function0 function0 = (Function0) obj5;
                    iu30 iu30Var = (iu30) obj4;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarD);
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
                    v17 v17Var = nt70Var.k;
                    qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                    boolean zG = x340Var2.g(function0);
                    Object objT = x340Var2.T();
                    if (zG || objT == m4cVar) {
                        objT = new xet(function0, (byte) 17);
                        x340Var2.s0(objT);
                    }
                    qim0 qim0VarC = i541.C(qim0VarD2, (iu30) objT);
                    if (v17Var != null) {
                        qim0VarC = qim0VarC.then(anm1.N("artwork_tap", nim0Var));
                    }
                    qim0 qim0Var = qim0VarC;
                    if (v17Var == null) {
                        x340Var2.i0(-186305675);
                        x340Var2.r(false);
                        gbxVar = null;
                    } else {
                        x340Var2.i0(-186305674);
                        String strO0 = cwl1.o0(x340Var2, 2131952446);
                        boolean zG2 = x340Var2.g(iu30Var);
                        Object objT2 = x340Var2.T();
                        if (zG2 || objT2 == m4cVar) {
                            objT2 = new g850(iu30Var, (byte) 29);
                            x340Var2.s0(objT2);
                        }
                        Function0 function1 = (Function0) objT2;
                        if (ihc1.y0(strO0)) {
                            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                            return null;
                        }
                        gbx gbxVar2 = new gbx(new y50(strO0), function1);
                        x340Var2.r(false);
                        gbxVar = gbxVar2;
                    }
                    String str = nt70Var.d;
                    boolean zG3 = x340Var2.g(function0);
                    Object objT3 = x340Var2.T();
                    if (zG3 || objT3 == m4cVar) {
                        objT3 = new j160(function0, (byte) 1);
                        x340Var2.s0(objT3);
                    }
                    r4o1.o(str, (Function0) objT3, qim0Var, gbxVar, x340Var2, 0);
                    qim0 qim0VarD3 = u291.d(nim0Var, 1.0f);
                    Integer num = nt70Var.e;
                    boolean zG4 = x340Var2.g(function0);
                    Object objT4 = x340Var2.T();
                    if (zG4 || objT4 == m4cVar) {
                        objT4 = new j160(function0, (byte) 2);
                        x340Var2.s0(objT4);
                    }
                    ago1.d(384, num, (Function0) objT4, x340Var2, qim0VarD3);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                oho1.j((String) obj3, (if5) obj4, (qim0) obj5, (b0k) obj, czo1.p(65));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                ajo1.i((t660) obj3, (qim0) obj5, (iu30) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                ab60 ab60Var = (ab60) obj3;
                m4c m4cVar2 = fkj0.X;
                iu30 iu30Var2 = (iu30) obj4;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sa60 sa60Var = ab60Var.b;
                    srt0 srt0Var = ab60Var.a;
                    zfx zfxVar = (zfx) obj5;
                    boolean zG5 = x340Var4.g(iu30Var2) | x340Var4.i(ab60Var);
                    Object objT5 = x340Var4.T();
                    if (zG5 || objT5 == m4cVar2) {
                        objT5 = new hs20(iu30Var2, ab60Var, (byte) 21);
                        x340Var4.s0(objT5);
                    }
                    Function0 function2 = (Function0) objT5;
                    boolean zG6 = x340Var4.g(iu30Var2);
                    Object objT6 = x340Var4.T();
                    if (zG6 || objT6 == m4cVar2) {
                        objT6 = new u460(iu30Var2, (byte) 2);
                        x340Var4.s0(objT6);
                    }
                    Function0 function3 = (Function0) objT6;
                    boolean zG7 = x340Var4.g(iu30Var2);
                    Object objT7 = x340Var4.T();
                    if (zG7 || objT7 == m4cVar2) {
                        objT7 = new z720(iu30Var2, (byte) 20);
                        x340Var4.s0(objT7);
                    }
                    iu30 iu30Var3 = (iu30) objT7;
                    boolean zG8 = x340Var4.g(iu30Var2);
                    Object objT8 = x340Var4.T();
                    if (zG8 || objT8 == m4cVar2) {
                        objT8 = new z720(iu30Var2, (byte) 21);
                        x340Var4.s0(objT8);
                    }
                    blo1.d(sa60Var, srt0Var, zfxVar, function2, function3, iu30Var3, (iu30) objT8, null, x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                hno1.a((mb60) obj3, (hjp) obj4, (kjp) obj5, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 8:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    u1p1.k((me60) obj3, ((pe60) obj5).d, (iu30) obj4, null, x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                ((bm00) obj3).a((yzm) obj4, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                ((bm00) obj3).e(czo1.p(1), (b0k) obj, (iu30) obj4, (qim0) obj5);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    qim0 qim0VarC2 = u291.c(nim0Var, 1.0f);
                    xv60 xv60Var = (xv60) obj3;
                    tv60 tv60Var = (tv60) obj5;
                    iu30 iu30Var4 = (iu30) obj4;
                    gfh0 gfh0VarC2 = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(x340Var8.T);
                    xos0 xos0VarM2 = x340Var8.m();
                    qim0 qim0VarE2 = zr7.E(x340Var8, qim0VarC2);
                    hzj.A.getClass();
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
                    nko1.H(gfh0VarC2, x340Var8, y580.O0);
                    nko1.H(xos0VarM2, x340Var8, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var8, y580.R0);
                    nko1.F(x340Var8);
                    nko1.H(qim0VarE2, x340Var8, y580.Y);
                    xv60Var.e((sv60) tv60Var, xv60Var.b, xv60Var.c, iu30Var4, x340Var8, 0);
                    x340Var8.r(true);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                ((nhc) obj3).f((td10) obj4, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                cx60 cx60Var = (cx60) obj3;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    nhc nhcVar = cx60Var.b;
                    td10 td10Var = (td10) ((ven0) obj4).getValue();
                    boolean zBooleanValue = ((Boolean) ((ven0) obj5).getValue()).booleanValue();
                    boolean zI = x340Var10.i(cx60Var);
                    Object objT9 = x340Var10.T();
                    if (zI || objT9 == fkj0.X) {
                        objT9 = new g050(cx60Var, (byte) 23);
                        x340Var10.s0(objT9);
                    }
                    nhcVar.h(td10Var, zBooleanValue, (Function0) objT9, (qim0) null, (es41) null, x340Var10, 0);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                ((o860) obj3).a((String) obj4, (j2i) obj5, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 15:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    lmw lmwVar = (lmw) obj3;
                    z5o0 z5o0Var = (z5o0) obj4;
                    lmwVar.d(z5o0Var != null ? z5o0Var.a : null, apo.r(1358902394, new cy00(z5o0Var, (fx60) obj5, lmwVar, (byte) 14), x340Var12), x340Var12, 48);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 16:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                iu30 iu30Var5 = (iu30) obj4;
                f070 f070Var = ((r070) obj5).a;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    op0 op0Var = (op0) ((res) obj3).g;
                    cs10 cs10Var = new cs10(true);
                    ji0 ji0Var = f070Var.a;
                    String str2 = ji0Var.c;
                    String str3 = ji0Var.i;
                    String str4 = ji0Var.b;
                    String value = ji0Var.Z.getValue();
                    ji0 ji0Var2 = f070Var.a;
                    String str5 = ji0Var2.W0;
                    String str6 = ji0Var2.Y0.a;
                    boolean zG9 = x340Var14.g(iu30Var5);
                    Object objT10 = x340Var14.T();
                    if (zG9 || objT10 == fkj0.X) {
                        objT10 = new z720(iu30Var5, (byte) 25);
                        x340Var14.s0(objT10);
                    }
                    otw.c(op0Var, new kp0(cs10Var, null, str2, ji0Var, str3, str4, value, str5, str6, false, (iu30) objT10), (qim0) null, (ipb1) null, x340Var14, 0, 12);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                m1p1.l((zs70) obj3, (iu30) obj4, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                m4c m4cVar3 = fkj0.X;
                iu30 iu30Var6 = (iu30) obj4;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    cu70 cu70Var = (cu70) obj3;
                    au70 au70Var = ((lu70) obj5).b;
                    boolean zG10 = x340Var16.g(iu30Var6);
                    Object objT11 = x340Var16.T();
                    if (zG10 || objT11 == m4cVar3) {
                        objT11 = new u460(iu30Var6, (byte) 17);
                        x340Var16.s0(objT11);
                    }
                    Function0 function4 = (Function0) objT11;
                    boolean zG11 = x340Var16.g(iu30Var6);
                    Object objT12 = x340Var16.T();
                    if (zG11 || objT12 == m4cVar3) {
                        objT12 = new u460(iu30Var6, (byte) 18);
                        x340Var16.s0(objT12);
                    }
                    s1p1.c(cu70Var, au70Var, function4, (Function0) objT12, null, x340Var16, 8);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                c2p1.e((tx70) obj3, (qim0) obj5, (iu30) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                long j = ((Offset) obj).a;
                drr0 drr0Var = (drr0) obj3;
                drr0Var.t(drr0Var.s() * ((Number) obj2).floatValue());
                drr0Var.t(yoi1.o(drr0Var.s(), 1.0f, 3.0f));
                ven0 ven0Var = (ven0) obj5;
                kaa0.j(drr0Var.s() == 1.0f ? (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) : Offset.g(((Offset) ven0Var.getValue()).a, j), ven0Var);
                ((iu30) obj4).invoke(Float.valueOf(drr0Var.s()));
                return rih1Var;
            case 21:
                return Single.fromCallable(new a280((ro30) obj3, (String) obj4, (vu30) obj5, (Intent) obj, (th61) obj2, (byte) 0));
            case 22:
                return Single.fromCallable(new a280((ro30) obj3, (String) obj4, (xu30) obj5, (Intent) obj, (th61) obj2, (byte) 1));
            case 23:
                ((Number) obj2).intValue();
                w5p1.a((p60) obj3, (qim0) obj5, (iu30) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                j7p1.e((s220) obj3, (iu30) obj4, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                w8p1.h((yl80) obj3, (ahs) obj4, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 26:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                yxb0 yxb0Var = (yxb0) obj3;
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    mod.b(oi7.a.a((gw70) yxb0Var.e), apo.r(-629537476, new jj50((yl80) obj5, yxb0Var, (iu30) obj4), x340Var18), x340Var18, 56);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                ((wq80) obj3).g(obj4, (j2i) obj5, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                bin.i((k990) obj3, (sip) obj4, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                txk0 txk0Var = (txk0) obj5;
                ia90 ia90Var = (ia90) obj4;
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    la90 la90Var = (la90) ((na90) obj3);
                    boolean zI2 = x340Var20.i(ia90Var) | x340Var20.i(txk0Var);
                    Object objT13 = x340Var20.T();
                    if (zI2 || objT13 == fkj0.X) {
                        objT13 = new ha90(ia90Var, txk0Var, (byte) 0);
                        x340Var20.s0(objT13);
                    }
                    f5p1.c(la90Var, (Function0) objT13, x340Var20, 0);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bp50(Object obj, Object obj2, Object obj3, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bp50(Object obj, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bp50(Object obj, iu30 iu30Var, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bp50(byte b, int i, Object obj, iu30 iu30Var, qim0 qim0Var) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = qim0Var;
        this.b = iu30Var;
    }
}
