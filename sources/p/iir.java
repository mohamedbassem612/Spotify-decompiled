package p;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.icu.text.SimpleDateFormat;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.protobuf.h;
import com.spotify.cosmos.cosmos.Response;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbars;
import com.spotify.libs.connect.events.proto.ConnectDeviceDiscoverySnapshot;
import com.spotify.libs.connect.events.proto.a;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.outcome.outcomeapi.exceptions.HttpError;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleTransformer;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public class iir implements k2r, SingleTransformer, Function, mc41, hhd1, t2n {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public iir(mr20 mr20Var, v5n v5nVar, g0l g0lVar, c9c0 c9c0Var, qo90 qo90Var, xvo xvoVar, Context context) {
        this.a = (byte) 8;
        this.b = context;
        mr20 mr20VarU = rqt0.u(new qer(c9c0Var.c.available(), qo90Var, (byte) 12));
        this.c = h5p1.r(hu20.e(rqt0.u(new dkm(mr20Var, (byte) 28)), new tno(null, v5nVar, (byte) 1)), new qer(yoi1.g(hqq0.K(g0lVar)), this, (byte) 13), mr20VarU, rqt0.u(yoi1.g(xvoVar.a(true))), new f3(5, (lnm) null, (byte) 9));
    }

    public static l0l f(List list, lp90 lp90Var) {
        Object next;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (u890.j(((l0l) obj).d(), lp90Var.a)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() == 1) {
            return (l0l) o7h.s0(arrayList);
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!ihc1.h0(lp90Var.b, ((l0l) next).getName(), true));
        l0l l0lVar = (l0l) next;
        return l0lVar == null ? (l0l) o7h.s0(arrayList) : l0lVar;
    }

    public void a(dhd1 dhd1Var, int i) {
        TextView textViewN;
        dhd1Var.a(((ito) ((ArrayList) this.b).get(i)).a);
        xzo1.s(dhd1Var);
        if (i != ((ViewPager2) ((lvc1) this.c).d).getCurrentItem() || (textViewN = xzo1.n(dhd1Var)) == null) {
            return;
        }
        textViewN.setTextAppearance(2132018004);
    }

    public Object apply(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 14:
                f8s f8sVar = (f8s) this.b;
                long jG = f8sVar.b.b(f8sVar.a, (String) obj).g(bma1.b.n(l1d.m("device-picker-message-box-dismissed-timestamp-", ((ywi0) this.c).name())), 0L);
                long jA = f8sVar.e.a();
                long jB = (f8sVar.d.b() - jG) / 86400000;
                if (jG != 0 && jB <= jA) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                c481 c481Var = (c481) obj;
                jfs jfsVar = (jfs) this.b;
                String str = (String) this.c;
                List list = c481Var.b;
                ArrayList<i1z> arrayList = new ArrayList();
                for (Object obj2 : list) {
                    String str2 = ((i1z) obj2).b;
                    if (str2 == null || str2.length() == 0) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (i1z i1zVar : arrayList) {
                    ContextTrack.Builder builder = ContextTrack.builder(i1zVar.a);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i1zVar.d());
                    linkedHashMap.put("added_at", String.valueOf(i1zVar.y));
                    arrayList2.add(builder.metadata(linkedHashMap).build());
                }
                com.spotify.player.model.Context.Builder builderPages = com.spotify.player.model.Context.builder(str).pages(Collections.singletonList(ContextPage.builder().tracks(arrayList2).build()));
                g281 g281Var = c481Var.a;
                LinkedHashMap linkedHashMapM = sqg0.M(new mmr0[]{new mmr0("sorting.criteria", String.format("%s ASC", Arrays.copyOf(new Object[]{"added_at"}, 1)))});
                if (jfsVar.e) {
                    linkedHashMapM.put("end_of_context_action", "stop");
                }
                if (jfsVar.f && u890.j(g281Var.B.get("autoplay_candidate"), "false")) {
                    linkedHashMapM.put("autoplay_candidate", "false");
                }
                return builderPages.metadata(linkedHashMapM).build();
            default:
                Response response = (Response) obj;
                int status = response.getStatus();
                tr80 tr80Var = vjs.a;
                return (status > ((rr80) tr80Var).b || ((rr80) tr80Var).a > status) ? Observable.error(new HttpError(response.getStatus(), response.getBodyString())) : Observable.fromCallable(new e71((iu30) this.b, response, (byte) 5)).map(new hur((iu30) this.c, response, (byte) 14));
        }
    }

    public void b(etu etuVar, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var;
        boolean z;
        m4c m4cVar = fkj0.X;
        Set set = etuVar.d;
        List list = etuVar.a;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(2125730651);
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? x340Var2.g(etuVar) : x340Var2.i(etuVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(this) ? 256 : 128;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            d0r d0rVarC = cwl1.C(((cir0) x340Var2.k(k2r0.a)).g());
            ven0 ven0VarS = v8r.s(iu30Var, x340Var2);
            boolean zG = x340Var2.g(d0rVarC);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                objT = (tvr) szq.b(d0rVarC, new sqm(this, ven0VarS, (byte) 29));
                x340Var2.s0(objT);
            }
            tvr tvrVar = (tvr) objT;
            boolean z2 = etuVar.b && list.isEmpty();
            ven0 ven0VarS2 = v8r.s(Boolean.valueOf(z2), x340Var2);
            boolean zG2 = x340Var2.g(list) | x340Var2.g(set);
            Object objT2 = x340Var2.T();
            if (zG2 || objT2 == m4cVar) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    p0v p0vVar = (p0v) obj;
                    boolean z3 = z2;
                    if (!p0vVar.e.equals(k0v.a) || set.contains(p0vVar.a)) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                    z2 = z3;
                }
                z = z2;
                mmr0 mmr0Var = new mmr0(arrayList, arrayList2);
                x340Var2.s0(mmr0Var);
                objT2 = mmr0Var;
            } else {
                z = z2;
            }
            mmr0 mmr0Var2 = (mmr0) objT2;
            List list2 = (List) mmr0Var2.a;
            List list3 = (List) mmr0Var2.b;
            xtb0 xtb0VarA = aub0.a(0, x340Var2, 3);
            Object objT3 = x340Var2.T();
            if (objT3 == m4cVar) {
                objT3 = yv91.a(new w77(xtb0VarA, ven0VarS2, (byte) 2));
                x340Var2.s0(objT3);
            }
            irn1.u(anm1.N("download_center_page_test_tag", nim0.a), apo.r(-960025400, new lpk((tob1) objT3, (byte) 1), x340Var2), (vu30) null, (erl1) null, apo.r(1408285250, new swj(z, etuVar, ven0VarS, xtb0VarA, this, list2, tvrVar, list3, (byte) 1), x340Var2), x340Var2, 24624, 12);
            x340Var = x340Var2;
            p0v p0vVar2 = etuVar.e;
            if (p0vVar2 == null) {
                x340Var.i0(-1647354029);
                x340Var.r(false);
            } else {
                x340Var.i0(-1647354028);
                int i3 = p0vVar2.c;
                boolean zI = x340Var.i(ven0VarS);
                Object objT4 = x340Var.T();
                if (zI || objT4 == m4cVar) {
                    objT4 = new hnf(ven0VarS, (byte) 26);
                    x340Var.s0(objT4);
                }
                Function0 function0 = (Function0) objT4;
                boolean zI2 = x340Var.i(ven0VarS);
                Object objT5 = x340Var.T();
                if (zI2 || objT5 == m4cVar) {
                    objT5 = new hnf(ven0VarS, (byte) 27);
                    x340Var.s0(objT5);
                }
                itu.d(i3, function0, (Function0) objT5, x340Var, 0);
                x340Var.r(false);
            }
            cbe cbeVar = etuVar.f;
            if (cbeVar == null) {
                x340Var.i0(-1647086065);
                x340Var.r(false);
            } else {
                x340Var.i0(-1647086064);
                boolean zI3 = x340Var.i(ven0VarS);
                Object objT6 = x340Var.T();
                if (zI3 || objT6 == m4cVar) {
                    objT6 = new hnf(ven0VarS, (byte) 28);
                    x340Var.s0(objT6);
                }
                Function0 function1 = (Function0) objT6;
                boolean zI4 = x340Var.i(ven0VarS);
                Object objT7 = x340Var.T();
                if (zI4 || objT7 == m4cVar) {
                    objT7 = new hnf(ven0VarS, (byte) 29);
                    x340Var.s0(objT7);
                }
                itu.e(cbeVar, function1, (Function0) objT7, x340Var, 0);
                x340Var.r(false);
            }
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nok(this, etuVar, iu30Var, i, (byte) 27);
        }
    }

    public Single c(Single single) {
        k9r k9rVar = (k9r) this.b;
        y0o y0oVar = new y0o(k9rVar, (wu60) this.c, (byte) 21);
        return single.doOnSuccess(new lgr(y0oVar, k9rVar, (byte) 2)).doOnError(new yrh(y0oVar, (byte) 21));
    }

    public Bundle d(Object obj) {
        return (Bundle) ((iu30) this.b).invoke(obj);
    }

    public Object e(Bundle bundle, Object obj) {
        return ((vu30) this.c).invoke(bundle, obj);
    }

    public Object g(Object obj) {
        y1t0 y1t0Var = (y1t0) this.c;
        nma0 nma0Var = (nma0) this.b;
        return ((nfa0) y1t0Var.b).a(((uz21) obj).f(), nma0Var);
    }

    public Observable h(String str) {
        return Observable.defer(new xf0(this, str, (byte) 2));
    }

    public Observable i() {
        xmu0 xmu0Var = (xmu0) this.b;
        Observable observableOnErrorReturn = ((Observable) ((y170) xmu0Var.b).invoke()).switchMap(new vyq0(xmu0Var, (byte) 20)).doOnError(mux0.h).onErrorReturn(i5x0.c);
        o3e0 o3e0Var = (o3e0) this.c;
        return Observable.combineLatest(observableOnErrorReturn, ((Observable) ((b9o) o3e0Var.c).invoke()).flatMap(new yfc0(o3e0Var, (byte) 9)), t9w.W0);
    }

    public o2r j() {
        switch (this.a) {
            case 3:
                return new etr((Context) this.b, ((iir) this.c).j());
            default:
                return new n1s((String) this.c, (vx40) this.b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public d9n k(iu30 iu30Var, onm onmVar) {
        k4s k4sVar;
        if (onmVar instanceof k4s) {
            k4sVar = (k4s) onmVar;
            int i = k4sVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                k4sVar.c = i - Integer.MIN_VALUE;
            } else {
                k4sVar = new k4s(this, onmVar);
            }
        } else {
            k4sVar = new k4s(this, onmVar);
        }
        Object obj = k4sVar.a;
        int i2 = k4sVar.c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    hm5.M(obj);
                    return null;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            k4sVar.c = 1;
            Object objInvoke = iu30Var.invoke(k4sVar);
            d9n d9nVar = d9n.a;
            if (objInvoke == d9nVar) {
                return d9nVar;
            }
            return null;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    public fqt l(List list, pp90 pp90Var, List list2, List list3, List list4, Map map, int i) throws Throwable {
        String str;
        nya nyaVar;
        ?? r2;
        re9 re9Var;
        Integer numValueOf;
        String string;
        h hVarBuild;
        yya yyaVar;
        String string2 = UUID.randomUUID().toString();
        Date date = new Date();
        String str2 = gqt.a.format(date);
        String str3 = new SimpleDateFormat("VV", Locale.US).format(date);
        ArrayList<q2a0> arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qo90 qo90Var = (qo90) it.next();
            l0l l0lVarF = f(list2, qo90Var.e);
            if (l0lVarF != null) {
                linkedHashSet.add(l0lVarF.j());
            }
            arrayList.add(new q2a0(qo90Var.a, qo90Var.e, l0lVarF));
        }
        if (pp90Var != null) {
            lp90 lp90Var = pp90Var.d;
            l0l l0lVarF2 = f(list2, lp90Var);
            if (l0lVarF2 != null) {
                linkedHashSet.add(l0lVarF2.j());
            }
            arrayList.add(new q2a0(pp90Var.a, lp90Var, l0lVarF2));
        }
        List list5 = list2;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list5) {
            if (!linkedHashSet.contains(((l0l) obj).j())) {
                arrayList2.add(obj);
            }
        }
        Throwable th = null;
        njr njrVar = (njr) ((Optional) this.b).orElse(null);
        String str4 = (njrVar == null || (yyaVar = njrVar.g) == null) ? null : yyaVar.a;
        boolean zIsEnabled = ((jo20) this.c).isEnabled();
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
        for (q2a0 q2a0Var : arrayList) {
            String str5 = q2a0Var.a;
            lp90 lp90Var2 = q2a0Var.b;
            String str6 = lp90Var2.b;
            l0l l0lVar = q2a0Var.c;
            Throwable th2 = th;
            if (l0lVar != null) {
                a aVarA = eqt.a(l0lVar, string2, zIsEnabled);
                aVarA.F("jam");
                aVarA.N(str5);
                aVarA.R(str6);
                hVarBuild = aVarA.build();
            } else {
                a aVarR = ConnectDeviceDiscoverySnapshot.r();
                aVarR.W(string2);
                aVarR.F("jam");
                aVarR.N(str5);
                aVarR.B(lp90Var2.a);
                aVarR.R(str6);
                hVarBuild = aVarR.build();
            }
            arrayList3.add((ConnectDeviceDiscoverySnapshot) hVarBuild);
            th = th2;
        }
        Throwable th3 = th;
        ArrayList arrayList4 = new ArrayList(q7h.U(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList4.add(eqt.a((l0l) it2.next(), string2, zIsEnabled).build());
        }
        List<z5e> list6 = list3;
        ArrayList arrayList5 = new ArrayList(q7h.U(list6, 10));
        for (z5e z5eVar : list6) {
            a aVarR2 = ConnectDeviceDiscoverySnapshot.r();
            aVarR2.W(string2);
            aVarR2.F("bluetooth");
            ikb ikbVar = z5eVar.a;
            vuh0 vuh0Var = ikbVar.a;
            aVarR2.y(vuh0Var.a);
            String str7 = z5eVar.d;
            if (str7 == null) {
                str7 = vuh0Var.b;
            }
            aVarR2.R(str7);
            int iC = l1d.C(z5eVar.c);
            if (iC == 1) {
                string = "BLUETOOTH_CAR";
            } else if (iC != 2) {
                string = iC != 3 ? z5eVar.b.toString() : "BLUETOOTH_SPEAKER";
            } else {
                string = "BLUETOOTH_HEADPHONES";
            }
            aVarR2.z(string);
            aVarR2.x(String.valueOf(vuh0Var.d));
            String str8 = vuh0Var.g;
            if (str8 == null) {
                str8 = "";
            }
            aVarR2.Q(str8);
            aVarR2.G(ikbVar.b);
            arrayList5.add(aVarR2.build());
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj2 : list5) {
            l0l l0lVar2 = (l0l) obj2;
            if (cw30.a(l0lVar2) && l0lVar2.n()) {
                arrayList6.add(obj2);
            }
        }
        ArrayList arrayList7 = new ArrayList(q7h.U(arrayList6, 10));
        Iterator it3 = arrayList6.iterator();
        while (it3.hasNext()) {
            arrayList7.add(((l0l) it3.next()).r());
        }
        ArrayList arrayList8 = new ArrayList();
        for (Object obj3 : arrayList7) {
            if (((String) obj3).length() > 0) {
                arrayList8.add(obj3);
            }
        }
        Set setP1 = o7h.p1(arrayList8);
        ArrayList<jy5> arrayList9 = new ArrayList();
        for (Object obj4 : list4) {
            jy5 jy5Var = (jy5) obj4;
            if (jy5Var.e.length() == 0 || !setP1.contains(jy5Var.e)) {
                arrayList9.add(obj4);
            }
        }
        ArrayList arrayList10 = new ArrayList(q7h.U(arrayList9, 10));
        for (jy5 jy5Var2 : arrayList9) {
            a aVarR3 = ConnectDeviceDiscoverySnapshot.r();
            aVarR3.W(string2);
            aVarR3.F("atv");
            aVarR3.O(jy5Var2.a);
            aVarR3.R(jy5Var2.b);
            String str9 = jy5Var2.g;
            if (str9 != null) {
                aVarR3.Q(str9);
            }
            arrayList10.add(aVarR3.build());
        }
        ArrayList<ConnectDeviceDiscoverySnapshot> arrayListV = q7h.V(p7h.M(new List[]{arrayList3, arrayList4, arrayList5, arrayList10}));
        ArrayList arrayList11 = new ArrayList(q7h.U(arrayListV, 10));
        for (ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot : arrayListV) {
            a builder = connectDeviceDiscoverySnapshot.toBuilder();
            if (i == 1) {
                str = "automatic";
            } else {
                if (i != 2) {
                    throw th3;
                }
                str = "user_initiated";
            }
            builder.U(str);
            builder.P(str2);
            builder.d0(str3);
            String strP = connectDeviceDiscoverySnapshot.p();
            if (strP.length() == 0 || (nyaVar = (nya) map.get(strP)) == null || (re9Var = nyaVar.a) == null) {
                r2 = th3;
            } else {
                numValueOf = Integer.valueOf(re9Var.b.a);
            }
            if (r2 != 0) {
                r2 = numValueOf;
                builder.V(r2.intValue());
            }
            if (str4 != null) {
                builder.w(str4);
            }
            arrayList11.add(builder.build());
        }
        return new fqt(arrayList11, string2);
    }

    public Single m() {
        return yoi1.i(((c9c0) this.c).e.a(), o6x.a).filter(olj0.X0).firstOrError().timeout(5L, TimeUnit.SECONDS, (Scheduler) this.b);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object n(String str, du90 du90Var, String str2, onm onmVar) {
        l4s l4sVar;
        String str3;
        String str4;
        wv90 wv90Var;
        du90 du90Var2;
        dv90 bv90Var;
        du90 du90Var3 = du90Var;
        if (onmVar instanceof l4s) {
            l4sVar = (l4s) onmVar;
            int i = l4sVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                l4sVar.f = i - Integer.MIN_VALUE;
            } else {
                l4sVar = new l4s(this, onmVar);
            }
        } else {
            l4sVar = new l4s(this, onmVar);
        }
        Object objE = l4sVar.d;
        d9n d9nVar = d9n.a;
        int i2 = l4sVar.f;
        try {
            if (i2 == 0) {
                hm5.M(objE);
                if (ihc1.y0(str2)) {
                    return new bv90(du90Var3.a);
                }
                try {
                    n4s n4sVar = (n4s) this.c;
                    l4sVar.a = str;
                    l4sVar.b = du90Var3;
                    l4sVar.c = str2;
                    l4sVar.f = 1;
                    objE = n4sVar.b;
                    if (objE != d9nVar) {
                        str3 = str;
                        str4 = str2;
                        wv90Var = (wv90) objE;
                        op71.x(l4sVar.getContext());
                        if (wv90Var instanceof tv90) {
                            pcd pcdVar = (pcd) this.b;
                            zu90 zu90Var = new zu90(str3, du90Var3.b, str4, ((tv90) wv90Var).a, du90Var3.a);
                            l4sVar.a = null;
                            l4sVar.b = du90Var3;
                            l4sVar.c = null;
                            l4sVar.f = 2;
                            objE = pcdVar.e(zu90Var, l4sVar);
                            if (objE != d9nVar) {
                                du90Var2 = du90Var3;
                                bv90Var = (dv90) objE;
                            }
                        }
                        return new bv90(du90Var3.a);
                    }
                    return d9nVar;
                } catch (Exception unused) {
                    bv90Var = new bv90(du90Var3.a);
                    du90Var2 = du90Var3;
                }
            } else if (i2 == 1) {
                String str5 = l4sVar.c;
                du90 du90Var4 = l4sVar.b;
                String str6 = l4sVar.a;
                try {
                    hm5.M(objE);
                    str4 = str5;
                    du90Var3 = du90Var4;
                    str3 = str6;
                    wv90Var = (wv90) objE;
                    op71.x(l4sVar.getContext());
                    if ((wv90Var instanceof tv90) && !ihc1.y0(((tv90) wv90Var).a)) {
                        pcd pcdVar2 = (pcd) this.b;
                        zu90 zu90Var2 = new zu90(str3, du90Var3.b, str4, ((tv90) wv90Var).a, du90Var3.a);
                        l4sVar.a = null;
                        l4sVar.b = du90Var3;
                        l4sVar.c = null;
                        l4sVar.f = 2;
                        objE = pcdVar2.e(zu90Var2, l4sVar);
                        if (objE != d9nVar) {
                            du90Var2 = du90Var3;
                            bv90Var = (dv90) objE;
                        }
                        return d9nVar;
                    }
                    return new bv90(du90Var3.a);
                } catch (Exception unused2) {
                    du90Var3 = du90Var4;
                    bv90Var = new bv90(du90Var3.a);
                    du90Var2 = du90Var3;
                }
            } else {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                du90Var2 = l4sVar.b;
                try {
                    hm5.M(objE);
                    bv90Var = (dv90) objE;
                } catch (Exception unused3) {
                    du90Var3 = du90Var2;
                    bv90Var = new bv90(du90Var3.a);
                    du90Var2 = du90Var3;
                }
            }
            if (bv90Var.getRequestId() != du90Var2.a) {
                return null;
            }
            return bv90Var;
        } catch (CancellationException e) {
            throw e;
        }
    }

    public iir(ujs ujsVar, iu30 iu30Var, iu30 iu30Var2) {
        this.a = (byte) 20;
        this.b = iu30Var;
        this.c = iu30Var2;
    }

    public iir(be beVar) {
        this.a = (byte) 26;
        this.b = beVar;
        this.c = new idd1(new ots(this, (byte) 15));
    }

    public iir(g0l g0lVar, h991 h991Var) {
        this.a = (byte) 22;
        this.b = g0lVar;
        this.c = Observable.merge(Observable.defer(new yj1(h991Var, (byte) 29)).flatMap(new sun(this, (byte) 18)), Observable.merge(h991Var.a.g(), h991Var.b.g()).map(qzs0.Y0));
    }

    public iir(ipq ipqVar) {
        this.a = (byte) 23;
        this.b = ipqVar;
        this.c = new bqk0((byte) 27);
    }

    public iir(gj5 gj5Var, FrameLayout frameLayout, d7s d7sVar) {
        this.a = (byte) 13;
        this.b = d7sVar;
        GlueToolbar glueToolbarCreateGlueToolbar = GlueToolbars.createGlueToolbar(frameLayout.getContext(), frameLayout);
        dug.r(glueToolbarCreateGlueToolbar.getView());
        frameLayout.addView(glueToolbarCreateGlueToolbar.getView(), 0);
        a1s a1sVar = new a1s((Activity) gj5Var, glueToolbarCreateGlueToolbar, (x8c0) ((f0i) gj5Var).a, (View.OnClickListener) new c20(this, (byte) 29));
        glueToolbarCreateGlueToolbar.getView().setVisibility(0);
        ((Drawable) a1sVar.d).setAlpha(0);
        ((mx40) a1sVar.b).e = true;
        this.c = a1sVar;
    }

    public /* synthetic */ iir(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public iir(Context context) {
        this.a = (byte) 3;
        iir iirVar = new iir();
        iirVar.c = "previewplayer";
        this.b = context.getApplicationContext();
        this.c = iirVar;
    }

    public iir() {
        this.a = (byte) 10;
        this.b = new vx40((byte) 13);
    }

    public iir(androidx.media3.exoplayer.video.a aVar) {
        this.a = (byte) 25;
        this.c = aVar;
    }
}
