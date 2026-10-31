package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.view.View;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dvt0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dvt0(Object obj, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        opl0 opl0Var;
        x340 x340Var;
        String str;
        byte b = this.a;
        byte b2 = 1;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                cvt0 cvt0Var = (cvt0) obj;
                tqw tqwVar = (tqw) obj3;
                if (tqwVar != null) {
                    ((evt0) obj4).b.a(cvt0Var.d, n3o1.y(tqwVar), (Bundle) null);
                }
                return rih1Var;
            case 1:
                km61 km61Var = (km61) obj;
                c8u0 c8u0Var = (c8u0) obj4;
                if (((Boolean) obj2).booleanValue()) {
                    fn31.T(smo1.e(flo1.l(op71.f(), c8u0Var.e)), (o8n) null, 0, new c3u0(c8u0Var, (lnm) null, (byte) 4), 3);
                    return new it61(Boolean.TRUE);
                }
                km61.a(km61Var, "disablePlayedReceipts", (Bundle) null, false, 6);
                return new it61(Boolean.TRUE);
            case 2:
                ((Number) obj3).intValue();
                ((tzr0) ((equ0) obj4).c.get()).a(((dqu0) obj).h, (b0k) obj2, 0);
                return rih1Var;
            case 3:
                wuu0 wuu0Var = (xuu0) obj3;
                uvk0 uvk0Var = (uvk0) ((tvu0) obj4).c.getValue();
                String id = ((dvu0) obj).a.getId();
                uvk0Var.getClass();
                sqk0 sqk0Var = new sqk0(uvk0Var, id);
                if (wuu0Var instanceof wuu0) {
                    return sqk0Var.a(wuu0Var.a);
                }
                if (wuu0Var instanceof vuu0) {
                    return sqk0Var.g();
                }
                eg.o();
                return null;
            case 4:
                otw.c(((mwu0) obj4).d, (gwu0) obj, (qim0) null, (ipb1) null, (b0k) obj2, (((Number) obj3).intValue() << 3) & 112, 12);
                return rih1Var;
            case 5:
                zzu0 zzu0Var = (zzu0) obj2;
                if (zzu0Var instanceof zzu0) {
                    ((b0v0) obj4).a.invoke(Boolean.valueOf(zzu0Var.a));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 6:
                x340 x340Var2 = (b0k) obj2;
                ((Number) obj3).intValue();
                v2v0 v2v0Var = (v2v0) obj4;
                String str2 = v2v0Var.q;
                String str3 = v2v0Var.t;
                StringBuilder sb = new StringBuilder(str2);
                String str4 = v2v0Var.r;
                if (str4.length() > 0) {
                    sb.append(", ".concat(str4));
                }
                if (str3.length() > 0) {
                    sb.append(", ".concat(str3));
                }
                String string = sb.toString();
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 0.0f, 16.0f, 0.0f, 11);
                x340 x340Var3 = x340Var2;
                boolean zG = x340Var3.g(string);
                Object objT = x340Var3.T();
                if (zG || objT == fkj0.X) {
                    objT = new zqu0(string, (byte) 7);
                    x340Var3.s0(objT);
                }
                qim0 qim0VarA = s161.a(qim0VarB, (iu30) objT);
                ye5 ye5VarO = kk0.o(694645573, x340Var3);
                int iO = ye5VarO.o(new zma1(cbx.a(x340Var3).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                try {
                    ye5VarO.g(str2);
                    if (str4.length() > 0) {
                        ye5VarO.g(" • ");
                        ye5VarO.g(str4);
                    }
                    if (str3.length() > 0) {
                        ye5VarO.g(" • ");
                        break;
                    }
                    ye5VarO.k(iO);
                    if (str3.length() > 0) {
                        ye5VarO.g(str3);
                    }
                    af5 af5VarP = ye5VarO.p();
                    x340Var3.r(false);
                    uwo1.d(af5VarP, cbx.a(x340Var3).b.b, qim0VarA, cbx.d(x340Var3).j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var3, 0, 0, 4080);
                    return rih1Var;
                } catch (Throwable th) {
                    ye5VarO.k(iO);
                    throw th;
                }
            case 7:
                wdv0 wdv0Var = (wdv0) obj2;
                ngs0 ngs0Var = (ngs0) obj4;
                List list = ((ydv0) obj).a;
                List list2 = wdv0Var.b;
                if (list2 == null) {
                    list2 = list;
                }
                if (u890.j(list2, list)) {
                    String str5 = wdv0Var.a;
                    if (((Boolean) ((v3v0) ngs0Var.d).invoke(new wdv0(str5, list2))).booleanValue()) {
                        azg azgVar = (azg) ngs0Var.e;
                        Iterator it = list.iterator();
                        int i = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i = -1;
                            } else if (!u890.j(((xdv0) it.next()).a, str5)) {
                                i++;
                            }
                        }
                        if (i >= 0 && !((xdv0) list.get(i)).c && (opl0Var = (opl0) azgVar.c) != null) {
                            r6h1 r6h1Var = opl0Var.b;
                            String str6 = str5 == null ? "all" : str5;
                            Integer numValueOf = Integer.valueOf(i);
                            x6h1 x6h1VarC = opl0Var.c.c();
                            x6h1VarC.i.add(new a7h1("filter_chip", str6, numValueOf, (String) null, (String) null));
                            x6h1VarC.j = false;
                            y6h1 y6h1VarA = x6h1VarC.a();
                            i8h1 i8h1Var = (i8h1) azgVar.b;
                            b7x b7xVar = b7x.a;
                            i8h1Var.m(str5 == null ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("clear_filter", 1, b7xVar), y6h1VarA, r6h1Var, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("filter", 1, b7xVar), y6h1VarA, r6h1Var, System.currentTimeMillis()), (xj61) null);
                        }
                    }
                }
                return rih1Var;
            case 8:
                ((fov0) obj4).a.invoke((dov0) obj2);
                return rih1Var;
            case 9:
                psv0 psv0Var = (rsv0) obj2;
                tqw tqwVar2 = (tqw) obj3;
                dx0 dx0Var = (dx0) obj4;
                ktv0 ktv0Var = ((ssv0) obj).a;
                String str7 = ktv0Var.l;
                tv80 tv80VarY = tqwVar2 != null ? n3o1.y(tqwVar2) : null;
                if (psv0Var.equals(qsv0.a)) {
                    htv0 htv0Var = ktv0Var.n;
                    q7t0.d.getClass();
                    dx0Var.g(htv0Var, lfb.e(str7), tv80VarY);
                } else if (psv0Var.equals(qsv0.b)) {
                    htv0 htv0Var2 = ktv0Var.o;
                    q7t0.d.getClass();
                    dx0Var.g(htv0Var2, lfb.e(str7), tv80VarY);
                } else {
                    if (!(psv0Var instanceof psv0)) {
                        eg.o();
                        return null;
                    }
                    ((hp20) dx0Var.d).a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(psv0Var.a)));
                }
                return rih1Var;
            case 10:
                btv0 btv0Var = (btv0) obj;
                if (((atv0) obj2) == atv0.a) {
                    ((hp20) ((rt01) obj4).d).a(btv0Var.a.c);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 11:
                ltv0 ltv0Var = (ltv0) obj2;
                tqw tqwVar3 = (tqw) obj3;
                rt01 rt01Var = (rt01) obj4;
                ktv0 ktv0Var2 = ((mtv0) obj).a;
                tv80 tv80VarY2 = tqwVar3 != null ? n3o1.y(tqwVar3) : null;
                if (ltv0Var.equals(ltv0.a)) {
                    htv0 htv0Var3 = ktv0Var2.n;
                    lfb lfbVar = q7t0.d;
                    String str8 = ktv0Var2.l;
                    lfbVar.getClass();
                    rt01Var.g(htv0Var3, lfb.e(str8), tv80VarY2);
                } else {
                    if (!ltv0Var.equals(ltv0.b)) {
                        eg.o();
                        return null;
                    }
                    htv0 htv0Var4 = ktv0Var2.o;
                    lfb lfbVar2 = q7t0.d;
                    String str9 = ktv0Var2.l;
                    lfbVar2.getClass();
                    rt01Var.g(htv0Var4, lfb.e(str9), tv80VarY2);
                }
                return rih1Var;
            case 12:
                ((Number) obj3).intValue();
                ((v7w0) obj4).c((b0k) obj2, 0);
                return rih1Var;
            case 13:
                ((Number) obj3).intValue();
                h8w0 h8w0Var = (h8w0) obj4;
                x340 x340Var4 = (b0k) obj2;
                boolean zI = x340Var4.i(h8w0Var);
                Object objT2 = x340Var4.T();
                if (zI || objT2 == fkj0.X) {
                    objT2 = new g8w0(h8w0Var, (byte) 0);
                    x340Var4.s0(objT2);
                }
                dgo1.c(rih1Var, (iu30) objT2, apo.r(747683361, new y6w0(h8w0Var, b2), x340Var4), x340Var4, 390);
                return rih1Var;
            case 14:
                Boolean bool = (Boolean) obj2;
                boolean zBooleanValue = bool.booleanValue();
                hma1 hma1VarEdit = ((dma1) ((zgz0) ((yeu0) obj4).c).b).edit();
                hma1VarEdit.a(lu71.a, zBooleanValue);
                hma1VarEdit.g();
                return new it61(bool);
            case 15:
                xjw0 xjw0Var = (xjw0) obj;
                wjw0 wjw0Var = (wjw0) obj2;
                tqw tqwVar4 = (tqw) obj3;
                sfn0 sfn0Var = ((zjw0) obj4).a;
                if (wjw0Var.equals(ujw0.a)) {
                    String str10 = xjw0Var.a;
                    if (str10 != null) {
                        String str11 = xjw0Var.e;
                        long j = xjw0Var.c;
                        m6n0 m6n0Var = new m6n0(j, ((long) xjw0Var.d) + j);
                        n6n0 n6n0Var = xjw0Var.g;
                        tv80 tv80VarY3 = tqwVar4 != null ? n3o1.y(tqwVar4) : null;
                        sfn0Var.b.a.m((Object) null, new ogn0(true));
                        sfn0Var.b(str11, str10, m6n0Var, n6n0Var, tv80VarY3);
                    }
                } else {
                    if (!wjw0Var.equals(vjw0.a)) {
                        eg.o();
                        return null;
                    }
                    sfn0Var.c();
                }
                return rih1Var;
            case 16:
                t7x0 t7x0Var = (t7x0) obj;
                s7x0 s7x0Var = (s7x0) obj2;
                tqw tqwVar5 = (tqw) obj3;
                v7x0 v7x0Var = (v7x0) obj4;
                String str12 = v7x0Var.d;
                kt91 kt91Var = v7x0Var.b;
                lzn0 lzn0Var = v7x0Var.a;
                tv80 tv80VarY4 = tqwVar5 != null ? n3o1.y(tqwVar5) : null;
                switch (s7x0Var.a.ordinal()) {
                    case 0:
                        lzn0Var.e();
                        break;
                    case 1:
                        if (tv80VarY4 != null) {
                            lzn0Var.a(str12, tv80VarY4, (Bundle) null);
                        }
                        break;
                    case 2:
                        if (tv80VarY4 != null) {
                            lzn0Var.a(v7x0Var.h, tv80VarY4, (Bundle) null);
                        }
                        break;
                    case 3:
                    case 4:
                        if (tv80VarY4 != null) {
                            lzn0Var.a(str12, tv80VarY4, (Bundle) null);
                        }
                        break;
                    case 5:
                        if (tv80VarY4 != null) {
                            lzn0Var.a(v7x0Var.f, tv80VarY4, (Bundle) null);
                        }
                        break;
                    case 6:
                        if (tv80VarY4 != null) {
                            lzn0Var.a(v7x0Var.e, tv80VarY4, (Bundle) null);
                        }
                        break;
                    case 7:
                        if (tv80VarY4 != null) {
                            t7x0Var.h.invoke(tv80VarY4);
                        }
                        break;
                    case 8:
                        if (!t7x0Var.d) {
                            t7x0Var.i.invoke();
                        } else if (tv80VarY4 != null) {
                            String str13 = t7x0Var.e;
                            if (str13 == null) {
                                str13 = v7x0Var.i;
                            }
                            lzn0Var.a(str13, tv80VarY4, (Bundle) null);
                        }
                        break;
                    case 9:
                        t7x0Var.g.invoke();
                        break;
                    case 10:
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131956077});
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131956077});
                        kt91Var.k(new er91((fs91) null, "", 2131956077, (String) null, 2131956076, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                        break;
                    case 11:
                        if (tv80VarY4 != null) {
                            lzn0Var.a(v7x0Var.g, tv80VarY4, (Bundle) null);
                        }
                        break;
                    case 12:
                        if (tv80VarY4 != null) {
                            t7x0Var.f.invoke(tv80VarY4);
                        }
                        break;
                    case 13:
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131960428});
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131960428});
                        kt91Var.k(new er91((fs91) null, "", 2131960428, (String) null, 2131959373, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                        break;
                    case 14:
                    case 15:
                        break;
                    default:
                        eg.o();
                        return null;
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                xcx0 xcx0Var = (xcx0) obj2;
                ug3 ug3Var = (ug3) obj4;
                if (xcx0Var.equals(vcx0.a)) {
                    ((gis) ug3Var.c).invoke();
                } else if (xcx0Var.equals(ucx0.a)) {
                    ((gis) ug3Var.d).invoke();
                } else {
                    if (!xcx0Var.equals(wcx0.a)) {
                        eg.o();
                        return null;
                    }
                    ((gis) ug3Var.e).invoke();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                tqw tqwVar6 = (tqw) obj3;
                oex0 oex0Var = (oex0) obj4;
                String strF = f4i1.f("spotify:internal:managed-account-details:teen:", ((nex0) obj).a, ":profile-visibility-settings");
                tv80 tv80VarY5 = tqwVar6 != null ? n3o1.y(tqwVar6) : null;
                lzn0 lzn0Var2 = oex0Var.a;
                if (tv80VarY5 != null) {
                    lzn0Var2.a(strF, tv80VarY5, (Bundle) null);
                } else {
                    lzn0Var2.h(strF);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (((yex0) obj2).equals(yex0.a)) {
                    ((Function0) ((cac) obj4).b).invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                tqw tqwVar7 = (tqw) obj3;
                lzn0 lzn0Var3 = ((slx0) obj4).a;
                String str14 = ((rlx0) obj).h;
                if (!((qlx0) obj2).equals(qlx0.a)) {
                    eg.o();
                    return null;
                }
                if (tqwVar7 != null) {
                    lzn0Var3.a(str14, n3o1.y(tqwVar7), (Bundle) null);
                } else {
                    lzn0Var3.h(str14);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (xlx0.a[((wlx0) obj2).ordinal()] == 1) {
                    a1r0.j(((amx0) ((ngs0) obj4).d).a, "spotify:promo-disclosure", (String) null, (Bundle) null, true, 4);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 22:
                x340 x340Var5 = (b0k) obj2;
                ((Number) obj3).intValue();
                nim0 nim0Var = nim0.a;
                qim0 qim0VarF = dug.f(u291.d(uyn1.w(nim0Var, (vzq0) obj), 1.0f), u7h.b, d4o1.a);
                bmx0 bmx0Var = (bmx0) obj4;
                gfh0 gfh0VarC = t1c.c(een.e, false);
                x340 x340Var6 = x340Var5;
                int iHashCode = Long.hashCode(x340Var6.T);
                xos0 xos0VarM = x340Var6.m();
                qim0 qim0VarE = zr7.E(x340Var5, qim0VarF);
                hzj.A.getClass();
                x340 x340Var7 = x340Var5;
                if (x340Var7.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var7.m0();
                if (x340Var7.S) {
                    x340Var7.l(hmb0.t1);
                } else {
                    x340Var7.v0();
                }
                nko1.H(gfh0VarC, x340Var5, y580.O0);
                nko1.H(xos0VarM, x340Var5, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var5, y580.R0);
                nko1.F(x340Var5);
                nko1.H(qim0VarE, x340Var5, y580.Y);
                if (bmx0Var.b.a()) {
                    x340Var7.i0(1941530968);
                    c680.s(anm1.N("PROMO_DISCLOSURE_WEBVIEW", u291.d(u291.x(0.0f, dsa0.m(x340Var5, 2131166901), 1, nim0Var), 1.0f)), null, null, x340Var5, 6);
                    x340Var7.r(false);
                    x340Var = x340Var7;
                } else {
                    x340Var7.i0(1941815238);
                    qim0 qim0VarN = anm1.N("PROMO_DISCLOSURE_WEBVIEW", u291.d(u291.x(0.0f, dsa0.m(x340Var5, 2131166901), 1, nim0Var), 1.0f));
                    pi30 pi30VarO = bbp1.o(x340Var5);
                    Bundle bundle = Bundle.EMPTY;
                    w8c0 w8c0Var = (w8c0) hso1.v(((iac0) x340Var7.k(jfe0.a)).getLifecycle(), x340Var5).getValue();
                    Object objT3 = x340Var7.T();
                    if (objT3 == fkj0.X) {
                        objT3 = zqb0.R0;
                        x340Var7.s0(objT3);
                    }
                    x340Var = x340Var7;
                    m5n1.a(fmx0.class, qim0VarN, pi30VarO, bundle, w8c0Var, (iu30) objT3, x340Var5, 0, 0);
                    x340Var.r(false);
                }
                x340Var.r(true);
                return rih1Var;
            case 23:
                kmx0 kmx0Var = (kmx0) obj;
                tqw tqwVar8 = (tqw) obj3;
                lzn0 lzn0Var4 = ((lmx0) obj4).a;
                Parcelable.Creator creator = lik1.CREATOR;
                String str15 = kmx0Var.e;
                if (oap1.o(str15)) {
                    Bundle bundleH = mno1.h(new mmr0[]{new mmr0("highlight_id", kmx0Var.a)});
                    if (tqwVar8 != null) {
                        lzn0Var4.a(str15, n3o1.y(tqwVar8), bundleH);
                    } else {
                        lzn0Var4.g(bundleH, str15);
                    }
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new n59((fux0) obj4, (cir0) obj2, (qux0) obj3);
            case 25:
                hsl1 hsl1Var = (hsl1) obj2;
                int i2 = hsl1Var.a.i(8).d;
                bjx bjxVar = ((tux0) obj4).a;
                if (i2 > 0) {
                    crn1.t((EncoreTextView) bjxVar.g);
                    crn1.t((EncoreTextView) bjxVar.c);
                    crn1.t((EncoreTextView) bjxVar.f);
                } else {
                    crn1.s((EncoreTextView) bjxVar.g);
                    crn1.s((EncoreTextView) bjxVar.c);
                    crn1.s((EncoreTextView) bjxVar.f);
                }
                return hsl1Var;
            case 26:
                ((z8b0) ((ngs0) obj4).d).invoke((iwx0) obj2);
                return rih1Var;
            case 27:
                if (z0y0.a[((x0y0) obj2).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                kls0 kls0Var = (kls0) obj4;
                ((f2g1) kls0Var.c).b((String) kls0Var.b, (ResultReceiver) null);
                return rih1Var;
            case 28:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                vhx0 vhx0Var = (vhx0) obj4;
                if (vhx0Var == null || (str = vhx0Var.a) == null) {
                    str = "";
                }
                String str16 = str;
                uwr uwrVar2 = cbx.a;
                uwo1.e(str16, (qim0) null, cbx.d(b0kVar).j, cbx.a(b0kVar).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar, 0, 0, 1714);
                return rih1Var;
            default:
                ((azy0) obj4).a.invoke();
                return rih1Var;
        }
    }
}
