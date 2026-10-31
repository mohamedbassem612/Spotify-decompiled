package p;

import android.content.Intent;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.genalphagraduation.graduationmessagingimpl.ForcedGraduationLockActivity;
import com.spotify.home.explicitfeedback.proto.Feedback;
import com.spotify.mobius.First;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rr10 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rr10(Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i;
        xw20 xw20Var;
        int i2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                return Boolean.valueOf(Math.abs(((yqg) ((t7y) obj3).b).b() - ((Feedback) obj).getCreatedAt()) >= 259200000);
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                t620 t620Var = (t620) obj3;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e720 e720Var = t620Var.a;
                    s620 s620Var = e720Var.a;
                    a720 a720Var = new a720(s620Var.a == 1, mqo1.A(e720Var.a.c), mqo1.A(s620Var.b));
                    jhp jhpVar = t620Var.c;
                    tbr0 tbr0VarC = ((cir0) x340Var2.k(k2r0.a)).c();
                    jhpVar.getClass();
                    otw.c(new tm(tbr0VarC), a720Var, (qim0) null, (ipb1) null, x340Var2, 0, 12);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    eqr0.b(0, 2, ((o820) obj3).a, x340Var4, (qim0) null);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    eqr0.b(0, 2, cwl1.o0(x340Var6, ((ya20) obj3).b), x340Var6, (qim0) null);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    vvm1.d(0, ((e920) obj3).a, x340Var8, null);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    vvm1.d(0, ((f920) obj3).a, x340Var10, null);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    uwo1.e(((ee21) obj3).b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var12, 0, 0, 2046);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    pa20 pa20Var = ((qa20) obj3).c;
                    if (pa20Var instanceof na20) {
                        i = 2131955998;
                    } else if (pa20Var instanceof ma20) {
                        i = 2131955984;
                    } else if (pa20Var instanceof ka20) {
                        i = 2131955982;
                    } else if (pa20Var instanceof oa20) {
                        i = 2131955999;
                    } else {
                        if (!(pa20Var instanceof la20)) {
                            eg.o();
                            return null;
                        }
                        i = 2131955983;
                    }
                    uwo1.e(cwl1.o0(x340Var14, i), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var14, 0, 0, 2046);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                bx20 bx20Var = (bx20) obj3;
                dx20 dx20Var = bx20Var.a;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    nx20 nx20Var = dx20Var.a;
                    if (nx20Var.equals(ex20.d)) {
                        xw20Var = new xw20(2131956048, 2131956047, new ww20(nx20Var.a()));
                    } else if (nx20Var.equals(lx20.d)) {
                        xw20Var = new xw20(2131956064, 2131956063, new ww20(nx20Var.a()));
                    } else if (nx20Var.equals(mx20.d)) {
                        xw20Var = new xw20(2131956062, 2131956061, new ww20(nx20Var.a()));
                    } else if (nx20Var.equals(kx20.d)) {
                        xw20Var = new xw20(2131956060, 2131956059, new ww20(nx20Var.a()));
                    } else if (nx20Var.equals(fx20.d)) {
                        xw20Var = new xw20(2131956050, 2131956049, new ww20(nx20Var.a()));
                    } else if (nx20Var.equals(jx20.d)) {
                        xw20Var = new xw20(2131956058, 2131956057, new ww20(nx20Var.a()));
                    } else if (nx20Var.equals(gx20.d)) {
                        xw20Var = new xw20(2131956052, 2131956051, new ww20(nx20Var.a()));
                    } else {
                        if (!nx20Var.equals(hx20.d)) {
                            eg.o();
                            return null;
                        }
                        xw20Var = new xw20(2131956055, 2131956054, new ww20(nx20Var.a()));
                    }
                    otw.c((maa) bx20Var.c.get(), new yw20(xw20Var, dx20Var.a), (qim0) null, (ipb1) null, x340Var16, 0, 12);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 9:
                return new uuj((ymd0) obj2, new zf10((p130) obj3, (cir0) obj, (byte) 16));
            case 10:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x230 x230Var = (x230) obj3;
                    f330 f330Var = x230Var.b;
                    z230 z230Var = x230Var.c;
                    otw.c(f330Var, new e330(z230Var.a, z230Var.b), (qim0) null, (ipb1) null, x340Var18, 0, 12);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 11:
                return new u7h(((wa30) obj3).c.e);
            case 12:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    uwo1.e(((cb30) obj3).a, nim0.a, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var20, 48, 0, 2044);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                ForcedGraduationLockActivity forcedGraduationLockActivity = (ForcedGraduationLockActivity) obj3;
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    Object objT = x340Var22.T();
                    Object obj4 = fkj0.X;
                    if (objT == obj4) {
                        lzn0 lzn0Var = forcedGraduationLockActivity.i1;
                        if (lzn0Var == null) {
                            u890.C("navigator");
                            throw null;
                        }
                        ov20 ov20Var = forcedGraduationLockActivity.j1;
                        if (ov20Var == null) {
                            u890.C("flowProductState");
                            throw null;
                        }
                        objT = new sc30(lzn0Var, ov20Var);
                        x340Var22.s0(objT);
                    }
                    sc30 sc30Var = (sc30) objT;
                    Object objT2 = x340Var22.T();
                    if (objT2 == obj4) {
                        objT2 = new oc30((Integer) forcedGraduationLockActivity.m1.getValue(), forcedGraduationLockActivity.l1);
                        x340Var22.s0(objT2);
                    }
                    oc30 oc30Var = (oc30) objT2;
                    ipb1 ipb1VarD = wpb1.D("key-forced-graduation-lock-element-state", sc30Var, oc30Var, x340Var22, 390);
                    View view = (View) x340Var22.k(AndroidCompositionLocals_androidKt.f);
                    int i3 = ForcedGraduationLockActivity.n1;
                    op80 jp80Var = new jp80(view);
                    l6h1 l6h1Var = forcedGraduationLockActivity.f1;
                    if (l6h1Var == null) {
                        u890.C("ubiDwellTimeLogger");
                        throw null;
                    }
                    i8h1 i8h1Var = forcedGraduationLockActivity.g1;
                    if (i8h1Var == null) {
                        u890.C("ubiLogger");
                        throw null;
                    }
                    op80 eq80Var = new eq80(new e3h1(l6h1Var, (n7h1) null, i8h1Var));
                    op80 wchVar = q6x.b;
                    if (jp80Var.equals(wchVar) && eq80Var.equals(wchVar)) {
                        jp80Var = wchVar;
                    } else if (jp80Var.equals(wchVar)) {
                        jp80Var = eq80Var;
                    } else if (!eq80Var.equals(wchVar)) {
                        wchVar = new wch(jp80Var, eq80Var);
                        jp80Var = wchVar;
                    }
                    xhk1.c(view, jp80Var);
                    qsw.c(new obk1(view), apo.r(-336935588, new qfx(forcedGraduationLockActivity, sc30Var, oc30Var, ipb1VarD, (byte) 19), x340Var22), x340Var22, 48);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 14:
                return ((xi7) obj3).l((Intent) obj, (th61) obj2);
            case 15:
                ((Number) obj2).intValue();
                gk30.c((yyi1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                ym90 ym90Var = (ym90) obj3;
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    String strO0 = cwl1.o0(x340Var24, 2131956129);
                    boolean zI = x340Var24.i(ym90Var);
                    Object objT3 = x340Var24.T();
                    if (zI || objT3 == fkj0.X) {
                        objT3 = new f710(ym90Var, (byte) 19);
                        x340Var24.s0(objT3);
                    }
                    Function0 function0 = (Function0) objT3;
                    if (ihc1.y0(strO0)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.f(new gbx(new y50(strO0), function0), (qim0) null, (max) null, (gdx) null, (idn0) null, (vu30) null, (vu30) null, npi.a, x340Var24, 12582912, 126);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    dn30 dn30Var = (dn30) obj3;
                    qj0 qj0Var = dn30Var.b;
                    en30 en30Var = dn30Var.c.a;
                    we10 we10Var = en30Var.a;
                    String str = we10Var.a;
                    String str2 = we10Var.b;
                    String str3 = we10Var.c;
                    phx phxVar = new phx(8, 0L, str3 == null ? "" : str3, str, str2);
                    we10 we10Var2 = en30Var.b;
                    String str4 = we10Var2.a;
                    String str5 = we10Var2.b;
                    String str6 = we10Var2.c;
                    otw.c(qj0Var, new zm30(phxVar, new phx(8, 0L, str6 == null ? "" : str6, str4, str5)), (qim0) null, (ipb1) null, x340Var26, 64, 12);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 18:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    otw.c(((kn30) obj3).b, jn30.a, (qim0) null, (ipb1) null, x340Var28, 48, 12);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 19:
                x340 x340Var29 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    qim0 qim0VarD = u291.d(nim0.a, 1.0f);
                    yt30 yt30Var = (yt30) obj3;
                    String str7 = yt30Var.g;
                    aq8.h(str7 != null ? new jlw0(str7, "") : yt30Var.Y, yt30Var.f, yt30Var.h, yt30Var.i, yt30Var.t, yt30Var.Z, qim0VarD, x340Var30, 1572864);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            case 20:
                ((Number) obj2).intValue();
                lcc.s((zx30) obj3, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 21:
                x340 x340Var31 = (b0k) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                u540 u540Var = (u540) obj3;
                x340 x340Var32 = x340Var31;
                if (x340Var32.Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    q7r0 q7r0Var = u540Var.c;
                    boolean z = u540Var.b.b;
                    zip zipVar = u540Var.d;
                    d0r d0rVarC = cwl1.C(q7r0Var);
                    boolean zG = x340Var32.g(d0rVarC) | x340Var32.g(zipVar) | x340Var32.h(z);
                    Object objT4 = x340Var32.T();
                    if (zG || objT4 == fkj0.X) {
                        p2o0 p2o0Var = (p2o0) zipVar.a.c;
                        objT4 = new t540((chp) p2o0Var.e, (chp) p2o0Var.f, d0rVarC, z);
                        x340Var32.s0(objT4);
                    }
                    nyx.a(2, (wux) null, apo.r(213859695, new xx00((t540) objT4, u540Var, d0rVarC, (byte) 24), x340Var32), x340Var32, 3078, 6);
                } else {
                    x340Var32.b0();
                }
                return rih1Var;
            case 22:
                sp00 sp00Var = (sp00) ((fxh) obj3).c;
                return new jpg0(new jb3((hjc) sp00Var.b, (y5v0) sp00Var.c, (mcn1) sp00Var.d, (ij81) sp00Var.e, new epb1((zob1) obj)), l540.e1);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                List list = (List) obj;
                String str8 = ((zb40) obj3).c.d;
                int iOrdinal = new y6b1(str8, false).c.ordinal();
                if (iOrdinal == 2) {
                    i2 = 2;
                } else {
                    if (iOrdinal != 8) {
                        k220.f("Unsupported content uri: ".concat(str8));
                        return null;
                    }
                    i2 = 1;
                }
                return new wb40(str8, i2, list, b7x.a, false, "https://support.spotify.com/article/managed-accounts-for-premium-family/");
            case 24:
                ((Number) obj2).intValue();
                d1u.k((s8b) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                yd40 yd40Var = (yd40) obj;
                return First.b(zd40.a((zd40) obj2, false, yd40Var.a, yd40Var.b, ((de40) obj3).b.c(), 1));
            case 26:
                x340 x340Var33 = (b0k) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                ig40 ig40Var = (ig40) obj3;
                x340 x340Var34 = x340Var33;
                if (x340Var34.Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    nmu0 nmu0Var = ig40Var.b.a;
                    ro30 ro30Var = ig40Var.e;
                    boolean zI2 = x340Var34.i(ig40Var);
                    Object objT5 = x340Var34.T();
                    if (zI2 || objT5 == fkj0.X) {
                        objT5 = new u830(ig40Var, (byte) 17);
                        x340Var34.s0(objT5);
                    }
                    pxd0.f(nmu0Var, null, ro30Var, (iu30) objT5, x340Var34, 0);
                } else {
                    x340Var34.b0();
                }
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                ((pg40) obj3).d((b0k) obj, czo1.p(7));
                return rih1Var;
            case 28:
                x340 x340Var35 = (b0k) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                u250 u250Var = (u250) obj3;
                x340 x340Var36 = x340Var35;
                if (x340Var36.Y(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    j0f0 j0f0Var = (j0f0) u250Var.j2.getValue();
                    if (j0f0Var == null) {
                        x340Var36.i0(-1310820922);
                        x340Var36.r(false);
                    } else {
                        x340Var36.i0(-1310820921);
                        boolean zI3 = x340Var36.i(u250Var);
                        Object objT6 = x340Var36.T();
                        if (zI3 || objT6 == fkj0.X) {
                            objT6 = new t250(u250Var, (byte) 3);
                            x340Var36.s0(objT6);
                        }
                        yoi1.e(j0f0Var, (Function0) objT6, 0, x340Var36, 8);
                        x340Var36.r(false);
                    }
                } else {
                    x340Var36.b0();
                }
                return rih1Var;
            default:
                x340 x340Var37 = (b0k) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                l750 l750Var = (l750) obj3;
                x340 x340Var38 = x340Var37;
                if (x340Var38.Y(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    lzn0 lzn0Var2 = l750Var.b;
                    o750 o750Var = l750Var.d;
                    lik1 lik1Var = o750Var.b;
                    lik1 lik1Var2 = o750Var.d;
                    v850 v850Var = o750Var.c;
                    lc20 lc20Var = l750Var.e;
                    boolean zI4 = x340Var38.i(l750Var);
                    Object objT7 = x340Var38.T();
                    if (zI4 || objT7 == fkj0.X) {
                        objT7 = new g050(l750Var, (byte) 2);
                        x340Var38.s0(objT7);
                    }
                    mth1.d(lzn0Var2, lik1Var, lik1Var2, v850Var, lc20Var, (Function0) objT7, x340Var38, 0);
                } else {
                    x340Var38.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rr10(Object obj, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }
}
