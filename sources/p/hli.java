package p;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hli extends hab0 implements vu30 {
    public static final hli N0;
    public static final hli O0;
    public static final hli P0;
    public static final hli Q0;
    public static final hli R0;
    public static final hli S0;
    public static final hli T0;
    public static final hli U0;
    public static final hli V0;
    public static final hli W0;
    public static final hli X;
    public static final hli X0;
    public static final hli Y;
    public static final hli Y0;
    public static final hli Z;
    public static final hli Z0;
    public static final hli a1;
    public static final hli b;
    public static final hli b1;
    public static final hli c;
    public static final hli c1;
    public static final hli d;
    public static final hli d1;
    public static final hli e;
    public static final hli e1;
    public static final hli f;
    public static final hli g;
    public static final hli h;
    public static final hli i;
    public static final hli t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new hli(i2, (byte) 0);
        c = new hli(i2, (byte) 1);
        d = new hli(i2, (byte) 2);
        e = new hli(i2, (byte) 3);
        f = new hli(i2, (byte) 4);
        g = new hli(i2, (byte) 5);
        h = new hli(i2, (byte) 6);
        i = new hli(i2, (byte) 7);
        t = new hli(i2, (byte) 8);
        X = new hli(i2, (byte) 9);
        Y = new hli(i2, (byte) 10);
        Z = new hli(i2, (byte) 11);
        N0 = new hli(i2, (byte) 12);
        O0 = new hli(i2, (byte) 13);
        P0 = new hli(i2, (byte) 14);
        Q0 = new hli(i2, (byte) 15);
        R0 = new hli(i2, (byte) 16);
        S0 = new hli(i2, (byte) 17);
        T0 = new hli(i2, (byte) 18);
        U0 = new hli(i2, (byte) 19);
        V0 = new hli(i2, (byte) 20);
        W0 = new hli(i2, (byte) 21);
        X0 = new hli(i2, (byte) 22);
        Y0 = new hli(i2, (byte) 23);
        Z0 = new hli(i2, (byte) 24);
        a1 = new hli(i2, (byte) 25);
        b1 = new hli(i2, (byte) 26);
        c1 = new hli(i2, (byte) 27);
        d1 = new hli(i2, (byte) 28);
        e1 = new hli(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hli(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        String string;
        p8h0 p8h0VarC;
        byte b2 = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    uwo1.e(cwl1.o0(x340Var2, 2131953046), null, null, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2046);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    uwo1.e(cwl1.o0(x340Var4, 2131953047), null, null, 0L, null, null, 0, false, null, 0, null, x340Var4, 0, 0, 2046);
                }
                break;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    uwo1.e(cwl1.o0(x340Var6, 2131953050), null, null, 0L, null, null, 0, false, null, 0, null, x340Var6, 0, 0, 2046);
                }
                break;
            case 3:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x340Var8.b0();
                } else {
                    w0h1.a(wrx.c, isl.a, u291.r(nim0Var, 16.0f), 0L, 0L, false, x340Var8, wrx.d | 48, 56);
                }
                break;
            case 4:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (!x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x340Var10.b0();
                } else {
                    uwo1.e(cwl1.o0(x340Var10, 2131954533), u291.f(nim0Var, 1.0f), null, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var10, 0, 0, 2028);
                }
                break;
            case 5:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (!x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x340Var12.b0();
                } else {
                    uwo1.e(cwl1.o0(x340Var12, 2131954534), u291.f(nim0Var, 1.0f), null, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var12, 0, 0, 2028);
                }
                break;
            case 6:
                b0k b0kVar = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                b0k b0kVar2 = (x340) b0kVar;
                if (!b0kVar2.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    b0kVar2.b0();
                } else {
                    vrg vrgVar = vrg.Z;
                    uwr uwrVar = cbx.a;
                    vrgVar.a(null, 36.0f, 4.0f, null, ((vex) zex.a.e).j, b0kVar2, 0, 9);
                }
                break;
            case 7:
                x340 x340Var13 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (!x340Var14.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x340Var14.b0();
                } else {
                    uwo1.e(cwl1.o0(x340Var14, 2131955482), null, null, 0L, null, null, 0, false, null, 0, null, x340Var14, 0, 0, 2046);
                }
                break;
            case 8:
                x340 x340Var15 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (!x340Var16.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x340Var16.b0();
                } else {
                    x74.e((qim0) null, x340Var16, 0);
                }
                break;
            case 9:
                x340 x340Var17 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (!x340Var18.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x340Var18.b0();
                } else {
                    eqr0.b(6, 2, " ", x340Var18, (qim0) null);
                }
                break;
            case 10:
                x340 x340Var19 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (!x340Var20.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x340Var20.b0();
                } else {
                    lex lexVarZ = yoo1.z(x340Var20);
                    nex nexVar = new nex(4);
                    zzq0 zzq0Var = yoo1.z(x340Var20).a;
                    Object objT = x340Var20.T();
                    if (objT == fkj0.X) {
                        objT = ovh.c1;
                        x340Var20.s0(objT);
                    }
                    poo1.g(false, (iu30) objT, nexVar, lexVarZ, null, 0, null, null, null, null, null, null, null, false, zzq0Var, ami.a, x340Var20, 54, 199680, 8176);
                }
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                x340 x340Var21 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (!x340Var22.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x340Var22.b0();
                } else {
                    uwo1.e(cwl1.o0(x340Var22, 2131955936), null, null, z4p1.f(167, 167, 167, 255), null, null, 0, false, null, 0, null, x340Var22, 3072, 0, 2038);
                }
                break;
            case grn1.d /* 12 */:
                x340 x340Var23 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (!x340Var24.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x340Var24.b0();
                } else {
                    uwo1.e(cwl1.o0(x340Var24, 2131962978), null, null, 0L, null, null, 0, false, null, 0, null, x340Var24, 0, 0, 2046);
                }
                break;
            case 13:
                x340 x340Var25 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                if (!x340Var26.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x340Var26.b0();
                } else {
                    olx olxVar = olx.c;
                    uwr uwrVar2 = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var26).g;
                    w0h1.a(olxVar, new jsl(cwl1.o0(x340Var26, 2131957161)), u291.r(nim0Var, 24.0f), 0L, 0L, false, x340Var26, olx.d, 56);
                }
                break;
            case 14:
                x340 x340Var27 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (!x340Var28.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x340Var28.b0();
                } else {
                    bzn1.e(null, null, false, null, rgr0.a, null, null, null, x340Var28, 0, 239);
                }
                break;
            case 15:
                x340 x340Var29 = (b0k) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                x340 x340Var30 = x340Var29;
                if (!x340Var30.Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x340Var30.b0();
                } else {
                    uwo1.e(cwl1.o0(x340Var30, 2131955521), null, null, 0L, null, null, 0, false, null, 0, null, x340Var30, 0, 0, 2046);
                }
                break;
            case 16:
                x340 x340Var31 = (b0k) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                x340 x340Var32 = x340Var31;
                if (!x340Var32.Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    x340Var32.b0();
                } else {
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(cwl1.o0(x340Var32, 2131953577), null, null, cbx.a(x340Var32).b.a, null, null, 0, false, null, 0, null, x340Var32, 0, 0, 2038);
                }
                break;
            case 17:
                x340 x340Var33 = (b0k) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                x340 x340Var34 = x340Var33;
                if (!x340Var34.Y(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    x340Var34.b0();
                }
                break;
            case 18:
                x340 x340Var35 = (b0k) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                x340 x340Var36 = x340Var35;
                if (!x340Var36.Y(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    x340Var36.b0();
                }
                break;
            case 19:
                x340 x340Var37 = (b0k) obj;
                int iIntValue20 = ((Number) obj2).intValue();
                x340 x340Var38 = x340Var37;
                if (!x340Var38.Y(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    x340Var38.b0();
                } else {
                    w0h1.a(xpx.c, isl.a, (qim0) null, 0L, 0L, false, x340Var38, xpx.d | 48, 60);
                }
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                x340 x340Var39 = (b0k) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                x340 x340Var40 = x340Var39;
                if (!x340Var40.Y(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    x340Var40.b0();
                } else {
                    w0h1.a(nox.c, isl.a, (qim0) null, 0L, 0L, false, x340Var40, nox.d | 48, 60);
                }
                break;
            case 21:
                x340 x340Var41 = (b0k) obj;
                int iIntValue22 = ((Number) obj2).intValue();
                x340 x340Var42 = x340Var41;
                if (!x340Var42.Y(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    x340Var42.b0();
                } else {
                    w0h1.a(ikx.c, new jsl(cwl1.o0(x340Var42, 2131955567)), (qim0) null, 0L, 0L, false, x340Var42, ikx.d, 60);
                }
                break;
            case 22:
                x340 x340Var43 = (b0k) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                x340 x340Var44 = x340Var43;
                if (!x340Var44.Y(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    x340Var44.b0();
                } else {
                    String strO0 = cwl1.o0(x340Var44, 2131956569);
                    uwr uwrVar4 = cbx.a;
                    uwo1.e(strO0, null, cbx.d(x340Var44).h, 0L, null, null, 0, false, null, 0, null, x340Var44, 0, 0, 2042);
                }
                break;
            case 23:
                x340 x340Var45 = (b0k) obj;
                int iIntValue24 = ((Number) obj2).intValue();
                x340 x340Var46 = x340Var45;
                if (!x340Var46.Y(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    x340Var46.b0();
                } else {
                    w0h1.a(wrx.c, isl.a, (qim0) null, 0L, 0L, false, x340Var46, wrx.d | 48, 60);
                }
                break;
            case 24:
                x340 x340Var47 = (b0k) obj;
                int iIntValue25 = ((Number) obj2).intValue();
                x340 x340Var48 = x340Var47;
                if (!x340Var48.Y(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    x340Var48.b0();
                } else {
                    uwo1.e(cwl1.o0(x340Var48, 2131953394), null, null, 0L, null, null, 0, false, null, 0, null, x340Var48, 0, 0, 2046);
                }
                break;
            case 25:
                x340 x340Var49 = (b0k) obj;
                int iIntValue26 = ((Number) obj2).intValue();
                x340 x340Var50 = x340Var49;
                if (!x340Var50.Y(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    x340Var50.b0();
                } else {
                    uwo1.e(cwl1.o0(x340Var50, 2131953379), null, null, 0L, null, null, 0, false, null, 0, null, x340Var50, 0, 0, 2046);
                }
                break;
            case 26:
                x340 x340Var51 = (b0k) obj;
                int iIntValue27 = ((Number) obj2).intValue();
                x340 x340Var52 = x340Var51;
                if (!x340Var52.Y(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    x340Var52.b0();
                } else {
                    uwo1.e(cwl1.o0(x340Var52, 2131953378), null, null, 0L, null, null, 0, false, null, 0, null, x340Var52, 0, 0, 2046);
                }
                break;
            case 27:
                x340 x340Var53 = (b0k) obj;
                int iIntValue28 = ((Number) obj2).intValue();
                x340 x340Var54 = x340Var53;
                if (!x340Var54.Y(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    x340Var54.b0();
                } else {
                    CharSequence text = ((Context) x340Var54.k(AndroidCompositionLocals_androidKt.b)).getResources().getText(2131953393);
                    if (text instanceof Spanned) {
                        string = Html.toHtml((Spanned) text, 0);
                        mbh0 mbh0VarM = mno1.m(Pattern.compile("<p dir=\"(?:ltr|rtl)\">(.*?)</p>").matcher(string), 0, string);
                        if (mbh0VarM != null && (p8h0VarC = mbh0VarM.c.c(1)) != null) {
                            string = p8h0VarC.a;
                        }
                    } else {
                        string = text.toString();
                    }
                    uwr uwrVar5 = cbx.a;
                    uwo1.f(fuo1.v(string, new e930(cbx.d(x340Var54).k.a.f, null)), null, null, null, null, null, 0, false, null, 0, null, null, x340Var54, 0, 0, 4094);
                }
                break;
            case 28:
                x340 x340Var55 = (b0k) obj;
                int iIntValue29 = ((Number) obj2).intValue();
                x340 x340Var56 = x340Var55;
                if (!x340Var56.Y(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    x340Var56.b0();
                } else {
                    uwo1.e(cwl1.o0(x340Var56, 2131958437), null, null, 0L, null, null, 0, false, null, 0, null, x340Var56, 0, 0, 2046);
                }
                break;
            default:
                x340 x340Var57 = (b0k) obj;
                int iIntValue30 = ((Number) obj2).intValue();
                x340 x340Var58 = x340Var57;
                if (!x340Var58.Y(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    x340Var58.b0();
                } else {
                    uwo1.e(cwl1.o0(x340Var58, 2131958438), null, null, 0L, null, null, 0, false, null, 0, null, x340Var58, 0, 0, 2046);
                }
                break;
        }
        return rih1Var;
    }
}
