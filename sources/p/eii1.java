package p;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.mobius.Next;
import com.spotify.mobius.functions.Consumer;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Collections;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eii1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eii1(edj1 edj1Var, e701 e701Var, iu30 iu30Var) {
        super(2);
        this.a = (byte) 6;
        this.b = edj1Var;
        this.c = iu30Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        String str;
        String str2;
        String str3;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        jlw0 jlw0Var = null;
        byte b2 = 2;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    otw.c((t2f1) obj4, ((whi1) obj3).a(), (qim0) null, (ipb1) null, x340Var2, 8, 12);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                kii1 kii1Var = (kii1) obj3;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    op80 jp80Var = new jp80((ComposeView) obj4);
                    l6h1 l6h1Var = kii1Var.K1;
                    if (l6h1Var == null) {
                        u890.C("ubiDwellTimeLogger");
                        throw null;
                    }
                    i8h1 i8h1Var = kii1Var.J1;
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
                    kiv kivVar = gfe0.a;
                    boolean zI = x340Var4.i(jp80Var);
                    Object objT = x340Var4.T();
                    if (zI || objT == fkj0.X) {
                        objT = new gt1(jp80Var, (byte) 3);
                        x340Var4.s0(objT);
                    }
                    mod.b(gfe0.d((Function0) objT, x340Var4), apo.r(-1396448026, new fc3(kii1Var, (byte) 24), x340Var4), x340Var4, 56);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    gyo1.E((evi1) obj4, (iu30) obj3, (qim0) null, x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    qvi1 qvi1Var = ((lvi1) obj4).b;
                    boolean zG = x340Var8.g(iu30Var);
                    Object objT2 = x340Var8.T();
                    if (zG || objT2 == fkj0.X) {
                        objT2 = new uyh1(iu30Var, (byte) 19);
                        x340Var8.s0(objT2);
                    }
                    jyo1.e(qvi1Var, (Function0) objT2, (qim0) null, (idn0) null, x340Var8, 0);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                gxi1 gxi1Var = (gxi1) obj4;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    qsw.c(new obk1((ConstraintLayout) gxi1Var.e.b), apo.r(-161110877, new exi1(gxi1Var, rwq.h((wen0) gxi1Var.i.getValue(), x340Var10, 0), rwq.h((wen0) gxi1Var.t.getValue(), x340Var10, 0), (xfx) obj3, rwq.h((wen0) gxi1Var.X.getValue(), x340Var10, 0), (byte) 2), x340Var10), x340Var10, 48);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                ((y2j1) obj4).e((iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                adj1 adj1Var = (edj1) obj4;
                x340 x340Var12 = x340Var11;
                if (!x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x340Var12.b0();
                } else if (adj1Var instanceof adj1) {
                    p9p1.e(adj1Var, (iu30) obj3, anm1.N(czd1.a, nim0Var), false, x340Var12, 0);
                }
                return rih1Var;
            case 7:
                iac0 iac0Var = (iac0) obj2;
                bcj1 bcj1Var = (bcj1) obj4;
                xk00 xk00Var = (xk00) obj3;
                gdh1 gdh1Var = bcj1Var.j;
                rzo0 rzo0Var = gdh1Var.d ? xk00Var.k : null;
                if (gdh1Var.c) {
                    return new jpg0(f6o1.A(bcj1Var.l.a(new lbj1("embeddedhome-ads-playercontroller", new jbj1(3, 3), new kbj1(new ku91(bcj1Var, rzo0Var, (lnm) null, (byte) 25), new lda1(2, bcj1Var, bcj1.class, "refreshPage", "refreshPage-ehl3_6g(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 10)), iac0Var)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new xaj1(bcj1Var, (byte) 2));
                }
                return new jpg0(new x8j1(bcj1Var.a, bcj1Var.b, bcj1Var.c.a(bcj1Var.d), bcj1Var.e, iac0Var, bcj1Var.g, bcj1Var.f, bcj1Var.h, new d7j1(gdh1Var.a), bcj1Var.i, bcj1Var.k, rzo0Var, new op0(bcj1Var.n)), l6j1.e);
            case 8:
                iac0 iac0Var2 = (iac0) obj2;
                wcj1 wcj1Var = (wcj1) obj4;
                rzo0 rzo0Var2 = wcj1Var.o.a() ? (rzo0) ((ajq0) obj3).d : null;
                gdh1 gdh1Var2 = wcj1Var.j;
                if (gdh1Var2.c) {
                    return new jpg0(f6o1.A(wcj1Var.l.a(new lbj1("embeddedhome-ads-playercontroller", new jbj1(3, 3), new kbj1(new ku91(wcj1Var, rzo0Var2, (lnm) null, (byte) 27), new lda1(2, wcj1Var, wcj1.class, "refreshPage", "refreshPage-ehl3_6g(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 11)), iac0Var2)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new xaj1(wcj1Var, (byte) 3));
                }
                return new jpg0(new x8j1(wcj1Var.a, wcj1Var.b, wcj1Var.c.a(wcj1Var.d), wcj1Var.e, iac0Var2, wcj1Var.g, wcj1Var.f, wcj1Var.h, new d7j1(gdh1Var2.a), wcj1Var.i, wcj1Var.k, rzo0Var2, new op0(wcj1Var.n)), l6j1.g);
            case 9:
                ((Number) obj2).intValue();
                qej1.h((String) obj4, (m4m) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                g2z g2zVar = (g2z) obj3;
                zej1 zej1Var = (zej1) obj4;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    int iC = l1d.C(zej1Var.r);
                    if (iC == 0) {
                        x340Var14.i0(72635122);
                        x340Var14.r(false);
                    } else if (iC == 1) {
                        x340Var14.i0(-1521682912);
                        otw.c((br0) g2zVar.d, new qy1(zej1Var.e, 6), (qim0) null, (ipb1) null, x340Var14, 8, 12);
                        x340Var14.r(false);
                    } else {
                        if (iC != 2) {
                            throw p3d1.k(x340Var14, -1521687741, false);
                        }
                        x340Var14.i0(72386255);
                        xho xhoVar = (xho) g2zVar.e;
                        if (xhoVar == null) {
                            x340Var14.i0(72386254);
                        } else {
                            x340Var14.i0(-1521685613);
                            x340Var14.i0(490744625);
                            String str4 = zej1Var.e;
                            Object objT3 = x340Var14.T();
                            if (objT3 == fkj0.X) {
                                objT3 = zhi1.W0;
                                x340Var14.s0(objT3);
                            }
                            otw.c(xhoVar, new uho(str4, (String) null, new pho(true, new hdx(18, (vu30) null, (vu30) objT3, (vu30) null, (hw61) null, 26), true), (nho) null, (String) null, (Function0) null, 250), (qim0) null, (ipb1) null, x340Var14, 8, 12);
                            x340Var14.r(false);
                        }
                        x340Var14.r(false);
                        x340Var14.r(false);
                    }
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 11:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    und.a((xwa) obj4, (qim0) null, 0.0f, apo.r(1598529096, new oij1((qij1) obj3, b2), x340Var16), x340Var16, 3072, 6);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 12:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    njj1 njj1Var = (njj1) obj4;
                    String str5 = njj1Var.a;
                    boolean z = njj1Var.b;
                    boolean zG2 = x340Var18.g(iu30Var2);
                    Object objT4 = x340Var18.T();
                    if (zG2 || objT4 == fkj0.X) {
                        objT4 = new y0j1(iu30Var2, (byte) 26);
                        x340Var18.s0(objT4);
                    }
                    g2p1.A(0, str5, (Function0) objT4, x340Var18, z);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                a4p1.c((adj1) obj4, (paj1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                qvj1 qvj1Var = (qvj1) obj4;
                ajq0 ajq0Var = (ajq0) obj3;
                return new aso(f6o1.A(new kpg0(qvj1Var.d, new hij1(qvj1Var.a.a(new epb1((zob1) obj), qvj1Var.c, (kko) ajq0Var.a, new ohi0(new har0(qvj1Var.f.b), false, false, 476), qvj1Var.b, (vu30) null, (p731) ajq0Var.c), qvj1Var, (byte) 5)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new yvf1(qvj1Var, (byte) 11));
            case 15:
                ((Number) obj2).intValue();
                o4p1.i((bwj1) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                b5p1.g((Long) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                u8d1 u8d1Var = (u8d1) obj3;
                m4c m4cVar = fkj0.X;
                uoa uoaVar = (uoa) obj4;
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    qim0 qim0VarN = anm1.N("video.swatch", nim0Var);
                    boolean zI2 = x340Var20.i(uoaVar);
                    Object objT5 = x340Var20.T();
                    if (zI2 || objT5 == m4cVar) {
                        objT5 = new cu0(uoaVar, (byte) 8);
                        x340Var20.s0(objT5);
                    }
                    iu30 iu30Var3 = (iu30) objT5;
                    boolean zG3 = x340Var20.g(u8d1Var) | x340Var20.i(uoaVar);
                    Object objT6 = x340Var20.T();
                    if (zG3 || objT6 == m4cVar) {
                        objT6 = new hij1(u8d1Var, uoaVar, (byte) 11);
                        x340Var20.s0(objT6);
                    }
                    dm5.a(iu30Var3, qim0VarN, (iu30) objT6, x340Var20, 48, 0);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 18:
                e4k1 e4k1Var = (e4k1) obj;
                y3k1 y3k1Var = (y3k1) obj2;
                Long l = e4k1Var.b;
                String str6 = e4k1Var.a;
                if (!(y3k1Var instanceof w3k1)) {
                    if (y3k1Var.equals(v3k1.a)) {
                        return Next.h(new e4k1(str6, l, z3k1.a));
                    }
                    if (y3k1Var.equals(x3k1.a)) {
                        return Next.i(new e4k1(str6, l, b4k1.a), Collections.singleton(new u3k1(new k3k1(l, str6))));
                    }
                    eg.o();
                    return null;
                }
                w3k1 w3k1Var = (w3k1) y3k1Var;
                d4k1 d4k1Var = w3k1Var.a;
                xkk1 xkk1Var = w3k1Var.b;
                llg llgVar = w3k1Var.c;
                long j = w3k1Var.d;
                String str7 = w3k1Var.e;
                String str8 = w3k1Var.f;
                xid xidVar = (xid) obj4;
                Context context = (Context) obj3;
                jo70 jo70Var = d4k1Var.a;
                wkk1 wkk1VarP = ucp1.p(d4k1Var.b);
                io70 io70Var = jo70Var.e;
                String str9 = jo70Var.a;
                String str10 = io70Var != null ? io70Var.a : null;
                if (str10 == null) {
                    str10 = "";
                }
                if (str7 != null) {
                    str = str8;
                    jlw0Var = new jlw0(str7, context.getString(2131962266));
                } else {
                    str = str8;
                    String str11 = wkk1VarP.a;
                    if (str11 != null) {
                        jlw0Var = new jlw0(str11, str9);
                    }
                }
                return Next.h(new e4k1(str6, l, new a4k1(new qij1(jlw0Var, new jlw0(((xkk1Var == null || (str2 = ucp1.p(xkk1Var).b) == null) && (str2 = wkk1VarP.b) == null) ? "" : str2, str10), wkk1VarP.d, wkk1VarP.c, (llgVar == null || (str3 = llgVar.b) == null) ? str9 : str3, str10, xidVar.n(llgVar, j, true, jo70Var.b), str))));
            case 19:
                ((Number) obj2).intValue();
                ((pt) obj4).y((Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 20:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    String strI = tgp1.i((Locale) obj4, (Locale) obj3);
                    uwr uwrVar = cbx.a;
                    uwo1.e(strI, (qim0) null, cbx.d(x340Var22).g, cbx.a(x340Var22).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var22, 0, 0, 2034);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 21:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                iu30 iu30Var4 = (iu30) obj3;
                eeo0 eeo0Var = (eeo0) obj4;
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    boolean zG4 = x340Var24.g(iu30Var4) | x340Var24.i(eeo0Var);
                    Object objT7 = x340Var24.T();
                    if (zG4 || objT7 == m4cVar2) {
                        objT7 = new nuk1(iu30Var4, eeo0Var, (byte) 0);
                        x340Var24.s0(objT7);
                    }
                    Function0 function0 = (Function0) objT7;
                    boolean zG5 = x340Var24.g(iu30Var4) | x340Var24.i(eeo0Var);
                    Object objT8 = x340Var24.T();
                    if (zG5 || objT8 == m4cVar2) {
                        objT8 = new nuk1(iu30Var4, eeo0Var, (byte) 1);
                        x340Var24.s0(objT8);
                    }
                    ggo1.i(eeo0Var, function0, (Function0) objT8, x340Var24, 0);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                rc2.d((qyk1) obj4, (j2i) obj3, (b0k) obj, czo1.p(49));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((Number) obj2).intValue();
                rc2.g((qyk1) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    iu30 iu30Var5 = (iu30) obj3;
                    m87.e((fwk1) obj4, iu30Var5, new ng20(iu30Var5), (qim0) null, x340Var26, 0);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                iu30 iu30Var6 = (iu30) obj4;
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    boolean zG6 = x340Var28.g(iu30Var6);
                    Object objT9 = x340Var28.T();
                    if (zG6 || objT9 == fkj0.X) {
                        objT9 = new izj1(iu30Var6, (byte) 21);
                        x340Var28.s0(objT9);
                    }
                    Function0 function1 = (Function0) objT9;
                    if (ihc1.y0("navigate to voting surface")) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.f(new gbx(new y50("navigate to voting surface"), function1), (qim0) null, (max) null, yla.s(x340Var28), (idn0) null, (vu30) null, (vu30) null, apo.r(574097075, new fak1((qwk1) obj3, (byte) 5), x340Var28), x340Var28, 12582912, 118);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 26:
                x340 x340Var29 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                iu30 iu30Var7 = (iu30) obj3;
                q5l1 q5l1Var = (r5l1) obj4;
                x340 x340Var30 = x340Var29;
                if (!x340Var30.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x340Var30.b0();
                } else if (q5l1Var instanceof q5l1) {
                    x340Var30.i0(1944157964);
                    q5l1 q5l1Var2 = q5l1Var;
                    String str12 = q5l1Var2.c;
                    String str13 = q5l1Var2.d;
                    String str14 = q5l1Var2.b;
                    boolean zG7 = x340Var30.g(iu30Var7);
                    Object objT10 = x340Var30.T();
                    if (zG7 || objT10 == fkj0.X) {
                        objT10 = new izj1(iu30Var7, (byte) 23);
                        x340Var30.s0(objT10);
                    }
                    lcc.w(str12, str13, str14, (Function0) objT10, q5l1Var2.e, q5l1Var2.f, null, x340Var30, 0);
                    x340Var30.r(false);
                } else {
                    x340Var30.i0(1944489509);
                    x340Var30.r(false);
                }
                return rih1Var;
            case 27:
                g0y0 g0y0Var = (g0y0) obj4;
                return new jpg0(new aso(new ug3((iac0) obj2, (yfu) g0y0Var.b, new sjf1(0, ((xk00) obj3).h, pk00.class, "playerGroupProvider", "playerGroupProvider()Lcom/spotify/multiplayer/multiplayerapi/PlayerGroupProvider;", 0, (byte) 17), (Function0) g0y0Var.c), new yvf1(g0y0Var, (byte) 16)), new tak1(g0y0Var, (byte) 15));
            case 28:
                ((Number) obj2).intValue();
                sok.a((hcl1) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                x340 x340Var31 = (b0k) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                m4c m4cVar3 = fkj0.X;
                x340 x340Var32 = x340Var31;
                if (x340Var32.Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    boolean z2 = ((jjr0) obj4).h;
                    qim0 qim0VarZ = u291.z(u291.b(0.0f, 70.0f, 1, u291.f(nim0Var, 1.0f)), (fra) null, 3);
                    Consumer consumer = (Consumer) obj3;
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode = Long.hashCode(x340Var32.T);
                    xos0 xos0VarM = x340Var32.m();
                    qim0 qim0VarE = zr7.E(x340Var32, qim0VarZ);
                    hzj.A.getClass();
                    if (x340Var32.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var32.m0();
                    if (x340Var32.S) {
                        x340Var32.l(hmb0.t1);
                    } else {
                        x340Var32.v0();
                    }
                    nko1.H(gfh0VarC, x340Var32, y580.O0);
                    nko1.H(xos0VarM, x340Var32, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var32, y580.R0);
                    nko1.F(x340Var32);
                    nko1.H(qim0VarE, x340Var32, y580.Y);
                    boolean zI3 = x340Var32.i(consumer);
                    Object objT11 = x340Var32.T();
                    if (zI3 || objT11 == m4cVar3) {
                        objT11 = new kf(consumer, (byte) 7);
                        x340Var32.s0(objT11);
                    }
                    Function0 function2 = (Function0) objT11;
                    boolean zH = x340Var32.h(z2);
                    Object objT12 = x340Var32.T();
                    if (zH || objT12 == m4cVar3) {
                        objT12 = new aag1((byte) 3, z2);
                        x340Var32.s0(objT12);
                    }
                    brl.f(0, function2, x340Var32, i541.C(nim0Var, (iu30) objT12));
                    boolean zH2 = x340Var32.h(z2);
                    Object objT13 = x340Var32.T();
                    if (zH2 || objT13 == m4cVar3) {
                        objT13 = new aag1((byte) 4, z2);
                        x340Var32.s0(objT13);
                    }
                    brl.g(i541.C(nim0Var, (iu30) objT13), x340Var32, 0);
                    x340Var32.r(true);
                } else {
                    x340Var32.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eii1(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eii1(Object obj, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
