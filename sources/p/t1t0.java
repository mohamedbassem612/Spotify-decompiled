package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.mobius.Next;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.pamviewservice.v1.proto.PremiumPlanRow;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t1t0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1t0(Instant instant, int i) {
        super(2);
        this.a = (byte) 3;
        this.b = instant;
    }

    /* JADX WARN: Code duplicated, block: B:163:0x0470  */
    public final Object invoke(Object obj, Object obj2) {
        Integer numValueOf;
        Instant instantOfEpochMilli;
        zj20 zj20Var;
        Instant instantOfEpochMilli2;
        Uri uri;
        goj0 goj0VarA;
        myv0 myv0Var;
        String str;
        String str2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 2;
        boolean zBooleanValue = false;
        boolean z = true;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z1t0 z1t0Var = (z1t0) obj3;
                    lvx.c(z1t0Var.b, z1t0Var.c, 0, x340Var2, null);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                g6t0 g6t0Var = (g6t0) obj3;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    g6t0Var.a.invoke((Boolean) b2p1.B(g6t0Var.b, Boolean.TRUE, x340Var4, 48).getValue(), x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                return (cdk1) obj3;
            case 3:
                ((Number) obj2).intValue();
                byo1.d((Instant) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                rbt0 rbt0Var = (rbt0) obj2;
                zj20 sbt0Var = bk20.W0;
                zj20 zj20Var2 = ak20.U0;
                boolean z2 = rbt0Var.a;
                PremiumPlanRow premiumPlanRow = ((ubt0) obj).a;
                zbt0 zbt0Var = (zbt0) obj3;
                wpv0 wpv0Var = zbt0Var.c;
                Context context = zbt0Var.a;
                if ((premiumPlanRow != null ? premiumPlanRow.s() : null) == cct0.c && z2 && rbt0Var.e && rbt0Var.f) {
                    return new vbt0(context.getString(2131961938), null, null, zj20Var2, null, 82);
                }
                if (!z2 && rbt0Var.c) {
                    return new vbt0(context.getString(2131961938), null, zbt0.X, sbt0Var, rbt0Var.d, 18);
                }
                if (!z2 && !rbt0Var.b) {
                    String string = context.getString(2131961938);
                    String str3 = zbt0.i;
                    String strW = premiumPlanRow != null ? premiumPlanRow.w() : null;
                    if (strW == null || ihc1.y0(strW)) {
                        instantOfEpochMilli2 = null;
                    } else {
                        try {
                            instantOfEpochMilli2 = Instant.ofEpochMilli(Long.parseLong(strW));
                        } catch (NumberFormatException unused) {
                            instantOfEpochMilli2 = null;
                        }
                    }
                    return new vbt0(string, instantOfEpochMilli2, zbt0.i, yj20.V0, rbt0Var.d, 18);
                }
                if (premiumPlanRow == null) {
                    return new vbt0((String) zbt0Var.e.getValue(), null, wpv0Var.b.m() ? zbt0.Y : zbt0.t, null, rbt0Var.d, 54);
                }
                String strT = premiumPlanRow.t();
                String strN = premiumPlanRow.n();
                String str4 = zbt0.i;
                String strU = premiumPlanRow.u();
                if (strU != null && !ihc1.y0(strU)) {
                    try {
                        numValueOf = Integer.valueOf(Color.parseColor(strU));
                    } catch (IllegalArgumentException unused2) {
                        numValueOf = null;
                    }
                    break;
                } else {
                    numValueOf = null;
                }
                String str5 = zbt0.i;
                String strW2 = premiumPlanRow.w();
                if (strW2 == null || ihc1.y0(strW2)) {
                    instantOfEpochMilli = null;
                } else {
                    try {
                        instantOfEpochMilli = Instant.ofEpochMilli(Long.parseLong(strW2));
                    } catch (NumberFormatException unused3) {
                        instantOfEpochMilli = null;
                    }
                }
                String str6 = wpv0Var.b.m() ? zbt0.Y : zbt0.t;
                int i2 = xbt0.a[premiumPlanRow.y().ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        sbt0Var = new sbt0(premiumPlanRow.v());
                    } else if (i2 == 3) {
                        sbt0Var = zj20.U0;
                    }
                    zj20Var = sbt0Var;
                } else {
                    zj20Var = zj20Var2;
                }
                return new vbt0(strT, strN, instantOfEpochMilli, str6, numValueOf, zj20Var, rbt0Var.d);
            case 5:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    uwo1.e(((kct0) obj3).e, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var6, 0, 0, 2046);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 6:
                fit0 fit0Var = (fit0) obj;
                bot0 bot0Var = (bot0) obj2;
                fit0 fit0Var2 = (fit0) obj3;
                List list = fit0Var.d;
                return (u890.j(fit0Var.b, bot0Var.a) && u890.j(list, bot0Var.f)) ? Next.j() : Next.h(new bot0(fit0Var.b, fit0Var2.c, list.size(), fit0Var2.e, fit0Var.d));
            case 7:
                return ((u9c) obj3).h((zob1) obj);
            case 8:
                r6h1 r6h1Var = (r6h1) obj2;
                Integer numValueOf2 = Integer.valueOf(((Number) obj).intValue());
                rnt0 rnt0Var = (rnt0) obj3;
                String strC = rnt0Var.c();
                return new wql0(numValueOf2, strC != null ? strC : "", rnt0Var.a().a, r6h1Var);
            case 9:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    qhm qhmVarJ = ((xwt0) obj3).a.j();
                    os51 os51Var = new os51(true, false);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var8).b;
                    cvx cvxVar2 = cbx.b(x340Var8).b;
                    cvx cvxVar3 = cbx.b(x340Var8).b;
                    otw.c(qhmVarJ, os51Var, uyn1.B(nim0.a, 8.0f, 16.0f, 8.0f, 0.0f, 8), (ipb1) null, x340Var8, 8, 8);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 10:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                boolean zY = x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2);
                rih1 rih1Var2 = rih1.a;
                if (zY) {
                    otw.c(q1o1.u((am51) obj3, (qim0) null, (FrameLayout.LayoutParams) null, 7), rih1Var2, (qim0) null, (ipb1) null, x340Var10, 48, 12);
                } else {
                    x340Var10.b0();
                }
                return rih1Var2;
            case 11:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    otw.c(q1o1.u((qm51) obj3, (qim0) null, (FrameLayout.LayoutParams) null, 7), new om51(false), (qim0) null, (ipb1) null, x340Var12, 0, 12);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 12:
                p6u0 p6u0Var = (p6u0) obj2;
                yna0 yna0Var = (yna0) ((smp0) obj3).e;
                String string2 = yna0Var.a.getString(2131959875);
                Resources resources = yna0Var.a;
                String string3 = resources.getString(2131959869);
                ArrayList arrayList = new ArrayList();
                if (p6u0Var.a) {
                    arrayList.add(new o6u0(0, new m6u0(wlx.c), resources.getString(2131959871), resources.getString(2131959870), blc0.W3));
                }
                if (p6u0Var.b) {
                    arrayList.add(new o6u0(arrayList.size(), new n6u0(), resources.getString(2131959874), resources.getString(2131959873), blc0.ac));
                }
                return new q6u0(string2, string3, mqo1.A(arrayList));
            case 13:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                boolean zY2 = x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2);
                rih1 rih1Var3 = rih1.a;
                if (zY2) {
                    otw.c((maa) ((z6u0) obj3).b.get(), rih1Var3, (qim0) null, (ipb1) null, x340Var14, 48, 12);
                } else {
                    x340Var14.b0();
                }
                return rih1Var3;
            case 14:
                return w5p1.o((dnu0) obj, ((onu0) obj3).a, (sv21) obj2);
            case 15:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                hnu0 hnu0Var = (hnu0) obj3;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    String str7 = hnu0Var.a;
                    Uri uri2 = str7 != null ? Uri.parse(str7) : Uri.EMPTY;
                    uri2.getClass();
                    bmq0.a(uri2, (qim0) null, (hcx) null, (String) null, hnu0Var.b, 0L, 0L, false, x340Var16, 0, 238);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 16:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x4i1 x4i1Var = (x4i1) obj3;
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    String str8 = x4i1Var.e;
                    if (str8 == null) {
                        uri = Uri.EMPTY;
                    } else {
                        String str9 = !ihc1.y0(str8) ? str8 : null;
                        if (str9 != null) {
                            uri = Uri.parse(str9);
                        } else {
                            uri = Uri.EMPTY;
                        }
                    }
                    Uri uri3 = uri;
                    uri3.getClass();
                    String str10 = x4i1Var.b;
                    String str11 = x4i1Var.c;
                    String str12 = str11 == null ? "" : str11;
                    Integer num = x4i1Var.g;
                    bmq0.a(uri3, (qim0) null, (hcx) null, str10, str12, num != null ? z4p1.e(num.intValue()) : u7h.k, 0L, false, x340Var18, 0, 198);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    uwo1.e(((uzu0) obj3).a, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var20, 0, 0, 1726);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 18:
                return new jpg0((dx0) ((tkv) obj3).b, o5v0.R0);
            case 19:
                return f6o1.A(new sdv0((byte) 0, ((xf4) ((ur6) obj3).b).q()), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
            case 20:
                p810 p810Var = (p810) obj2;
                ytp0 ytp0Var = (ytp0) obj3;
                Context context2 = (Context) ytp0Var.b;
                String str13 = p810Var.b;
                List list2 = p810Var.a;
                if (list2.isEmpty()) {
                    return wxd.a;
                }
                List<y53> list3 = list2;
                ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
                for (y53 y53Var : list3) {
                    boolean z3 = (p810Var.d && ((dp4) ytp0Var.f).b()) ? z : zBooleanValue;
                    String str14 = y53Var.b;
                    String str15 = y53Var.d;
                    String str16 = y53Var.c;
                    boolean z4 = y53Var.g;
                    boolean z5 = z;
                    arrayList2.add(new etd(str16, str14, z4 ? xcg1.i(context2.getString(2131952179), " • ", t9p1.j(context2, str15)) : y53Var.e.a + " • " + t9p1.j(context2, str15), y53Var.a, z6x.a, str14, z4 ? "latest_release" : "default", (y53Var.h && z3) ? z5 : false));
                    z = z5;
                    zBooleanValue = false;
                }
                return new xxd(context2.getString(2131960253, p810Var.c), arrayList2, !ihc1.y0(str13) ? new txd(context2.getString(2131960252), str13.concat(":releases")) : null);
            case 21:
                pc8 pc8Var = (pc8) obj3;
                return new jpg0(f6o1.A(new ngs0((i8h1) ((kly0) pc8Var.c).get(), new v3v0(1, (oev0) pc8Var.b, oev0.class, "onCategorySelected", "onCategorySelected(Lcom/spotify/creator/creatorpage/popularreleases/PopularReleasesCategoryChipsElement$CategorySelected;)Z", 0, (byte) 6)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), o5v0.Y0);
            case 22:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    eqr0.b(0, 2, ((xdv0) obj3).b, x340Var22, (qim0) null);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                qgv0 qgv0Var = (qgv0) obj3;
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    boolean zI = x340Var24.i(qgv0Var);
                    Object objT = x340Var24.T();
                    if (zI || objT == fkj0.X) {
                        objT = new z6v0(qgv0Var, (byte) 6);
                        x340Var24.s0(objT);
                    }
                    uap1.b((Function0) objT, x340Var24, 0);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 24:
                wiv0 wiv0Var = (wiv0) obj;
                Map map = ((elv0) obj2).a;
                yqg yqgVar = ((hjv0) obj3).b;
                String str17 = wiv0Var.a;
                Boolean bool = (Boolean) map.get(str17);
                zBooleanValue = bool != null ? bool.booleanValue() : false;
                Long l = wiv0Var.c;
                if (l != null && l.longValue() <= yqgVar.d().getTime().getTime()) {
                    i = 3;
                } else if (!zBooleanValue) {
                    i = 1;
                }
                return new yiv0(i, str17, wiv0Var.b);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return ((njv0) obj3).e((ljv0) obj2, (uiv0) obj);
            case 26:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                gwv0 gwv0Var = (gwv0) obj3;
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    String strO0 = cwl1.o0(x340Var26, 2131960342);
                    Object objT2 = x340Var26.T();
                    m4c m4cVar = fkj0.X;
                    if (objT2 == m4cVar) {
                        objT2 = v8r.q(strO0);
                        x340Var26.s0(objT2);
                    }
                    ven0 ven0Var = (ven0) objT2;
                    if (gwv0Var.c.a.a.b()) {
                        x340Var26.i0(2022144561);
                        boolean zI2 = x340Var26.i(ven0Var) | x340Var26.i(gwv0Var) | x340Var26.g(strO0);
                        Object objT3 = x340Var26.T();
                        if (zI2 || objT3 == m4cVar) {
                            elu0 elu0Var = new elu0(gwv0Var, strO0, ven0Var, (lnm) null, (byte) 6);
                            x340Var26.s0(elu0Var);
                            objT3 = elu0Var;
                        }
                        qxd0.t(rih1Var, x340Var26, (vu30) objT3);
                        x340Var26.r(false);
                    } else {
                        x340Var26.i0(2022268530);
                        x340Var26.r(false);
                    }
                    otw.c((maa) gwv0Var.b.get(), new ewv0((String) ven0Var.getValue()), (qim0) null, (ipb1) null, x340Var26, 0, 12);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 27:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    syv0 syv0Var = (syv0) obj3;
                    t3p1.k(new oo11(syv0Var.g, syv0Var.e), (qim0) null, x340Var28, 8);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 28:
                hoj0 hoj0VarC = ((ioj0) obj2).c(myv0.class, ((lzv0) obj).a);
                if (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null || (myv0Var = (myv0) goj0VarA.a) == null) {
                    eg.m("Prerelease metadata data should not be null");
                    return null;
                }
                long j = myv0Var.b;
                jby jbyVar = myv0Var.c;
                ZoneId zoneId = (ZoneId) ((et90) obj3).e;
                String str18 = myv0Var.a;
                nq70 nq70Var = (nq70) o7h.s0(jbyVar.d);
                return new mzv0(str18, nq70Var != null ? nq70Var.a : null, Instant.ofEpochSecond(j).atZone(zoneId).toLocalDate(), (int) ChronoUnit.DAYS.between(LocalDate.now(zoneId), Instant.ofEpochSecond(j).atZone(zoneId).toLocalDate()), jbyVar.b, jbyVar.c);
            default:
                oyv0 oyv0Var = (oyv0) obj;
                mmr0 mmr0Var = (mmr0) obj2;
                yvg1 yvg1Var = (yvg1) mmr0Var.a;
                jo70 jo70Var = (jo70) yvg1Var.a;
                xkk1 xkk1Var = (xkk1) yvg1Var.b;
                zoy0 zoy0Var = (zoy0) yvg1Var.c;
                boolean zBooleanValue2 = ((Boolean) mmr0Var.b).booleanValue();
                long j2 = zoy0Var.c;
                Instant instantOfEpochSecond = Instant.ofEpochSecond(j2);
                ynb0 ynb0Var = (ynb0) ((n0o) obj3).f;
                LocalDate localDate = instantOfEpochSecond.atZone((ZoneId) ynb0Var.get()).toLocalDate();
                up70 up70VarA = xkk1Var.a.a(vp70.d);
                if (up70VarA == null || (str2 = up70VarA.a.a) == null) {
                    up70 up70VarA2 = xkk1Var.a.a(vp70.c);
                    str = up70VarA2 != null ? up70VarA2.a.a : "";
                } else {
                    str = str2;
                }
                String str19 = jo70Var.a;
                String str20 = oyv0Var.a;
                localDate.getClass();
                return new q0w0(str19, str, str20, localDate, j2, (int) ChronoUnit.DAYS.between(LocalDate.now((ZoneId) ynb0Var.get()), localDate), j2 < ZonedDateTime.now((ZoneId) ynb0Var.get()).toEpochSecond(), oyv0Var.b, zBooleanValue2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1t0(Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }
}
