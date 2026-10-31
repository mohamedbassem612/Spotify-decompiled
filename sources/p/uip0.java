package p;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
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
import com.spotify.aiplaylist.promptcreation.presentation.PromptCreationHeaderView;
import com.spotify.base.java.logging.Logger;
import com.spotify.kidsaccount.api.v2.proto.NotEmpty;
import com.spotify.player.model.PlayerState;
import com.spotify.premiummarketing.premiumdestinationpage.v1.PremiumDestinationPageResponse;
import com.spotify.pses.pses.PsesFetchException;
import com.spotify.pses.v1.proto.ConfigurationResponse;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeSwitchIfEmpty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uip0 implements Function, c9v, nyc, hs31, xi7, qiw, ya, b2i {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ uip0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public void N(int i, p2i0 p2i0Var, twa twaVar) {
        ((ysp0) this.b).a.open();
    }

    public void U(int i, p2i0 p2i0Var) {
        ((ysp0) this.b).a.open();
    }

    public String a(int i, String... strArr) {
        return ((dg30) this.b).getResources().getString(i, Arrays.copyOf(strArr, strArr.length));
    }

    public boolean accept(Object obj) {
        return ((uh4) this.b).e();
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0372  */
    /* JADX WARN: Code duplicated, block: B:137:0x03b8  */
    public Object apply(Object obj) throws PsesFetchException {
        c560 b560Var;
        oc20 mc20Var;
        d820 c820Var;
        wkd wkdVar;
        huz evzVar;
        Single singleFlatMap;
        String str;
        String str2;
        String str3;
        Observable observableJust;
        gmy0 m231Var;
        String string;
        byte b = this.a;
        o6x o6xVar = o6x.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                mmr0 mmr0Var = (mmr0) obj;
                tip0 tip0Var = (tip0) mmr0Var.a;
                lai1 lai1Var = tip0Var.a;
                dam damVar = tip0Var.b;
                gpy0 gpy0Var = tip0Var.c;
                boolean z = tip0Var.d;
                boolean z2 = ((Boolean) mmr0Var.b).booleanValue() && lai1Var.a;
                if (z) {
                    return i560.a;
                }
                spq0 spq0Var = lai1Var.b;
                if (!spq0Var.c()) {
                    return new h560((m560) obj2);
                }
                if (!gpy0Var.a) {
                    return new e560(e9p1.m((kai1) spq0Var.b()));
                }
                if (damVar.equals(y9m.a)) {
                    return new g560(e9p1.m((kai1) spq0Var.b()));
                }
                if (damVar.b() && damVar.a()) {
                    return new d560(e9p1.m((kai1) spq0Var.b()), z2);
                }
                c560 c560VarM = e9p1.m((kai1) spq0Var.b());
                me20 me20VarB = c560VarM.b();
                me20 me20VarA = me20.a(me20VarB, damVar.a() && me20VarB.c, damVar.b() && me20VarB.f, 91);
                if (c560VarM instanceof a560) {
                    b560Var = new a560(((a560) c560VarM).a, me20VarA);
                } else {
                    if (!(c560VarM instanceof b560)) {
                        eg.o();
                        return null;
                    }
                    b560Var = new b560(((b560) c560VarM).a, me20VarA);
                }
                return new f560(b560Var, damVar, z2);
            case 1:
            case 2:
            case 4:
            case 11:
            case 12:
            case 18:
            case 20:
            case 22:
            case 23:
            case 24:
            case 25:
            default:
                l0x0 l0x0Var = ((t6z0) obj2).h;
                dn90 dn90Var = ((p5z0) obj).d;
                Resources resources = (Resources) l0x0Var.c;
                int i = dn90Var.b;
                if (dn90Var instanceof y80) {
                    string = resources.getQuantityString(2131820869, i, Integer.valueOf(i));
                } else if (dn90Var instanceof x80) {
                    string = resources.getQuantityString(2131820868, i, Integer.valueOf(i));
                } else {
                    if (!(dn90Var instanceof z80)) {
                        eg.o();
                        return null;
                    }
                    string = resources.getString(2131960751);
                }
                String str4 = string;
                str4.getClass();
                ((kt91) l0x0Var.b).k(new er91((fs91) null, str4, (Integer) null, resources.getString(2131960798), (Integer) null, new hid0(l0x0Var, (byte) 19), (cvr) null, (xq91) null, false));
                return Observable.empty();
            case 3:
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (List) obj) {
                    if (hashSet.add(((ssp0) obj3).a)) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : arrayList) {
                    arrayList2.add(obj4);
                }
                return o7h.d1(o7h.a1(arrayList2, ((ivp0) obj2).c), 20);
            case 5:
                return sd41.a(((t9q0) obj2).b, ((x9q0) obj).a, (tv80) null, 6).w();
            case 6:
                if (((List) obj).isEmpty()) {
                    Single singleJust = Single.just(new xnq0(((nsy0) obj2).a));
                    singleJust.getClass();
                    return singleJust;
                }
                Single singleJust2 = Single.just(goq0.a);
                singleJust2.getClass();
                return singleJust2;
            case 7:
                return !((Boolean) obj).booleanValue() ? Observable.never() : Observable.create(new hvp0((en70) obj2, (byte) 5));
            case 8:
                e320 e320Var = (f320) obj;
                e320 e320Var2 = e320Var instanceof e320 ? e320Var : null;
                if (e320Var2 == null) {
                    Logger.d(f4i1.f("Unexpected FieldValidationResponse type: ", e320Var.getClass().getSimpleName(), ". Expected FieldValidationResponse.Password for password validation."), new Object[0]);
                    e320Var2 = new e320(new r0c0());
                }
                return new i6s0(((b6s0) obj2).a, e320Var2.a);
            case 9:
                qx41 qx41Var = (qx41) obj;
                yon yonVar = (yon) obj2;
                ((t5h1) yonVar.d).getClass();
                String strA = t5h1.a();
                String str5 = qx41Var.b;
                List list = qx41Var.j;
                if (list == null) {
                    xo20 xo20Var = qx41Var.d;
                    if (xo20Var != null) {
                        mc20Var = new mc20(xo20Var);
                    } else {
                        hhg1.n("Required value was null.");
                    }
                    return null;
                }
                mc20Var = new nc20(list);
                oc20 oc20Var = mc20Var;
                int i2 = qx41Var.f;
                String str6 = qx41Var.e;
                gyh gyhVar = qx41Var.h;
                boolean z3 = qx41Var.i;
                pc20 pc20Var = new pc20(strA, str5, oc20Var, i2, str6, gyhVar, z3, (l651) yonVar.e);
                boolean z4 = str6.length() == 0;
                ur00 ur00Var = (ur00) yonVar.c;
                kp00 kp00Var = (kp00) ur00Var.e;
                di4 di4Var = (di4) kp00Var.b;
                boolean z5 = oc20Var instanceof mc20;
                if (!z5) {
                    if (oc20Var instanceof nc20) {
                        nc20 nc20Var = (nc20) oc20Var;
                        ArrayList arrayListB = ((o551) kp00Var.c).b(z3, di4Var.n0(), di4Var.M());
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Iterator it = arrayListB.iterator();
                        while (it.hasNext()) {
                            linkedHashSet.add(((mo21) it.next()).a);
                        }
                        c820Var = new c820(nc20Var.a, linkedHashSet);
                    } else {
                        eg.o();
                    }
                    return null;
                }
                c820Var = new b820(((mc20) oc20Var).a);
                e820 e820Var = new e820(str5, c820Var, pc20Var.d, pc20Var.e, pc20Var.h);
                z2g0 z2g0Var = (z2g0) ((ydf0) ((n0v0) ur00Var.f).b).c(e820Var);
                if (z2g0Var != null) {
                    singleFlatMap = Single.just(z2g0Var);
                } else {
                    uu0 uu0Var = (uu0) ur00Var.c;
                    uny unyVar = (uny) uu0Var.g;
                    di4 di4Var2 = (di4) unyVar.b;
                    if (!z5) {
                        if (oc20Var instanceof nc20) {
                            v8n0 v8n0Var = (v8n0) unyVar.c;
                            boolean zP0 = di4Var2.p0();
                            b75 b75Var = v8n0Var.d;
                            boolean zD = b75Var.d();
                            int iOrdinal = b75Var.h().ordinal();
                            if (iOrdinal == 0) {
                                wkdVar = xkd.c;
                            } else if (iOrdinal == 1) {
                                wkdVar = wkd.c;
                            } else {
                                eg.o();
                            }
                            evzVar = new evz(v8n0Var.b(zP0, zD, wkdVar), unyVar, (byte) 8);
                            singleFlatMap = yoi1.i(new ipr(evzVar, pc20Var, uu0Var, (byte) 13), o6xVar).firstOrError().flatMap(new lc20(ur00Var, pc20Var, e820Var, (byte) 0));
                        } else {
                            eg.o();
                        }
                        return null;
                    }
                    wo20 wo20Var = ((mc20) oc20Var).a.b;
                    boolean z6 = wo20Var instanceof uo20;
                    if (z6) {
                        int iC = l1d.C(((uo20) wo20Var).a);
                        if (iC == 4) {
                            str3 = "pl_spotify_logic";
                        } else if (iC != 6) {
                            str = null;
                        } else {
                            str3 = di4Var2.q0() ? "videoflag" : null;
                        }
                        str = str3;
                    } else {
                        str = null;
                    }
                    String str7 = di4Var2.d() ? "is_chaptered" : null;
                    if (di4Var2.h0()) {
                        if (wo20Var instanceof to20) {
                            int iC2 = l1d.C(((to20) wo20Var).a);
                            if (iC2 != 0 && iC2 != 1) {
                                if (iC2 != 2) {
                                    eg.o();
                                    return null;
                                }
                            }
                        } else if (z6) {
                            str2 = nn10.a[l1d.C(((uo20) wo20Var).a)] == 1 ? "tentpolemusicfilters" : null;
                        } else if (!(wo20Var instanceof vo20)) {
                            eg.o();
                            return null;
                        }
                    }
                    evzVar = new huz(uny.I(f46.i0(new String[]{str, "track_classification", str7, str2, di4Var2.o0() ? "showverified" : null, unyVar.n(), di4Var2.a0() ? "smartfilters" : null})), (byte) 10);
                    singleFlatMap = yoi1.i(new ipr(evzVar, pc20Var, uu0Var, (byte) 13), o6xVar).firstOrError().flatMap(new lc20(ur00Var, pc20Var, e820Var, (byte) 0));
                }
                boolean z7 = z4;
                return singleFlatMap.map(new l1p0(pc20Var, (byte) 13)).map(new svh0(yonVar, qx41Var, z4, (byte) 6)).onErrorReturn(new jqd0(yonVar, qx41Var, z7, pc20Var, (byte) 8)).toObservable().compose(z7 ? (lk1) yonVar.b : nm3.X);
            case 10:
                return (Long) ((PlayerState) obj).position(((evs0) obj2).b.b()).e(0L);
            case 13:
                cs01 cs01Var = (cs01) obj;
                tyt0 tyt0Var = (tyt0) obj2;
                y6b1 y6b1Var = cs01Var.e;
                String strG = y6b1Var != null ? y6b1Var.g() : null;
                pyt0 pyt0Var = pyt0.b;
                if (strG == null || strG.equals("spotify:playlist:37i9dQZF1EYkqdzj48dyYq")) {
                    observableJust = Observable.just(pyt0Var);
                } else if (strG.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || strG.equals("spotify:collection:tracks") || strG.equals("spotify:internal:collection:tracks") || (nhc1.Y(strG, "spotify:user:", false) && nhc1.R(strG, ":collection", false))) {
                    String str8 = cs01Var.d;
                    observableJust = tyt0Var.b.a("", Collections.singletonList(str8), false).toObservable().map(new yjp1(str8, (byte) 14)).onErrorReturnItem(pyt0Var);
                } else {
                    observableJust = Observable.fromCallable(new wra(tyt0Var, y6b1Var, cs01Var, (byte) 4));
                }
                return observableJust.map(new hvp0(cs01Var, (byte) 11));
            case 14:
                feh fehVar = (feh) obj;
                return fehVar instanceof ceh ? ((mcu0) obj2).c.a(new g9u0("read-along-default-player-seek", false)) : Single.just(fehVar);
            case 15:
                mmr0 mmr0Var2 = (mmr0) obj;
                String str9 = (String) mmr0Var2.a;
                int iIntValue = ((Number) mmr0Var2.b).intValue();
                bxh bxhVar = (uwh) ((x981) obj2).b;
                return new MaybeSwitchIfEmpty(cwl1.e0(bxhVar.d, new zi3(bxhVar, str9, iIntValue, (lnm) null, (byte) 4)).f(b610.Z0), Maybe.e(j5.a)).n().onErrorReturn(f610.Y0);
            case 16:
                kgv0 kgv0Var = (kgv0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    return rqt0.F(o6xVar, new c3u0(kgv0Var, (lnm) null, (byte) 9));
                }
                iza0 iza0Var = kgv0Var.b.a;
                bgo0 bgo0VarO = NotEmpty.o();
                bgo0VarO.n();
                return iza0Var.e(bgo0VarO.build()).map(b610.h);
            case 17:
                sy21 sy21Var = (sy21) obj;
                wlv0 wlv0Var = (wlv0) obj2;
                wlv0Var.getClass();
                ry21 ry21Var = sy21Var.a;
                long j = ry21Var.Z - ry21Var.Y;
                LinkedHashMap linkedHashMapM = sqg0.M(new mmr0[]{new mmr0("source", "connection_speed"), new mmr0("speed", String.valueOf((ry21Var.g.toString().getBytes(nne.a).length / (j / 1000.0f)) / 1024.0f)), new mmr0("duration", String.valueOf(j))});
                boolean z8 = ry21Var.Q0;
                if (!z8) {
                    linkedHashMapM.put("error_message", ry21Var.c);
                }
                wlv0Var.c.a(new khv0((String) null, "pses_connection", linkedHashMapM));
                if (!z8) {
                    throw new PsesFetchException(Integer.valueOf(ry21Var.d), 6);
                }
                ConfigurationResponse configurationResponse = (ConfigurationResponse) sy21Var.b;
                if (configurationResponse != null) {
                    return configurationResponse;
                }
                throw new PsesFetchException(null, 5);
            case 19:
                return ((zhq0) obj2).l((PremiumDestinationPageResponse) obj);
            case 21:
                return ((www0) obj2).d.b((String) obj).map(zi20.b1).firstOrError();
            case 26:
                Object obj5 = ((e331) obj).a;
                try {
                    gfo0 gfo0Var = ((fmy0) obj2).g;
                    hm5.M(obj5);
                    ConfigurationResponse configurationResponseA = ((ouk) obj5).a();
                    gfo0Var.a(configurationResponseA);
                    m231Var = new yrg0(configurationResponseA, (byte) 9).l();
                    break;
                } catch (Exception e) {
                    m231Var = new m231(e);
                }
                return new e331(m231Var);
        }
    }

    public af5 h(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(1045297818);
        kdy0 kdy0Var = (kdy0) this.b;
        ye5 ye5Var = new ye5();
        uwr uwrVar = cbx.a;
        int iO = ye5Var.o(new zma1(cbx.a(x340Var).b.g, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
        try {
            Object obj = kdy0Var.c;
            ye5Var.g("Unavailable option 2");
            ye5Var.k(iO);
            ye5Var.g("\n");
            ye5Var.g("Unavailable option 3");
            af5 af5VarP = ye5Var.p();
            x340Var.r(false);
            return af5VarP;
        } catch (Throwable th) {
            ye5Var.k(iO);
            throw th;
        }
    }

    public void i(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        String queryParameter;
        Uri uri;
        Uri uri2 = s4b1Var.a;
        if (uri2 == null || (queryParameter = uri2.getQueryParameter("is_free")) == null) {
            queryParameter = "0";
        }
        String country = Locale.getDefault().getCountry();
        if (queryParameter.equals("1")) {
            uri = Uri.parse("https://support.spotify.com/" + country + "/close-account/plain/");
        } else {
            uri = Uri.parse("https://support.spotify.com/" + country + "/premium-close-account/plain/");
        }
        b72 b72Var = (b72) this.b;
        ((ryf) b72Var.c).b((Activity) b72Var.b, new lyf(mxf.b, iyf.a, uri));
    }

    public void k(jf01 jf01Var, IOException iOException) {
        ((em61) this.b).v(iOException);
    }

    public Single l(Intent intent, th61 th61Var) {
        return ((o241) ((ru9) this.b).b).a.map(b4x0.b).firstOrError().onErrorReturn(c4x0.b).map(new yqu0(intent, th61Var, (byte) 18));
    }

    public void n(jf01 jf01Var, ry21 ry21Var) {
        ((em61) this.b).u(ry21Var);
    }

    public void q(int i, p2i0 p2i0Var) {
        ((ysp0) this.b).a.open();
    }

    public void v(Object obj) {
        mmr0 mmr0Var = (mmr0) obj;
        fvx0 fvx0Var = (fvx0) this.b;
        boolean zBooleanValue = ((Boolean) mmr0Var.a).booleanValue();
        n360 n360Var = (n360) mmr0Var.b;
        PromptCreationHeaderView promptCreationHeaderView = (PromptCreationHeaderView) fvx0Var.d.e;
        if (n360Var == null) {
            promptCreationHeaderView.setVisibility(8);
            return;
        }
        promptCreationHeaderView.setVisibility(0);
        promptCreationHeaderView.y(zBooleanValue, n360Var, fvx0Var.c.b.i());
        fvx0Var.b.d = new hzu0(n360Var, fvx0Var, (byte) 29);
        promptCreationHeaderView.setOnCloseClickListener(new cvx0(fvx0Var, (byte) 0));
        promptCreationHeaderView.setOnBackClickListener(new dvx0(fvx0Var, n360Var, (byte) 0));
        promptCreationHeaderView.setMoreOptionsButtonClickListener(new dvx0(fvx0Var, n360Var, (byte) 1));
        promptCreationHeaderView.setLegalDisclaimerClickListener(new cvx0(fvx0Var, (byte) 1));
    }

    public void y(int i, p2i0 p2i0Var, Exception exc) {
        ((ysp0) this.b).a.open();
    }
}
