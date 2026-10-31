package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dt90 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dt90(Object obj, Object obj2, Object obj3, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x024c  */
    public final Object invoke() {
        Function0 function0;
        List list;
        int iNextIndex;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                iu30 iu30Var = (iu30) obj;
                Activity activity = (Activity) ((et90) obj3).e;
                ct90 ct90Var = ((ys90) obj2).b;
                if (ct90Var instanceof bt90) {
                    if (((bt90) ct90Var).a) {
                        iu30Var.invoke(us90.a);
                    }
                    if (((bt90) ct90Var).b) {
                        iu30Var.invoke(new ws90(activity));
                    }
                } else if (ct90Var instanceof zs90) {
                    iu30Var.invoke(new ws90(activity));
                } else {
                    if (!(ct90Var instanceof at90)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(vs90.a);
                }
                return rih1Var;
            case 1:
                ArrayList arrayList = (ArrayList) obj2;
                w5b0 w5b0Var = (w5b0) obj;
                Iterator it = ((List) obj3).iterator();
                while (it.hasNext()) {
                    arrayList.add(w5b0Var.a.c(w5b0.k.a((String) it.next())));
                }
                return rih1Var;
            case 2:
                sd5 sd5Var = (sd5) obj3;
                aab0 aab0Var = (aab0) obj;
                tv80 tv80VarF = bcl1.f((bcl1) sd5Var.c, ((o0i) obj2).e, "labeled_share_button", aab0Var.a, (String) null, j9b0.Z0, 8);
                String str = aab0Var.a;
                String str2 = aab0Var.d;
                String str3 = aab0Var.f;
                Bundle bundleG = cy30.g("watchfeed.share.background_image_url", str2);
                bundleG.putString("watchfeed.share.share_format_id", tyo1.p(blc0.mg, new String[0]).b());
                bundleG.putString("watchfeed.share.pre_url_text", str3);
                bundleG.putString("watchfeed.share.background_content_description", ((Context) sd5Var.e).getString(2131956653));
                ((xh71) sd5Var.d).a(new wa71(str, (String) null, (cqs0) null, (dqi1) null, (String) null, (String) null, (Bundle) null, 126), bundleG, new vm71("watch-feed-entity-share"), tv80VarF, Collections.singletonList(cbl1.a));
                ((yp10) sd5Var.b).a(6, b7x.a);
                return rih1Var;
            case 3:
                bxb0 bxb0Var = (bxb0) obj3;
                i8h1 i8h1Var = bxb0Var.a;
                x6h1 x6h1VarC = ((uvk0) obj2).a.c();
                x6h1VarC.i.add(new a7h1("leave_and_delete_confirmation_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("confirm_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                fn31.T(cto1.q(bxb0Var.c), bxb0Var.h, 0, new m2a0(bxb0Var, (String) obj, (lnm) null, (byte) 5), 2);
                return rih1Var;
            case 4:
                jyb0 jyb0Var = (jyb0) obj3;
                fn31.T(cto1.q(jyb0Var.c), jyb0Var.i, 0, new xtz(jyb0Var, (String) obj2, (String) obj, null, (byte) 19), 2);
                return rih1Var;
            case 5:
                return ((ut71) obj3).b((Activity) obj2, ((t0c0) obj).a);
            case 6:
                vu30 vu30Var = (vu30) obj3;
                dnc0 dnc0Var = (dnc0) obj2;
                Function0 function1 = dnc0Var.d;
                Function0 function2 = dnc0Var.e;
                d0r d0rVar = dnc0Var.a;
                boolean z2 = dnc0Var.b;
                boolean z3 = dnc0Var.c;
                List list2 = (List) obj;
                List<tg50> list3 = list2;
                ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
                for (tg50 tg50Var : list3) {
                    gj50 gj50Var = tg50Var.a;
                    LinkedHashMap linkedHashMap = tg50Var.b;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        linkedHashMap2.put(entry.getKey(), ((wrw) entry.getValue()).getMetadata());
                        function1 = function1;
                    }
                    arrayList2.add(new ezq(gj50Var, linkedHashMap2));
                }
                Function0 function3 = function1;
                ArrayList<Map> arrayList3 = new ArrayList(q7h.U(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    LinkedHashMap linkedHashMap3 = ((tg50) it2.next()).b;
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(zno1.s(linkedHashMap3.size()));
                    for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                        linkedHashMap4.put(entry2.getKey(), ((wrw) entry2.getValue()).getMetadata());
                    }
                    arrayList3.add(linkedHashMap4);
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                for (Map map : arrayList3) {
                    for (Class cls : map.keySet()) {
                        Map map2 = (Map) linkedHashMap5.get(cls);
                        if (map2 != null) {
                            Object obj4 = map.get(cls);
                            obj4.getClass();
                            linkedHashMap5.put(cls, sqg0.O(map2, (Map) obj4));
                        } else {
                            Object obj5 = map.get(cls);
                            obj5.getClass();
                            linkedHashMap5.put(cls, obj5);
                        }
                    }
                }
                Map mapU = sqg0.U(linkedHashMap5);
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                ArrayList<mmr0> arrayList4 = new ArrayList();
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    r7h.W(sqg0.S(((tg50) it3.next()).b), arrayList4);
                }
                for (mmr0 mmr0Var : arrayList4) {
                    linkedHashMap6.put(mmr0Var.a, ((wrw) mmr0Var.b).e());
                }
                Map mapU2 = sqg0.U(linkedHashMap6);
                ArrayList arrayList5 = new ArrayList(q7h.U(list3, 10));
                Iterator it4 = list3.iterator();
                while (it4.hasNext()) {
                    LinkedHashMap linkedHashMap7 = ((tg50) it4.next()).b;
                    LinkedHashMap linkedHashMap8 = new LinkedHashMap(zno1.s(linkedHashMap7.size()));
                    for (Map.Entry entry3 : linkedHashMap7.entrySet()) {
                        linkedHashMap8.put(entry3.getKey(), Collections.singletonList(((wrw) entry3.getValue()).b()));
                    }
                    arrayList5.add(linkedHashMap8);
                }
                Map mapU3 = two1.u(arrayList5);
                ArrayList arrayList6 = new ArrayList();
                Iterator it5 = list3.iterator();
                while (true) {
                    boolean zHasNext = it5.hasNext();
                    List list4 = z6x.a;
                    if (!zHasNext) {
                        Map mapU4 = two1.u(arrayList6);
                        LinkedHashMap linkedHashMap9 = new LinkedHashMap(zno1.s(mapU4.size()));
                        for (Map.Entry entry4 : mapU4.entrySet()) {
                            Object key = entry4.getKey();
                            if (((List) entry4.getValue()).size() > 1) {
                                eg.m("Please avoid declaring same structure in multiple groups.");
                                return null;
                            }
                            Object value = entry4.getValue();
                            if (((List) value).size() > 1) {
                                value = null;
                            }
                            List list5 = (List) value;
                            linkedHashMap9.put(key, list5 != null ? (s3r) o7h.s0(list5) : null);
                        }
                        LinkedHashMap linkedHashMap10 = new LinkedHashMap();
                        for (Map.Entry entry5 : linkedHashMap9.entrySet()) {
                            if (entry5.getValue() != null) {
                                linkedHashMap10.put(entry5.getKey(), entry5.getValue());
                            }
                        }
                        LinkedHashMap linkedHashMap11 = new LinkedHashMap(zno1.s(linkedHashMap10.size()));
                        for (Map.Entry entry6 : linkedHashMap10.entrySet()) {
                            Object key2 = entry6.getKey();
                            Object value2 = entry6.getValue();
                            value2.getClass();
                            linkedHashMap11.put(key2, (s3r) value2);
                        }
                        ArrayList arrayList7 = new ArrayList(q7h.U(list3, 10));
                        Iterator it6 = list3.iterator();
                        while (it6.hasNext()) {
                            LinkedHashMap linkedHashMap12 = ((tg50) it6.next()).b;
                            LinkedHashMap linkedHashMap13 = new LinkedHashMap(zno1.s(linkedHashMap12.size()));
                            for (Map.Entry entry7 : linkedHashMap12.entrySet()) {
                                linkedHashMap13.put(entry7.getKey(), ((wrw) entry7.getValue()).h());
                                function2 = function2;
                            }
                            Function0 function4 = function2;
                            LinkedHashMap linkedHashMap14 = new LinkedHashMap();
                            for (Map.Entry entry8 : linkedHashMap13.entrySet()) {
                                if (entry8.getValue() != null) {
                                    linkedHashMap14.put(entry8.getKey(), entry8.getValue());
                                }
                            }
                            LinkedHashMap linkedHashMap15 = new LinkedHashMap(zno1.s(linkedHashMap14.size()));
                            for (Map.Entry entry9 : linkedHashMap14.entrySet()) {
                                Object key3 = entry9.getKey();
                                Object value3 = entry9.getValue();
                                value3.getClass();
                                linkedHashMap15.put(key3, (vu30) value3);
                            }
                            arrayList7.add(linkedHashMap15);
                            function2 = function4;
                        }
                        Function0 function5 = function2;
                        Map mapU5 = two1.u(arrayList7);
                        ArrayList arrayList8 = new ArrayList(q7h.U(list3, 10));
                        Iterator it7 = list3.iterator();
                        while (it7.hasNext()) {
                            LinkedHashMap linkedHashMap16 = ((tg50) it7.next()).b;
                            LinkedHashMap linkedHashMap17 = new LinkedHashMap(zno1.s(linkedHashMap16.size()));
                            for (Map.Entry entry10 : linkedHashMap16.entrySet()) {
                                Object key4 = entry10.getKey();
                                ruh0 ruh0VarG = ((wrw) entry10.getValue()).g();
                                linkedHashMap17.put(key4, ruh0VarG != null ? Collections.singletonList(ruh0VarG) : list4);
                            }
                            arrayList8.add(linkedHashMap17);
                        }
                        return (snc0) vu30Var.invoke(new vnc0(function3, function5, arrayList2, mapU, mapU3, mapU2, linkedHashMap11, mapU5, dnc0Var.f, two1.u(arrayList8), d0rVar, z2, z3, dnc0Var.g), list2);
                    }
                    LinkedHashMap linkedHashMap18 = ((tg50) it5.next()).b;
                    LinkedHashMap linkedHashMap19 = new LinkedHashMap(zno1.s(linkedHashMap18.size()));
                    for (Map.Entry entry11 : linkedHashMap18.entrySet()) {
                        Object key5 = entry11.getKey();
                        s3r s3rVarF = ((wrw) entry11.getValue()).f();
                        linkedHashMap19.put(key5, s3rVarF != null ? Collections.singletonList(s3rVarF) : list4);
                    }
                    arrayList6.add(linkedHashMap19);
                }
                break;
            case 7:
                RecyclerView recyclerView = (RecyclerView) obj3;
                recyclerView.removeCallbacks((nx30) obj2);
                okk1 okk1Var = (okk1) obj;
                recyclerView.p0(okk1Var);
                okk1.h.removeCallbacks(okk1Var.g);
                okk1Var.e = null;
                okk1Var.f = false;
                return rih1Var;
            case 8:
                l5d0 l5d0Var = (l5d0) obj3;
                s45 s45Var = l5d0Var.a;
                h5d0 h5d0Var = (h5d0) obj2;
                t45 t45VarA = s45Var.a("list_ux_platform_" + h5d0Var);
                t45.m(t45VarA, h5d0Var.toString(), 4);
                Object objInvoke = ((iu30) obj).invoke(new s2c0(l5d0Var, t45VarA));
                t45VarA.g(h5d0Var.toString());
                s45Var.b(t45VarA.e());
                return objInvoke;
            case 9:
                fn31.T((c9n) obj3, (o8n) null, 0, new m2a0((sdd0) obj2, (tdd0) obj, (lnm) null, (byte) 8), 3);
                return rih1Var;
            case 10:
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (x22) obj;
                ViewTreeObserver viewTreeObserver = ((View) obj3).getViewTreeObserver();
                p811 p811Var = (p811) obj2;
                Object obj6 = p811Var.a;
                if (obj6 != viewTreeObserver) {
                    ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) obj6;
                    if (viewTreeObserver2 != null) {
                        ViewTreeObserver viewTreeObserver3 = viewTreeObserver2.isAlive() ? viewTreeObserver2 : null;
                        if (viewTreeObserver3 != null) {
                            viewTreeObserver3.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                        }
                    }
                    viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                    p811Var.a = viewTreeObserver;
                }
                return rih1Var;
            case 11:
                ven0 ven0Var = (ven0) obj3;
                if (((x8c0) obj2).b().a(w8c0.d) && ((View) obj).isShown()) {
                    z = true;
                }
                ven0Var.setValue(Boolean.valueOf(z));
                return rih1Var;
            case 12:
                return ((a8e0) obj3).a.b((q6e0) obj2, new v7r0(2, xio1.p((q7r0) obj)));
            case 13:
                lee0 lee0Var = lee0.f;
                iu30 iu30Var2 = (iu30) obj;
                int iC = l1d.C(((nee0) obj3).c);
                if (iC == 0) {
                    see0 see0Var = (see0) obj2;
                    if (!ag0.C0(see0Var.a, see0Var.h)) {
                        lee0Var = lee0.e;
                    }
                    iu30Var2.invoke(lee0Var);
                } else if (iC == 1) {
                    iu30Var2.invoke(kee0.a);
                } else {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    iu30Var2.invoke(lee0Var);
                }
                return rih1Var;
            case 14:
                az20.a((az20) obj3);
                b6t b6tVar = (k6a1) obj2;
                if (b6tVar != null) {
                    b6tVar.a();
                }
                ((Function0) obj).invoke();
                return rih1Var;
            case 15:
                ((Function0) obj3).invoke();
                ((ven0) obj).setValue((Object) null);
                ((scx) obj2).a();
                return rih1Var;
            case 16:
                qvf0 qvf0Var = (qvf0) obj3;
                i8h1 i8h1Var2 = (i8h1) qvf0Var.c.getValue();
                x6h1 x6h1VarC3 = qvf0Var.b.a.c();
                x6h1VarC3.i.add(new a7h1("continue_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                ((iu30) obj).invoke(new nvf0(i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("logout", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null)));
                ((ven0) ((p811) obj2).a).setValue(Boolean.FALSE);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                utg0 utg0Var = (utg0) obj3;
                m0u0 m0u0Var = (m0u0) obj2;
                Disposable disposable = (Disposable) utg0Var.d.remove(m0u0Var);
                if (disposable != null) {
                    disposable.dispose();
                }
                utg0Var.b.remove(m0u0Var);
                utg0Var.c.remove((String) obj);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((iu30) obj).invoke(orh0.a);
                ((ihg0) obj3).a(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", (String) obj2, null)));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ubw0 ubw0Var = (ubw0) obj2;
                return new vu41((yqg) ((n801) ((qq) obj3).l).b, ubw0Var, ubw0Var, new abh0((ven0) obj, (byte) 3));
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                xfn0 xfn0Var = (xfn0) obj3;
                if (xfn0Var != null && (function0 = xfn0Var.a) != null) {
                    function0.invoke();
                }
                iu30 iu30Var3 = (iu30) ((ven0) obj2).getValue();
                i091 i091Var = (i091) ((ven0) obj).getValue();
                if (i091Var == null) {
                    z = true;
                } else if (i091Var.g && !ebp1.q(i091Var)) {
                    o091 o091Var = i091Var.h;
                    if (!(o091Var instanceof j091) && !(o091Var instanceof k091)) {
                        z = true;
                    }
                }
                iu30Var3.invoke(new d000(z));
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                kgi0 kgi0Var = (kgi0) obj3;
                kgi0Var.b = true;
                ((iu30) obj).invoke(new dgi0(kgi0Var.a));
                ArrayList arrayList9 = ((igi0) obj2).b;
                if (!arrayList9.isEmpty()) {
                    kgi0Var.d(((mey0) arrayList9.get(yoi1.q(kgi0Var.a, p7h.K(arrayList9)))).a);
                }
                return rih1Var;
            case 22:
                ubw0 ubw0Var2 = (ubw0) obj2;
                return new vu41((yqg) ((n801) obj3).b, ubw0Var2, ubw0Var2, new abh0((ven0) obj, (byte) 8));
            case 23:
                kgi0 kgi0Var2 = (kgi0) obj3;
                kgi0Var2.b = true;
                ((iu30) obj).invoke(new jii0(kgi0Var2.a));
                ArrayList arrayList10 = ((pii0) obj2).b;
                if (!arrayList10.isEmpty()) {
                    kgi0Var2.d(((mey0) arrayList10.get(yoi1.q(kgi0Var2.a, p7h.K(arrayList10)))).a);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                Observable observableI = yoi1.i(((clm0) obj).b, o6x.a);
                g1i g1iVar = (g1i) ((atp) obj3).a.c;
                Context context = (Context) ((ozp) g1iVar.b).a.x1.a;
                c8o.l(context);
                ygp ygpVar = (ygp) ((jly0) g1iVar.c).get();
                daq daqVar = ((ozp) g1iVar.b).a;
                RetrofitMaker retrofitMaker = (RetrofitMaker) daqVar.Y3.get();
                c8o.l(retrofitMaker);
                ykm0 ykm0Var = (ykm0) retrofitMaker.createWebgateService(ykm0.class, "android-list-ux-platform-consumers-standard-sections-morelikethis");
                ajg ajgVar = (ajg) daqVar.a2.get();
                c8o.l(ajgVar);
                ku1 ku1Var = new ku1(new lmw(new kqi0(ykm0Var, ajgVar, new dn81((byte) 29), (byte) 9)), (byte) 6);
                ctp ctpVar = (ctp) ((jly0) g1iVar.e).get();
                Scheduler scheduler = (Scheduler) daqVar.z1.get();
                c8o.l(scheduler);
                Scheduler scheduler2 = (Scheduler) daqVar.r3.get();
                c8o.l(scheduler2);
                return new kpg0(new cm0(context, ygpVar, ku1Var, ctpVar, scheduler, scheduler2, (String) obj2, observableI), xjm0.X);
            case 25:
                ((iu30) obj).invoke(eqm0.a);
                if (((hqm0) obj3).a.size() > 1) {
                    ((ven0) obj2).setValue(Boolean.TRUE);
                }
                return rih1Var;
            case 26:
                poj0 poj0Var = (poj0) obj2;
                fn31.T((llm) poj0Var.d, (o8n) null, 4, new wkk0((r091) obj, (rtm0) obj3, poj0Var, (lnm) null, (byte) 8), 1);
                return rih1Var;
            case 27:
                cc0 cc0Var = ((lnn0) obj3).a;
                hfb hfbVar = (hfb) obj2;
                onr0 onr0Var = (onr0) obj;
                cc0Var.getClass();
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper != null && !u890.j(Looper.myLooper(), mainLooper)) {
                    eg.m("ActivePageSet must be called on the main thread");
                    return null;
                }
                if (cc0Var.a.d() && (list = (List) cc0Var.d.get(onr0Var)) != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            iNextIndex = -1;
                        } else if (((bc0) listIterator.previous()).a == hfbVar) {
                            iNextIndex = listIterator.nextIndex();
                        }
                    }
                    if (iNextIndex >= 0) {
                        Map map3 = (Map) cc0Var.c.getValue();
                        list.remove(iNextIndex);
                        cc0Var.a(onr0Var, list, map3);
                    }
                }
                return rih1Var;
            case 28:
                qu50 qu50Var = (qu50) obj3;
                xtn0 xtn0Var = (xtn0) obj;
                qu50Var.b.a(xtn0Var.b, bcl1.f(qu50Var.c, ((o0i) obj2).e, "navigation_button", (String) null, (String) null, new xkm0(xtn0Var, (byte) 23), 12), (Bundle) null);
                return rih1Var;
            default:
                yso0 yso0Var = (yso0) obj3;
                yso0Var.d.m();
                if (Build.VERSION.SDK_INT >= 33) {
                    ((ihg0) obj2).a("android.permission.POST_NOTIFICATIONS");
                } else {
                    yso0.d(yso0Var, (ven0) obj);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dt90(Object obj, iu30 iu30Var, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.d = iu30Var;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dt90(iu30 iu30Var, Object obj, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.d = iu30Var;
        this.b = obj;
        this.c = obj2;
    }
}
