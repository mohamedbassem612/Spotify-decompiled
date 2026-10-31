package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.encoreconsumermobile.elements.previewbutton.PreviewOverlayView;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import com.spotify.premiumdestination.destination.mobius.domain.MappingException;
import com.spotify.signup.signup.v2.proto.Error;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFilter;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatten;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeObserveOn;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRefCount;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class aru0 implements Function, ix30 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;

    public aru0(Map map, Map map2, int i) {
        this.a = (byte) 22;
        sg0 sg0Var = new sg0(1, (lnm) null, (byte) 23);
        map = (i & 2) != 0 ? null : map;
        map2 = (i & 4) != 0 ? null : map2;
        this.b = sg0Var;
        this.c = map;
        this.d = map2;
    }

    public static Map b() {
        Boolean bool = Boolean.TRUE;
        return sqg0.J(new mmr0[]{new mmr0("uri", bool), new mmr0("name", bool), new mmr0("covers", bool)});
    }

    public static aru0 m(LayoutInflater layoutInflater, PreviewOverlayView previewOverlayView) {
        layoutInflater.inflate(2131625454, (ViewGroup) previewOverlayView);
        int i = 2131430303;
        LottieAnimationView lottieAnimationViewT = m5n1.t(previewOverlayView, 2131430303);
        if (lottieAnimationViewT != null) {
            i = 2131430400;
            ImageView imageView = (ImageView) m5n1.t(previewOverlayView, 2131430400);
            if (imageView != null) {
                return new aru0(previewOverlayView, lottieAnimationViewT, imageView, (byte) 23);
            }
        }
        bhn0.i("Missing required view with ID: ".concat(previewOverlayView.getResources().getResourceName(i)));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:42:0x0103  */
    /* JADX WARN: Code duplicated, block: B:46:0x011a A[PHI: r2 r12
      0x011a: PHI (r2v11 java.lang.Object) = (r2v10 java.lang.Object), (r2v1 java.lang.Object) binds: [B:44:0x0117, B:18:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x011a: PHI (r12v6 p.d9n) = (r12v4 p.d9n), (r12v9 p.d9n) binds: [B:44:0x0117, B:18:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0139, code lost:
    
        if (r0.a(r1, r10) == r12) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(p.y4k1 r19, p.onm r20) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.aru0.a(p.y4k1, p.onm):java.lang.Object");
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return (List) ((py21) obj).b(new zqu0((String) this.b, (byte) 0), new zqu0((bru0) this.d, (String) this.c));
            case 12:
                ulv0 ulv0Var = (ulv0) obj;
                if (ulv0Var instanceof tlv0) {
                    ((lxg) this.b).a("auth_flow");
                    return new an41(new d4v0((ui8) this.c, ulv0Var, (dn41) this.d, (byte) 2));
                }
                if (ulv0Var instanceof slv0) {
                    return bn41.a;
                }
                eg.o();
                return null;
            default:
                wtv0 wtv0Var = (wtv0) obj;
                return ((mzr0) this.b).g(wtv0Var.a, (String) null, wtv0Var.c, wtv0Var.b, false).map(new pt60((nfa0) this.d, (byte) 1)).map(new rpv0(this.c, (byte) 1)).map(dj20.b1).onErrorReturn(new hvp0(wtv0Var, (byte) 18));
        }
    }

    public iz0 c() {
        return new iz0((gw70) this.b, ((m35) this.c).a(), new idd1(new oai0((ycm) this.d, (byte) 4)));
    }

    public hf2 d(ubw0 ubw0Var, ubw0 ubw0Var2, boolean z, ubw0 ubw0Var3) {
        return new hf2((yqg) this.b, (nwt) this.c, (clm) this.d, ubw0Var, ubw0Var3, ubw0Var2, z);
    }

    public Single e(String str) {
        return ((o241) this.d).a.firstOrError().flatMap(new yeu0(this, str, (byte) 16));
    }

    public MaybeObserveOn f(String str) {
        MaybeEmpty maybeEmptyO;
        x3v0 x3v0Var = (x3v0) this.b;
        Set set = s4b1.f;
        int iOrdinal = uic.x(str).c.ordinal();
        if (iOrdinal != 844) {
            maybeEmptyO = iOrdinal != 860 ? MaybeEmpty.a : x3v0Var.c(Collections.singletonList(str), new t3v0((Map) null, (Map) null, sqg0.O(b(), Collections.singletonMap("publisher", Boolean.TRUE)), (List) null, p7h.M(new Integer[]{31, 164}), 95)).flatMapMaybe(new xrh(str, (byte) 3));
        } else {
            List listSingletonList = Collections.singletonList(str);
            Boolean bool = Boolean.TRUE;
            Maybe maybeFlatMapMaybe = x3v0Var.a(listSingletonList, new t3v0(b(), sqg0.O(sqg0.O(Collections.singletonMap("link", bool), b()), Collections.singletonMap("publisher", bool)), (Map) null, Collections.singletonList(22), (List) null, 167)).flatMapMaybe(new akp1(str, (byte) 10));
            yj20 yj20Var = yj20.a1;
            maybeFlatMapMaybe.getClass();
            maybeEmptyO = Maybe.o(new MaybeFlatten(new MaybeFilter(maybeFlatMapMaybe, yj20Var), new ij01((hv00) this.c, (byte) 10)));
        }
        return maybeEmptyO.g((Scheduler) this.d);
    }

    public void g(String str, String str2, List list, d3d1 d3d1Var, String str3) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str4 = (String) it.next();
            Maybe maybeFilter = Single.create(new oj80(str4, (eo0) this.b, (byte) 10)).subscribeOn((Scheduler) this.d).filter(ta20.c1);
            maybeFilter.getClass();
            maybeFilter.f(Functions.b(w3i1.class)).subscribe(new a2b1(this, d3d1Var, str, str4, str2, str3));
        }
    }

    public Observable h(String str, boolean z) {
        Observable observableNever;
        ObservableRefCount observableRefCountF = yoi1.i(((a981) this.d).d, o6x.a).distinctUntilChanged().replay(1).f();
        if (z) {
            observableNever = ((koy0) this.c).a().withLatestFrom(observableRefCountF, zz10.b1);
            observableNever.getClass();
        } else {
            observableNever = Observable.never();
            observableNever.getClass();
        }
        return Observable.defer(new yj1(Observable.merge(observableRefCountF, observableNever), (byte) 9)).switchMapSingle(new yqu0(this, str, (byte) 1));
    }

    public rnw0 i() {
        return (rnw0) this.c;
    }

    public List j(byte[] bArr) {
        List list = (List) ((ConcurrentHashMap) this.b).get(new snw0(bArr));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public List k() {
        return j(e130.a);
    }

    public View l() {
        return (PreviewOverlayView) this.b;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00bd A[Catch: all -> 0x00f2, TryCatch #0 {all -> 0x00f2, blocks: (B:13:0x0036, B:37:0x00b7, B:39:0x00bd, B:42:0x00e7, B:18:0x004a, B:25:0x006c, B:26:0x0072, B:28:0x0078, B:30:0x0087, B:31:0x0096, B:33:0x009c, B:35:0x00a9, B:36:0x00ad, B:43:0x00ea, B:44:0x00f1, B:21:0x0054), top: B:48:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:? A[LOOP:0: B:37:0x00b7->B:52:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(String str, onm onmVar) {
        lov0 lov0Var;
        String str2;
        int i;
        Object next;
        aru0 aru0Var;
        Iterator it;
        int i2;
        Iterable iterable;
        int i3;
        int i4;
        q8n q8nVar;
        cqu0 cqu0Var;
        if (onmVar instanceof lov0) {
            lov0Var = (lov0) onmVar;
            int i5 = lov0Var.t;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                lov0Var.t = i5 - Integer.MIN_VALUE;
            } else {
                lov0Var = new lov0(this, onmVar);
            }
        } else {
            lov0Var = new lov0(this, onmVar);
        }
        Object objC = lov0Var.h;
        int i6 = lov0Var.t;
        d9n d9nVar = d9n.a;
        try {
            if (i6 == 0) {
                hm5.M(objC);
                bxh bxhVar = (uwh) this.b;
                lov0Var.a = str;
                lov0Var.b = this;
                lov0Var.e = 0;
                lov0Var.t = 1;
                objC = bxhVar.c(str, lov0Var);
                if (objC != d9nVar) {
                    str2 = str;
                    i = 0;
                }
                return d9nVar;
            }
            if (i6 == 1) {
                int i7 = lov0Var.e;
                aru0 aru0Var2 = lov0Var.b;
                str2 = lov0Var.a;
                hm5.M(objC);
                i = i7;
                this = aru0Var2;
            } else {
                if (i6 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i8 = lov0Var.g;
                int i9 = lov0Var.f;
                i3 = lov0Var.e;
                it = lov0Var.d;
                iterable = lov0Var.c;
                aru0Var = lov0Var.b;
                hm5.M(objC);
                i4 = i8;
                i2 = i9;
            }
            while (it.hasNext()) {
                rzh rzhVar = (rzh) it.next();
                q8nVar = (q8n) aru0Var.d;
                cqu0Var = new cqu0(rzhVar, aru0Var, (lnm) null, (byte) 4);
                lov0Var.a = null;
                lov0Var.b = aru0Var;
                lov0Var.c = iterable;
                lov0Var.d = it;
                lov0Var.e = i3;
                lov0Var.f = i2;
                lov0Var.g = i4;
                lov0Var.t = 2;
                if (fn31.Y(q8nVar, cqu0Var, lov0Var) == d9nVar) {
                    return d9nVar;
                }
            }
            return rih1.a;
            Iterator it2 = ((Iterable) objC).iterator();
            do {
                if (!it2.hasNext()) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                next = it2.next();
            } while (!((zvh) next).a.equals(str2));
            List list = ((zvh) next).b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((rzh) obj).c instanceof blb) {
                    arrayList.add(obj);
                }
            }
            aru0Var = this;
            it = arrayList.iterator();
            i2 = 0;
            iterable = arrayList;
            i3 = i;
            i4 = 0;
            while (it.hasNext()) {
                rzh rzhVar2 = (rzh) it.next();
                q8nVar = (q8n) aru0Var.d;
                cqu0Var = new cqu0(rzhVar2, aru0Var, (lnm) null, (byte) 4);
                lov0Var.a = null;
                lov0Var.b = aru0Var;
                lov0Var.c = iterable;
                lov0Var.d = it;
                lov0Var.e = i3;
                lov0Var.f = i2;
                lov0Var.g = i4;
                lov0Var.t = 2;
                if (fn31.Y(q8nVar, cqu0Var, lov0Var) == d9nVar) {
                    return d9nVar;
                }
            }
        } catch (Throwable unused) {
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.premiumdestination.destination.mobius.domain.MappingException */
    public mvv0 o(re70 re70Var) throws MappingException {
        try {
            q3c q3cVar = (q3c) this.b;
            y570 y570VarL = re70Var.l();
            y570VarL.getClass();
            return new mvv0(q3cVar.D(y570VarL), p(re70Var));
        } catch (Exception e) {
            throw new MappingException(e);
        }
    }

    public void onFailure(Throwable th) {
        ((kl1) this.d).f = null;
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((l3d) this.c).c((d2d) it.next());
        }
        arrayList.clear();
    }

    public void onSuccess(Object obj) {
        ((kl1) this.d).f = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:83:0x0214  */
    public ArrayList p(re70 re70Var) {
        etv0 ayq0Var;
        ld70 ld70Var;
        sjb sjbVar = (sjb) this.c;
        List<y570> listK = re70Var.k();
        ArrayList arrayList = new ArrayList(q7h.U(listK, 10));
        for (y570 y570Var : listK) {
            switch (y570Var.h().a()) {
                case "premiumPage:benefitList":
                    String str = y570Var.n().a.a;
                    HubsImmutableComponentBundle[] hubsImmutableComponentBundleArrH = y570Var.g().h("items");
                    uqg0<HubsImmutableComponentBundle> uqg0VarQ0 = hubsImmutableComponentBundleArrH != null ? f46.Q0(hubsImmutableComponentBundleArrH) : null;
                    if (uqg0VarQ0 == null) {
                        uqg0VarQ0 = z6x.a;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (HubsImmutableComponentBundle hubsImmutableComponentBundle : uqg0VarQ0) {
                        arrayList2.add(new mja(hubsImmutableComponentBundle.B("title"), hubsImmutableComponentBundle.B("icon")));
                    }
                    ayq0Var = new hqv0(str, arrayList2, fjb.l(y570Var));
                    break;
                case "premiumPage:accordion":
                    sks0 sks0Var = (sks0) this.d;
                    String strF = y570Var.g().F("collapsed_text", "");
                    String strF2 = y570Var.g().F("expanded_text", "");
                    ave0 ave0VarL = fjb.l(y570Var);
                    List listS = y570Var.s();
                    ArrayList arrayList3 = new ArrayList(q7h.U(listS, 10));
                    Iterator it = listS.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((sjb) sks0Var.b).w((y570) it.next()));
                    }
                    ayq0Var = new aq50(strF, strF2, ave0VarL, arrayList3);
                    break;
                case "premiumPage:featureCard":
                    id70 id70VarN = y570Var.n();
                    String str2 = id70VarN != null ? id70VarN.a.a : null;
                    id70 id70VarN2 = y570Var.n();
                    String str3 = id70VarN2 != null ? id70VarN2.a.b : null;
                    dd70 dd70VarK = y570Var.k();
                    String str4 = (dd70VarK == null || (ld70Var = dd70VarK.a.c) == null) ? null : ld70Var.a.c;
                    dd70 dd70VarK2 = y570Var.k();
                    String str5 = dd70VarK2 != null ? dd70VarK2.a.f : null;
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG = y570Var.g();
                    String strB = hubsImmutableComponentBundleG != null ? hubsImmutableComponentBundleG.B("color_set") : null;
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG2 = y570Var.g();
                    String strB2 = hubsImmutableComponentBundleG2 != null ? hubsImmutableComponentBundleG2.B("details_title") : null;
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG3 = y570Var.g();
                    ayq0Var = new osv0(str2, str3, strB2, hubsImmutableComponentBundleG3 != null ? hubsImmutableComponentBundleG3.B("details_text") : null, str5, strB, str4, fjb.l(y570Var));
                    break;
                case "premiumPage:wtsOfferCardV2":
                    ayq0Var = sjbVar.w(y570Var);
                    break;
                case "premiumPage:wtsOfferCardV3":
                    ayq0Var = sjbVar.w(y570Var);
                    break;
                case "premiumPage:offerCta":
                    ayq0Var = new ow50(y570Var.n().a.a, a0b.f(y570Var), u890.j(y570Var.g().B("mode"), "full_width") ? 1 : 2, fjb.l(y570Var), (String) null, 16);
                    break;
                case "premiumPage:sectionHeader":
                    ayq0Var = new jwv0(y570Var.n().a.a, y570Var.n().a.b, fjb.l(y570Var));
                    break;
                case "premiumPage:offerLegalText":
                    String str6 = y570Var.n().a.a;
                    String strF3 = y570Var.g().F("textColor", "#FFFFFF");
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG4 = y570Var.g().g("margin");
                    ayq0Var = new etv0(str6, strF3, y570Var.g().F("alignment", "").equals("natural") ? 2 : 1, hubsImmutableComponentBundleG4 != null ? new uqg0(hubsImmutableComponentBundleG4.n(0, "leading"), hubsImmutableComponentBundleG4.n(0, "top"), hubsImmutableComponentBundleG4.n(0, "trailing"), hubsImmutableComponentBundleG4.n(0, "bottom")) : null, fjb.l(y570Var));
                    break;
                default:
                    ayq0Var = new ayq0(1);
                    break;
            }
            arrayList.add(ayq0Var);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object q(wa71 wa71Var, cuu0 cuu0Var, onm onmVar) {
        wtu0 wtu0Var;
        LinkedHashMap linkedHashMap;
        boolean zH;
        wls0 wls0Var;
        String str;
        Object objH;
        cuu0 cuu0Var2;
        wls0 wls0Var2;
        Integer numValueOf;
        String string;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.d;
        if (onmVar instanceof wtu0) {
            wtu0Var = (wtu0) onmVar;
            int i = wtu0Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                wtu0Var.h = i - Integer.MIN_VALUE;
            } else {
                wtu0Var = new wtu0(this, onmVar);
            }
        } else {
            wtu0Var = new wtu0(this, onmVar);
        }
        Object obj = wtu0Var.f;
        int i2 = wtu0Var.h;
        if (i2 == 0) {
            hm5.M(obj);
            linkedHashMap = new LinkedHashMap((Map) wa71Var.c);
            zH = cuu0Var.h();
            wls0 wls0Var3 = wls0.d;
            wls0Var = zH ? wls0.f : wls0Var3;
            wls0 wls0VarA = cuu0Var.a();
            if ((wls0Var.b() && wls0VarA.b()) || (wls0Var == wls0Var3 && (wls0VarA == wls0Var3 || wls0VarA.b()))) {
                str = null;
            } else {
                String str2 = (String) linkedHashMap2.get(wls0Var);
                if (str2 == null) {
                    xyc0 xyc0Var = (iyc0) this.b;
                    wls0 wls0Var4 = wls0Var;
                    String str3 = wa71Var.a;
                    wtu0Var.a = wa71Var;
                    wtu0Var.b = cuu0Var;
                    wtu0Var.c = linkedHashMap;
                    wtu0Var.d = wls0Var4;
                    wtu0Var.e = zH;
                    wtu0Var.h = 1;
                    xyc0 xyc0Var2 = xyc0Var;
                    objH = c921.H(xyc0Var2.c, new z290(wls0Var4, str3, xyc0Var2, (lnm) null, (byte) 12), wtu0Var);
                    d9n d9nVar = d9n.a;
                    if (objH == d9nVar) {
                        return d9nVar;
                    }
                    cuu0Var2 = cuu0Var;
                    wls0Var2 = wls0Var4;
                } else {
                    str = str2;
                }
                if (str != null || str.length() == 0) {
                    hhg1.n("Generated permission token is null or empty");
                    return null;
                }
                linkedHashMap2.put(wls0Var, str);
            }
            if (str != null) {
                linkedHashMap.put("pt", str);
            }
            String str4 = wa71Var.e;
            if (str4 == null) {
                dc31 dc31Var = (dc31) this.c;
                String strG = cuu0Var.g();
                String strB = cuu0Var.b();
                if (str == null) {
                    str = "";
                }
                if (((me30) dc31Var.c).a(strB) == le30.b) {
                    numValueOf = 2131960138;
                } else if (strB != null && strB.length() != 0) {
                    numValueOf = 2131960139;
                } else if (str.length() > 0) {
                    numValueOf = Integer.valueOf(zH ? 2131960137 : 2131960140);
                } else {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    string = ((Context) dc31Var.b).getString(numValueOf.intValue(), strG);
                } else {
                    string = null;
                }
                str4 = string;
            }
            return wa71.a(wa71Var, null, mqo1.G(linkedHashMap), str4, Error.TOO_YOUNG_FIELD_NUMBER);
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        boolean z = wtu0Var.e;
        wls0Var2 = wtu0Var.d;
        linkedHashMap = wtu0Var.c;
        cuu0Var2 = wtu0Var.b;
        wa71 wa71Var2 = wtu0Var.a;
        hm5.M(obj);
        zH = z;
        wa71Var = wa71Var2;
        objH = obj;
        str = ((cyc0) ((py21) objH).d()).a;
        wls0Var = wls0Var2;
        cuu0Var = cuu0Var2;
        if (str != null) {
        }
        hhg1.n("Generated permission token is null or empty");
        return null;
    }

    public void r() {
        r091 r091Var = (r091) this.b;
        if (r091Var != null) {
            r091Var.g();
        }
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public void s() {
        r091 r091Var = (r091) this.b;
        if (r091Var != null) {
            r091Var.j();
        }
    }

    public void t() {
        VideoSurfaceView videoSurfaceView;
        bpb1 bpb1Var;
        i091 i091Var;
        lsm0 lsm0Var;
        ksm0 ksm0Var;
        WeakReference weakReference = (WeakReference) this.c;
        if (weakReference == null || (videoSurfaceView = (VideoSurfaceView) weakReference.get()) == null) {
            return;
        }
        WeakReference weakReference2 = (WeakReference) this.d;
        String str = null;
        if (videoSurfaceView == (weakReference2 != null ? (VideoSurfaceView) weakReference2.get() : null)) {
            return;
        }
        r091 r091Var = (r091) this.b;
        if (r091Var != null && (bpb1Var = r091Var.g) != null && (i091Var = (i091) bpb1Var.getValue()) != null && (lsm0Var = i091Var.a) != null && (ksm0Var = lsm0Var.b) != null) {
            str = ksm0Var.e;
        }
        if (str == null) {
            return;
        }
        r091 r091Var2 = (r091) this.b;
        if (r091Var2 != null) {
            r091Var2.i(videoSurfaceView);
        }
        this.d = new WeakReference(videoSurfaceView);
    }

    public /* synthetic */ aru0(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public aru0(String str, bru0 bru0Var, String str2) {
        this.a = (byte) 0;
        this.b = str;
        this.d = bru0Var;
        this.c = str2;
    }

    public aru0(q3c q3cVar, dgb dgbVar, ejb ejbVar, fza fzaVar, l7c l7cVar, sjb sjbVar, sks0 sks0Var, nfb nfbVar) {
        this.a = (byte) 16;
        this.b = q3cVar;
        this.c = sjbVar;
        this.d = sks0Var;
    }

    public aru0(zgz0 zgz0Var, crd crdVar, erd erdVar) {
        this.a = (byte) 19;
        this.b = crdVar;
        this.c = erdVar;
        this.d = zgz0Var.f();
    }

    public aru0(iyc0 iyc0Var, a0b a0bVar, dc31 dc31Var) {
        this.a = (byte) 2;
        this.b = iyc0Var;
        this.c = dc31Var;
        this.d = new LinkedHashMap();
    }

    public /* synthetic */ aru0(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public aru0(LinearLayout linearLayout, lc20 lc20Var, LinearLayout linearLayout2, kp00 kp00Var, p1f0 p1f0Var, wb00 wb00Var, lc20 lc20Var2, yeu0 yeu0Var) {
        this.a = (byte) 10;
        this.b = linearLayout;
        this.c = lc20Var;
        this.d = lc20Var2;
    }

    public aru0(Class cls) {
        this.a = (byte) 26;
        this.b = new ConcurrentHashMap();
        this.d = cls;
    }

    public aru0(lmy0 lmy0Var, kly0 kly0Var, Scheduler scheduler, sz11 sz11Var, Context context, vte0 vte0Var, ph61 ph61Var) {
        this.a = (byte) 29;
        this.b = kly0Var;
        this.c = scheduler;
        this.d = context;
    }

    public aru0(byte b) {
        this.a = b;
        switch (b) {
            case 24:
                break;
            default:
                long[] jArr = hj41.a;
                this.b = new nen0();
                break;
        }
    }
}
