package p;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.spotify.authenticated_sessions.session_termination.proto.EsSessionTermination;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import com.spotify.prefs.esperanto.proto.EsPrefs;
import com.spotify.signup.signup.v2.proto.ClientInfo;
import com.spotify.support.assertion.Assertion;
import com.spotify.trending.v1.TrendingLocationSignalPayload;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nl51 implements qiw, ya, Function, jvd, t6b0, ObservableOnSubscribe, Predicate, sh {
    public final /* synthetic */ byte a;
    public Object b;

    public nl51(Context context) {
        boolean zIsEmpty;
        this.a = (byte) 23;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.b = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                e.getMessage();
            }
        }
    }

    public static int e(Context context, pwg1 pwg1Var) {
        Bundle extras = ((Intent) pwg1Var.b.a().b).getExtras();
        Integer num = extras == null ? null : (Integer) extras.get("androidx.browser.customtabs.extra.COLOR_SCHEME");
        if (num == null || num.intValue() == 0) {
            return (context.getResources().getConfiguration().uiMode & 48) == 32 ? 2 : 1;
        }
        return num.intValue();
    }

    public boolean accept(Object obj) {
        return ((ksk) obj).b && ((d2f1) this.b).f;
    }

    public Object apply(Object obj) {
        yi01 yi01Var = null;
        switch (this.a) {
            case 8:
                f7h f7hVar = (f7h) ((Map) obj).get(((e381) this.b).a);
                return Boolean.valueOf(f7hVar != null ? f7hVar.a : false);
            case 12:
                yig yigVarO = ClientInfo.o();
                yigVarO.q(kn81.a);
                ar81 ar81Var = (ar81) this.b;
                yigVarO.t(ar81Var.b.a.a());
                yigVarO.s(ar81Var.d);
                yigVarO.u();
                yigVarO.n(Collections.singletonList(wld.CAPABILITY_WEB_INTERACTION_V1));
                yigVarO.r(ar81Var.e);
                return new mp81((ClientInfo) yigVarO.build());
            case 16:
                hxe0 hxe0Var = (hxe0) obj;
                bk8 bk8Var = hxe0Var.d;
                l3f0 l3f0Var = hxe0Var.c;
                if (l3f0Var != null && bk8Var != null) {
                    hj01 hj01Var = ((mq91) this.b).a;
                    yi01Var = new yi01(hj01Var.n, hj01Var.c(v11.a(l3f0Var), bk8Var.name()));
                }
                return ((Single) hxe0Var.b.k.invoke(hxe0Var.a, yi01Var)).map(new up41(hxe0Var, (byte) 15)).onErrorReturn(njx0.O0);
            case 17:
                return new w3a1(((x1a1) this.b).a, (sy21) null);
            case 24:
                return ((EsPrefs.PrefValues) obj).o() == ((EsPrefs.SetParams) this.b).n() ? CompletableEmpty.a : Completable.j(new Assertion.RecoverableAssertionError("Failed to save ContextPlayerConfiguration preferences", (String) null));
            default:
                mtf1 mtf1Var = (mtf1) this.b;
                return new FlowableTake(Flowable.h(mtf1Var.a, mtf1Var.a(), s9x0.S0).J(new lqc(mtf1Var, (byte) 27)));
        }
    }

    public jgb1 b() {
        c0g.x.getClass();
        return new jgb1("showPublishedPlaylists", 2131962008, null, 2131962007, null, null, null, null, cxo1.P0, ((pcl) this.b).a(), new ibd1(new xad1(46, false), new abd1(rc11.a.b(g981.class))), null, 73658);
    }

    public Observable c(i iVar, ArrayList arrayList) {
        String uri = iVar.getUri();
        String name = iVar.getName();
        gv81 gv81Var = (gv81) this.b;
        q3t0 q3t0Var = new q3t0(uri, name, gv81Var.b.b());
        gv81Var.h = dm61.x0(q3t0Var, gv81Var.h);
        return m(q3t0Var, arrayList);
    }

    public ArrayList d(List list, boolean z) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
        if (linkedHashSet == null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    int i = ((k581) obj).e;
                    if (i == 1 || i == 3) {
                        arrayList.add(obj);
                    }
                }
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet2.add(((k581) it.next()).a);
                }
                this.b = linkedHashSet2;
                linkedHashSet = linkedHashSet2;
            } else {
                linkedHashSet = w7x.a;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (linkedHashSet.contains(((k581) obj2).a)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public Observable f(i iVar, ArrayList arrayList, mvd mvdVar) {
        Observable observableJust;
        bkf1 bkf1Var = (bkf1) mvdVar;
        gv81 gv81Var = (gv81) this.b;
        Set set = s4b1.f;
        String str = bkf1Var.a;
        int iOrdinal = uic.x(str).c.ordinal();
        if (iOrdinal == 30 || iOrdinal == 44) {
            observableJust = Observable.just(bkf1Var.j(iVar, z6x.a));
        } else {
            o411 o411Var = gv81Var.d;
            Set setS0 = f46.S0(new String[]{iVar.getUri(), str});
            List list = bkf1Var.d.a;
            ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((i) it.next()).getUri());
            }
            observableJust = up30.t(o411.a(o411Var, gv81Var.g.d, (String) null, (String) null, o7h.p1(up30.x(o7h.N0(bkf1Var.e, o7h.N0(arrayList2, arrayList)))), setS0, 6), arrayList).map(new n381((Object) bkf1Var, (Object) iVar, (byte) 8));
        }
        observableJust.getClass();
        return observableJust;
    }

    public Observable g(List list, String str, mvd mvdVar) {
        bkf1 bkf1Var = (bkf1) mvdVar;
        gv81 gv81Var = (gv81) this.b;
        o411 o411Var = gv81Var.d;
        Set setSingleton = Collections.singleton(bkf1Var.a);
        int i = gv81Var.g.c;
        List list2 = bkf1Var.d.a;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((i) it.next()).getUri());
        }
        return up30.t(o411.a(o411Var, i, str, (String) null, o7h.p1(up30.x(o7h.N0(bkf1Var.e, arrayList))), setSingleton, 4), list).map(new up41(bkf1Var, (byte) 14));
    }

    public mdd1 h(Context context, String str) {
        IntentFilter intentFilter;
        IntentFilter intentFilter2;
        HashMap map = (HashMap) this.b;
        mdd1 mdd1Var = (mdd1) map.get(str);
        if (mdd1Var != null) {
            return mdd1Var;
        }
        boolean z = false;
        if (!s9g.a.contains(str) ? false : s9g.a(context.getPackageManager(), str, 380900000)) {
            mdd1 mdd1Var2 = new mdd1(true, true);
            map.put(str, mdd1Var2);
            return mdd1Var2;
        }
        ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(new Intent().setAction("android.support.customtabs.action.CustomTabsService").setPackage(str), 64);
        boolean z2 = (resolveInfoResolveService == null || (intentFilter2 = resolveInfoResolveService.filter) == null || !intentFilter2.hasCategory("androidx.browser.customtabs.category.NavBarColorCustomization")) ? false : true;
        if (resolveInfoResolveService != null && (intentFilter = resolveInfoResolveService.filter) != null && intentFilter.hasCategory("androidx.browser.customtabs.category.ColorSchemeCustomization")) {
            z = true;
        }
        mdd1 mdd1Var3 = new mdd1(z2, z);
        map.put(str, mdd1Var3);
        return mdd1Var3;
    }

    public r6b0 i(heg hegVar, ab11 ab11Var) {
        if (!hegVar.equals(dia0.b)) {
            return null;
        }
        ((l811) this.b).a = true;
        return null;
    }

    public synchronized upb j(String str, String str2) {
        return upb.a(((SharedPreferences) this.b).getString(str + "|T|" + str2 + "|*", null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(nhe0 nhe0Var, String str, onm onmVar) {
        ru51 ru51Var;
        if (onmVar instanceof ru51) {
            ru51Var = (ru51) onmVar;
            int i = ru51Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ru51Var.c = i - Integer.MIN_VALUE;
            } else {
                ru51Var = new ru51(this, onmVar);
            }
        } else {
            ru51Var = new ru51(this, onmVar);
        }
        Object obj = ru51Var.a;
        d9n d9nVar = d9n.a;
        int i2 = ru51Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                Integer num = nhe0Var.c;
                if (num != null) {
                    vf40.c = String.valueOf(num.intValue());
                    bpb1 bpb1Var = vf40.b;
                    Boolean bool = Boolean.TRUE;
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, bool);
                }
                hpg1 hpg1VarN = TrendingLocationSignalPayload.n();
                hpg1VarN.n(nhe0Var.a);
                String str2 = nhe0Var.b;
                if (str2 == null) {
                    str2 = "";
                }
                hpg1VarN.s(str2);
                Integer num2 = nhe0Var.c;
                hpg1VarN.q(num2 != null ? num2.intValue() : 0);
                TrendingLocationSignalPayload trendingLocationSignalPayload = (TrendingLocationSignalPayload) hpg1VarN.build();
                ifl1 ifl1Var = (ifl1) this.b;
                trendingLocationSignalPayload.getClass();
                ru51Var.c = 1;
                if (ifl1Var.e(str, trendingLocationSignalPayload, ru51Var) == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Object obj2 = ((e331) obj).a;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            bpb1 bpb1Var2 = vf40.b;
            Boolean bool2 = Boolean.FALSE;
            bpb1Var2.getClass();
            bpb1Var2.m((Object) null, bool2);
            vf40.c = null;
        }
        return rih1.a;
    }

    public yrd l(mvd mvdVar) {
        bkf1 bkf1Var = (bkf1) mvdVar;
        ivd ivdVar = bkf1Var.d;
        String str = bkf1Var.a;
        String string = bkf1Var.b;
        gv81 gv81Var = (gv81) this.b;
        Context context = gv81Var.c;
        Set set = s4b1.f;
        int iOrdinal = uic.x(str).c.ordinal();
        if (iOrdinal == 30 || iOrdinal == 44) {
            string = context.getString(2131952487, string);
        } else if (iOrdinal == 926) {
            string = context.getString(2131952486, string);
        }
        string.getClass();
        return new yrd(string, (String) null, (String) null, gv81Var.l(str), gv81Var.j, Collections.singletonList(new avd("items", (String) null, (yud) null, new cvd(ivdVar.a))), ivdVar.b, new vtd(gv81Var.j.a, str), bkf1Var.c, 12);
    }

    public Observable m(q3t0 q3t0Var, List list) {
        Observable observable;
        Observable observable2;
        t9w t9wVar = t9w.i;
        mpi1 mpi1Var = mpi1.f;
        gv81 gv81Var = (gv81) this.b;
        o411 o411Var = gv81Var.d;
        String str = q3t0Var.a;
        int i = gv81Var.g.e;
        o411Var.getClass();
        Observable observableT = up30.t(o411Var.b(i, "", (String) null, Collections.singleton(str), w7x.a), list);
        gid gidVar = gv81Var.e;
        String str2 = q3t0Var.a;
        Set setP1 = o7h.p1(up30.x(list));
        gidVar.getClass();
        Set set = s4b1.f;
        int iOrdinal = uic.x(str2).c.ordinal();
        if (iOrdinal != 30) {
            observable = iOrdinal != 926 ? Observable.error(new IllegalArgumentException("Unsupported uri ".concat(str2))) : ((sjj0) gidVar.b).b(str2).map(fmv.e).flatMap(new gid(gidVar, setP1, (byte) 26)).onErrorResumeNext(mpi1Var).toObservable();
        } else {
            observable = Single.just(str2).flatMap(new gid(gidVar, setP1, (byte) 26)).onErrorResumeNext(mpi1Var).toObservable();
        }
        em3 em3Var = gv81Var.f;
        Set setP2 = o7h.p1(up30.x(list));
        em3Var.getClass();
        int iOrdinal2 = uic.x(str2).c.ordinal();
        if (iOrdinal2 != 44) {
            observable2 = iOrdinal2 != 926 ? Observable.error(new IllegalArgumentException("Unsupported uri ".concat(str2))) : ((sjj0) em3Var.b).b(str2).map(bya0.h).flatMap(new em3(em3Var, setP2, (byte) 16)).onErrorResumeNext(t9wVar).toObservable();
        } else {
            observable2 = Single.just(str2).flatMap(new em3(em3Var, setP2, (byte) 16)).onErrorResumeNext(t9wVar).toObservable();
        }
        return Observable.combineLatest(observableT, observable, observable2, new nn61((Object) gv81Var, (Object) q3t0Var, false, (byte) 21));
    }

    public Observable n(String str, List list) {
        gv81 gv81Var = (gv81) this.b;
        if (gv81Var.h.isEmpty()) {
            Observable observableJust = Observable.just(b7x.a);
            observableJust.getClass();
            return observableJust;
        }
        Set set = gv81Var.h;
        ArrayList arrayList = new ArrayList(q7h.U(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(m((q3t0) it.next(), list));
        }
        Observable observableCombineLatest = Observable.combineLatest(arrayList, a4x0.Z);
        observableCombineLatest.getClass();
        return observableCombineLatest;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object o(String str, String str2, onm onmVar) {
        j461 j461Var;
        Boolean m231Var;
        if (onmVar instanceof j461) {
            j461Var = (j461) onmVar;
            int i = j461Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                j461Var.c = i - Integer.MIN_VALUE;
            } else {
                j461Var = new j461(this, onmVar);
            }
        } else {
            j461Var = new j461(this, onmVar);
        }
        j461 j461Var2 = j461Var;
        Object objH = j461Var2.a;
        int i2 = j461Var2.c;
        try {
            if (i2 == 0) {
                hm5.M(objH);
                j0a1 j0a1Var = (j0a1) this.b;
                j461Var2.c = 1;
                objH = j0a1Var.h(str2, str, i0a1.a, new wz91(str), j461Var2);
                d9n d9nVar = d9n.a;
                if (objH == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objH);
            }
            m231Var = (Boolean) objH;
            m231Var.getClass();
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA == null) {
            return !m231Var.booleanValue() ? new m231(new IllegalStateException("Message request was not sent")) : rih1.a;
        }
        return new m231(thA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(String str, onm onmVar) {
        fi61 fi61Var;
        if (onmVar instanceof fi61) {
            fi61Var = (fi61) onmVar;
            int i = fi61Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fi61Var.c = i - Integer.MIN_VALUE;
            } else {
                fi61Var = new fi61(this, onmVar);
            }
        } else {
            fi61Var = new fi61(this, onmVar);
        }
        Object objI0 = fi61Var.a;
        int i2 = fi61Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objI0);
                jn7 jn7Var = (jn7) this.b;
                if (ihc1.y0(str)) {
                    throw new IllegalArgumentException("username must not be blank");
                }
                mrz mrzVarN = EsSessionTermination.SessionReference.n();
                mrzVarN.n(str);
                EsSessionTermination.SessionReference sessionReferenceBuild = mrzVarN.build();
                nrz nrzVarN = EsSessionTermination.TerminateSessionRequest.n();
                nrzVarN.n(sessionReferenceBuild);
                EsSessionTermination.TerminateSessionRequest terminateSessionRequestBuild = nrzVarN.build();
                fi61Var.c = 1;
                objI0 = jn7Var.I0(terminateSessionRequestBuild, fi61Var);
                d9n d9nVar = d9n.a;
                if (objI0 == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objI0);
            }
            EsSessionTermination.TerminateSessionResult terminateSessionResult = (EsSessionTermination.TerminateSessionResult) objI0;
            int iO = terminateSessionResult.o();
            int i3 = iO == 0 ? -1 : ei61.a[l1d.C(iO)];
            if (i3 == 1) {
                return rih1.a;
            }
            if (i3 == 2) {
                hhg1.n(l1d.m("Session termination request was rejected: ", terminateSessionResult.n().getMessage()));
                return null;
            }
            if (i3 != 3) {
                eg.o();
                return null;
            }
            eg.m("Session termination response did not contain a result");
            return null;
        } catch (CancellationException e) {
            op71.x(fi61Var.getContext());
            k220.p("Session termination transport failed", e);
            return null;
        }
    }

    public fuo1 q(ozc1 ozc1Var, String str, String str2, byte[] bArr) {
        boolean zContainsKey;
        byte[] bArrR = rqo1.r(bArr, cuo1.A(str, str2, ozc1Var.a, ozc1Var.c));
        if (bArrR == null) {
            return new f0d1(vzc1.b);
        }
        if (!MessageDigest.isEqual(bArrR, ozc1Var.b)) {
            return new f0d1(uzc1.b);
        }
        hp91 hp91Var = (hp91) this.b;
        byte[] bArr2 = ozc1Var.a;
        synchronized (hp91Var) {
            hp91Var.h();
            zContainsKey = ((LinkedHashMap) hp91Var.c).containsKey(new zzc1(bArr2));
        }
        if (zContainsKey) {
            return new f0d1(yzc1.b);
        }
        hp91 hp91Var2 = (hp91) this.b;
        byte[] bArr3 = ozc1Var.a;
        synchronized (hp91Var2) {
            hp91Var2.h();
            zzc1 zzc1Var = new zzc1(bArr3);
            if (!((LinkedHashMap) hp91Var2.c).containsKey(zzc1Var)) {
                ((LinkedHashMap) hp91Var2.c).put(zzc1Var, Long.valueOf(((yqg) hp91Var2.b).a()));
                if (((LinkedHashMap) hp91Var2.c).size() > 10000) {
                    Iterator it = ((LinkedHashMap) hp91Var2.c).entrySet().iterator();
                    it.next();
                    it.remove();
                }
            }
        }
        return new g0d1(ozc1Var.c);
    }

    public boolean r(View view) {
        ((View) this.b).performClick();
        return true;
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        ConnectivityManager.NetworkCallback lu4Var = new lu4(observableEmitter, (byte) 5);
        r3b1 r3b1Var = (r3b1) this.b;
        r3b1Var.a.registerDefaultNetworkCallback(lu4Var);
        observableEmitter.setCancellable(new pc6(r3b1Var, lu4Var, (byte) 11));
    }

    public boolean test(Object obj) {
        return ((String) obj).equals(((vsr0) this.b).a);
    }

    public void v(Object obj) {
        String string;
        ly31 ly31Var = (ly31) obj;
        e061 e061Var = (e061) this.b;
        l060 l060Var = e061Var.h;
        Resources resources = e061Var.a.getContext().getResources();
        if (ly31Var.equals(jy31.a)) {
            string = resources.getQuantityString(2131820722, 0, 0);
        } else if (ly31Var instanceof ky31) {
            int i = ((ky31) ly31Var).a;
            string = resources.getQuantityString(2131820722, i, Integer.valueOf(i));
        } else {
            if (!ly31Var.equals(iy31.a)) {
                eg.o();
                return;
            }
            string = resources.getString(2131958374);
        }
        l060 l060Var2 = new l060(l060Var.a, string, l060Var.c, l060Var.d);
        dtw dtwVar = e061Var.g;
        if (dtwVar != null) {
            dtwVar.f(l060Var2);
        }
    }

    public void a() {
    }

    public /* synthetic */ nl51(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public nl51(ifl1 ifl1Var, vf40 vf40Var) {
        this.a = (byte) 1;
        this.b = ifl1Var;
    }

    public nl51(CallbackRouter callbackRouter) {
        this.a = (byte) 5;
        this.b = new jn7(new CosmosCoroutineTransport(new q7v0(callbackRouter, (byte) 3)));
    }
}
