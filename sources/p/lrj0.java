package p;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.spotify.base.java.logging.Logger;
import com.spotify.betamax.offlinecoordinator.proto.OfflinePlugin;
import com.spotify.betamax.offlinecoordinator.proto.OfflinePlugin$IdentifyResponse$Result;
import com.spotify.betamax.offlinecoordinator.proto.d;
import com.spotify.betamax.offlinecoordinator.proto.e;
import com.spotify.betamax.offlinecoordinator.proto.f;
import com.spotify.messages.AndroidBluetoothPermissionStatus;
import com.spotify.metadata.proto.Metadata$Episode;
import com.spotify.nowplaying.musicinstallation.NowPlayingActivity;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lrj0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lrj0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void accept(Object obj) {
        zpn1 hpn0Var;
        String str;
        byte b = 8;
        int i = 5;
        byte b2 = 3;
        int i2 = 4;
        switch (this.a) {
            case 0:
                mmr0 mmr0Var = (mmr0) obj;
                boolean zBooleanValue = ((Boolean) mmr0Var.a).booleanValue();
                long jLongValue = ((Number) mmr0Var.b).longValue();
                znm znmVar = (znm) ((kly0) ((vf2) this.b).c).get();
                if (zBooleanValue) {
                    znmVar.b(jLongValue);
                    return;
                } else {
                    znmVar.a();
                    return;
                }
            case 1:
                ContextTrack contextTrack = (ContextTrack) obj;
                dtw dtwVar = ((jsj0) this.b).V0;
                if (dtwVar != null) {
                    dtwVar.f(new oof1(contextTrack.uri(), l4o1.a0(contextTrack, ContextTrack$Metadata.KEY_POINTER_URI)));
                    return;
                } else {
                    u890.C("trackInfoVH");
                    throw null;
                }
            case 2:
                ContextTrack contextTrack2 = (ContextTrack) obj;
                dtw dtwVar2 = ((lsj0) this.b).P0;
                if (dtwVar2 != null) {
                    dtwVar2.f(new oof1(contextTrack2.uri(), l4o1.a0(contextTrack2, ContextTrack$Metadata.KEY_POINTER_URI)));
                    return;
                } else {
                    u890.C("trackInfoVH");
                    throw null;
                }
            case 3:
                ContextTrack contextTrack3 = (ContextTrack) obj;
                dtw dtwVar3 = ((lsj0) this.b).P0;
                if (dtwVar3 != null) {
                    dtwVar3.f(new oof1(contextTrack3.uri(), l4o1.a0(contextTrack3, ContextTrack$Metadata.KEY_POINTER_URI)));
                    return;
                } else {
                    u890.C("trackInfoVH");
                    throw null;
                }
            case 4:
                s880 s880Var = (s880) this.b;
                int iOrdinal = ((nwq0) obj).ordinal();
                if (iOrdinal == 0) {
                    ((HorizontalScrollView) s880Var.c).setVisibility(0);
                    ((View) s880Var.e).setAlpha(1.0f);
                    ((dtw) s880Var.h).f(Boolean.TRUE);
                    ((View) s880Var.f).setVisibility(0);
                    ((View) s880Var.d).setVisibility(0);
                    View view = (View) s880Var.g;
                    if (view != null) {
                        view.setVisibility(0);
                        return;
                    }
                    return;
                }
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        eg.o();
                        return;
                    }
                    ((View) s880Var.d).setVisibility(8);
                    ((View) s880Var.f).setVisibility(8);
                    ((dtw) s880Var.h).f(Boolean.FALSE);
                    ((View) s880Var.e).setAlpha(0.0f);
                    ((HorizontalScrollView) s880Var.c).setVisibility(8);
                    View view2 = (View) s880Var.g;
                    if (view2 != null) {
                        view2.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((rcs) this.b).invoke((Boolean) obj);
                return;
            case 6:
                k0u k0uVar = (k0u) ((spq0) obj).h();
                if (k0uVar != null) {
                    x6m0 x6m0Var = (x6m0) this.b;
                    x6m0Var.e.onNext(new ix5(k0uVar.a, true, k0uVar.b, x6m0Var.c(), "system_volume_updates", x6m0Var.d()));
                    return;
                }
                return;
            case 7:
                Boolean bool = (Boolean) obj;
                nlm0 nlm0Var = (nlm0) this.b;
                nlm0Var.i1().c.setEnabled(bool.booleanValue());
                nlm0Var.i1().c.setAlpha(bool.booleanValue() ? 1.0f : 0.5f);
                return;
            case 8:
                Boolean bool2 = (Boolean) obj;
                ((u3c) this.b).getClass();
                dn81 dn81VarA = u3c.a();
                if (dn81VarA != null) {
                    boolean zBooleanValue2 = bool2.booleanValue();
                    n3c n3cVar = (n3c) dn81VarA.b;
                    if (n3cVar.k.a != zBooleanValue2) {
                        n3cVar.s(zBooleanValue2 ? 4 : 1);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                qpu qpuVar = (qpu) obj;
                wkn0 wkn0Var = (wkn0) this.b;
                Integer num = qpuVar.a;
                String str2 = qpuVar.b;
                wkn0Var.e1.setBackgroundColor(num != null ? num.intValue() : ((Number) wkn0Var.s1.getValue()).intValue());
                if (str2 == null) {
                    wkn0Var.g1.setImageDrawable(null);
                    return;
                }
                xab1 xab1Var = wkn0Var.o1;
                lnm lnmVar = null;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                wkn0Var.o1 = fn31.T(cto1.q(wkn0Var.b1), (o8n) null, 0, new m3n0(wkn0Var, str2, lnmVar, b), 3);
                return;
            case 10:
                opn0 opn0Var = (opn0) obj;
                epn0 epn0Var = (epn0) this.b;
                if (!u890.j(opn0Var.b, (String) epn0Var.Y0().c)) {
                    epn0Var.Y0().c = null;
                    epn0Var.a1(new hpn0("state_mismatch", "State parameter mismatch"));
                    return;
                }
                epn0Var.Y0().c = null;
                String str3 = opn0Var.a;
                if (str3 != null) {
                    hpn0Var = new ipn0(str3);
                } else {
                    String str4 = opn0Var.c;
                    if (str4 != null) {
                        String str5 = opn0Var.d;
                        if (str5 == null) {
                            str5 = "Unknown error";
                        }
                        hpn0Var = new hpn0(str4, str5);
                    } else {
                        hpn0Var = new hpn0("no_auth_code", "No authorization code in callback");
                    }
                }
                epn0Var.a1(hpn0Var);
                return;
            case 11:
                kqi0 kqi0Var = (kqi0) this.b;
                lzn0 lzn0Var = (lzn0) kqi0Var.b;
                oqn1 oqn1Var = ((n0n1) obj).c;
                if (oqn1Var instanceof ksn0) {
                    ksn0 ksn0Var = (ksn0) oqn1Var;
                    lzn0Var.a(ksn0Var.c, ksn0Var.d, (Bundle) null);
                    return;
                }
                if (!(oqn1Var instanceof msn0)) {
                    if (!(oqn1Var instanceof csn0)) {
                        eg.o();
                        return;
                    } else {
                        lzn0Var.e();
                        ((kt91) kqi0Var.d).b();
                        return;
                    }
                }
                Set set = s4b1.f;
                msn0 msn0Var = (msn0) oqn1Var;
                String str6 = msn0Var.c;
                String strZ = uic.x(str6).z();
                if (strZ == null || strZ.length() == 0) {
                    z710.d((z710) kqi0Var.c, str6, false, 6);
                    return;
                } else {
                    if (uic.u(str6)) {
                        lzn0Var.a(strZ, msn0Var.d, (Bundle) null);
                        return;
                    }
                    return;
                }
            case 12:
                l1o0 l1o0Var = (l1o0) this.b;
                int iOrdinal2 = ((n2o0) obj).ordinal();
                if (iOrdinal2 == 0) {
                    t1o0 t1o0VarZ0 = l1o0Var.Z0();
                    t1o0VarZ0.g.b(t1o0VarZ0.c.a().flatMapCompletable(new jpa0(t1o0VarZ0, (byte) 26)).subscribe(new s1o0(t1o0VarZ0, (byte) 5)));
                    return;
                }
                if (iOrdinal2 == 1) {
                    t1o0 t1o0VarZ1 = l1o0Var.Z0();
                    t1o0VarZ1.g.b(t1o0VarZ1.c.a().flatMapCompletable(new tym0(t1o0VarZ1, b2)).subscribe(new s1o0(t1o0VarZ1, (byte) 4)));
                    return;
                } else {
                    if (iOrdinal2 != 2) {
                        eg.o();
                        return;
                    }
                    l1o0 l1o0Var2 = l1o0Var.Z0().f;
                    if (l1o0Var2 != null) {
                        l1o0Var2.b1(g4o0.c);
                        return;
                    } else {
                        u890.C("view");
                        throw null;
                    }
                }
            case 13:
                dma1 dma1Var = (dma1) obj;
                v1o0 v1o0Var = (v1o0) this.b;
                v1o0Var.getClass();
                bma1 bma1Var = v1o0.h;
                int iL = dma1Var.l(bma1Var, 0);
                hma1 hma1VarEdit = dma1Var.edit();
                hma1VarEdit.c(v1o0.g, v1o0Var.e.b());
                hma1VarEdit.b(bma1Var, iL + 1);
                hma1VarEdit.g();
                return;
            case 14:
                u210 u210Var = (u210) ((p2o0) this.b).d;
                int iOrdinal3 = ((p4o0) obj).ordinal();
                if (iOrdinal3 == 0) {
                    str = "granted";
                } else if (iOrdinal3 == 1) {
                    str = "denied_once";
                } else if (iOrdinal3 == 2) {
                    str = "denied_twice";
                } else {
                    if (iOrdinal3 != 3) {
                        eg.o();
                        return;
                    }
                    str = "never_denied";
                }
                y74 y74VarN = AndroidBluetoothPermissionStatus.n();
                y74VarN.n(str);
                u210Var.a.a(y74VarN.build());
                return;
            case 15:
                ((fno0) this.b).d = (List) obj;
                return;
            case 16:
                ((bnj0) this.b).o(((lse0) obj).b);
                return;
            case 17:
                w4p0 w4p0Var = ((NowPlayingActivity) this.b).p1;
                if (w4p0Var == null) {
                    u890.C("pageLoadReporter");
                    throw null;
                }
                if (w4p0Var.g || w4p0Var.h) {
                    return;
                }
                w4p0Var.g = true;
                iw4 iw4Var = w4p0Var.d;
                if (iw4Var != null) {
                    iw4Var.e(4, false);
                    return;
                }
                return;
            case 18:
                ((ior) this.b).a(((tzo0) obj).d, false);
                return;
            case 19:
                ou80 ou80Var = ((uzo0) obj).d;
                e7p0 e7p0Var = (e7p0) this.b;
                if (ou80Var != null) {
                    e7p0.d(e7p0Var, ou80Var);
                    return;
                } else {
                    e7p0Var.c();
                    return;
                }
            case 20:
                ffb0 ffb0Var = (ffb0) this.b;
                ffb0Var.c.m((Object) null, Boolean.valueOf(((vzo0) obj).d));
                hma1 hma1VarEdit2 = ffb0Var.a.edit();
                hma1VarEdit2.a(gfb0.b, true);
                hma1VarEdit2.h();
                return;
            case 21:
                ((q2p0) this.b).d().onNext((ju41) obj);
                return;
            case 22:
                g2z g2zVar = (g2z) this.b;
                ((r4p0) g2zVar.c).b = false;
                yqq0 yqq0Var = (yqq0) g2zVar.f;
                if (yqq0Var != null) {
                    g2zVar.E(yqq0Var, false);
                    return;
                }
                return;
            case 23:
                ((ugp0) this.b).c = ((Boolean) obj).booleanValue();
                return;
            case 24:
                ((clp0) this.b).b(((hkp0) obj).c);
                return;
            case 25:
                zcs zcsVar = (zcs) this.b;
                l0l l0lVar = ((ikp0) obj).c;
                zcsVar.a.onNext(new vad1(l0lVar.getName(), l0lVar.j()));
                return;
            case 26:
                mmr0 mmr0Var2 = (mmr0) obj;
                Object obj2 = mmr0Var2.a;
                elp0 elp0Var = (elp0) this.b;
                bbr0 bbr0Var = elp0Var.Y;
                bn70 bn70VarA = bbr0Var.b0(bn70.class).a();
                n6r0 n6r0Var = bn70VarA != null ? bn70VarA.a : null;
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                boolean zJ = u890.j(n6r0Var, yon1.p0());
                hgr0 hgr0VarA = bbr0Var.b0(hgr0.class).a();
                boolean zJ2 = u890.j(hgr0VarA != null ? hgr0VarA.a : null, egr0.a);
                if (zJ || zJ2) {
                    Logger.d("Nudge suppressed, ignore show request", new Object[0]);
                    return;
                }
                if (elp0Var.X.isEnabled()) {
                    goq goqVar = elp0Var.t;
                    String str7 = ((vad1) obj2).b;
                    if (((apr) goqVar.e).c()) {
                        return;
                    }
                    goqVar.h = ((qor) goqVar.b).d(new s6l(new p6l(new j2i(-658213250, new g1o(hqq0.l0(((f2l) goqVar.d).a.a), goqVar, (byte) 22), true)), (String) null, new o6l(((Context) goqVar.g).getString(2131959311), new i3o(str7, (byte) 14), new i4o(goqVar, (byte) 23)), iyk0.d, (String) null, (String) null, ((jo20) goqVar.f).isEnabled(), Metadata$Episode.EPISODE_CONTENT_RATING_FIELD_NUMBER), new k6l(), (Long) null);
                    return;
                }
                vad1 vad1Var = (vad1) obj2;
                View view3 = (View) mmr0Var2.b;
                byp bypVar = elp0Var.h;
                String str8 = vad1Var.a;
                dlp0 dlp0Var = new dlp0(elp0Var, (byte) 0);
                dlp0 dlp0Var2 = new dlp0(elp0Var, (byte) 1);
                ocp0 ocp0Var = new ocp0(elp0Var, vad1Var, (byte) 25);
                gj5 gj5Var = (gj5) bypVar.b;
                if (!((apr) bypVar.d).c()) {
                    bypVar.g = dlp0Var;
                    bypVar.h = dlp0Var2;
                    odr odrVar = new odr(gj5Var.getLayoutInflater());
                    odrVar.e(new hlp0(gj5Var.getString(2131959308, str8), str8, gj5Var.getString(2131959307)));
                    odrVar.n(new vas((Object) ocp0Var, (byte) 2));
                    ((vku) bypVar.e).a(((l8s) bypVar.c).c(new hjo0(new nh31((View) odrVar.b), view3, (m9s) bypVar.i)).observeOn((Scheduler) bypVar.a).subscribe(new yrh(bypVar, (byte) 28)));
                }
                vnd1 vnd1Var = elp0Var.d;
                i8h1 i8h1Var = (i8h1) vnd1Var.b;
                txk0 txk0Var = (txk0) vnd1Var.c;
                x6h1 x6h1VarC = txk0Var.b.c();
                x6h1VarC.i.add(new a7h1("switch_network_nudge", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = txk0Var.c;
                i8h1Var.f(k7h1Var.a(), (Set) null);
                return;
            case 27:
                lvp0 lvp0Var = (lvp0) obj;
                kl1 kl1Var = (kl1) this.b;
                OfflinePlugin.PluginCommand pluginCommand = lvp0Var.a;
                Collection<bqp0> collection = lvp0Var.b;
                int iO = pluginCommand.o();
                int i3 = iO == 0 ? -1 : pqp0.a[l1d.C(iO)];
                if (i3 == 1) {
                    hqp0 hqp0Var = (hqp0) kl1Var.f;
                    hqp0Var.getClass();
                    yna ynaVar = hqp0Var.a;
                    ArrayList<zpp0> arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : collection) {
                        if (((bqp0) obj3).getManifestId() != null) {
                            arrayList.add(obj3);
                        } else {
                            arrayList2.add(obj3);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
                    for (zpp0 zpp0Var : arrayList) {
                        String manifestId = zpp0Var.getManifestId();
                        manifestId.getClass();
                        zpp0 zpp0Var2 = zpp0Var instanceof zpp0 ? zpp0Var : null;
                        long j = zpp0Var2 != null ? zpp0Var2.a.n : 0L;
                        String uri = zpp0Var.getUri();
                        sqp0 sqp0Var = t9p1.h((kru) ynaVar.b.g.get(wqn1.n(manifestId))) == 5 ? sqp0.c : sqp0.b;
                        long jB = ynaVar.b(wqn1.n(manifestId));
                        if (jB <= 0) {
                            jB = ((j * ((long) hqp0Var.f)) / 8) / 1000;
                        }
                        arrayList3.add(new tqp0(uri, sqp0Var, jB));
                    }
                    ArrayList arrayList4 = new ArrayList(q7h.U(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(new tqp0(((bqp0) it.next()).getUri(), sqp0.d, 0L));
                    }
                    ArrayList<tqp0> arrayListN0 = o7h.N0(arrayList4, arrayList3);
                    uqp0 uqp0Var = hqp0Var.d;
                    d dVarN = OfflinePlugin.IdentifyResponse.n();
                    for (tqp0 tqp0Var : arrayListN0) {
                        f fVar = tqp0Var.b.a;
                        long j2 = tqp0Var.c;
                        e eVarO = OfflinePlugin$IdentifyResponse$Result.o();
                        eVarO.q(fVar);
                        eVarO.n(j2);
                        dVarN.n(tqp0Var.a, (OfflinePlugin$IdentifyResponse$Result) eVarO.build());
                    }
                    lup0 builder = sap1.c().toBuilder();
                    builder.r(dVarN.build());
                    OfflinePlugin.PluginResponse pluginResponseBuild = builder.build();
                    pluginResponseBuild.getClass();
                    uqp0Var.b.a(uqp0Var.a.b(pluginResponseBuild).subscribe());
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        String manifestId2 = ((bqp0) it2.next()).getManifestId();
                        if (manifestId2 != null) {
                            arrayList5.add(manifestId2);
                        }
                    }
                    hna hnaVar = hqp0Var.b;
                    if (hnaVar.h.a().B1 != ttp0.b) {
                        return;
                    }
                    hnaVar.j.a(Observable.fromIterable(arrayList5).flatMapMaybe(new fna(hnaVar, (byte) 0)).observeOn(hnaVar.i).flatMapMaybe(new bv40(hnaVar, (byte) 27)).flatMapSingle(new dg8(hnaVar, (byte) 4)).subscribe(new mba(hnaVar, (byte) 2), nm.c1));
                    return;
                }
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            return;
                        }
                        hqp0 hqp0Var2 = (hqp0) kl1Var.f;
                        hqp0Var2.getClass();
                        Iterator it3 = collection.iterator();
                        while (it3.hasNext()) {
                            String manifestId3 = ((bqp0) it3.next()).getManifestId();
                            if (manifestId3 != null) {
                                hqp0Var2.a.a.a.g(4, wqn1.n(manifestId3));
                            }
                        }
                        return;
                    }
                    hqp0 hqp0Var3 = (hqp0) kl1Var.f;
                    hqp0Var3.getClass();
                    Iterator it4 = collection.iterator();
                    while (it4.hasNext()) {
                        String manifestId4 = ((bqp0) it4.next()).getManifestId();
                        if (manifestId4 != null) {
                            String strN = wqn1.n(manifestId4);
                            ena enaVar = hqp0Var3.a.a;
                            enaVar.j.a(new CompletableFromAction(new dm1(enaVar, strN, (byte) 1)).s(enaVar.h).subscribe());
                        }
                    }
                    return;
                }
                hqp0 hqp0Var4 = (hqp0) kl1Var.f;
                hqp0Var4.getClass();
                for (bqp0 bqp0Var : collection) {
                    String manifestId5 = bqp0Var.getManifestId();
                    if (manifestId5 != null) {
                        String strN2 = wqn1.n(manifestId5);
                        i0v i0vVar = new i0v(strN2, Collections.singletonMap("episode_uri", bqp0Var.getUri()));
                        qyu qyuVar = new qyu(hqp0Var4.f, hqp0Var4.g);
                        yna ynaVar2 = hqp0Var4.a;
                        int iH = t9p1.h((kru) ynaVar2.b.g.get(strN2));
                        if (iH != i2 && iH != i) {
                            ena enaVar2 = ynaVar2.a;
                            Scheduler scheduler = enaVar2.h;
                            swu swuVar = new swu(i0vVar);
                            t390 t390Var = enaVar2.g;
                            LinkedHashMap linkedHashMap = t390Var.c;
                            ArrayList arrayList6 = t390Var.b;
                            ArrayList arrayList7 = new ArrayList(q7h.U(arrayList6, 10));
                            Iterator it5 = arrayList6.iterator();
                            while (it5.hasNext()) {
                                arrayList7.add(((wma) it5.next()).a(qyuVar));
                            }
                            linkedHashMap.put(swuVar, arrayList7);
                            long jB2 = t390Var.a.b();
                            Map.Entry entryA = t390Var.a(strN2);
                            if (entryA != null) {
                                Iterator it6 = ((List) entryA.getValue()).iterator();
                                while (it6.hasNext()) {
                                    ((vma) it6.next()).d(jB2);
                                }
                            }
                            enaVar2.j.a(enaVar2.b.h(swuVar, qyuVar).observeOn(scheduler).doOnSuccess(new dna(enaVar2, strN2, (byte) 0)).observeOn(scheduler).subscribe(new dna(enaVar2, strN2, (byte) 1), new dna(enaVar2, strN2, (byte) 2)));
                        }
                        i = 5;
                        i2 = 4;
                    }
                }
                return;
            case 28:
                orp0 orp0Var = (orp0) obj;
                prp0 prp0Var = (prp0) this.b;
                synchronized (prp0Var.c) {
                    Iterator it7 = prp0Var.c.iterator();
                    while (it7.hasNext()) {
                        ((fxp0) it7.next()).a(orp0Var);
                    }
                }
                return;
            default:
                Set set2 = (Set) this.b;
                set2.size();
                Objects.toString(set2);
                return;
        }
    }
}
