package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d720 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d720(iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        z50 z50Var = z50.c;
        byte b2 = 7;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new y620((uha1) obj, ((Number) obj2).intValue()));
                return rih1Var;
            case 1:
                iu30Var.invoke(new v620((List) obj, (uha1) obj2));
                return rih1Var;
            case 2:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    jsl jslVar = new jsl(cwl1.o0(x340Var2, 2131953909));
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new y720(iu30Var, (byte) 2);
                        x340Var2.s0(objT);
                    }
                    o0p1.b(jslVar, (Function0) objT, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    jsl jslVar2 = new jsl(cwl1.o0(x340Var4, 2131953908));
                    boolean zG2 = x340Var4.g(iu30Var);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == fkj0.X) {
                        objT2 = new y720(iu30Var, (byte) 4);
                        x340Var4.s0(objT2);
                    }
                    o0p1.b(jslVar2, (Function0) objT2, x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    jsl jslVar3 = new jsl(cwl1.o0(x340Var6, 2131953906));
                    boolean zG3 = x340Var6.g(iu30Var);
                    Object objT3 = x340Var6.T();
                    if (zG3 || objT3 == fkj0.X) {
                        objT3 = new y720(iu30Var, (byte) 9);
                        x340Var6.s0(objT3);
                    }
                    o0p1.b(jslVar3, (Function0) objT3, x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 5:
                iu30Var.invoke(new pb30((kq61) obj, (String) obj2));
                return rih1Var;
            case 6:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    j82.h(0, x340Var8, iu30Var, (qim0) null);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    String strO0 = cwl1.o0(x340Var10, 2131956386);
                    boolean zG4 = x340Var10.g(iu30Var);
                    Object objT4 = x340Var10.T();
                    if (zG4 || objT4 == fkj0.X) {
                        objT4 = new g850(iu30Var, (byte) 2);
                        x340Var10.s0(objT4);
                    }
                    Function0 function0 = (Function0) objT4;
                    if (ihc1.y0(strO0)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    wro1.l(new gbx(new y50(strO0), function0), (qim0) null, (max) null, (gdx) null, (idn0) null, nqi.b, x340Var10, 196608, 30);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    ti5.a(nqi.a, (qim0) null, apo.r(-43860396, new d720(iu30Var, b2), x340Var12), (xu30) null, 0.0f, (erl1) null, kkn.C(cbx.a(x340Var12).a.d, 0L, 0L, 0L, 0L, x340Var12, 62), x340Var12, 390, 186);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 9:
                iu30Var.invoke(new lb60(((Number) obj).intValue(), ((Number) obj2).intValue()));
                return rih1Var;
            case 10:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    boolean zG5 = x340Var14.g(iu30Var);
                    Object objT5 = x340Var14.T();
                    if (zG5 || objT5 == fkj0.X) {
                        objT5 = new zi80(iu30Var, (byte) 0);
                        x340Var14.s0(objT5);
                    }
                    h7p1.d((Function0) objT5, x340Var14, 0);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 11:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    boolean zG6 = x340Var16.g(iu30Var);
                    Object objT6 = x340Var16.T();
                    if (zG6 || objT6 == fkj0.X) {
                        objT6 = new zi80(iu30Var, (byte) 1);
                        x340Var16.s0(objT6);
                    }
                    h7p1.q((Function0) objT6, x340Var16, 0);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 12:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    boolean zG7 = x340Var18.g(iu30Var);
                    Object objT7 = x340Var18.T();
                    if (zG7 || objT7 == fkj0.X) {
                        objT7 = new zi80(iu30Var, (byte) 2);
                        x340Var18.s0(objT7);
                    }
                    h7p1.r((Function0) objT7, x340Var18, 0);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    boolean zG8 = x340Var20.g(iu30Var);
                    Object objT8 = x340Var20.T();
                    if (zG8 || objT8 == fkj0.X) {
                        objT8 = new zi80(iu30Var, (byte) 23);
                        x340Var20.s0(objT8);
                    }
                    iu90.a((Function0) objT8, x340Var20, 0);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 14:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    boolean zG9 = x340Var22.g(iu30Var);
                    Object objT9 = x340Var22.T();
                    if (zG9 || objT9 == fkj0.X) {
                        objT9 = new zi80(iu30Var, (byte) 24);
                        x340Var22.s0(objT9);
                    }
                    iu90.e((Function0) objT9, x340Var22, 0);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                acq0.o(iu30Var, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                hqq0.h(iu30Var, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                hqq0.k(iu30Var, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                iu30Var.invoke((iys0) obj);
                return rih1Var;
            case 19:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    boolean zG10 = x340Var24.g(iu30Var);
                    Object objT10 = x340Var24.T();
                    if (zG10 || objT10 == fkj0.X) {
                        objT10 = new sya0(iu30Var, (byte) 0);
                        x340Var24.s0(objT10);
                    }
                    wro1.l(new gbx(z50Var, (Function0) objT10), (qim0) null, (max) null, (gdx) null, (idn0) null, pui.b, x340Var24, 196608, 30);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 20:
                iu30Var.invoke(new bwb0(((Number) obj).intValue(), (String) obj2));
                return rih1Var;
            case 21:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    y251.c(iu30Var, x340Var26, 0);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                mqo1.k(iu30Var, (b0k) obj, czo1.p(1));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((Number) obj2).intValue();
                mqo1.l(iu30Var, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                return (qim0) iu30Var.invoke((aqb0) obj);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                iu30Var.invoke(new emd0(((Number) obj).intValue(), (String) obj2));
                return rih1Var;
            case 26:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    ldx ldxVar = ldx.c;
                    boolean zG11 = x340Var28.g(iu30Var);
                    Object objT11 = x340Var28.T();
                    if (zG11 || objT11 == fkj0.X) {
                        objT11 = new ijd0(iu30Var, b2);
                        x340Var28.s0(objT11);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT11), ldxVar, anm1.N("LocalFilesRationaleDialogDismissButton", nim0Var), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, cxi.c, x340Var28, 0, 48, 2040);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 27:
                x340 x340Var29 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    String strO1 = cwl1.o0(x340Var30, 2131952696);
                    boolean zG12 = x340Var30.g(iu30Var);
                    Object objT12 = x340Var30.T();
                    if (zG12 || objT12 == fkj0.X) {
                        objT12 = new ijd0(iu30Var, (byte) 8);
                        x340Var30.s0(objT12);
                    }
                    Function0 function1 = (Function0) objT12;
                    if (ihc1.y0(strO1)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    wro1.l(new gbx(new y50(strO1), function1), anm1.N("BackButton", nim0Var), (max) null, (gdx) null, (idn0) null, kxi.a, x340Var30, 196608, 28);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            case 28:
                iu30Var.invoke(new wof0((Set) obj, ((Boolean) obj2).booleanValue()));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                dem1.l(iu30Var, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d720(iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = iu30Var;
    }
}
