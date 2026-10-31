package p;

import android.icu.text.SimpleDateFormat;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.google.protobuf.h;
import com.spotify.base.java.logging.Logger;
import com.spotify.carmobile.cardetection.events.proto.CarDetectionEvent;
import com.spotify.externalintegration.loggingservice.events.proto.ExternalAccessoryRemoteError;
import com.spotify.libs.bluetooth.events.proto.BluetoothLowEnergyStartScanningFailed;
import com.spotify.libs.connect.events.proto.ClientConnectEnvironment;
import com.spotify.login.phonenumbersignup.callingcode.CallingCodePickerActivity;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.LoggingData;
import com.spotify.mobius.MobiusLoop;
import com.spotify.player.model.ContextTrack;
import com.spotify.profile.editprofile.proto.Userprofileview;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.operators.completable.CompletableError;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import j$.time.Instant;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mba implements Consumer {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ mba(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:166:0x03ed A[LOOP:7: B:164:0x03e7->B:166:0x03ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:380:0x0825  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void accept(Object obj) {
        tb20 tb20Var;
        String str;
        ConcurrentHashMap concurrentHashMap;
        CallingCodePickerActivity callingCodePickerActivity;
        a layoutManager;
        ArrayList arrayList;
        Iterator it;
        List listZ0;
        klc klcVar;
        t0w t0wVar;
        Handler handler;
        Handler handler2;
        int i = 5;
        byte b = 2;
        Instant instantValueOf = null;
        boolean z = false;
        int i2 = 0;
        objArr = 0;
        Object[] objArr = 0;
        z = false;
        z = false;
        z = false;
        switch (this.a) {
            case 0:
                vu30 vu30Var = (vu30) this.b;
                pih0 pih0Var = pih0.c;
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "Unknown search error.";
                }
                vu30Var.invoke(pih0Var, message);
                return;
            case 1:
                ((rma) this.b).c = (qma) obj;
                return;
            case 2:
                mmr0 mmr0Var = (mmr0) obj;
                String str2 = (String) mmr0Var.a;
                rwu rwuVar = (rwu) mmr0Var.b;
                try {
                    ((hna) this.b).b(str2, rwuVar);
                    return;
                } finally {
                    rwuVar.a();
                }
            case 3:
                hza hzaVar = (hza) obj;
                boolean z2 = hzaVar.a;
                cxc0 cxc0Var = hzaVar.b;
                kza kzaVar = (kza) this.b;
                BehaviorSubject behaviorSubject = kzaVar.l;
                boolean z3 = cxc0Var.i;
                kby kbyVar = cxc0Var.f;
                if (!z3 && !z2) {
                    nb20 nb20Var = tb20.Companion;
                    nfa0 nfa0Var = kzaVar.a;
                    nb20Var.getClass();
                    Map map = kbyVar.q;
                    tb20 tb20Var2 = xb20.a;
                    String str3 = (String) map.get("filter_pill_metadata");
                    if (str3 != null) {
                        try {
                            tb20Var = (tb20) nfa0Var.a(str3, nb20Var.serializer());
                        } catch (Exception unused) {
                            tb20Var = tb20Var2;
                        }
                        if (tb20Var != null) {
                            tb20Var2 = tb20Var;
                        }
                    }
                    List list = tb20Var2.b;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (((sb20) it2.next()).c) {
                            }
                        }
                        if (wm5.A(kbyVar.q) || !kzaVar.c.a.d()) {
                            z = true;
                        }
                    } else if (wm5.A(kbyVar.q)) {
                        z = true;
                    } else {
                        z = true;
                    }
                    break;
                }
                behaviorSubject.onNext(Boolean.valueOf(z));
                return;
            case 4:
                ((r0b) this.b).b.e();
                return;
            case 5:
                ((j8k1) this.b).V();
                return;
            case 6:
                ((fgb) this.b).d.a((ugn) obj);
                return;
            case 7:
                mjb mjbVar = (ojb) obj;
                if (mjbVar instanceof mjb) {
                    ii9 ii9Var = ((rjb) this.b).c;
                    mjb mjbVar2 = mjbVar;
                    if (mjbVar2.equals(hjb.a)) {
                        i = 1;
                    } else if (mjbVar2.equals(ijb.a)) {
                        i = 2;
                    } else if (!mjbVar2.equals(jjb.a)) {
                        if (mjbVar2.equals(kjb.a)) {
                            i = 3;
                        } else {
                            if (!mjbVar2.equals(ljb.a)) {
                                eg.o();
                                return;
                            }
                            i = 4;
                        }
                    }
                    t2j0 t2j0Var = ii9Var.a;
                    vjb vjbVarN = BluetoothLowEnergyStartScanningFailed.n();
                    int iC = l1d.C(i);
                    if (iC == 0) {
                        str = "alreadyStarted";
                    } else if (iC == 1) {
                        str = "bluetoothNotSupported";
                    } else if (iC == 2) {
                        str = "permissionsMissing";
                    } else if (iC == 3) {
                        str = "scannerUnavailable";
                    } else {
                        if (iC != 4) {
                            eg.o();
                            return;
                        }
                        str = "other";
                    }
                    vjbVarN.n(str);
                    t2j0Var.a(vjbVarN.build());
                    return;
                }
                return;
            case 8:
                gfb gfbVar = (gfb) obj;
                pfb pfbVar = gfbVar.b;
                tjb tjbVar = (tjb) this.b;
                if (gfbVar.a && pfbVar != null) {
                    objArr = 1;
                }
                q59 q59Var = tjbVar.c;
                if (objArr == 0) {
                    if (q59Var != null) {
                        q59Var.l().L();
                    }
                    tjbVar.c = null;
                    return;
                }
                if (u890.j(q59Var != null ? (pfb) q59Var.c : null, pfbVar)) {
                    return;
                }
                q59 q59Var2 = tjbVar.c;
                if (q59Var2 != null) {
                    q59Var2.l().L();
                }
                tjbVar.c = null;
                instantValueOf = pfbVar != null ? pfbVar.a : null;
                if (instantValueOf == null) {
                    instantValueOf = "";
                }
                m210 m210Var = new m210("bluetooth", "", instantValueOf, "bluetooth", "", "", "", "", "", "media_button", "");
                ham hamVar = (ham) tjbVar.a.a.b;
                v5u0 v5u0Var = (v5u0) ((it8) hamVar.b).b;
                c8o.l(v5u0Var);
                g510 g510Var = (g510) ((it8) hamVar.b).c;
                c8o.l(g510Var);
                rl1 rl1Var = new rl1(m210Var, v5u0Var, g510Var, (byte) 5);
                rl1Var.b = true;
                tjbVar.c = new q59(rl1Var, pfbVar, (byte) 16);
                return;
            case 9:
                ((zpb) this.b).b.onNext(new vpb((Throwable) obj));
                return;
            case 10:
                g1r g1rVar = (g1r) obj;
                boolean z4 = g1rVar.d;
                Long l = g1rVar.c;
                ebc ebcVar = (ebc) this.b;
                ReentrantLock reentrantLock = ebcVar.i;
                vku vkuVar = ebcVar.f;
                n36 n36Var = ebcVar.k;
                reentrantLock.lock();
                try {
                    n36Var.addLast(new h520(g1rVar));
                    if ((l != null ? l.longValue() : 0L) > 0) {
                        ebcVar.b = l;
                    }
                    ebcVar.l = g1rVar.g;
                    if (n36Var.c == 1) {
                        ebcVar.j.signal();
                        break;
                    }
                    return;
                } finally {
                    if (z4) {
                        vkuVar.c();
                    }
                    reentrantLock.unlock();
                }
            case 11:
                a5j0 a5j0Var = (a5j0) obj;
                BehaviorSubject behaviorSubject2 = ((emc) this.b).b;
                if ((a5j0Var instanceof w4j0) || (a5j0Var instanceof v4j0)) {
                    concurrentHashMap = (ConcurrentHashMap) behaviorSubject2.h();
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    concurrentHashMap.remove(a5j0Var.a().a);
                } else {
                    concurrentHashMap = (ConcurrentHashMap) behaviorSubject2.h();
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    concurrentHashMap.put(a5j0Var.a().a, yhm0.m(a5j0Var));
                }
                behaviorSubject2.onNext(concurrentHashMap);
                return;
            case 12:
                Uri uri = (Uri) obj;
                pmc pmcVar = (pmc) this.b;
                int i3 = pmc.Z1;
                if (((ijl1) pmcVar).H1 != null) {
                    pmcVar.l1(uri.toString());
                    return;
                }
                return;
            case 13:
                List list2 = (List) obj;
                q0d q0dVar = (q0d) this.b;
                CallingCodePickerActivity callingCodePickerActivity2 = q0dVar.j;
                if (callingCodePickerActivity2 != null) {
                    lq80 lq80Var = callingCodePickerActivity2.e1;
                    lq80Var.h = list2;
                    lq80Var.B();
                }
                String str4 = q0dVar.k;
                int i4 = -1;
                i4 = -1;
                if (str4 != null) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (u890.j(((m0d) it3.next()).a, str4)) {
                            i4 = i2;
                        } else {
                            i2++;
                        }
                    }
                }
                if (i4 < 0 || (callingCodePickerActivity = q0dVar.j) == null || (layoutManager = ((RecyclerView) callingCodePickerActivity.l0().b).getLayoutManager()) == null) {
                    return;
                }
                layoutManager.H0(i4);
                return;
            case 14:
                sug0 sug0Var = (sug0) this.b;
                sug0Var.c = true;
                ixg ixgVar = sug0Var.e;
                if (ixgVar != null) {
                    ixgVar.b();
                    return;
                }
                return;
            case 15:
                ((t2j0) ((ne) this.b).a).a((h) obj);
                return;
            case 16:
                vqd vqdVar = (vqd) obj;
                xqd xqdVar = (xqd) this.b;
                Object[] objArr2 = vqdVar.a && vqdVar.b && !(xqdVar.g && !xqdVar.h) == true;
                wqd wqdVar = new wqd();
                wqdVar.a = vqdVar.c;
                if (objArr2 != true) {
                    aia0 aia0Var = xqdVar.a;
                    ConcurrentHashMap concurrentHashMap2 = ((bba) aia0Var).d;
                    if (((aba) concurrentHashMap2.remove(wqdVar)) != null) {
                        x390.n(((bba) aia0Var).b, 1, "Aborted");
                    }
                    if (concurrentHashMap2.isEmpty()) {
                        aia0Var.N0.c();
                    }
                } else if (!xqdVar.f) {
                    aia0 aia0Var2 = xqdVar.a;
                    x390 x390Var = ((bba) aia0Var2).b;
                    ConcurrentHashMap concurrentHashMap3 = ((bba) aia0Var2).d;
                    if (((bba) aia0Var2).f.get()) {
                        ConcurrentHashMap.KeySetView keySetView = ((bba) aia0Var2).e;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : keySetView) {
                            if (((xjs) obj2).d()) {
                                arrayList2.add(obj2);
                            }
                        }
                        List listL1 = o7h.l1(arrayList2);
                        if (listL1.isEmpty()) {
                            boolean zIsEmpty = concurrentHashMap3.isEmpty();
                            if (concurrentHashMap3.containsKey(wqdVar) && ((aba) concurrentHashMap3.remove(wqdVar)) != null) {
                                x390.n(x390Var, 1, "The trigger is re-submitted");
                            }
                            ((bba) aia0Var2).a.getClass();
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            concurrentHashMap3.put(wqdVar, new aba(wqdVar, Instant.ofEpochMilli(Scheduler.a(timeUnit))));
                            if (zIsEmpty) {
                                Scheduler scheduler = aia0Var2.g;
                                vku vkuVar2 = aia0Var2.N0;
                                vkuVar2.a.i();
                                aba abaVar = (aba) o7h.B0(((bba) aia0Var2).d.values());
                                instantValueOf = abaVar != null ? abaVar.b : null;
                                if (instantValueOf != null) {
                                    vkuVar2.a(aia0Var2.Y.z(instantValueOf).n(scheduler).t(aia0Var2.i.toMillis(), timeUnit, aia0Var2.g, (CompletableError) null).s(scheduler).subscribe(new f72(aia0Var2, (byte) 26), new zha0(aia0Var2, (byte) 1)));
                                }
                            }
                        } else {
                            aia0Var2.b(wqdVar, listL1);
                        }
                    } else {
                        x390.n(x390Var, 1, "Jumpstart API is not running");
                    }
                    xqdVar.f = true;
                }
                if (vqdVar.b) {
                    return;
                }
                xqdVar.f = false;
                xqdVar.g = false;
                return;
            case 17:
                mmr0 mmr0Var2 = (mmr0) obj;
                boolean zBooleanValue = ((Boolean) mmr0Var2.a).booleanValue();
                String str5 = (String) mmr0Var2.b;
                yqd yqdVar = (yqd) ((kly0) this.b).get();
                yqdVar.getClass();
                mqd mqdVarN = CarDetectionEvent.n();
                mqdVarN.n(zBooleanValue);
                mqdVarN.q(str5);
                CarDetectionEvent carDetectionEventBuild = mqdVarN.build();
                t2j0 t2j0Var2 = yqdVar.a;
                carDetectionEventBuild.getClass();
                t2j0Var2.a(carDetectionEventBuild);
                return;
            case 18:
                h290 h290VarO = ((Userprofileview.GetPronounsResponse) obj).o();
                oee oeeVar = (oee) this.b;
                h290VarO.getClass();
                if (h290VarO.isEmpty()) {
                    arrayList = new ArrayList();
                    it = h290VarO.iterator();
                    while (it.hasNext()) {
                        r7h.W(((Userprofileview.PronounsByLanguage) it.next()).n(), arrayList);
                    }
                    listZ0 = o7h.Z0(arrayList);
                } else {
                    Iterator it4 = h290VarO.iterator();
                    while (it4.hasNext()) {
                        if (ihc1.h0(((Userprofileview.PronounsByLanguage) it4.next()).getLanguage(), oeeVar.d, false)) {
                            List listA1 = o7h.a1(h290VarO, new xvd(oeeVar, (byte) 1));
                            listZ0 = new ArrayList();
                            Iterator it5 = listA1.iterator();
                            while (it5.hasNext()) {
                                r7h.W(o7h.Z0(((Userprofileview.PronounsByLanguage) it5.next()).n()), listZ0);
                            }
                        }
                    }
                    arrayList = new ArrayList();
                    it = h290VarO.iterator();
                    while (it.hasNext()) {
                        r7h.W(((Userprofileview.PronounsByLanguage) it.next()).n(), arrayList);
                    }
                    listZ0 = o7h.Z0(arrayList);
                }
                oeeVar.e = listZ0;
                return;
            case 19:
                ((pyf) this.b).l1((String) obj);
                return;
            case 20:
                zrj1 zrj1Var = (zrj1) this.b;
                hma1 hma1VarEdit = ((dma1) zrj1Var.b).edit();
                hma1VarEdit.f((bma1) zrj1Var.d);
                hma1VarEdit.g();
                return;
            case 21:
                for (l0l l0lVar : (List) obj) {
                    if (l0lVar.l()) {
                        li9 li9Var = ((qig) this.b).b;
                        String strD = l0lVar.d();
                        Date date = new Date();
                        String str6 = hq80.a.format(date);
                        String str7 = new SimpleDateFormat("VV", Locale.US).format(date);
                        pig pigVarN = ClientConnectEnvironment.n();
                        pigVarN.n(strD);
                        pigVarN.q(str6);
                        pigVarN.r(str7);
                        ClientConnectEnvironment clientConnectEnvironmentBuild = pigVarN.build();
                        t2j0 t2j0Var3 = li9Var.a;
                        clientConnectEnvironmentBuild.getClass();
                        t2j0Var3.a(clientConnectEnvironmentBuild);
                        return;
                    }
                }
                bhn0.t("Collection contains no element matching the predicate.");
                return;
            case 22:
                th61 th61Var = (th61) obj;
                if (th61Var.b || th61Var.c || th61Var.d) {
                    return;
                }
                Logger.g("ClientMessagingPlatformDaemon stopped due to user logout", new Object[0]);
                ljc ljcVar = (kjc) ((ofb) this.b).b;
                ric ricVar = ljcVar.g;
                DismissReason.UserLoggingOut userLoggingOut = DismissReason.UserLoggingOut.INSTANCE;
                LinkedHashMap linkedHashMap = ricVar.a;
                Collection collectionValues = linkedHashMap.values();
                ArrayList arrayList3 = new ArrayList();
                Iterator it6 = collectionValues.iterator();
                while (it6.hasNext()) {
                    r4j0 r4j0Var = (r4j0) ((WeakReference) it6.next()).get();
                    if (r4j0Var != null) {
                        arrayList3.add(r4j0Var);
                    }
                }
                linkedHashMap.clear();
                Iterator it7 = arrayList3.iterator();
                while (it7.hasNext()) {
                    ((r4j0) it7.next()).dismiss();
                }
                MobiusLoop mobiusLoop = ljcVar.k;
                Set<mmr0> set = (mobiusLoop == null || (klcVar = (klc) mobiusLoop.i) == null) ? null : klcVar.e;
                if (set != null) {
                    for (mmr0 mmr0Var3 : set) {
                        LoggingData loggingDataB = ((a5j0) mmr0Var3.b).b();
                        a5j0 a5j0Var2 = (a5j0) mmr0Var3.b;
                        if (a5j0Var2 instanceof t4j0) {
                            ljcVar.a((gmc) mmr0Var3.a, loggingDataB);
                        } else if (!(a5j0Var2 instanceof u4j0) && !(a5j0Var2 instanceof v4j0) && !(a5j0Var2 instanceof w4j0) && !(a5j0Var2 instanceof x4j0)) {
                            if (a5j0Var2 instanceof y4j0) {
                                ljcVar.a((gmc) mmr0Var3.a, loggingDataB);
                            } else {
                                if (!(a5j0Var2 instanceof z4j0)) {
                                    eg.o();
                                    return;
                                }
                                ljcVar.a((gmc) mmr0Var3.a, loggingDataB);
                            }
                        }
                    }
                }
                vlc vlcVar = ljcVar.f;
                vlcVar.b = new DiscardReason() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$UserLoggingOut
                    public static final int $stable = 0;
                };
                vlcVar.a = null;
                MobiusLoop mobiusLoop2 = ljcVar.k;
                if (mobiusLoop2 != null) {
                    mobiusLoop2.dispose();
                }
                ljcVar.k = null;
                fn31.T(ljcVar.j, (o8n) null, 0, new hzb(ljcVar, instantValueOf, b), 3);
                ukg0 it8 = ((bz31) ((b2p) ((ofb) this.b).c).get()).b.values().iterator();
                while (((g0y) it8).hasNext()) {
                    ((ty31) it8.next()).dispose();
                }
                ((ric) ((b2p) ((ofb) this.b).f).get()).a.clear();
                ((hmc) ((b2p) ((ofb) this.b).e).get()).a.clear();
                emc emcVar = (emc) ((b2p) ((ofb) this.b).d).get();
                emcVar.c.c();
                emcVar.b.onComplete();
                ((qic) ((b2p) ((ofb) this.b).g).get()).a.clear();
                return;
            case 23:
                spq0 spq0Var = (spq0) obj;
                jlg jlgVar = (jlg) this.b;
                jlgVar.getClass();
                boolean zC = spq0Var.c();
                hlg hlgVar = jlgVar.b;
                if (zC) {
                    String str8 = (String) spq0Var.b();
                    hlgVar.getClass();
                    try {
                        hma1 hma1VarEdit2 = hlgVar.a.edit();
                        hma1VarEdit2.d(hlg.b, str8);
                        hma1VarEdit2.g();
                        return;
                    } catch (IllegalStateException e) {
                        e.toString();
                        return;
                    }
                }
                hlgVar.getClass();
                try {
                    hma1 hma1VarEdit3 = hlgVar.a.edit();
                    hma1VarEdit3.f(hlg.b);
                    hma1VarEdit3.g();
                    break;
                } catch (NullPointerException e2) {
                    e2.toString();
                }
                Runnable runnable = (Runnable) jlgVar.f.get();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 24:
                v2h v2hVar = (v2h) obj;
                cr6 cr6Var = (cr6) this.b;
                View view = (View) ((lag) cr6Var.b).d;
                boolean z5 = v2hVar.a;
                view.setVisibility(z5 ? 0 : 8);
                if (z5) {
                    ((qzh) cr6Var.f).f(new a1h(v2hVar.b));
                    return;
                }
                return;
            case 25:
                x390 x390Var2 = ((o9h) this.b).a;
                s1b0 s1b0Var = ((n9h) obj).a;
                if (s1b0Var != null && (t0wVar = ((p1b0) x390Var2.b).a) != null) {
                    t0wVar.invoke(s1b0Var);
                }
                ((lzn0) x390Var2.c).e();
                return;
            case 26:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                wbh wbhVar = (wbh) ((km0) this.b).c;
                if (zBooleanValue2) {
                    if (!wbhVar.e || wbhVar.d || (handler2 = wbhVar.c) == null) {
                        return;
                    }
                    handler2.sendEmptyMessage(1);
                    return;
                }
                if (wbhVar.e && wbhVar.d && (handler = wbhVar.c) != null) {
                    handler.sendEmptyMessage(2);
                    return;
                }
                return;
            case 27:
                Throwable th = (Throwable) obj;
                b8p1 b8p1Var = (b8p1) this.b;
                u210 u210Var = (u210) b8p1Var.c;
                int i5 = b8p1Var.b;
                String str9 = (String) b8p1Var.d;
                String str10 = (String) b8p1Var.e;
                String lowerCase = bb00.s(i5).toLowerCase(Locale.ROOT);
                String message2 = th.getMessage();
                if (message2 == null) {
                    message2 = j2h1.I(th);
                }
                if (str9.length() == 0 && (str10 == null || str10.length() == 0)) {
                    return;
                }
                t2j0 t2j0Var4 = u210Var.a;
                s210 s210VarN = ExternalAccessoryRemoteError.n();
                s210VarN.n(lowerCase);
                s210VarN.r(str9);
                s210VarN.q(message2);
                if (str10 != null) {
                    s210VarN.s(str10);
                }
                t2j0Var4.a(s210VarN.build());
                return;
            case 28:
                HttpException httpException = (Throwable) obj;
                HttpException httpException2 = httpException instanceof HttpException ? httpException : null;
                instantValueOf = httpException2 != null ? Integer.valueOf(httpException2.a) : null;
                if (httpException instanceof IOException) {
                    return;
                }
                if (instantValueOf != null && instantValueOf.intValue() == 503) {
                    return;
                }
                if (instantValueOf != null && instantValueOf.intValue() == 504) {
                    return;
                }
                n57.t("Failed to load comments card for track: " + ((ContextTrack) this.b).uri(), httpException);
                return;
            default:
                ((x9k1) this.b).c(((inh) obj).a);
                return;
        }
    }
}
