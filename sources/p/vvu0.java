package p;

import android.R;
import android.app.Activity;
import android.bluetooth.BluetoothGattCharacteristic;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.compose.ui.geometry.Offset;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnErrorReturn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vvu0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvu0(dg8 dg8Var, il00 il00Var, ye90 ye90Var, mka mkaVar, l1p0 l1p0Var, fza fzaVar) {
        super(1);
        this.a = (byte) 0;
        this.b = dg8Var;
        this.c = il00Var;
        this.d = ye90Var;
        this.e = l1p0Var;
    }

    /* JADX WARN: Code duplicated, block: B:295:0x09cc  */
    public final Object invoke(Object obj) throws Throwable {
        m2d0 s2d0Var;
        Boolean m231Var;
        lg31 lg31Var;
        huz mpy0Var;
        Object objE;
        y751 y751Var;
        byte b = this.a;
        byte b2 = 11;
        byte b3 = 2;
        boolean z = false;
        xb51 xb51Var = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.b;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                String str = (String) obj;
                m2d0 m2d0Var = new m2d0(true);
                ((wqg) ((dg8) obj4).b).getClass();
                if (!str.equals("spotify:playlist:37i9dQZF1CIl0ks0ynmzpD")) {
                    m2d0Var = null;
                }
                if (m2d0Var != null) {
                    return m2d0Var;
                }
                ((agc0) ((il00) obj5).b).getClass();
                n2d0 n2d0Var = (str.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str.equals("spotify:collection:tracks") || str.equals("spotify:internal:collection:tracks") || (nhc1.Y(str, "spotify:user:", false) && nhc1.R(str, ":collection", false))) ? n2d0.a : null;
                if (n2d0Var != null) {
                    return n2d0Var;
                }
                ye90 ye90Var = (ye90) obj3;
                boolean zH = ((gqm1) ye90Var.b).a.h();
                m2d0 m2d0Var2 = u2d0.a;
                m2d0 m2d0Var3 = zH ? m2d0Var2 : new m2d0(true);
                ((xrm1) ye90Var.c).getClass();
                if (!xrm1.a(str)) {
                    m2d0Var3 = null;
                }
                if (m2d0Var3 == null) {
                    m2d0Var3 = new x2d0(false);
                    Set set = s4b1.f;
                    if (uic.x(str).c != blc0.ka) {
                        m2d0Var3 = null;
                    }
                    if (m2d0Var3 == null) {
                        l1p0 l1p0Var = (l1p0) obj2;
                        if (str.equals("spotify:list:offline-playable:all")) {
                            mia1 mia1VarA = ((qia1) l1p0Var.b).a();
                            String str2 = mia1VarA.a;
                            boolean z2 = mia1VarA.b;
                            int iHashCode = str2.hashCode();
                            if (iHashCode != -1982576430) {
                                if (iHashCode != -891624790) {
                                    if (iHashCode == 3373707 && str2.equals("name")) {
                                        s2d0Var = new x2d0(z2);
                                    } else {
                                        s2d0Var = m2d0Var2;
                                    }
                                } else if (str2.equals("album.name")) {
                                    s2d0Var = new q2d0(z2);
                                } else {
                                    s2d0Var = m2d0Var2;
                                }
                            } else if (str2.equals("artist.name")) {
                                s2d0Var = new s2d0(z2);
                            } else {
                                s2d0Var = m2d0Var2;
                            }
                        } else {
                            s2d0Var = null;
                        }
                        if (s2d0Var != null) {
                            return s2d0Var;
                        }
                        xb51 q2d0Var = new q2d0(false);
                        jxu0 jxu0VarC = oxu0.a.c(str);
                        jxu0 jxu0Var = jxu0VarC instanceof jxu0 ? jxu0VarC : null;
                        xb51Var = u890.j(jxu0Var != null ? jxu0Var.a : null, "offline-playable-artist") ? q2d0Var : null;
                        return xb51Var != null ? xb51Var : m2d0Var2;
                    }
                }
                return m2d0Var3;
            case 1:
                u2v0 u2v0Var = (u2v0) obj;
                String str3 = u2v0Var.a;
                mr20 mr20VarK = ((bv40) obj4).k(str3);
                o6x o6xVar = o6x.a;
                Flowable flowableH = yoi1.h(mr20VarK, o6xVar);
                Flowable flowableH2 = yoi1.h(((zr00) obj5).a, o6xVar);
                Observable observableA = ((yh2) obj3).a();
                BackpressureStrategy backpressureStrategy = BackpressureStrategy.d;
                Flowable flowable = observableA.toFlowable(backpressureStrategy);
                FlowableOnErrorReturn flowableOnErrorReturnM = g7h.d((g7h) obj2, "", new String[]{str3}).toFlowable(backpressureStrategy).J(new rut0(u2v0Var, (byte) 5)).M(ua20.b1);
                Function function = Functions.a;
                Flowable flowableG = Flowable.g(flowableH2, flowable, flowableOnErrorReturnM.t(function), flowableH, va20.b1);
                flowableG.getClass();
                return flowableG.t(function);
            case 2:
                xhv0 xhv0Var = (xhv0) obj4;
                qzh qzhVar = xhv0Var.l;
                qzhVar.f((div0) ((tob1) obj5).getValue());
                qzhVar.n(new ozu0((o0i) obj3, xhv0Var, (vhv0) obj2, b3));
                return rih1Var;
            case 3:
                e261 e261Var = (e261) obj;
                b261.n(e261Var, (String) obj4);
                if (((o8w0) obj5) != null) {
                    b261.p(e261Var, Collections.singletonList(new epo((String) obj3, new smt0((iu30) obj2, (byte) 27))));
                }
                return rih1Var;
            case 4:
                xgw0 xgw0Var = (xgw0) obj4;
                cas casVar = (a7m0) obj;
                casVar.a = new ygw0(xgw0Var, (rt01) obj5, (byte) 1);
                FlowEventSources.Companion companion = FlowEventSources.a;
                q8n q8nVar = xgw0Var.d;
                xmu0 xmu0Var = xgw0Var.a;
                Flowable flowable2 = (Flowable) xmu0Var.b;
                vbm[] vbmVarArr = q601.a;
                mr20[] mr20VarArr = {rqt0.u(new x010(new kge(flowable2), new m441(new y2k(2, (lnm) null, (byte) 4)), new lok0((Object) xmu0Var, (lnm) xb51Var, (byte) 17), (byte) 1)), (jge) xgw0Var.b.d, xgw0Var.c.c};
                companion.getClass();
                casVar.b = new b(q8nVar, mr20VarArr);
                casVar.d = new v6f((q8n) obj3, (byte) 4);
                casVar.e = new v6f((q8n) obj2, (byte) 5);
                return rih1Var;
            case 5:
                kt91 kt91Var = (kt91) obj5;
                if (((z6x0) obj4).Y == wbk1.c) {
                    String string = ((Context) obj3).getString(2131960415);
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    kt91Var.k(new er91((fs91) null, string, (Integer) null, (String) null, 2131960416, new jn90((iu30) obj2, (byte) 25), (cvr) null, (xq91) null, false));
                }
                return new xwm0(kt91Var, (byte) 11);
            case 6:
                tv80 tv80Var = (tv80) obj;
                i7x0 i7x0Var = (i7x0) obj4;
                String str4 = (String) obj5;
                String str5 = (String) obj3;
                h7x0 h7x0Var = (h7x0) obj2;
                r630 r630Var = i7x0Var.d;
                boolean z3 = h7x0Var != h7x0.b;
                Set set2 = s4b1.f;
                String strS = uic.x(str4).s();
                if (strS != null) {
                    if (r630Var.c(str4) == null) {
                        r630Var.a(new i430(str4, 30, false));
                    }
                    r630Var.k(str4, z3);
                    xab1 xab1Var = i7x0Var.i;
                    if (xab1Var != null) {
                        xab1Var.d((CancellationException) null);
                    }
                    i7x0Var.i = fn31.T(cto1.q(i7x0Var.f), (o8n) null, 0, new vr1(i7x0Var, strS, z3, h7x0Var, str5, tv80Var, str4, (lnm) null), 3);
                }
                return rih1Var;
            case 7:
                rtb0 rtb0Var = (rtb0) obj;
                rtb0.c(rtb0Var, "heading", new j2i(609729982, new f2z0((m4z0) obj5, (byte) 4), true), 2);
                o4z0 o4z0Var = (o4z0) obj4;
                List list = o4z0Var.b;
                rtb0Var.e(list.size(), (iu30) null, new iio0(list, (byte) 14), new j2i(2039820996, new a87(list, (p40) obj3, (m4z0) obj5, o4z0Var, (i4z0) obj2, (byte) 7), true));
                return rih1Var;
            case 8:
                BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) obj;
                eh9 eh9Var = (eh9) obj2;
                ndz0 ndz0Var = (ndz0) obj5;
                ai9 ai9Var = (ai9) obj4;
                if (ai9Var == null) {
                    return new gdz0(hg9.a);
                }
                Object objCompute = ndz0Var.o.compute((String) obj3, new mdz0(ai9Var, (byte) 0));
                objCompute.getClass();
                edz0 edz0Var = (edz0) objCompute;
                cdz0 cdz0Var = new cdz0(eh9Var);
                edz0Var.b.put(eh9Var, cdz0Var);
                edz0Var.c.set(cdz0Var);
                try {
                    m231Var = Boolean.valueOf(ai9Var.a(bluetoothGattCharacteristic));
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA = e331.a(m231Var);
                if (thA != null) {
                    return new gdz0(new ig9(thA.getClass().getSimpleName()));
                }
                Boolean bool = Boolean.TRUE;
                if (!m231Var.equals(bool)) {
                    bool = null;
                }
                return ndz0.n(bool, new kg9((Integer) null));
            case 9:
                int iIntValue = ((Number) obj).intValue();
                kkz0 kkz0Var = (kkz0) obj4;
                ((Function0) kkz0Var.b).invoke();
                ven0 ven0Var = (ven0) obj2;
                ((j3y0) kkz0Var.e).invoke(((phz0) ((rhz0) ven0Var.getValue()).f.get(iIntValue)).a);
                if (((rhz0) ven0Var.getValue()).h) {
                    ((qam1) obj5).a(1);
                }
                ((xgm1) ((rk41) obj3).c).a(new pgm1(new y0c1("quiz-answer-state-key"), ((phz0) ((rhz0) ven0Var.getValue()).f.get(iIntValue)).a));
                return rih1Var;
            case 10:
                c9n c9nVar = (c9n) obj2;
                y301 y301Var = (y301) obj;
                nxz0 nxz0Var = (nxz0) obj3;
                jxz0 jxz0Var = (jxz0) obj4;
                if (y301Var.equals(l301.a) || y301Var.equals(t301.a)) {
                    ((iu30) obj5).invoke(ixz0.a);
                    Function0 function0 = nxz0Var.b;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    nxz0Var.d.a(nxz0Var.a, jxz0Var.d);
                } else if (y301Var instanceof s301) {
                    fn31.T(c9nVar, (o8n) null, 0, new mxz0(nxz0Var, jxz0Var, y301Var, null, (byte) 0), 3);
                } else if (y301Var instanceof q301) {
                    fn31.T(c9nVar, (o8n) null, 0, new mxz0(nxz0Var, jxz0Var, y301Var, null, (byte) 1), 3);
                }
                return rih1Var;
            case 11:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                String str6 = (String) obj3;
                ((ss50) obj4).a(0);
                if (zBooleanValue) {
                    ((iu30) obj5).invoke(str6);
                } else {
                    ((iu30) obj2).invoke(str6);
                }
                return rih1Var;
            case 12:
                List list2 = (List) obj4;
                a401 a401Var = (a401) obj5;
                rtb0.b((rtb0) obj, list2.size(), new j3y0((Object) list2, (Object) a401Var, (byte) 19), new j2i(-1946663222, new d34(a401Var, (b0i0) obj3, list2, (ven0) obj2, (byte) 7), true), 4);
                return rih1Var;
            case 13:
                e261 e261Var2 = (e261) obj;
                a701 a701Var = (c701) obj4;
                String str7 = (String) obj5;
                String str8 = (String) obj3;
                iu30 iu30Var = (iu30) obj2;
                smc0 smc0VarN = k4p1.n();
                if (a701Var instanceof a701) {
                    smc0VarN.add(new epo(str7, new j9z0(iu30Var, (byte) 13)));
                    if (a701Var.a.h) {
                        smc0VarN.add(new epo(str8, new j9z0(iu30Var, (byte) 14)));
                    }
                }
                b261.p(e261Var2, k4p1.k(smc0VarN));
                return rih1Var;
            case 14:
                e261 e261Var3 = (e261) obj;
                ma01 ma01Var = (ma01) obj4;
                String str9 = (String) obj5;
                String str10 = (String) obj3;
                iu30 iu30Var2 = (iu30) obj2;
                smc0 smc0VarN2 = k4p1.n();
                if (ma01Var.j) {
                    smc0VarN2.add(new epo(str9, new j9z0(iu30Var2, (byte) 19)));
                    if (ma01Var.h) {
                        smc0VarN2.add(new epo(str10, new j9z0(iu30Var2, (byte) 20)));
                    }
                }
                b261.p(e261Var3, k4p1.k(smc0VarN2));
                return rih1Var;
            case 15:
                rtb0 rtb0Var2 = (rtb0) obj;
                fl01 fl01Var = (fl01) obj4;
                rtb0.f(rtb0Var2, "header", new j2i(1037127306, new juy0(fl01Var, (tk51) obj5, (byte) 2), true), 2);
                List list3 = fl01Var.e;
                rtb0Var2.e(list3.size(), new iio0(list3, (byte) 22), new iio0(list3, (byte) 23), new j2i(2039820996, new a87(list3, (key) obj3, fl01Var, (List) obj2, (tk51) obj5, (byte) 8), true));
                return rih1Var;
            case 16:
                wda wdaVar = (wda) obj;
                x711 x711Var = (x711) obj4;
                c8c0 c8c0VarA = x711Var.f.a(wdaVar.d, (Map) obj5);
                fp8 fp8Var = x711Var.c;
                String str11 = wdaVar.a;
                boolean z4 = wdaVar.b;
                String str12 = wdaVar.c;
                ksk kskVar = new ksk(str11, z4, ((me30) fp8Var.b).a(str12 == null ? "" : str12));
                String str13 = (String) wdaVar.e.get("request_id");
                return new y131((String) obj3, wdaVar.a, str13 == null ? "" : str13, (String) obj2, kskVar, str12 == null ? "" : str12, (Map) obj5, c8c0VarA, wdaVar.e);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                k221 k221Var = (k221) obj4;
                hyy0 hyy0Var = (hyy0) obj5;
                rtb0.b((rtb0) obj, k221Var.c.size(), new nt01(hyy0Var, k221Var, (byte) 12), new j2i(-311986564, new d34(k221Var, (a221) obj3, (String) obj2, hyy0Var, (byte) 8), true), 4);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                s880 s880Var = (s880) obj4;
                rm5 rm5Var = (rm5) s880Var.h;
                String str14 = (String) obj5;
                ya21 ya21Var = new ya21(s880Var, (String) obj3, str14, (za21) obj2, (byte) 0);
                g521 g521Var = new g521(s880Var, (byte) 3);
                Activity activity = (Activity) rm5Var.a;
                String string2 = activity.getString(2131958555);
                String string3 = activity.getString(R.string.cancel);
                mw40 mw40VarT = yoi1.T(activity, activity.getString(2131958557, str14), activity.getString(2131958556, str14));
                oad oadVar = new oad(ya21Var, (byte) 9);
                mw40VarT.a = string2;
                mw40VarT.c = oadVar;
                oad oadVar2 = new oad(g521Var, (byte) 10);
                mw40VarT.b = string3;
                mw40VarT.d = oadVar2;
                mw40VarT.e = false;
                mw40VarT.b().b();
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                String str15 = (String) obj;
                ((ven0) obj3).setValue(str15);
                ven0 ven0Var2 = (ven0) obj2;
                if (!((Boolean) ven0Var2.getValue()).booleanValue() && !str15.equals(((oc21) obj4).b)) {
                    ven0Var2.setValue(Boolean.TRUE);
                    ((iu30) obj5).invoke(new kc21(str15));
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                jl21 jl21Var = (jl21) obj4;
                fn31.T(cto1.q(jl21Var.b), (o8n) null, 0, new hgo0((byte) 11, jl21Var, (lik1) obj5, (tv80) obj, (String) obj3, (Map) obj2, (lnm) null), 3);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                WebView webView = new WebView((Context) obj);
                Function0 function1 = (Function0) obj5;
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setDomStorageEnabled(true);
                webView.addJavascriptInterface(new pk21(new rl21(webView, function1, (byte) 1), new nt01((yl21) obj3, webView, (byte) 24), new lpx0(function1, (byte) 27)), "ReportBridge");
                webView.setWebViewClient((km21) obj4);
                ((ven0) obj2).setValue(webView);
                return webView;
            case 22:
                long j = ((Offset) obj).a;
                wol wolVar = (apl) obj4;
                wol wolVar2 = wolVar instanceof wol ? wolVar : null;
                if (wolVar2 != null && (lg31Var = wolVar2.b) != null) {
                    xb51Var = lg31Var.e;
                }
                if (xb51Var != null && ((Boolean) ((ven0) obj2).getValue()).booleanValue() && (((gg31) obj5).n instanceof eg31)) {
                    ((iu30) obj3).invoke(new nf31(xb51Var));
                }
                return rih1Var;
            case 23:
                dnc0 dnc0Var = (dnc0) obj;
                d0r d0rVar = (d0r) obj4;
                String str16 = (String) obj5;
                List list4 = (List) obj3;
                o3r o3rVar = r761.a;
                if (list4.isEmpty()) {
                    mpy0Var = new huz(z6x.a, (byte) 10);
                } else {
                    o3r o3rVar2 = r761.a;
                    List list5 = list4;
                    ArrayList arrayList = new ArrayList(q7h.U(list5, 10));
                    Iterator it = list5.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((pvc0) it.next()).c);
                    }
                    mpy0Var = new mpy0(t2p1.u(d0rVar, o3rVar2, arrayList), str16, list4, b2);
                }
                two1.v(dnc0Var, mpy0Var, false, new hf31((kh31) obj2, d0rVar, (byte) 1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                v7c0 v7c0Var = (v7c0) obj;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj4;
                p811 p811Var = (p811) obj5;
                w7c0 w7c0Var = ((tr3) obj3).c;
                if ((v7c0Var instanceof x9v0) || (v7c0Var instanceof kf90)) {
                    jo31.r(linkedHashSet, (tr3) p811Var.a);
                } else if (v7c0Var instanceof eg90) {
                    tr3 tr3Var = (tr3) p811Var.a;
                    eg90 eg90Var = eg90.a;
                    Boolean bool2 = (Boolean) w7c0Var.a(eg90Var);
                    Boolean bool3 = (Boolean) tr3Var.c.a(eg90Var);
                    if (bool2 != null && bool3 != null && !bool2.equals(bool3)) {
                        linkedHashSet.add(new on3(d9k1.c));
                    }
                } else if (v7c0Var instanceof gww0) {
                    w7c0 w7c0Var2 = ((dq3) obj2).a;
                    gww0 gww0Var = gww0.a;
                    x0x0 x0x0Var = (x0x0) w7c0Var2.a(gww0Var);
                    x0x0 x0x0Var2 = (x0x0) w7c0Var.a(gww0Var);
                    boolean z5 = x0x0Var2.d;
                    String str17 = x0x0Var2.a;
                    if (z5 && u890.j(str17, x0x0Var.a) && x0x0Var2.c == null && u890.j(x0x0Var2.b, str17)) {
                        tr3 tr3Var2 = (tr3) p811Var.a;
                        p811Var.a = tr3.b(tr3Var2, (List) null, (sxc0) null, new w7c0(sqg0.O(tr3Var2.c.a, Collections.singletonMap(gww0Var, (x0x0) w7c0Var.a(gww0Var)))), false, 11);
                    }
                } else if (v7c0Var instanceof rf90) {
                    tr3 tr3Var3 = (tr3) p811Var.a;
                    rf90 rf90Var = rf90.a;
                    boolean zBooleanValue2 = ((Boolean) w7c0Var.a(rf90Var)).booleanValue();
                    Boolean bool4 = (Boolean) tr3Var3.c.a(rf90Var);
                    if (zBooleanValue2 != bool4.booleanValue()) {
                        linkedHashSet.add(new tn3(new yoc0(new fqq0((as3) null, (dia1) null, (jf20) null, (mml) null, bool4, (fab0) null, (a3t0) null, (Boolean) null, (Boolean) null, 495))));
                    }
                }
                return rih1Var;
            case 25:
                xb51 bundle = (Bundle) obj;
                hd41 hd41Var = new hd41((ipb1) ((Function0) obj4).invoke(), (String) obj5);
                mc41 mc41Var = (mc41) obj2;
                if (bundle.getBoolean("com.spotify.element.state_holder_saved_state")) {
                    hd41Var.j(bundle.getBundle("ui_state"));
                    bundle = bundle.getBundle("element_state");
                }
                if (bundle != null) {
                    xb51Var = bundle.isEmpty() ? null : bundle;
                    if (xb51Var != null && (objE = mc41Var.e(xb51Var, obj3)) != null) {
                        hd41Var.e(objE);
                    }
                }
                return hd41Var;
            case 26:
                AtomicInteger atomicInteger = (AtomicInteger) obj4;
                int iIncrementAndGet = atomicInteger.incrementAndGet();
                p811 p811Var2 = (p811) obj5;
                faa0 faa0Var = (faa0) p811Var2.a;
                if (faa0Var != null) {
                    faa0Var.d((CancellationException) null);
                }
                ssw0 ssw0Var = (ssw0) obj3;
                p811Var2.a = fn31.T(ssw0Var, (o8n) null, 0, new tv1((iu30) obj2, obj, atomicInteger, iIncrementAndGet, ssw0Var, (lnm) null, (byte) 9), 3);
                return rih1Var;
            case 27:
                ((lsl) obj).s1();
                x751 x751Var = (x751) ((xe01) obj2).a.getValue();
                pl20 pl20Var = (pl20) obj3;
                ((yy80) obj5).invoke(pl20Var.a, pl20Var.c, x751Var != null ? new xb51(x751Var.b) : null);
                return rih1Var;
            case 28:
                xb51 xb51Var2 = (xb51) obj;
                int i = xb51Var2.a;
                List list6 = ((xtb0) obj4).h().l;
                ArrayList arrayList2 = new ArrayList(q7h.U(list6, 10));
                Iterator it2 = list6.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((qtb0) it2.next()).l);
                }
                Set setP1 = o7h.p1(arrayList2);
                List list7 = ((rnc0) ((ven0) obj2).getValue()).b;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj6 : list7) {
                    if (setP1.contains(((h8k1) obj6).b)) {
                        arrayList3.add(obj6);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Object obj7 = ((h8k1) it3.next()).a;
                    pd51 pd51Var = obj7 instanceof pd51 ? (pd51) obj7 : null;
                    if (pd51Var != null) {
                        arrayList4.add(pd51Var);
                    }
                }
                if (arrayList4.size() == setP1.size() && (((y751Var = (y751) obj5) == null || y751Var.a(i, arrayList4)) && ((Boolean) ((iu30) obj3).invoke(xb51Var2)).booleanValue())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                az20.a((az20) obj4);
                hl51 hl51VarB = ((dqy) obj5).b(zBooleanValue3);
                if (hl51VarB == null) {
                    return null;
                }
                ((vu30) obj3).invoke(((c220) obj2).a, hl51VarB);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vvu0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
