package p;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class q1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(gn1 gn1Var, Function0 function0, Function0 function1) {
        super(2);
        this.a = (byte) 19;
        this.b = gn1Var;
        this.c = function0;
        this.d = function1;
    }

    public final Object invoke(Object obj, Object obj2) {
        String str;
        cyn cynVar;
        vu30 vu30Var;
        byte b;
        vu30 vu30Var2;
        int i;
        ayn zxnVar;
        byte b2 = this.a;
        nim0 nim0Var = nim0.a;
        tit titVar = null;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                iu30 iu30Var = (iu30) obj3;
                s1 s1Var = (s1) obj4;
                h1 h1Var = (h1) obj5;
                String str2 = h1Var.d;
                int i2 = h1Var.f;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b1 b1Var = h1Var.o;
                    y0 y0Var = h1Var.n;
                    int i3 = i2 != 0 ? 1 : 0;
                    String strO0 = cwl1.o0(x340Var2, 2131952154);
                    String str3 = h1Var.m;
                    String str4 = h1Var.b;
                    String str5 = h1Var.e;
                    int i4 = y0Var.b;
                    int i5 = y0Var.a;
                    int i6 = h1Var.f;
                    tn30 tn30Var = h1Var.g;
                    Integer num = h1Var.j;
                    String str6 = h1Var.k;
                    Long l = h1Var.h;
                    String str7 = h1Var.i;
                    boolean z = y0Var.d;
                    x0 x0VarA = b1Var.a();
                    x0 x0VarA2 = h1Var.f10p.a();
                    if (i2 != 0) {
                        int iC = l1d.C(i2);
                        if (iC != 0) {
                            str = str5;
                            if (iC != 1) {
                                if (iC == 2) {
                                    i = 2;
                                } else {
                                    eg.o();
                                }
                                return null;
                            }
                            i = 1;
                        } else {
                            str = str5;
                            i = 4;
                        }
                        String str8 = h1Var.b;
                        int iC2 = l1d.C(i2);
                        if (iC2 == 0) {
                            zxnVar = new zxn(str8);
                        } else {
                            if (iC2 != 1 && iC2 != 2) {
                                eg.o();
                                return null;
                            }
                            zxnVar = new xxn(str8, strO0);
                        }
                        cynVar = new cyn(i, 0, zxnVar);
                    } else {
                        str = str5;
                        rih1Var = rih1Var;
                        cynVar = null;
                    }
                    tn30 tn30Var2 = h1Var.g;
                    cyn cynVar2 = (tn30Var2 == null || y0Var.b != 1 || h1Var.e == null) ? null : new cyn(3, i3, new yxn(tn30Var2));
                    if (h1Var.l) {
                        x340Var2.i0(-1335265357);
                        vu30 vu30VarR = apo.r(-597929036, new o1(h1Var, s1Var), x340Var2);
                        x340Var2.r(false);
                        vu30Var = vu30VarR;
                    } else {
                        x340Var2.i0(-1334559828);
                        x340Var2.r(false);
                        vu30Var = null;
                    }
                    boolean z2 = ((b1Var instanceof z0) && ihc1.y0(str2)) ? false : true;
                    if (s1Var.i.e) {
                        x340Var2.i0(-1334244806);
                        vu30 vu30VarR2 = apo.r(-1306675972, new o1(s1Var, h1Var), x340Var2);
                        b = 0;
                        x340Var2.r(false);
                        vu30Var2 = vu30VarR2;
                    } else {
                        b = 0;
                        x340Var2.i0(-1333915028);
                        x340Var2.r(false);
                        vu30Var2 = null;
                    }
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == m4cVar) {
                        objT = new p1(iu30Var, b);
                        x340Var2.s0(objT);
                    }
                    Function0 function0 = (Function0) objT;
                    boolean zG2 = x340Var2.g(iu30Var);
                    Object objT2 = x340Var2.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = new p1(iu30Var, (byte) 1);
                        x340Var2.s0(objT2);
                    }
                    pro1.a(str3, str4, str2, str, i4, i5, i6, tn30Var, num, str6, l, str7, z, x0VarA, x0VarA2, vu30Var, function0, (Function0) objT2, cynVar, cynVar2, vu30Var2, z2, x340Var2, 0);
                } else {
                    rih1Var = rih1Var;
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                gto1.d((ArrayList) obj5, (n041) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                gto1.l((q041) obj5, (n041) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                dxo1.i((String) obj5, (gw70) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                eyo1.a((mp) obj5, (iu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                ((pt) obj5).j((ev) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                i40 i40Var = (i40) obj4;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    vyo1.a((e40) obj5, (xho) i40Var.N0.getValue(), (hft0) i40Var.O0.getValue(), (xgx0) i40Var.P0.getValue(), (iu30) obj3, null, x340Var4, 4160);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 7:
                String str9 = (String) obj;
                Bundle bundle = (Bundle) obj2;
                lg0 lg0Var = (lg0) obj5;
                wdg wdgVar = (tka0) obj4;
                String strO = wdgVar.o();
                if (strO == null) {
                    strO = "zeroResult";
                }
                if (str9.equals(strO)) {
                    if (((f21) lg0Var.a.get(wdgVar.n())) == null) {
                        eg.m("Missing result");
                        return null;
                    }
                    String string = bundle.getString("error");
                    if (u890.j(string, "invalid_credentials")) {
                        titVar = tit.a;
                    } else if (u890.j(string, "invalid_email")) {
                        titVar = uit.a;
                    } else if (u890.j(string, "invalid_phone_number")) {
                        titVar = vit.a;
                    }
                    ((iu30) obj3).invoke(new xit(titVar));
                }
                return rih1Var;
            case 8:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    u1p1.a((jk0) obj5, (iu30) obj3, (op0) ((qj0) obj4).e, null, x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                ((wj0) obj5).e(czo1.p(1), (String) obj4, (Function0) obj3, (b0k) obj);
                return rih1Var;
            case 10:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    rk0 rk0Var = (rk0) obj4;
                    qk0 qk0Var = (qk0) obj3;
                    otw.c((rwj) ((tm) obj5).e, new tl0(rk0Var.a, qk0Var.a, qk0Var.b, rk0Var.e), (qim0) null, (ipb1) null, x340Var8, 0, 12);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    qim0 qim0VarK = d9y0.k(nim0Var, ((fm0) obj5).a ? 1.0f : 0.0f);
                    boolean zG3 = x340Var10.g(iu30Var2);
                    Object objT3 = x340Var10.T();
                    if (zG3 || objT3 == fkj0.X) {
                        objT3 = new p1(iu30Var2, (byte) 16);
                        x340Var10.s0(objT3);
                    }
                    wro1.h(new gbx(z50.c, (Function0) objT3), ldx.c, qim0VarK, null, yla.p(x340Var10).a(), null, false, null, null, apo.r(186620987, new f90((hux) obj4, (byte) 1), x340Var10), x340Var10, 0, 6, 984);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                g2p1.b((ziu) obj5, (xb10) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    j2p1.a((zq0) obj5, ((Boolean) ((Function0) obj4).invoke()).booleanValue(), (iu30) obj3, null, x340Var12, 0);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 14:
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                bb1 bb1Var = (bb1) obj4;
                eb1 eb1Var = (eb1) obj5;
                em0 em0Var = eb1Var.d;
                x340 x340Var14 = x340Var13;
                if (!x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x340Var14.b0();
                } else if (eb1Var.g.b.b()) {
                    x340Var14.i0(493627352);
                    d0r d0rVarC = cwl1.C(((cir0) x340Var14.k(k2r0.a)).g());
                    bb1Var.getClass();
                    b5p1.a(bb1Var, iu30Var3, em0Var, d0rVarC, eb1Var.f, null, x340Var14, 0);
                    x340Var14.r(false);
                } else {
                    x340Var14.i0(494010729);
                    bb1Var.getClass();
                    z4p1.b(bb1Var, iu30Var3, em0Var, null, x340Var14, 0);
                    x340Var14.r(false);
                }
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                j6p1.a((p10) obj5, (qim0) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    fm50 fm50Var = (fm50) obj5;
                    gj1 gj1Var = (gj1) obj4;
                    w4i1 w4i1Var = gj1Var.d;
                    otw.c(fm50Var, new bm50(1, pcf.d(6, gj1Var.a, null), w4i1Var.a, w4i1Var.b, (String) ((ven0) obj3).getValue()), (qim0) null, (ipb1) null, x340Var16, 0, 12);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                wm1 wm1Var = (wm1) obj4;
                iu30 iu30Var4 = (iu30) obj3;
                tm1 tm1Var = (tm1) obj5;
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    boolean z3 = tm1Var.b < 10;
                    Object objT4 = x340Var18.T();
                    m4c m4cVar2 = fkj0.X;
                    if (objT4 == m4cVar2) {
                        objT4 = v8r.q(Boolean.FALSE);
                        x340Var18.s0(objT4);
                    }
                    ven0 ven0Var = (ven0) objT4;
                    boolean zH = x340Var18.h(z3) | x340Var18.g(iu30Var4) | x340Var18.i(ven0Var);
                    Object objT5 = x340Var18.T();
                    if (zH || objT5 == m4cVar2) {
                        objT5 = new vm1(z3, iu30Var4, ven0Var, (byte) 0);
                        x340Var18.s0(objT5);
                    }
                    w5p1.b(0, (Function0) objT5, x340Var18, z3);
                    if (((Boolean) ven0Var.getValue()).booleanValue()) {
                        x340Var18.i0(2001479592);
                        p40 p40Var = wm1Var.d;
                        boolean zI = x340Var18.i(ven0Var);
                        Object objT6 = x340Var18.T();
                        if (zI || objT6 == m4cVar2) {
                            objT6 = new ma0(ven0Var, (byte) 6);
                            x340Var18.s0(objT6);
                        }
                        otw.c(p40Var, new f4f((Function0) objT6), (qim0) null, (ipb1) null, x340Var18, 0, 12);
                        x340Var18.r(false);
                    } else {
                        x340Var18.i0(2001648728);
                        x340Var18.r(false);
                    }
                    if (tm1Var.c) {
                        x340Var18.i0(2001694236);
                        Object objT7 = x340Var18.T();
                        if (objT7 == m4cVar2) {
                            objT7 = wm1Var.e.a(new qj(iu30Var4, (byte) 28));
                            x340Var18.s0(objT7);
                        }
                        otw.c((hbd) objT7, new fbd(tm1Var.d, true, (Intent) null), (qim0) null, (ipb1) null, x340Var18, 0, 12);
                        x340Var18.r(false);
                    } else {
                        x340Var18.i0(2002028664);
                        x340Var18.r(false);
                    }
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 18:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                g3 g3Var = (g3) obj3;
                m4c m4cVar3 = fkj0.X;
                hh hhVar = (hh) obj4;
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    gn1 gn1Var = (gn1) obj5;
                    boolean zG4 = x340Var20.g(hhVar);
                    Object objT8 = x340Var20.T();
                    if (zG4 || objT8 == m4cVar3) {
                        objT8 = new g3(hhVar, (byte) 19);
                        x340Var20.s0(objT8);
                    }
                    Function0 function1 = (Function0) objT8;
                    boolean zG5 = x340Var20.g(g3Var);
                    Object objT9 = x340Var20.T();
                    if (zG5 || objT9 == m4cVar3) {
                        objT9 = new g3(g3Var, (byte) 20);
                        x340Var20.s0(objT9);
                    }
                    n8p1.a(gn1Var, function1, (Function0) objT9, null, x340Var20, 0);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 19:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                gn1 gn1Var2 = (gn1) obj5;
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    iqo1.d(apo.r(-1545198377, new hn1(gn1Var2, (byte) 0), x340Var22), apo.r(573852598, new wm((Function0) obj4, (byte) 4), x340Var22), anm1.N("save_for_later_dialog", nim0Var), apo.r(516987252, new hn1(gn1Var2, (byte) 1), x340Var22), apo.r(-1658929069, new hn1(gn1Var2, (byte) 2), x340Var22), apo.r(460121906, new wm((Function0) obj3, (byte) 5), x340Var22), x340Var22, 224310, 0);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                w8p1.i((xtb0) obj5, (c380) obj4, (ab) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                ((ov1) obj5).b((qim0) obj4, (g431) obj3, (b0k) obj, czo1.p(519));
                return rih1Var;
            case 22:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                tu1 tu1Var = (tu1) obj4;
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    ((j2i) obj5).c1(tu1Var.a(), Boolean.valueOf(tu1Var.b().size() > 1), (Function0) obj3, x340Var24, 0);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                t9p1.e((ow1) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                d32.a((vta1) obj5, (qim0) obj4, (fua1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                pap1.f((h52) obj5, (iu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 26:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    ahm0 ahm0Var = (ahm0) obj5;
                    zod.a(ahm0Var.b, ahm0Var.d, (iu30) obj3, ((oc2) obj4).e, (qim0) null, x340Var26, 0);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 27:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                iu30 iu30Var5 = (iu30) obj3;
                m4c m4cVar4 = fkj0.X;
                hh2 hh2Var = (hh2) obj4;
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    zg2 zg2Var = (zg2) obj5;
                    boolean zG6 = x340Var28.g(iu30Var5);
                    Object objT10 = x340Var28.T();
                    if (zG6 || objT10 == m4cVar4) {
                        objT10 = new ib2(iu30Var5, (byte) 4);
                        x340Var28.s0(objT10);
                    }
                    iu30 iu30Var6 = (iu30) objT10;
                    boolean zI2 = x340Var28.i(hh2Var);
                    Object objT11 = x340Var28.T();
                    if (zI2 || objT11 == m4cVar4) {
                        objT11 = new gh2(hh2Var, (byte) 0);
                        x340Var28.s0(objT11);
                    }
                    Function0 function2 = (Function0) objT11;
                    boolean zI3 = x340Var28.i(hh2Var);
                    Object objT12 = x340Var28.T();
                    if (zI3 || objT12 == m4cVar4) {
                        objT12 = new gh2(hh2Var, (byte) 1);
                        x340Var28.s0(objT12);
                    }
                    j82.a(zg2Var, iu30Var6, (qim0) null, function2, (Function0) objT12, x340Var28, 0, 4);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 28:
                x340 x340Var29 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                c9n c9nVar = (c9n) obj3;
                m4c m4cVar5 = fkj0.X;
                ii2 ii2Var = (ii2) obj5;
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    oi2 oi2Var = (qi2) rwq.h(ii2Var.b.b, x340Var30, 0).getValue();
                    if (oi2Var instanceof oi2) {
                        x340Var30.i0(-960967042);
                        Activity activity = (Activity) obj4;
                        String strR = activity != null ? k1o1.r(activity, oi2Var.b) : null;
                        if (strR == null) {
                            strR = "";
                        }
                        String str10 = strR;
                        oi2 oi2Var2 = oi2Var;
                        int i7 = oi2Var2.a;
                        boolean zI4 = x340Var30.i(ii2Var) | x340Var30.i(c9nVar);
                        Object objT13 = x340Var30.T();
                        if (zI4 || objT13 == m4cVar5) {
                            objT13 = new y4(ii2Var, c9nVar, (byte) 28);
                            x340Var30.s0(objT13);
                        }
                        Function0 function3 = (Function0) objT13;
                        boolean zI5 = x340Var30.i(oi2Var) | x340Var30.i(ii2Var);
                        Object objT14 = x340Var30.T();
                        if (zI5 || objT14 == m4cVar5) {
                            objT14 = new y4(ii2Var, oi2Var2, (byte) 29);
                            x340Var30.s0(objT14);
                        }
                        z47.a(i7, str10, function3, (Function0) objT14, x340Var30, 0);
                        x340Var30.r(false);
                    } else {
                        x340Var30.i0(-959953187);
                        x340Var30.r(false);
                    }
                    boolean zI6 = x340Var30.i(ii2Var);
                    Object objT15 = x340Var30.T();
                    if (zI6 || objT15 == m4cVar5) {
                        objT15 = new qm(ii2Var, (lnm) null, (byte) 13);
                        x340Var30.s0(objT15);
                    }
                    qxd0.t(rih1Var, x340Var30, (vu30) objT15);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                fq7.s((t51) obj5, (t51) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1(Object obj, Object obj2, Object obj3, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1(Object obj, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1(Object obj, iu30 iu30Var, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.d = iu30Var;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1(byte b, int i, Object obj, iu30 iu30Var, qim0 qim0Var) {
        super(2);
        this.a = b;
        this.b = obj;
        this.d = iu30Var;
        this.c = qim0Var;
    }
}
