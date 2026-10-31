package p;

import android.net.Uri;
import com.spotify.eventcardinfoservice.v1.EventCardInfoRequest;
import com.spotify.eventcardinfoservice.v1.EventCardInfoResponse;
import com.spotify.mdata.esperanto.proto.ObserveRequest;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatten;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import spotify.collection.esperanto.proto.CollectionDecorateRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xf0 implements Supplier {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xf0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object get() {
        Single singleJust;
        List listL1;
        byte b = 26;
        boolean z = true;
        switch (this.a) {
            case 0:
                yf0 yf0Var = (yf0) this.b;
                iu30 iu30Var = yf0Var.b;
                iu30 iu30Var2 = yf0Var.a;
                ContextTrack contextTrack = (ContextTrack) this.c;
                Maybe maybe = (Maybe) iu30Var.invoke(iu30Var2.invoke(contextTrack));
                ycc1 ycc1Var = new ycc1(yf0Var, contextTrack, (byte) 6);
                maybe.getClass();
                return new MaybeFlatten(maybe, ycc1Var);
            case 1:
                String str = (String) this.c;
                pnd pndVar = (pnd) this.b;
                List list = pndVar.d.f;
                if (list.size() >= 2) {
                    return pndVar.e.a(Collections.singletonList(str)).map(cq41.N0).doOnSuccess(new a21(pndVar, str, (byte) 21)).toFlowable();
                }
                hpc1 hpc1Var = (hpc1) o7h.s0(list);
                String str2 = hpc1Var != null ? hpc1Var.f : null;
                if (str2 == null) {
                    str2 = "";
                }
                return Flowable.I(str2);
            case 2:
                iir iirVar = (iir) this.b;
                x3v0 x3v0Var = (x3v0) iirVar.c;
                String str3 = (String) this.c;
                List listSingletonList = Collections.singletonList(str3);
                yw7 yw7Var = (yw7) iirVar.b;
                Boolean bool = Boolean.TRUE;
                return x3v0Var.b(listSingletonList, new t3v0(sqg0.J(new mmr0[]{new mmr0("available", bool), new mmr0("backgroundable", bool), new mmr0("covers", bool), new mmr0("description", bool), new mmr0("freezeFrames", bool), new mmr0("isFollowingShow", bool), new mmr0("isExplicit", bool), new mmr0("is19PlusOnly", bool), new mmr0("isInListenLater", bool), new mmr0("isMusicAndTalk", bool), new mmr0("isNew", bool), new mmr0("isPlayed", bool), new mmr0("isPlayable", bool), new mmr0("lastPlayedAt", bool), new mmr0("length", bool), new mmr0("link", bool), new mmr0("manifestId", bool), new mmr0("mediaTypeEnum", bool), new mmr0("name", bool), new mmr0("offline", bool), new mmr0("playable", bool), new mmr0("playabilityRestriction", bool), new mmr0("previewId", bool), new mmr0("previewManifestId", bool), new mmr0("publishDate", bool), new mmr0("syncProgress", bool), new mmr0("timeLeft", bool), new mmr0("type", bool), new mmr0("isBookChapter", bool), new mmr0("isCurated", bool)}), yw7.c(yw7Var), yw7.c(yw7Var), f46.i0(new Integer[]{4, 22, 54, 21, 24, yw7Var.a ? 29 : null, 58, 178, 114, 164, 30, 113, yw7Var.b ? 179 : null, yw7Var.c ? 185 : null, 208}), (List) null, 135)).map(new ljp1(str3, (byte) 8));
            case 3:
                w2z w2zVar = ((m900) this.b).a;
                mmr0 mmr0Var = (mmr0) this.c;
                String str4 = (String) mmr0Var.a;
                boolean zBooleanValue = ((Boolean) mmr0Var.b).booleanValue();
                i900 i900VarO = EventCardInfoRequest.o();
                i900VarO.n(str4);
                i900VarO.q(zBooleanValue);
                EventCardInfoRequest eventCardInfoRequestBuild = i900VarO.build();
                Single<EventCardInfoResponse> singleA = ((j900) w2zVar.b).a(eventCardInfoRequestBuild);
                kq6 kq6Var = (kq6) w2zVar.c;
                String strN = eventCardInfoRequestBuild.n();
                r5h r5hVar = kq6Var.a;
                e3h e3hVarP = CollectionDecorateRequest.p();
                e3hVarP.q("spotify:artist:".concat(strN));
                e3hVarP.r(kq6.b);
                return Single.zip(singleA, r5hVar.b(e3hVarP.build()).map(xbp1.h), m9h.g1).map(p9w.d1).onErrorReturn(q9w.e1);
            case 4:
                zu00 zu00Var = (zu00) this.b;
                ihp0 ihp0Var = zu00Var.c;
                oi oiVar = (oi) this.c;
                ArrayList arrayList = (ArrayList) oiVar.d;
                ArrayList arrayList2 = (ArrayList) oiVar.d;
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((rv00) it.next()).b.getSimpleName());
                }
                List listZ0 = o7h.Z0(o7h.j0(arrayList3));
                if (!oiVar.b) {
                    if (arrayList2 == null || !arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        do {
                            if (!it2.hasNext()) {
                                z = false;
                            }
                        } while (!((rv00) it2.next()).c);
                    } else {
                        z = false;
                    }
                }
                mmr0 mmr0Var2 = new mmr0("feature_id", (String) oiVar.c);
                mmr0 mmr0Var3 = new mmr0("num_queries", String.valueOf(arrayList2.size()));
                ArrayList arrayList4 = new ArrayList(q7h.U(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((rv00) it3.next()).a);
                }
                Map mapJ = sqg0.J(new mmr0[]{mmr0Var2, mmr0Var3, new mmr0("num_uris", String.valueOf(o7h.j0(arrayList4).size())), new mmr0("extension_kinds", o7h.y0(listZ0, ",", (String) null, (String) null, (iu30) null, 62)), new mmr0("notify_on_changes", String.valueOf(z))});
                kj41 kj41VarU = ihp0Var.u("metadata.observe");
                kj41VarU.c(mapJ);
                nif1 nif1VarL = ihp0.l(ihp0Var, "metadata.observe", oiVar, 4);
                for (Map.Entry entry : mapJ.entrySet()) {
                    nif1VarL.setAttribute((String) entry.getKey(), (String) entry.getValue());
                }
                kj41 kj41Var = kj41VarU;
                nif1 nif1Var = nif1VarL;
                nif1Var.c((Long) null, "await_final_response");
                nif1Var.c((Long) null, "proto_serialize");
                try {
                    ObserveRequest observeRequestA = zu00Var.a(oiVar);
                    AtomicInteger atomicInteger = new AtomicInteger(0);
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                    Observable map = zu00Var.a.callStream("spotify.mdata_esperanto.proto.MetadataService", "Observe", observeRequestA).map(o810.P0).doOnSubscribe(new lgr(nif1Var, atomicBoolean, (byte) 17)).doOnNext(new y43(atomicBoolean2, atomicInteger, nif1Var, atomicBoolean, (byte) 6)).map(new uny(atomicBoolean2, zu00Var, nif1Var, (byte) 18));
                    djx djxVar = new djx(atomicBoolean2, nif1Var, kj41Var, (byte) 14);
                    return map.doOnNext(new xu(djxVar, (byte) 28)).doOnError(new cfs(djxVar, (byte) 26)).doFinally(new yu00(atomicBoolean, nif1Var, atomicInteger, atomicBoolean2, kj41Var));
                } finally {
                    nif1Var.e("proto_serialize");
                }
            case 5:
                p811 p811Var = (p811) this.b;
                Object obj = p811Var.a;
                return (obj == null || (singleJust = Single.just(obj)) == null) ? ((Single) this.c).doOnSuccess(new wrk(p811Var, (byte) 3)) : singleJust;
            case 6:
                hc51 hc51Var = (hc51) this.b;
                ac51 ac51Var = hc51Var.e(jh31.T0).a.g;
                g931 g931Var = new g931(new AtomicBoolean(), hc51Var, ac51Var != null ? Long.valueOf(ac51Var.b) : null, (byte) 23);
                return Single.defer(new dfh0((Function0) this.c, (byte) 0)).doOnSuccess(new cfh0(g931Var, (byte) 0)).doOnError(new cfh0(g931Var, (byte) 1)).doOnDispose(new wqd0(g931Var, (byte) 6));
            case 7:
                cvm0 cvm0Var = (cvm0) this.b;
                return cvm0Var.a.b(new oi(cvm0Var.b, false, new kim0((g4r) this.c, (byte) 1)));
            case 8:
                s880 s880Var = (s880) this.b;
                k5o0 k5o0Var = (k5o0) this.c;
                CompletableSource completableFromAction = new CompletableFromAction(new tt60(s880Var, k5o0Var, (byte) 8));
                Completable completableIgnoreElement = ((w9u0) s880Var.b).a(new l9u0()).ignoreElement();
                mzr0 mzr0Var = (mzr0) s880Var.d;
                return Completable.m(new CompletableSource[]{completableFromAction, ((jo91) s880Var.e).b() ? ((ip91) s880Var.c).j() : completableIgnoreElement.c(j2h1.D((q8n) mzr0Var.d, new p651(mzr0Var, k5o0Var.a, k5o0Var.b, k5o0Var.c, (lnm) null, (byte) 17)))});
            case 9:
                n3q0 n3q0Var = (n3q0) this.b;
                Set set = (Set) this.c;
                ArrayList arrayList5 = new ArrayList(q7h.U(set, 10));
                Iterator it4 = set.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(new l3q0((String) it4.next()));
                }
                n3q0Var.d = o7h.p1(arrayList5);
                n3q0Var.e = null;
                return CompletableEmpty.a;
            case 10:
                n3q0 n3q0Var2 = (n3q0) this.b;
                n3q0Var2.e = new o0g(new l3q0((String) this.c), n3q0Var2.a.e() + 3600000, (byte) 9);
                return CompletableEmpty.a;
            case 11:
                return ((vht0) this.b).b.f((String) this.c).o();
            case 12:
                Set set2 = (Set) this.b;
                ArrayList arrayList6 = new ArrayList();
                for (Object obj2 : set2) {
                    if (nhc1.Y((String) obj2, "spotify:episode", false)) {
                        arrayList6.add(obj2);
                    }
                }
                return arrayList6.isEmpty() ? Observable.empty() : ((fjx0) this.c).a.b(arrayList6, fjx0.d);
            case 13:
                gx01 gx01Var = (gx01) this.b;
                Observable observableMerge = Observable.merge(gx01Var.l, gx01Var.m.startWithItem(xw01.a).delay(10000L, TimeUnit.MILLISECONDS, gx01Var.f));
                p811 p811Var2 = (p811) this.c;
                return observableMerge.scan(p811Var2.a, new bb01(gx01Var, (byte) 2)).doOnNext(new wrk(p811Var2, (byte) 7));
            case 14:
                z6x z6xVar = z6x.a;
                Object obj3 = ((p811) this.b).a;
                z6x z6xVar2 = (List) (((List) obj3).isEmpty() ? null : obj3);
                if (z6xVar2 != null) {
                    z6xVar = z6xVar2;
                }
                ip91 ip91Var = (ip91) this.c;
                Observable observableMerge2 = Observable.merge(ip91Var.o, ip91Var.l.startWithItem(rih1.a).map(wbx0.O0).delay(10000L, TimeUnit.MILLISECONDS, ((ip91) this.c).h));
                ip91 ip91Var2 = (ip91) this.c;
                synchronized (ip91Var2.m) {
                    listL1 = o7h.l1(ip91Var2.n);
                    ip91Var2.n.clear();
                }
                return observableMerge2.startWithIterable(o7h.O0(wo91.a, listL1)).scan(z6xVar, new ep31((ip91) this.c, (byte) 18)).filter(new dgb((byte) 25));
            case 15:
                return ((uu00) this.b).b(new oi("SubscriberStateEventSource", false, new hqa1((String) this.c, (byte) 7)));
            case 16:
                lvc1 lvc1Var = (lvc1) this.b;
                a780 a780Var = (a780) lvc1Var.c;
                String str5 = (String) this.c;
                lwz0 lwz0Var = (lwz0) a780Var.a.get(str5);
                if (lwz0Var == null) {
                    return ((eeg1) lvc1Var.b).a(str5).flatMap(new y281(lvc1Var, (byte) 25)).doOnSuccess(new z0u0(lvc1Var, str5, b));
                }
                qzq qzqVar = a780Var.a;
                qzqVar.remove(str5);
                qzqVar.put(str5, lwz0Var);
                return Single.just(lwz0Var);
            default:
                y221 y221Var = ((j1l1) this.b).q;
                Uri uri = (Uri) this.c;
                y221Var.getClass();
                return Single.fromCallable(new e71(uri, y221Var, (byte) 19));
        }
    }
}
