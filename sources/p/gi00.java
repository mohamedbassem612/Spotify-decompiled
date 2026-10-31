package p;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.podcast.endpointsimpl.experimental.show.exceptions.BookUriRedirectException;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gi00 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi00(t7y t7yVar, zf30 zf30Var) {
        super(1);
        this.a = (byte) 8;
        this.b = zf30Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.FacebookException */
    public final Object invoke(Object obj) throws FacebookException {
        String strV;
        int i;
        byte b = 19;
        byte b2 = 0;
        byte b3 = 1;
        lnm lnmVar = null;
        switch (this.a) {
            case 0:
                ((y11) this.b).accept((mh00) obj);
                return rih1.a;
            case 1:
                np00 np00Var = (np00) this.b;
                for (sbu0 sbu0Var : np00Var.c.values()) {
                    synchronized (sbu0Var) {
                        dm5.y(sbu0Var.j);
                        sbu0Var.k = true;
                        sbu0Var.a(false);
                        break;
                    }
                }
                np00Var.c.clear();
                return rih1.a;
            case 2:
                return new h3r(new d3r("Failed to get list with URI " + ((poa0) this.b) + ": " + ((jy21) obj)));
            case 3:
                qv00 qv00Var = (qv00) obj;
                for (Map.Entry entry : ((wu00) this.b).a.entrySet()) {
                    if (!((Collection) entry.getValue()).isEmpty()) {
                        qv00Var.b((Class) entry.getKey(), (Iterable) entry.getValue(), false);
                    }
                }
                return rih1.a;
            case 4:
                az00 az00Var = (az00) this.b;
                cas casVar = (a7m0) obj;
                casVar.d = new yy00(az00Var, b2);
                casVar.e = new yy00(az00Var, b3);
                bjx bjxVar = az00Var.c;
                ObservableSource map = new ObservableFromPublisher(((ag90) bjxVar.b).a).map(ta20.Z0);
                yeu0 yeu0Var = (yeu0) bjxVar.c;
                roc0 roc0Var = (roc0) ((koc0) yeu0Var.b);
                Observable observableDistinctUntilChanged = roc0Var.e().distinctUntilChanged();
                any anyVarC = roc0Var.c();
                o6x o6xVar = o6x.a;
                ObservableSource observableSourceCombineLatest = Observable.combineLatest(observableDistinctUntilChanged, yoi1.i(anyVarC, o6xVar).distinctUntilChanged(), yoi1.i(((mnk0) yeu0Var.c).a, o6xVar).distinctUntilChanged(), new nhc(yeu0Var, (byte) 19));
                ObservableSource map2 = ((dxz0) ((n4b) bjxVar.d).b).e().map(zhm0.P0);
                v1k v1kVar = (v1k) bjxVar.f;
                Observable observableDistinctUntilChanged2 = ((yh2) v1kVar.d).a().distinctUntilChanged();
                Observable observableI = yoi1.i(((b7n) v1kVar.b).a(q6n.a), o6x.a);
                Observable observable = ((o241) v1kVar.c).a;
                ObservableSource observableSourceCombineLatest2 = Observable.combineLatest(observableDistinctUntilChanged2, observableI, observable.map(ns80.V0).distinctUntilChanged(), observable.map(bya0.R0).distinctUntilChanged(), stf0.W0);
                fdc fdcVar = (fdc) bjxVar.e;
                casVar.b = RxEventSources.a(new ObservableSource[]{map, observableSourceCombineLatest, map2, observableSourceCombineLatest2, !fdcVar.b ? Observable.empty() : yoi1.i(new tf2(hu20.e(rqt0.u(new f8f0(((mnk0) fdcVar.c).a, (byte) 25)), new zz90(lnmVar, (Object) fdcVar, (byte) 23)), (byte) 19), o6x.a), ((xvo) ((xap) bjxVar.g).b).a(true).map(fmv.a1)});
                casVar.a = new hzw(az00Var, (byte) 21);
                casVar.a(fa00.e1, zy00.b);
                return rih1.a;
            case 5:
                return new BookUriRedirectException((String) obj, ((ma8) this.b).a);
            case 6:
                ke10 ke10Var = (ke10) obj;
                String str = ((re10) this.b).d;
                return le10.a(new le10(str, str, (String) null, (Integer) null, (String) null, wd10.a, 1, (String) null, (String) null, (String) null, true, ie10.a, z6x.a), (String) null, (String) null, (Integer) null, ke10Var.a, (xd10) null, ke10Var.b, ke10Var.c, ke10Var.d, ke10Var.e, ke10Var.f, (je10) null, (List) null, 6191);
            case 7:
                e261 e261Var = (e261) obj;
                String str2 = ((le10) this.b).h;
                if (str2 != null) {
                    b261.n(e261Var, str2);
                }
                return rih1.a;
            case 8:
                s1f0 s1f0Var = (s1f0) obj;
                Date date = xd.Y;
                if (fuo1.s() != null) {
                    fuo1.y((xd) null);
                    eyh0.f.h().A((rl8) null);
                    uo5.Y.o().M((hww0) null, true);
                    SharedPreferences.Editor editorEdit = s1f0Var.a.edit();
                    editorEdit.putBoolean("express_login_allowed", false);
                    editorEdit.apply();
                }
                zf30 zf30Var = (zf30) this.b;
                List<String> list = xf10.a;
                for (String str3 : list) {
                    lfb lfbVar = s1f0.b;
                    if (lfb.g(str3)) {
                        throw new FacebookException(f4i1.f("Cannot pass a publish or manage permission (", str3, ") to a request for read authorization"));
                    }
                }
                String string = UUID.randomUUID().toString();
                SecureRandom secureRandom = new SecureRandom();
                int iNextInt = secureRandom.nextInt(86) + 43;
                ArrayList arrayListO0 = o7h.O0('~', o7h.O0('_', o7h.O0('.', o7h.O0('-', o7h.N0(new zme('0', '9', false), o7h.L0(new zme('a', 'z', false), new zme('A', 'Z', false)))))));
                ArrayList arrayList = new ArrayList(iNextInt);
                for (int i2 = 0; i2 < iNextInt; i2++) {
                    Character ch = (Character) arrayListO0.get(secureRandom.nextInt(arrayListO0.size()));
                    ch.getClass();
                    arrayList.add(ch);
                }
                String strY0 = o7h.y0(arrayList, "", (String) null, (String) null, (iu30) null, 62);
                if (!(string.length() == 0 ? false : !(ihc1.v0(string, ' ', 0, 6) >= 0)) || !bmq0.G(strY0)) {
                    hhg1.n("Failed requirement.");
                    return null;
                }
                HashSet hashSet = new HashSet(list);
                hashSet.add("openid");
                Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
                try {
                    strV = bmq0.v(strY0);
                    i = 1;
                } catch (FacebookException unused) {
                    strV = strY0;
                    i = 2;
                }
                Set setP1 = o7h.p1(setUnmodifiableSet);
                String strB = wf10.b();
                String string2 = UUID.randomUUID().toString();
                w0h1.H();
                String str4 = wf10.f;
                String str5 = str4 == null ? "" : str4;
                w0h1.H();
                String str6 = wf10.g;
                Parcelable rye0Var = new rye0(setP1, strB, string2, string, strY0, strV, i, str5, str6 == null ? "" : str6);
                Date date2 = xd.Y;
                ((rye0) rye0Var).h = fuo1.w();
                ((rye0) rye0Var).Y = null;
                ((rye0) rye0Var).Z = false;
                ((rye0) rye0Var).O0 = false;
                ((rye0) rye0Var).P0 = false;
                dg30 dg30VarF0 = zf30Var.f0();
                m1f0 m1f0VarG = xi20.Y.g(dg30VarF0);
                String str7 = ((rye0) rye0Var).O0 ? "foa_mobile_login_start" : "fb_mobile_login_start";
                if (!dhn.a.contains(m1f0VarG)) {
                    try {
                        ScheduledExecutorService scheduledExecutorService = m1f0.d;
                        Bundle bundleO = qtg.o(string2);
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("login_behavior", "NATIVE_WITH_FALLBACK");
                            jSONObject.put("request_code", z5c.c(1));
                            jSONObject.put("permissions", TextUtils.join(",", ((rye0) rye0Var).b));
                            jSONObject.put("default_audience", eqq.w(3));
                            jSONObject.put("isReauthorize", ((rye0) rye0Var).h);
                            String str8 = m1f0VarG.c;
                            if (str8 != null) {
                                jSONObject.put("facebookVersion", str8);
                            }
                            jSONObject.put("target_app", pze0.b(1));
                            bundleO.putString("6_extras", jSONObject.toString());
                            break;
                        } catch (JSONException unused2) {
                        }
                        m1f0VarG.b.p(bundleO, str7);
                    } catch (Throwable th) {
                        dhn.a(m1f0VarG, th);
                    }
                    break;
                }
                yla ylaVar = hzc.b;
                int iC = z5c.c(1);
                r1f0 r1f0Var = new r1f0(s1f0Var);
                synchronized (ylaVar) {
                    HashMap map3 = hzc.c;
                    if (!map3.containsKey(Integer.valueOf(iC))) {
                        map3.put(Integer.valueOf(iC), r1f0Var);
                    }
                }
                Intent intent = new Intent();
                intent.setClass(wf10.a(), FacebookActivity.class);
                intent.setAction(g5d0.s(((rye0) rye0Var).a));
                Bundle bundle = new Bundle();
                bundle.putParcelable("request", rye0Var);
                intent.putExtra("com.facebook.LoginFragment:Request", bundle);
                if (wf10.a().getPackageManager().resolveActivity(intent, 0) != null) {
                    try {
                        zf30Var.startActivityForResult(intent, z5c.c(1));
                        return rih1.a;
                    } catch (ActivityNotFoundException unused3) {
                    }
                }
                FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
                s1f0.a(dg30VarF0, 3, (Map) null, facebookException, false, rye0Var);
                throw facebookException;
            case 9:
                e261 e261Var2 = (e261) obj;
                if (((pm10) this.b).c.size() > 1) {
                    b261.x(e261Var2, 8);
                }
                return rih1.a;
            case 10:
                bm10 bm10Var = (bm10) this.b;
                vl10 vl10Var = (vl10) ((Map) obj).get(bm10Var);
                return vl10Var == null ? new tl10(bm10Var.a(), rd.a) : vl10Var;
            case 11:
                return (Map) ((en10) this.b).b((List) obj).getValue();
            case 12:
                ((ts10) this.b).e2 = true;
                return rih1.a;
            case 13:
                at10 at10Var = (at10) this.b;
                return new phl0(at10Var.s.path(), at10Var.t.a, (r6h1) obj);
            case 14:
                int iIntValue = ((Number) obj).intValue();
                bpb1 bpb1Var = ((zv10) this.b).b.i;
                fw10 fw10Var = (fw10) bpb1Var.getValue();
                if (fw10Var != null && fw10Var.c == iIntValue) {
                    bpb1Var.l((Object) null);
                }
                return rih1.a;
            case 15:
                ((qtr) obj).b(new skv((br0) this.b, (lnm) null, (byte) 6));
                return rih1.a;
            case 16:
                return Boolean.valueOf(u890.j(((ee21) obj).a.getId(), ((ee21) this.b).a.getId()));
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return ((sd20) this.b).a.a((l0i) null);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                bpb1 bpb1Var2 = (bpb1) ((sp00) this.b).e;
                bpb1Var2.getClass();
                bpb1Var2.m((Object) null, (String) obj);
                return rih1.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                LinkedHashMap linkedHashMap = ((djc1) obj).a;
                ak7 ak7Var = (ak7) this.b;
                cjc1 cjc1Var = new cjc1(api.c);
                cjc1 cjc1Var2 = new cjc1(api.d);
                vd20 vd20Var = vd20.d;
                if (!(ak7Var instanceof ak7)) {
                    eg.o();
                    return null;
                }
                xzq xzqVar = new xzq(ak7Var.a, vd20Var);
                jd11 jd11Var = rc11.a;
                linkedHashMap.put(jd11Var.b(yx31.class), new buj(xzqVar, cjc1Var, cjc1Var2));
                j2i j2iVar = api.a;
                linkedHashMap.put(jd11Var.b(zx31.class), new m2i());
                return rih1.a;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ug3 ug3Var = (ug3) this.b;
                rwp rwpVar = (rwp) ug3Var.d;
                op20 op20Var = (op20) ug3Var.e;
                rwpVar.getClass();
                ((z2s) obj).R(nnp0.class, new dx0(op20Var, new yxk0((byte) 1)), ll20.V0, ll20.W0, ll20.X0, false, wo10.S0);
                return rih1.a;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                bx20 bx20Var = (bx20) this.b;
                int iB = bx20Var.a.a.b();
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-reinventfree-fma-upsell";
                x6h1VarI.f = "1.1.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.b = dsl0.c(iB);
                y6h1 y6h1VarA = x6h1VarI.a();
                i8h1 i8h1Var = (i8h1) bx20Var.d.get();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1.a;
            case 22:
                t030 t030Var = (t030) this.b;
                return j2h1.D(t030Var.f, new xr00((Object) t030Var, obj, lnmVar, (byte) 12));
            case 23:
                ((qtr) obj).b(new u08((d430) this.b, (lnm) null, (byte) 7));
                return rih1.a;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                k430 k430Var = (k430) obj;
                l430 l430Var = (l430) this.b;
                return new x010(d3p1.H(l430Var.a, l430Var.d, k430Var), t5p1.i(new soy0(((eu8) l430Var.c.b).a(k430Var.a).toObservable().toFlowable(BackpressureStrategy.b))), new vm0(3, (lnm) null, (byte) 14), (byte) 1);
            case 25:
                ((qtr) obj).b(new js((jvu) this.b, (lnm) null, (byte) 11));
                return rih1.a;
            case 26:
                v530 v530Var = (v530) this.b;
                v530Var.c.W0 = ((cir0) obj).h().a(uj1.w, new wj1(v530Var, b));
                return v530Var.b;
            case 27:
                return (aol0) this.b;
            case 28:
                wfx wfxVar = ((px6) this.b).b.c;
                return new nwr(wfxVar.b, wfxVar.a, (byte) 1);
            default:
                wfx wfxVar2 = ((px6) this.b).b.c;
                return new nwr(wfxVar2.b, wfxVar2.a, (byte) 1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gi00(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }
}
