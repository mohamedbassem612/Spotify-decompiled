package p;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.mobius.functions.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kpw0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpw0(sy01 sy01Var, iu30 iu30Var, qlb qlbVar) {
        super(2);
        this.a = (byte) 29;
        this.b = sy01Var;
        this.c = qlbVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        cr31 cr31VarB;
        akx akxVar;
        qux nuxVar;
        nkx nkxVar;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    WeakHashMap weakHashMap = osl1.x;
                    qim0 qim0VarY = too1.y(nim0Var, new mih1((erl1) obj4, lhc.g(x340Var2).c));
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarZ = uyn1.z(cbx.b(x340Var2).e.b, 0.0f, 2, qim0VarY);
                    j2i j2iVar = (j2i) obj3;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(hmb0.t1);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    dv20.l(0, j2iVar, x340Var2, true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    d1x0 d1x0Var = (d1x0) obj4;
                    nm1 nm1Var = (nm1) obj3;
                    String str = d1x0Var.d;
                    String str2 = d1x0Var.c;
                    String str3 = d1x0Var.g;
                    Integer num = d1x0Var.a;
                    nm1Var.h(str2, str, str3, num != null ? z4p1.e(num.intValue()) : u7h.k, x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                obx0 obx0Var = (obx0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                g1b g1bVar = (g1b) obj4;
                ViewGroup viewGroup = (ViewGroup) g1bVar.d;
                Resources resources = viewGroup.getContext().getResources();
                mw40 mw40VarT = yoi1.T(viewGroup.getContext(), resources.getString(2131960550, obx0Var.c), resources.getString(2131960549));
                String string = resources.getString(2131963955);
                fcx0 fcx0Var = new fcx0((Consumer) obj3, obx0Var, g1bVar, iIntValue3);
                mw40VarT.a = string;
                mw40VarT.c = fcx0Var;
                String string2 = resources.getString(2131953433);
                k6b k6bVar = k6b.t;
                mw40VarT.b = string2;
                mw40VarT.d = k6bVar;
                mw40VarT.b().b();
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                ((ugx0) obj4).h((gix0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                x340 x340Var5 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                rlx0 rlx0Var = (rlx0) obj4;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    String str4 = rlx0Var.g;
                    Function0 function0 = (Function0) obj3;
                    if (ihc1.y0(str4)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    gbx gbxVar = new gbx(new y50(str4), function0);
                    idx idxVar = new idx();
                    gdx gdxVarS = yla.s(x340Var6);
                    qim0 qim0VarN = anm1.N("HighlightPromoCardCta", nim0Var);
                    Object objT = x340Var6.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = ilx0.e;
                        x340Var6.s0(objT);
                    }
                    qim0 qim0VarQ = d9y0.q(qim0VarN, (iu30) objT);
                    boolean zI = x340Var6.i(rlx0Var);
                    Object objT2 = x340Var6.T();
                    if (zI || objT2 == m4cVar) {
                        objT2 = new mwv0(rlx0Var, (byte) 27);
                        x340Var6.s0(objT2);
                    }
                    foo1.c(gbxVar, idxVar, s161.a(qim0VarQ, (iu30) objT2), null, gdxVarS, null, null, null, null, null, apo.r(968994050, new y6w0(rlx0Var, (byte) 9), x340Var6), x340Var6, 0, 48, 2008);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                ((n0v0) obj4).g((k0y0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                x340 x340Var7 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                a6y0 a6y0Var = (a6y0) obj4;
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x340Var8.b0();
                } else if (a6y0Var instanceof x5y0) {
                    x340Var8.i0(-1424255461);
                    uwr uwrVar2 = cbx.a;
                    avw0 avw0Var = cbx.b(x340Var8).c;
                    long j = ((u7h) x340Var8.k(qgx.a)).a;
                    qim0 qim0VarR = u291.r(nim0Var, 24.0f);
                    Object objT3 = x340Var8.T();
                    if (objT3 == fkj0.X) {
                        objT3 = g2y0.d1;
                        x340Var8.s0(objT3);
                    }
                    rhx0.a(s161.a(qim0VarR, (iu30) objT3), j, 2.0f, 0L, 1, 0.0f, x340Var8, 0, 40);
                    x340Var8.r(false);
                } else {
                    x340Var8.i0(-1423993170);
                    ((de40) obj3).getClass();
                    String strF = de40.f(a6y0Var, x340Var8);
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(strF, null, cbx.d(x340Var8).h, 0L, null, null, 0, false, null, 0, null, x340Var8, 0, 0, 2042);
                    x340Var8.r(false);
                }
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                rzn1.a((llw0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                ggo1.x((rul1) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                tho1.n((vkk1) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                gio1.g((i4z0) obj4, (p40) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                ((kuy) obj4).e((bez0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                ((kuy) obj4).f((xpw) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                x340 x340Var9 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                boolean zY = x340Var10.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2);
                rih1 rih1Var2 = rih1.a;
                if (!zY) {
                    x340Var10.b0();
                    return rih1Var2;
                }
                iiz0 iiz0Var = (iiz0) obj4;
                kiz0 kiz0Var = new kiz0(iiz0Var.d.a, ((giz0) obj3).a.a);
                Object objT4 = x340Var10.T();
                if (objT4 == fkj0.X) {
                    ojq ojqVar = (ojq) iiz0Var.b.a.c;
                    miz0 miz0Var = new miz0(kiz0Var, (zlq) ojqVar.c.get(), (amq) ojqVar.X.get(), (bmq) ojqVar.l1.get(), (xip) ojqVar.n1.get(), (zja1) ojqVar.f.get(), (rgn0) ojqVar.d.get());
                    x340Var10.s0(miz0Var);
                    objT4 = miz0Var;
                }
                miz0 miz0Var2 = (miz0) objT4;
                otw.c(miz0Var2, rih1Var2, (qim0) null, wpb1.C("QuizGameplay", miz0Var2, rih1Var2, x340Var10, 390, 8), x340Var10, 48, 4);
                return rih1Var2;
            case 14:
                x340 x340Var11 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    gjz0 gjz0Var = (gjz0) obj3;
                    otw.c((xiz0) obj4, new tiz0(gjz0Var.d, false, gjz0Var.e, gjz0Var.f), (qim0) null, (ipb1) null, x340Var12, 8, 12);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                rpo1.g((xzz0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                ((b0i0) obj4).d((a401) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                ((vu30) obj4).invoke(((s201) obj).a, Integer.valueOf(((Number) obj2).intValue()));
                ((Function0) obj3).invoke();
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                ((i501) obj4).n1((xtj) obj3, (b0k) obj, czo1.p(7));
                return rih1Var;
            case 19:
                x340 x340Var13 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                tbr0 tbr0Var = (tbr0) obj3;
                q501 q501Var = (q501) obj4;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    n0v0 n0v0Var = q501Var.b;
                    ArrayList arrayList = q501Var.c.b;
                    boolean zI2 = x340Var14.i(tbr0Var) | x340Var14.i(q501Var);
                    Object objT5 = x340Var14.T();
                    if (zI2 || objT5 == fkj0.X) {
                        objT5 = new j3y0(tbr0Var, q501Var, (byte) 21);
                        x340Var14.s0(objT5);
                    }
                    n0v0Var.d(arrayList, (iu30) objT5, (qim0) null, x340Var14, 0);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                int iIntValue9 = ((Number) obj).intValue();
                int iIntValue10 = ((Number) obj2).intValue();
                ((hdn0) obj4).t(iIntValue9);
                ((hdn0) obj3).t(iIntValue10);
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                cto1.c((Consumer) obj4, (mk81) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                cuo1.v((ArrayList) obj4, (String) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 23:
                String str5 = (String) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                xmu0 xmu0Var = ((no01) obj4).b;
                String str6 = ((udx0) obj3).a;
                i8h1 i8h1Var = (i8h1) xmu0Var.c;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-profile-entity";
                x6h1VarI.f = "12.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.d = str6;
                x6h1 x6h1VarR = kk0.r(x6h1VarI, "profile");
                x6h1VarR.i.add(new a7h1("recently_played_artists", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarR.j = false;
                y6h1 y6h1VarA = x6h1VarR.a();
                Integer numValueOf = Integer.valueOf(iIntValue11);
                x6h1 x6h1VarC = y6h1VarA.c();
                x6h1VarC.i.add(new a7h1("artist_row", (String) null, numValueOf, str5, (String) null));
                x6h1VarC.j = true;
                ((lzn0) xmu0Var.b).a(str5, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null);
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                ((fv01) obj4).b((c380) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 25:
                x340 x340Var15 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    uwr uwrVar4 = cbx.a;
                    w0h1.a((hux) obj4, (ksl) obj3, (qim0) null, cbx.a(x340Var16).b.b, 0L, false, x340Var16, 8, 52);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 26:
                x340 x340Var17 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                qim0 qim0Var = (qim0) obj3;
                v07 v07Var = (o17) obj4;
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    zz6 zz6Var = v07Var.a().b;
                    if (zz6Var instanceof yz6) {
                        cr31VarB = (cr31) ((k9) a47.c).b;
                    } else if (zz6Var instanceof zz6) {
                        cr31VarB = er31.b(zz6Var.d);
                    } else if ((v07Var instanceof l07) || (v07Var instanceof p07) || (v07Var instanceof j17) || (v07Var instanceof n07) || (v07Var instanceof j07) || (v07Var instanceof k17) || (v07Var instanceof l17) || (v07Var instanceof u07) || (v07Var.a().b instanceof xz6)) {
                        cr31VarB = (cr31) ((k9) y37.c).b;
                    } else {
                        cr31VarB = ((v07Var instanceof t07) || (v07Var instanceof o07) || (v07Var instanceof e17) || (v07Var instanceof f17) || (v07Var instanceof h17)) ? (cr31) ((k9) z37.c).b : (cr31) ((k9) b47.c).b;
                    }
                    v07 v07Var2 = v07Var instanceof v07 ? v07Var : null;
                    Drawable drawable = v07Var2 != null ? v07Var2.a : null;
                    if (drawable == null || v07Var.b.a != null) {
                        x340Var18.i0(-892229863);
                        String str7 = v07Var.a().a;
                        if (str7 == null) {
                            str7 = "";
                        }
                        Uri uri = Uri.parse(str7);
                        qim0 qim0VarQ2 = i1p1.q(qim0Var, cr31VarB);
                        if (v07Var.b() == null) {
                            nuxVar = oux.a;
                        } else {
                            if ((v07Var instanceof g17) || (v07Var instanceof h17)) {
                                akxVar = ltx.c;
                            } else if ((v07Var instanceof l07) || (v07Var instanceof n07)) {
                                akxVar = nkx.c;
                            } else if (v07Var instanceof k07) {
                                akxVar = akx.c;
                            } else if (v07Var instanceof y07) {
                                akxVar = grx.c;
                            } else if ((v07Var instanceof a17) || (v07Var instanceof e17) || (v07Var instanceof t07)) {
                                akxVar = mrx.c;
                            } else if (v07Var instanceof o07) {
                                akxVar = pkx.c;
                            } else {
                                akxVar = v07Var instanceof u07 ? bnx.c : box.c;
                            }
                            nuxVar = new nux(akxVar, akxVar);
                        }
                        eso1.e(uri, isl.a, qim0VarQ2, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, nuxVar, false, false, x340Var18, 224304, 0, 3520);
                        x340Var18.r(false);
                    } else {
                        x340Var18.i0(-892453590);
                        cwl1.f(x7v.a(drawable, x340Var18), (String) null, i1p1.q(u291.d(qim0Var, 1.0f), cr31VarB), (tl3) null, mif1.P0, 0.0f, (ColorFilter) null, x340Var18, 56, 104);
                        x340Var18.r(false);
                    }
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 27:
                x340 x340Var19 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj3;
                xx01 xx01Var = (xx01) obj4;
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    String str8 = xx01Var.b;
                    String str9 = xx01Var.c;
                    String str10 = xx01Var.d;
                    y37 y37Var = ay01.a[l1d.C(xx01Var.e)] == 1 ? y37.c : a47.c;
                    String str11 = xx01Var.a;
                    Set set = s4b1.f;
                    if (uic.g(str11, blc0.u1)) {
                        nkxVar = nkx.c;
                    } else {
                        nkxVar = uic.g(str11, blc0.g1) ? akx.c : grx.c;
                    }
                    nux nuxVar2 = new nux(nkxVar, nkxVar);
                    boolean zG = x340Var20.g(iu30Var) | x340Var20.g(xx01Var);
                    Object objT6 = x340Var20.T();
                    if (zG || objT6 == fkj0.X) {
                        objT6 = new zkz0(iu30Var, xx01Var, (byte) 14);
                        x340Var20.s0(objT6);
                    }
                    c0p1.c(str8, null, str9, null, str10, y37Var, nuxVar2, (Function0) objT6, x340Var20, 0, 282);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 28:
                x340 x340Var21 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    otw.c((qlb) ((qlb) obj4).f, (String) obj3, (qim0) null, (ipb1) null, x340Var22, 0, 12);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            default:
                x340 x340Var23 = (b0k) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                sy01 sy01Var = (sy01) obj4;
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    String str12 = sy01Var.b;
                    String str13 = sy01Var.c;
                    x340Var24.i0(1721000529);
                    x340Var24.r(false);
                    x340Var24.i0(1721132031);
                    x340Var24.r(false);
                    d0p1.i(str12, null, str13, null, null, null, 0.0f, apo.r(52359153, new hov0(sy01Var, (qlb) obj3, (byte) 17), x340Var24), x340Var24, 12582912, 74);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kpw0(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kpw0(Object obj, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
