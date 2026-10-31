package p;

import android.content.Context;
import android.view.View;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.protobuf.Int32Value;
import com.spotify.adsdisplay.browser.BreadcrumbException;
import com.spotify.base.java.logging.Logger;
import com.spotify.identity.proto.v3.Identity;
import com.spotify.identity.proto.v3.Identity$KidProfile;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.Restrictions;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function5;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.completable.CompletableToSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableCombineLatest;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ep31 implements Function, Producer, Function5, ya, jvd, BiFunction, i2q0, ObservableOnSubscribe, sh {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ ep31(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public CompletableToSingle a(c841 c841Var) {
        return ((ya10) this.b).b(c841Var).x(Boolean.TRUE);
    }

    public boolean accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 12:
                ksk kskVar = (ksk) obj;
                return (((f771) obj2).a.o(kskVar.a) || kskVar.c == le30.U0) ? false : true;
            default:
                return ((bq4) obj2).a() && ((ksk) obj).c == le30.h1;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: io.reactivex.rxjava3.exceptions.CompositeException */
    public Object apply(Object obj) throws CompositeException {
        k560 k560Var;
        FlowableMap flowableMapI;
        byte b = this.a;
        byte b2 = 24;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                throw new CompositeException(new Throwable[]{(Throwable) obj, (BreadcrumbException) obj2});
            case 2:
            case 5:
            case 6:
            case 7:
            case 11:
            case 12:
            case 16:
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
            default:
                return new CompletableFromAction(new dkb1((r0d1) obj2, (Boolean) obj, (byte) 3));
            case 3:
                wa41 wa41Var = (wa41) obj;
                zq80 zq80VarP = Int32Value.p();
                zq80VarP.n(wa41Var.d);
                rn70 rn70VarN = Identity$KidProfile.n();
                rn70VarN.q(zq80VarP);
                Identity$KidProfile identity$KidProfile = (Identity$KidProfile) rn70VarN.build();
                sn70 sn70VarO = Identity.KidProfileUpdateRequest.o();
                sn70VarO.n(identity$KidProfile);
                Identity.KidProfileUpdateRequest kidProfileUpdateRequestBuild = sn70VarO.build();
                String str = wa41Var.c;
                kidProfileUpdateRequestBuild.getClass();
                return ((co70) obj2).c(str, kidProfileUpdateRequestBuild).d(Observable.just(new lb41(true))).onErrorReturn(m9x0.i);
            case 4:
                tw41 tw41Var = (tw41) obj;
                ad7 ad7Var = (ad7) obj2;
                return new ed7(ad7Var.e, (String) null, tw41Var.b, !ihc1.y0(ad7Var.f), tw41Var.a, tw41Var.c, 2);
            case 8:
                dwi0 dwi0Var = (dwi0) obj;
                xqx0 xqx0Var = (xqx0) obj2;
                return Observable.just(new lrx0(new wvi0(xqx0Var.b, dwi0Var.c - 1, xqx0Var.c, dwi0Var.e)), new xrx0(dwi0Var));
            case 9:
                ln41 ln41Var = (ln41) obj;
                if (ln41Var instanceof jn41) {
                    return new xv21((th61) obj2);
                }
                if (ln41Var.equals(kn41.a)) {
                    return vv21.a;
                }
                eg.o();
                return null;
            case 10:
                ob0 ob0Var = (tb0) obj;
                fk61 fk61Var = (fk61) obj2;
                if (!(ob0Var instanceof rb0)) {
                    return (CompletableSource) fk61Var.a.invoke();
                }
                vip0 vip0Var = fk61Var.c;
                ob0 ob0Var2 = (rb0) ob0Var;
                if (ob0Var2 instanceof ob0) {
                    k560Var = ob0Var2.a;
                } else {
                    if (!(ob0Var2 instanceof sb0)) {
                        eg.o();
                        return null;
                    }
                    k560Var = ((sb0) ob0Var2).a;
                }
                return ((Observable) vip0Var.invoke(k560Var)).flatMapCompletable(new dr41(fk61Var, (byte) 8));
            case 13:
                mz01 mz01Var = (mz01) obj;
                yon yonVar = (yon) obj2;
                String str2 = mz01Var.b;
                q7j0 q7j0Var = (q7j0) yonVar.d;
                Single map = (q7j0.c(str2) ? rqt0.F(o6x.a, new lm61(yonVar, str2, (lnm) null, (byte) 24)).map(icx0.X) : q7j0Var.b(str2) ? Single.just(Boolean.TRUE) : Single.just(Boolean.FALSE)).map(new n381(mz01Var, yonVar, (byte) 2));
                q7j0Var.a();
                return map.onErrorReturnItem("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ").flatMapCompletable(new nn61(yonVar, mz01Var, false, (byte) 14)).w();
            case 14:
                return new CompletableFromAction(new tt60((kt91) obj2, (pi91) obj, b2)).w();
            case 15:
                return new zp81(((ar81) obj2).g.n, new m231((Throwable) obj));
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                mmr0 mmr0Var = (mmr0) obj;
                List list = (List) mmr0Var.a;
                if (!((Boolean) mmr0Var.b).booleanValue() || list.isEmpty()) {
                    return Flowable.I(b7x.a);
                }
                HashSet hashSet = new HashSet();
                ArrayList<ContextTrack> arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (hashSet.add(((ContextTrack) obj3).uri())) {
                        arrayList.add(obj3);
                    }
                }
                ac10 ac10Var = (ac10) obj2;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (ContextTrack contextTrack : arrayList) {
                    Float fB = ac10.b(contextTrack);
                    if (fB == null || u890.h(fB, 1.0f)) {
                        flowableMapI = Flowable.I(eqa1.a);
                    } else {
                        String strUri = contextTrack.uri();
                        flowableMapI = ((uu00) ac10Var.b).b(new oi((String) ac10Var.d, false, new hqa1(strUri, (byte) 0))).takeUntil(r6x0.Q0).map(new vdn1(strUri, (byte) 18)).doOnError(iqa1.b).onErrorReturnItem(Float.valueOf(0.0f)).toFlowable(BackpressureStrategy.d).J(new ks21(fB, (byte) 26));
                    }
                    arrayList2.add(flowableMapI.J(new dr41(contextTrack, (byte) 18)));
                }
                r5x0 r5x0Var = r5x0.Q0;
                int i = Flowable.a;
                ObjectHelper.a(i, "bufferSize");
                return new FlowableCombineLatest(arrayList2, r5x0Var, i);
            case 22:
                return new yvg1(Boolean.TRUE, (th61) obj, ((oob1) obj2).c);
            case 23:
                return Integer.valueOf(((Number) ((dzb1) ((w2s) obj2).i).b.invoke()).intValue() + ((Integer) obj).intValue());
            case 25:
                ecc1 ecc1Var = (ecc1) obj;
                g2x0 g2x0Var = (g2x0) obj2;
                lik1 lik1Var = ecc1Var.d;
                String str3 = ecc1Var.f;
                String str4 = ecc1Var.e;
                return Observable.create(new ycc1((f33) g2x0Var.c, (str4 == null || str4.length() == 0 || str3 == null || str3.length() == 0) ? new o13(ecc1Var.c, lik1Var) : new p13(str4, str3, lik1Var), (byte) 23)).onErrorReturn(qzs0.f).map(new dr41(g2x0Var, (byte) 25));
            case 26:
                Logger.e((Throwable) obj, "Assisted Curation: Failed to fetch next page of audiobook recommendations", new Object[0]);
                return (v491) obj2;
        }
    }

    public Observable b(q3t0 q3t0Var, List list) {
        fv81 fv81Var = (fv81) this.b;
        return up30.u(vz01.c(fv81Var.g, fv81Var.e, fv81Var.f.e, gzy.e, q3t0Var.a, (Set) null, 48), list).map(fv81Var.h).map(new n381(fv81Var, q3t0Var, (byte) 9)).toObservable();
    }

    public Observable c(i iVar, ArrayList arrayList) {
        String uri = iVar.getUri();
        String name = iVar.getName();
        fv81 fv81Var = (fv81) this.b;
        q3t0 q3t0Var = new q3t0(uri, name, fv81Var.c.b());
        fv81Var.i = dm61.x0(q3t0Var, fv81Var.i);
        return b(q3t0Var, arrayList);
    }

    public Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ContextTrack contextTrack = (ContextTrack) obj;
        fvf1 fvf1Var = (fvf1) obj2;
        agv agvVar = (agv) obj5;
        String strUri = contextTrack.uri();
        long j = fvf1Var.a;
        long j2 = fvf1Var.b;
        boolean zIsEmpty = ((Restrictions) obj3).disallowSeekingReasons().isEmpty();
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        jn4 jn4Var = ((qo51) this.b).e;
        iu30 iu30Var = (iu30) olv.a.get(l4o1.a0(contextTrack, "context_uri"));
        return new f0g1(strUri, j, j2, zIsEmpty, false, zBooleanValue, iu30Var != null ? (yzf1) iu30Var.invoke(jn4Var) : null, agvVar, 16);
    }

    public boolean e() {
        return ((xa91) this.b).a();
    }

    public Observable f(i iVar, ArrayList arrayList, mvd mvdVar) {
        hv81 hv81Var = (hv81) mvdVar;
        fv81 fv81Var = (fv81) this.b;
        vz01 vz01Var = fv81Var.g;
        String uri = iVar.getUri();
        String str = fv81Var.e;
        Set setSingleton = Collections.singleton(hv81Var.a.a);
        int i = fv81Var.f.d;
        List list = hv81Var.b.a;
        ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((i) it.next()).getUri());
        }
        return up30.u(vz01Var.b(str, i, gzy.e, uri, setSingleton, o7h.p1(up30.w(o7h.N0(hv81Var.d, arrayList2)))), arrayList).map(fv81Var.h).map(new ke71(hv81Var, iVar, (byte) 17)).toObservable();
    }

    public Observable g(List list, String str, mvd mvdVar) {
        hv81 hv81Var = (hv81) mvdVar;
        fv81 fv81Var = (fv81) this.b;
        vz01 vz01Var = fv81Var.g;
        String str2 = fv81Var.e;
        String str3 = hv81Var.a.a;
        Set setSingleton = Collections.singleton(str3);
        int i = fv81Var.f.c;
        List list2 = hv81Var.b.a;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((i) it.next()).getUri());
        }
        return up30.u(vz01Var.b(str2, i, gzy.e, str3, setSingleton, o7h.p1(up30.w(o7h.N0(hv81Var.d, arrayList)))), list).map(fv81Var.h).map(new dr41(hv81Var, (byte) 14)).toObservable();
    }

    public Object get() {
        return new SchedulerWorkRunner(((c751) this.b).P0);
    }

    public yrd l(mvd mvdVar) {
        hv81 hv81Var = (hv81) mvdVar;
        fv81 fv81Var = (fv81) this.b;
        String str = hv81Var.a.a;
        pud pudVar = fv81Var.j;
        String strF = f4i1.f(pudVar.a, "/", str);
        pud pudVar2 = fv81Var.j;
        ivd ivdVar = hv81Var.b;
        List listSingletonList = Collections.singletonList(new avd("items", (String) null, (yud) null, new cvd(ivdVar.a)));
        boolean z = ivdVar.b;
        vtd vtdVar = new vtd(pudVar.a, "");
        Context context = fv81Var.d;
        el51 el51Var = ivdVar.c;
        return new yrd(context.getString(2131952486, el51Var != null ? el51Var.b : null), (String) null, (String) null, strF, pudVar2, listSingletonList, z, vtdVar, hv81Var.c, 14);
    }

    public Observable n(String str, List list) {
        fv81 fv81Var = (fv81) this.b;
        if (fv81Var.i.isEmpty()) {
            Observable observableJust = Observable.just(b7x.a);
            observableJust.getClass();
            return observableJust;
        }
        Set set = fv81Var.i;
        ArrayList arrayList = new ArrayList(q7h.U(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(b((q3t0) it.next(), list));
        }
        Observable observableCombineLatest = Observable.combineLatest(arrayList, b4x0.Z);
        observableCombineLatest.getClass();
        return observableCombineLatest;
    }

    public void onComplete(Task task) {
        pya1 pya1Var = (pya1) this.b;
        if (task.j()) {
            for (SplitInstallSessionState splitInstallSessionState : (List) task.g()) {
                if (splitInstallSessionState.status() == 2) {
                    pya1Var.c.cancelInstall(splitInstallSessionState.sessionId()).b(new esa1(pya1Var, splitInstallSessionState, (byte) 3));
                }
            }
        }
    }

    public boolean r(View view) {
        ((qvs) this.b).invoke(fzf1.e);
        return true;
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        c4c1 c4c1Var = (c4c1) this.b;
        c4c1Var.d.setStoryGestureListener(new b4c1(c4c1Var, observableEmitter, (byte) 0));
        g4c1 g4c1Var = c4c1Var.c;
        g4c1Var.setStoryEndListener$src_main_java_com_spotify_campaigns_storytelling_storytelling(new b4c1(c4c1Var, observableEmitter, (byte) 1));
        g4c1Var.setCloseListener$src_main_java_com_spotify_campaigns_storytelling_storytelling(new n1r(observableEmitter, (byte) 7));
        g4c1Var.setMuteListener$src_main_java_com_spotify_campaigns_storytelling_storytelling(new rlv0(observableEmitter, (byte) 1));
        g4c1Var.setPauseListener$src_main_java_com_spotify_campaigns_storytelling_storytelling(new rlv0(observableEmitter, (byte) 2));
        g4c1Var.setShareListener$src_main_java_com_spotify_campaigns_storytelling_storytelling(new n1r(observableEmitter, (byte) 8));
        g4c1Var.setNextListener$src_main_java_com_spotify_campaigns_storytelling_storytelling(new n1r(observableEmitter, (byte) 9));
        g4c1Var.setPreviousListener$src_main_java_com_spotify_campaigns_storytelling_storytelling(new n1r(observableEmitter, (byte) 10));
        observableEmitter.setCancellable(new ci0(c4c1Var, (byte) 9));
    }

    public Object apply(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                Collection collectionO0 = (List) obj;
                vo91 vo91Var = (yo91) obj2;
                long jB = ((ip91) obj3).a.b();
                if (vo91Var instanceof vo91) {
                    collectionO0 = o7h.O0(vo91Var.a, collectionO0);
                } else if (vo91Var instanceof xo91) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : collectionO0) {
                        if (!u890.j(((zo91) obj4).a, ((xo91) vo91Var).a)) {
                            arrayList.add(obj4);
                        }
                    }
                    collectionO0 = arrayList;
                } else if (!(vo91Var instanceof wo91)) {
                    eg.o();
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : collectionO0) {
                    if (((zo91) obj5).b + 10000 > jB) {
                        arrayList2.add(obj5);
                    }
                }
                return arrayList2;
            default:
                return new CompletableFromAction(new wf0((mtf1) obj3, (String) obj, (fvf1) obj2, (byte) 25));
        }
    }
}
