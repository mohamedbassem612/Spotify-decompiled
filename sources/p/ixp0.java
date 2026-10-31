package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.deeplinkimpl.events.proto.PlaybackFromDeeplink;
import com.spotify.gpb.trackingimpl.events.proto.GpbCheckoutEvents;
import com.spotify.messages.ListeningPartyJoinDevice;
import com.spotify.messages.ListeningPartyLeftDevice;
import com.spotify.payment.paymentimpl.events.proto.CheckoutEjectToWeb;
import com.spotify.payment.paymentimpl.events.proto.CheckoutFieldFocus;
import com.spotify.payment.paymentimpl.events.proto.CheckoutFieldValidationError;
import com.spotify.payment.paymentimpl.events.proto.CheckoutFlowStart;
import com.spotify.payment.paymentimpl.events.proto.CheckoutFormView;
import com.spotify.payment.paymentimpl.events.proto.CheckoutPaymentAppSwitchAttempt;
import com.spotify.payment.paymentimpl.events.proto.CheckoutPaymentAttemptJS;
import com.spotify.payment.paymentimpl.events.proto.CheckoutPaymentValidationErrorJS;
import com.spotify.payment.paymentimpl.events.proto.CheckoutViewJS;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ixp0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ixp0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void accept(Object obj) {
        boolean zJ;
        g7h1 g7h1Var;
        Object k3tVar;
        myn0 myn0Var;
        g7h1 g7h1Var2;
        String str;
        k5u0 k5u0VarB;
        ucu0 ucu0VarT = null;
        boolean z = true;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                g9r g9rVar = (g9r) this.b;
                ((exp0) g9rVar.b).b("downloading=" + bool + " schedule_requested=" + bool);
                if (bool.booleanValue()) {
                    ((r0z0) ((kly0) g9rVar.c).get()).a();
                    return;
                }
                return;
            case 1:
                ((Context) ((km0) this.b).c).getSharedPreferences("com.spotify.oops", 0).edit().putInt("AdsFetchOopsSamplingRateBps", ((Integer) obj).intValue()).apply();
                return;
            case 2:
                ((p2p0) this.b).c((yqq0) obj, false);
                return;
            case 3:
                ((pvq0) this.b).c(true);
                return;
            case 4:
                ((tyq0) this.b).e.a = ((z310) obj).a;
                return;
            case 5:
                String str2 = (String) obj;
                if (ihc1.y0(str2) || !TextUtils.isDigitsOnly(str2)) {
                    return;
                }
                xyq0 xyq0Var = (xyq0) this.b;
                int i = Integer.parseInt(str2);
                yqg yqgVar = xyq0Var.e;
                dma1 dma1Var = xyq0Var.c;
                if (i > xyq0Var.d.b()) {
                    return;
                }
                bma1 bma1Var = xyq0.g;
                long jG = dma1Var.g(bma1Var, -1L);
                if (jG == -1 || yqgVar.b() - jG > 86400000) {
                    hma1 hma1VarEdit = dma1Var.edit();
                    hma1VarEdit.c(bma1Var, yqgVar.b());
                    hma1VarEdit.g();
                    xyq0Var.b.a("active-session-days", String.valueOf(i + 1));
                    return;
                }
                return;
            case 6:
                ((jvn0) ((p410) this.b).h).a((th61) obj);
                return;
            case 7:
                xnh1 xnh1Var = (f6r0) obj;
                w1r0 w1r0Var = (w1r0) this.b;
                vkg vkgVar = w1r0Var.a;
                if (xnh1Var instanceof rir0) {
                    if (((rir0) xnh1Var).i) {
                        return;
                    }
                    w1r0Var.c = true;
                    vkgVar.S(xnh1Var);
                    return;
                }
                if ((xnh1Var instanceof e6r0) && w1r0Var.c) {
                    vkgVar.y((e6r0) xnh1Var);
                    w1r0Var.c = false;
                    return;
                }
                return;
            case 8:
                p1f0 p1f0Var = (p1f0) this.b;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) p1f0Var.d;
                if (!concurrentHashMap.isEmpty()) {
                    long jE = ((yqg) p1f0Var.c).e();
                    Iterator it = concurrentHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        t480 t480Var = (t480) entry.getKey();
                        dgs0 dgs0Var = (dgs0) entry.getValue();
                        a8r0 a8r0Var = dgs0Var.c;
                        boolean z3 = jE - dgs0Var.a >= 300 ? z : z2;
                        y6r0 y6r0Var = a8r0Var.a;
                        l7h1 l7h1Var = dgs0Var.b;
                        if (z3) {
                            q480 q480VarT = ((ffe1) p1f0Var.a).t(a4p1.r(y6r0Var), a4p1.g(l7h1Var));
                            p480 p480Var = new p480(q480VarT.a.toString());
                            it.remove();
                            ((ConcurrentHashMap) p1f0Var.e).put(t480Var, new s6r0(p480Var, q480VarT.b, ((q6h1) l7h1Var).a, a4p1.s(l7h1Var), a4p1.t(l7h1Var), y6r0Var != null ? y6r0Var.a : null, a8r0Var.d));
                            if (q480VarT.b == 0) {
                                ((q7h1) p1f0Var.b).b(p480Var, dgs0Var.b, a8r0Var, dgs0Var.d, dgs0Var.e);
                            }
                            z = true;
                            z2 = false;
                        }
                    }
                }
                if (concurrentHashMap.isEmpty()) {
                    ((rku) p1f0Var.f).a();
                    ((AtomicBoolean) p1f0Var.h).set(false);
                    return;
                }
                return;
            case 9:
                j3t j3tVar = j3t.a;
                i3t i3tVar = i3t.a;
                eir0 eir0Var = (f6r0) obj;
                hir0 hir0Var = (hir0) this.b;
                hir0Var.d = false;
                ynb0 ynb0Var = hir0Var.a;
                boolean z4 = eir0Var instanceof eir0;
                if (z4) {
                    n6r0 n6r0Var = eir0Var.a;
                    AtomicReferenceArray atomicReferenceArray = p6r0.e;
                    zJ = u890.j(n6r0Var, yon1.I5());
                } else if (eir0Var instanceof rir0) {
                    n6r0 n6r0Var2 = ((rir0) eir0Var).b;
                    AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                    zJ = u890.j(n6r0Var2, yon1.I5());
                } else {
                    zJ = false;
                }
                ynb0 ynb0Var2 = hir0Var.b;
                if (zJ) {
                    if (ynb0Var2 != null && (g7h1Var2 = (g7h1) ynb0Var2.get()) != null && g7h1Var2.b.get()) {
                        hir0Var.e = eir0Var;
                        return;
                    }
                } else if (ynb0Var2 != null && (g7h1Var = (g7h1) ynb0Var2.get()) != null) {
                    g7h1Var.b.set(false);
                }
                if (z4) {
                    mwn0 mwn0Var = (mwn0) ynb0Var.get();
                    eir0 eir0Var2 = eir0Var;
                    String strPath = eir0Var2.a.path();
                    qir0 qir0Var = eir0Var2.b;
                    String str3 = qir0Var != null ? qir0Var.a : null;
                    qir0 qir0Var2 = eir0Var2.c;
                    mwn0Var.g(new gwn0(strPath, str3, qir0Var2 != null ? qir0Var2.a : null, (u8h1) null, 8));
                } else if (eir0Var instanceof rir0) {
                    if (eir0Var.equals(hir0Var.e)) {
                        return;
                    }
                    mwn0 mwn0Var2 = (mwn0) ynb0Var.get();
                    rir0 rir0Var = (rir0) eir0Var;
                    String strPath2 = rir0Var.b.path();
                    qir0 qir0Var3 = rir0Var.d;
                    String str4 = qir0Var3 != null ? qir0Var3.a : null;
                    qir0 qir0Var4 = rir0Var.e;
                    gwn0 gwn0Var = new gwn0(strPath2, str4, qir0Var4 != null ? qir0Var4.a : null, rir0Var.j);
                    y6r0 y6r0Var2 = rir0Var.a;
                    long j = rir0Var.c;
                    var0 var0Var = rir0Var.f;
                    List list = rir0Var.g;
                    boolean z5 = rir0Var.h;
                    boolean z6 = rir0Var.i;
                    myn0 myn0Var2 = new myn0(y6r0Var2, j, var0Var, list, z5, z6);
                    zfr zfrVar = mwn0Var2.j;
                    if (z6) {
                        g3t g3tVar = (g3t) zfrVar.b;
                        if (g3tVar == null) {
                            zfrVar.b = new g3t(gwn0Var, myn0Var2);
                        } else if (u890.j(g3tVar.b.a, y6r0Var2)) {
                            zfrVar.b = new g3t(gwn0Var, myn0Var2, g3tVar.c, g3tVar.d);
                        } else {
                            ucu0VarT = zfrVar.t();
                            zfrVar.b = new g3t(gwn0Var, myn0Var2);
                        }
                        if (ucu0VarT != null) {
                            mwn0Var2.h(ucu0VarT);
                            nsn0 nsn0Var = ((h3t) ucu0VarT).c;
                            if (nsn0Var != null) {
                                mwn0Var2.k(nsn0Var);
                            }
                        }
                    } else {
                        if (((LinkedHashSet) zfrVar.c).remove(y6r0Var2)) {
                            k3tVar = i3tVar;
                        } else {
                            g3t g3tVar2 = (g3t) zfrVar.b;
                            if (u890.j((g3tVar2 == null || (myn0Var = g3tVar2.b) == null) ? null : myn0Var.a, y6r0Var2)) {
                                zfrVar.b = null;
                                k3tVar = new k3t(o7h.l1(g3tVar2.c), g3tVar2.d);
                            } else {
                                k3tVar = j3tVar;
                            }
                        }
                        if (!k3tVar.equals(i3tVar)) {
                            if (k3tVar.equals(j3tVar)) {
                                h3t h3tVarT = zfrVar.t();
                                if (h3tVarT != null) {
                                    mwn0Var2.h(h3tVarT);
                                    nsn0 nsn0Var2 = h3tVarT.c;
                                    if (nsn0Var2 != null) {
                                        mwn0Var2.k(nsn0Var2);
                                    }
                                }
                                mwn0Var2.l(gwn0Var, myn0Var2);
                            } else {
                                if (!(k3tVar instanceof k3t)) {
                                    eg.o();
                                    return;
                                }
                                k3t k3tVar2 = (k3t) k3tVar;
                                nsn0 nsn0Var3 = k3tVar2.b;
                                if (nsn0Var3 != null) {
                                    mwn0Var2.k(nsn0Var3);
                                }
                                mwn0Var2.l(gwn0Var, myn0Var2);
                                Iterator it2 = k3tVar2.a.iterator();
                                while (it2.hasNext()) {
                                    mwn0Var2.j().a(new nzz((ou80) it2.next()));
                                }
                            }
                        }
                    }
                }
                hir0Var.e = eir0Var;
                return;
            case 10:
                ((su01) this.b).f("network_fetch_parents");
                return;
            case 11:
                ((sjq0) this.b).B0();
                return;
            case 12:
                z3s0 z3s0Var = (b4s0) obj;
                t2j0 t2j0Var = (t2j0) ((dzp0) this.b).c;
                if (z3s0Var instanceof z3s0) {
                    akd0 akd0VarN = ListeningPartyJoinDevice.n();
                    akd0VarN.n(z3s0Var.a);
                    t2j0Var.a(akd0VarN.build());
                    return;
                } else {
                    if (!(z3s0Var instanceof a4s0)) {
                        eg.o();
                        return;
                    }
                    gkd0 gkd0VarN = ListeningPartyLeftDevice.n();
                    gkd0VarN.n(((a4s0) z3s0Var).a);
                    t2j0Var.a(gkd0VarN.build());
                    return;
                }
            case 13:
                ggw ggwVar = (pgw) obj;
                lvc lvcVar = (lvc) this.b;
                if (ggwVar instanceof ggw) {
                    ggw ggwVar2 = ggwVar;
                    eyf eyfVarP = CheckoutViewJS.p();
                    eyfVarP.u(ggwVar2.b);
                    eyfVarP.t(ggwVar2.c);
                    eyfVarP.r(ggwVar2.d);
                    eyfVarP.v(ggwVar2.e);
                    eyfVarP.w(ggwVar2.g);
                    ArrayList arrayList = ggwVar2.h;
                    ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((zbs0) it3.next()).a);
                    }
                    eyfVarP.q(arrayList2);
                    eyfVarP.x(ggwVar2.i);
                    ArrayList arrayList3 = ggwVar2.j;
                    ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(((zbs0) it4.next()).a);
                    }
                    eyfVarP.n(arrayList4);
                    String str5 = ggwVar2.a;
                    if (str5 != null) {
                        eyfVarP.s(str5);
                    }
                    String str6 = ggwVar2.f;
                    if (str6 != null) {
                        eyfVarP.y(str6);
                    }
                    lvcVar.d(eyfVarP.build());
                    return;
                }
                if (ggwVar instanceof hgw) {
                    ewf ewfVarN = CheckoutEjectToWeb.n();
                    ewfVarN.n(((hgw) ggwVar).a);
                    lvcVar.d(ewfVarN.build());
                    return;
                }
                if (ggwVar instanceof igw) {
                    igw igwVar = (igw) ggwVar;
                    fwf fwfVarN = CheckoutFieldFocus.n();
                    fwfVarN.q(igwVar.d);
                    String str7 = igwVar.a;
                    if (str7 != null) {
                        fwfVarN.n(str7);
                    }
                    String str8 = igwVar.b;
                    if (str8 != null) {
                        fwfVarN.r(str8);
                    }
                    String str9 = igwVar.c;
                    if (str9 != null) {
                        fwfVarN.s(str9);
                    }
                    lvcVar.d(fwfVarN.build());
                    return;
                }
                if (ggwVar instanceof jgw) {
                    jgw jgwVar = (jgw) ggwVar;
                    gwf gwfVarN = CheckoutFieldValidationError.n();
                    gwfVarN.r(jgwVar.d);
                    gwfVarN.q(jgwVar.e);
                    String str10 = jgwVar.a;
                    if (str10 != null) {
                        gwfVarN.n(str10);
                    }
                    String str11 = jgwVar.b;
                    if (str11 != null) {
                        gwfVarN.s(str11);
                    }
                    String str12 = jgwVar.c;
                    if (str12 != null) {
                        gwfVarN.t(str12);
                    }
                    lvcVar.d(gwfVarN.build());
                    return;
                }
                if (ggwVar instanceof kgw) {
                    kgw kgwVar = (kgw) ggwVar;
                    hwf hwfVarN = CheckoutFlowStart.n();
                    hwfVarN.s(kgwVar.c);
                    hwfVarN.r(kgwVar.d);
                    String str13 = kgwVar.a;
                    if (str13 != null) {
                        hwfVarN.n(str13);
                    }
                    String str14 = kgwVar.b;
                    if (str14 != null) {
                        hwfVarN.q(str14);
                    }
                    lvcVar.d(hwfVarN.build());
                    return;
                }
                if (ggwVar instanceof lgw) {
                    lgw lgwVar = (lgw) ggwVar;
                    iwf iwfVarN = CheckoutFormView.n();
                    iwfVarN.r(lgwVar.c);
                    String str15 = lgwVar.a;
                    if (str15 != null) {
                        iwfVarN.n(str15);
                    }
                    String str16 = lgwVar.b;
                    if (str16 != null) {
                        iwfVarN.q(str16);
                    }
                    lvcVar.d(iwfVarN.build());
                    return;
                }
                if (ggwVar instanceof ngw) {
                    ngw ngwVar = (ngw) ggwVar;
                    nwf nwfVarN = CheckoutPaymentAttemptJS.n();
                    nwfVarN.v(ngwVar.e);
                    nwfVarN.q();
                    nwfVarN.u(ngwVar.f);
                    String str17 = ngwVar.a;
                    if (str17 != null) {
                        nwfVarN.r(str17);
                    }
                    String str18 = ngwVar.b;
                    if (str18 != null) {
                        nwfVarN.n(str18);
                    }
                    String str19 = ngwVar.c;
                    if (str19 != null) {
                        nwfVarN.t(str19);
                    }
                    String str20 = ngwVar.d;
                    if (str20 != null) {
                        nwfVarN.s(str20);
                    }
                    lvcVar.d(nwfVarN.build());
                    return;
                }
                if (!(ggwVar instanceof mgw)) {
                    if (!(ggwVar instanceof ogw)) {
                        eg.o();
                        return;
                    }
                    ogw ogwVar = (ogw) ggwVar;
                    owf owfVarN = CheckoutPaymentValidationErrorJS.n();
                    owfVarN.r(ogwVar.f);
                    String str21 = ogwVar.a;
                    if (str21 != null) {
                        owfVarN.q(str21);
                    }
                    String str22 = ogwVar.b;
                    if (str22 != null) {
                        owfVarN.u(str22);
                    }
                    String str23 = ogwVar.c;
                    if (str23 != null) {
                        owfVarN.n(str23);
                    }
                    String str24 = ogwVar.d;
                    if (str24 != null) {
                        owfVarN.t(str24);
                    }
                    String str25 = ogwVar.e;
                    if (str25 != null) {
                        owfVarN.s(str25);
                    }
                    lvcVar.d(owfVarN.build());
                    return;
                }
                mgw mgwVar = (mgw) ggwVar;
                mwf mwfVarN = CheckoutPaymentAppSwitchAttempt.n();
                mwfVarN.u(mgwVar.a);
                mwfVarN.t(mgwVar.c);
                mwfVarN.w(mgwVar.d);
                int i2 = mgwVar.e;
                if (i2 == 1) {
                    str = "app";
                } else if (i2 == 2) {
                    str = "browser";
                } else {
                    if (i2 != 3) {
                        throw null;
                    }
                    str = "unknown";
                }
                mwfVarN.v(str);
                String str26 = mgwVar.b;
                if (str26 != null) {
                    mwfVarN.q(str26);
                }
                String str27 = mgwVar.f;
                if (str27 != null) {
                    mwfVarN.r(str27);
                }
                String str28 = mgwVar.g;
                if (str28 != null) {
                    mwfVarN.s(str28);
                }
                String str29 = mgwVar.h;
                if (str29 != null) {
                    mwfVarN.n(str29);
                }
                lvcVar.d(mwfVarN.build());
                return;
            case 14:
                ((tks0) this.b).a.b("Error running periodic scheduler: %s", new Object[]{((Throwable) obj).getMessage()});
                return;
            case 15:
                jts0 jts0Var = (jts0) this.b;
                svo svoVar = jts0Var.c;
                rvo rvoVar = svoVar.a;
                String str30 = rvoVar != null ? rvoVar.a : null;
                svoVar.a = null;
                if (str30 == null) {
                    str30 = jts0.i;
                }
                jts0Var.a.f(new dwn0(str30, "", true, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
                return;
            case 16:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (m0d m0dVar : (List) obj) {
                    linkedHashMap.put(m0dVar.a, m0dVar);
                }
                yts0 yts0Var = (yts0) this.b;
                wts0 wts0Var = yts0Var.a;
                m0d m0dVarA = linkedHashMap.containsValue(yts0Var.X) ? yts0Var.X : mpi1.a(wts0Var.P0(), linkedHashMap);
                if (m0dVarA != null) {
                    yts0Var.X = m0dVarA;
                    wts0Var.a1(m0dVarA);
                }
                ((ProgressBar) wts0Var.Y0().e).setVisibility(8);
                ((ConstraintLayout) ((p1f0) wts0Var.Y0().d).f).setVisibility(0);
                wts0Var.a1(wts0Var.Z0().X);
                return;
            case 17:
                PlayerState playerState = (PlayerState) obj;
                byp bypVar = (byp) this.b;
                PlayerState playerState2 = (PlayerState) bypVar.h;
                if (playerState2 != null && playerState.playbackId().c() && ((!playerState.track().c() || (!l4o1.E((ContextTrack) playerState.track().b()) && !l4o1.Q((ContextTrack) playerState.track().b()))) && ((!playerState2.playbackId().c() && playerState.playbackId().c()) || !u890.j(playerState.contextUri(), playerState2.contextUri()) || (playerState2.isPaused() && !playerState.isPaused())))) {
                    String strUri = playerState.track().c() ? ((ContextTrack) playerState.track().b()).uri() : "";
                    k9r k9rVar = (k9r) bypVar.c;
                    String str31 = (String) playerState.playbackId().b();
                    strUri.getClass();
                    String strContextUri = playerState.contextUri();
                    e0u0 e0u0VarN = PlaybackFromDeeplink.n();
                    e0u0VarN.q(str31);
                    e0u0VarN.s(strUri);
                    String strA = ((gdr) k9rVar.d).a(fdr.e);
                    if (strA != null) {
                        e0u0VarN.n(strA);
                    }
                    if (strContextUri != null && strContextUri.length() != 0) {
                        e0u0VarN.r(strContextUri);
                    }
                    PlaybackFromDeeplink playbackFromDeeplinkBuild = e0u0VarN.build();
                    t2j0 t2j0Var2 = (t2j0) k9rVar.c;
                    playbackFromDeeplinkBuild.getClass();
                    t2j0Var2.a(playbackFromDeeplinkBuild);
                    playbackFromDeeplinkBuild.toString();
                    bypVar.i(tnt0.e);
                }
                if (playerState.track().c() && (l4o1.E((ContextTrack) playerState.track().b()) || l4o1.Q((ContextTrack) playerState.track().b()))) {
                    return;
                }
                bypVar.h = playerState;
                return;
            case 18:
                h1u0 h1u0Var = (h1u0) obj;
                i1u0 i1u0Var = (i1u0) this.b;
                g1u0 g1u0Var = i1u0Var.b;
                PlayerState playerState3 = h1u0Var.a;
                if (!h1u0Var.c.c() && (!playerState3.isPlaying() || playerState3.isPaused())) {
                    spq0 spq0Var = h1u0Var.b;
                    boolean zIsPlaying = playerState3.isPlaying();
                    if ((i1u0Var.e.isEnabled() || Build.VERSION.SDK_INT < 31 || !spq0Var.c() || ((l0l) spq0Var.b()).l() || zIsPlaying) && !playerState3.isPlaying() && i1u0Var.g) {
                        g1u0Var.e();
                        i1u0Var.g = false;
                        return;
                    }
                    return;
                }
                if (i1u0Var.g) {
                    return;
                }
                i1u0Var.g = true;
                g1u0Var.r = g1u0Var.b.a(qd30.a);
                vku vkuVar = g1u0Var.D;
                Flowable flowableX = g1u0Var.e.x(rh20.Y0).X(new e5l0(g1u0Var.j, (byte) 26));
                flowableX.getClass();
                Function function = Functions.a;
                FlowableDistinctUntilChanged flowableDistinctUntilChangedT = flowableX.t(function);
                Scheduler scheduler = g1u0Var.i;
                vkuVar.b(new Disposable[]{flowableDistinctUntilChangedT.L(scheduler).subscribe(new e1u0(g1u0Var, (byte) 0)), g1u0Var.f.J(new twb(g1u0Var, (byte) 19)).t(function).L(scheduler).subscribe(new e1u0(g1u0Var, (byte) 1)), yoi1.h(g1u0Var.p.c, o6x.a).X(yi20.X0).L(scheduler).subscribe(new e1u0(g1u0Var, (byte) 2))});
                llm llmVar = g1u0Var.F;
                if (llmVar != null) {
                    smo1.p(llmVar, (CancellationException) null);
                }
                llm llmVarK = i3a.k(g1u0Var.q);
                g1u0Var.F = llmVarK;
                fn31.T(llmVarK, (o8n) null, 0, new i2p0(g1u0Var, (lnm) null, (byte) 29), 3);
                return;
            case 19:
                ((v5u0) this.b).b = ((Boolean) obj).booleanValue();
                return;
            case 20:
                otg0 otg0Var = (otg0) obj;
                long j2 = otg0Var.b;
                hdu0 hdu0Var = (hdu0) this.b;
                m9n m9nVar = hdu0Var.Y;
                k5u0 k5u0VarA = hdu0Var.a();
                k5u0 k5u0Var = hdu0Var.S0;
                if (k5u0VarA != null) {
                    k5u0VarB = k5u0VarA;
                } else if (k5u0Var == null) {
                    return;
                } else {
                    k5u0VarB = k5u0Var;
                }
                if (hdu0Var.W0 && !k5u0VarB.e && !k5u0VarB.g && k5u0VarB.f > 0.0f) {
                    k5u0VarB = k5u0.b(k5u0VarB, otg0Var.c, Long.valueOf(j2), (Long) null, false, 0.0f, false, (Integer) null, (List) null, (String) null, (jgc1) null, 0, false, false, 32729);
                }
                if (m9nVar.a()) {
                    zcu0 zcu0VarT = hdu0Var.T(k5u0VarB, (Long) null);
                    long j3 = otg0Var.c;
                    Long lValueOf = Long.valueOf(j2 + hdu0Var.Q0);
                    String str32 = otg0Var.a.a;
                    m9nVar.b.accept(m9nVar.a.a(zcu0.a(zcu0VarT, j3, lValueOf, (Long) null, str32 != null ? new ucu0(str32) : null, (Long) null, 130554)));
                    return;
                }
                return;
            case 21:
                ((veu0) this.b).c.onNext(o4p1.o((PlayerState) obj));
                return;
            case 22:
                ((d0v0) this.b).h.onError((Throwable) obj);
                return;
            case 23:
                ((a6v0) this.b).a.startActivity(new Intent("android.intent.action.VIEW", (Uri) obj));
                return;
            case 24:
                Uri uri = (Uri) obj;
                ypv0 ypv0Var = (ypv0) this.b;
                dg30 dg30VarF0 = ypv0Var.f0();
                if (dg30VarF0 != null) {
                    dg30VarF0.runOnUiThread(new jyh0(ypv0Var, uri, (byte) 10));
                    return;
                }
                return;
            case 25:
                yfu yfuVar = ((wqv0) this.b).d;
                pf61 pf61Var = (pf61) yfuVar.c;
                pf61Var.a();
                b550 b550VarN = GpbCheckoutEvents.n();
                b550VarN.n("in_app_choice_screen_skipped");
                b550VarN.r();
                b550VarN.t(pf61Var.a());
                b550VarN.q();
                b550VarN.v(pf61Var.c());
                ((t2j0) yfuVar.b).a(b550VarN.build());
                return;
            case 26:
                if (((wte0) obj) == wte0.b) {
                    cvw0 cvw0Var = (cvw0) this.b;
                    synchronized (cvw0Var) {
                        kvw0 kvw0Var = ((bvw0) cvw0Var.a.get()).a;
                        utw0 utw0Var = ike1.a;
                        utw0Var.y("RCS");
                        utw0Var.o("Cleaning product state store.", new Object[0]);
                        kvw0Var.a.delete();
                    }
                    return;
                }
                return;
            case 27:
                ((lvw0) this.b).b = (spq0) obj;
                return;
            case 28:
                ((lz6) this.b).invoke(obj);
                return;
            default:
                ((rh0) this.b).a(new yxs0(((ayw0) obj).a));
                return;
        }
    }
}
