package p;

import android.service.notification.StatusBarNotification;
import com.google.protobuf.Empty;
import com.spotify.musicappplatform.state.idle.api.MusicAppLock;
import com.spotify.player.model.PlayerState;
import com.spotify.wear.wearabledatalayer.events.proto.WearOSPairedDevice;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vf2 implements dwo {
    public final /* synthetic */ byte a = 2;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public vf2(ywp ywpVar, vgr vgrVar, ywp ywpVar2, ywp ywpVar3, Scheduler scheduler, Scheduler scheduler2) {
        this.b = ywpVar;
        this.c = ywpVar2;
        this.d = ywpVar3;
        vku vkuVar = new vku();
        this.e = vkuVar;
        PublishSubject publishSubject = new PublishSubject();
        this.f = publishSubject;
        Observable observable = (Observable) vgrVar.d;
        Scheduler scheduler3 = (Scheduler) vgrVar.g;
        Observable map = observable.observeOn(scheduler3).map(new rmr(vgrVar, (byte) 7)).filter(xbp1.W0).map(wcp1.V0);
        Observable observableCombineLatest = Observable.combineLatest(((g0l) vgrVar.c).l().filter(uml1.W0).map(pbo1.V0).distinctUntilChanged(qbo1.U0), ((Observable) vgrVar.f).startWithItem(r560.b).map(vgp1.W0).distinctUntilChanged().doOnNext(new cfs(vgrVar, (byte) 0)), cxo1.W0);
        Scheduler scheduler4 = (Scheduler) vgrVar.h;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        vkuVar.a(Observable.merge(map, observableCombineLatest.throttleLast(200L, timeUnit, scheduler4).observeOn(scheduler3).map(new qmr(vgrVar, (byte) 7)).filter(o9p1.X0).map(vap1.V0)).filter(fkj0.e1).map(new qkn0(this, (byte) 19)).subscribeOn(scheduler2).subscribe(new dy40(this, (byte) 16), p.Z0));
        vkuVar.a(publishSubject.filter(kc20.Y0).throttleFirst(500L, timeUnit, scheduler2).observeOn(scheduler).subscribe(new h0u0(this, (byte) 0)));
        vkuVar.a(publishSubject.filter(ud20.X0).observeOn(scheduler).subscribe(new h0u0(this, (byte) 1)));
    }

    public static final /* synthetic */ PublishSubject a(vf2 vf2Var) {
        return (PublishSubject) vf2Var.f;
    }

    public static final void c(vf2 vf2Var, boolean z) {
        vf2Var.g(z, vzm0.a);
    }

    public void d(g0u0 g0u0Var) {
        ArrayList arrayList = g0u0Var.c;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((i0u0) it.next()).c());
        }
        Map mapT = sqg0.T(o7h.v1(arrayList2, g0u0Var.d));
        mapT.toString();
        ffs ffsVar = (ffs) ((ywp) this.d).get();
        k650 k650Var = g0u0Var.a;
        l650 l650Var = g0u0Var.b;
        int iOrdinal = l650Var.ordinal();
        if (iOrdinal == 0) {
            ffsVar.a(k650Var, l650Var, mapT);
        } else if (iOrdinal == 1) {
            ffsVar.a(k650Var, l650Var, mapT);
        } else {
            if (iOrdinal == 2) {
                return;
            }
            eg.o();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(onm onmVar) {
        qgl1 qgl1Var;
        if (onmVar instanceof qgl1) {
            qgl1Var = (qgl1) onmVar;
            int i = qgl1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qgl1Var.d = i - Integer.MIN_VALUE;
            } else {
                qgl1Var = new qgl1(this, onmVar);
            }
        } else {
            qgl1Var = new qgl1(this, onmVar);
        }
        Object objC = qgl1Var.b;
        int i2 = qgl1Var.d;
        if (i2 == 0) {
            hm5.M(objC);
            ygl1 ygl1Var = (ygl1) this.d;
            qgl1Var.a = this;
            qgl1Var.d = 1;
            objC = ygl1Var.c(qgl1Var);
            Object obj = d9n.a;
            if (objC == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = qgl1Var.a;
            hm5.M(objC);
        }
        this.getClass();
        for (omr0 omr0Var : (List) objC) {
            jhl1 jhl1VarN = WearOSPairedDevice.n();
            jhl1VarN.r(omr0Var.a);
            jhl1VarN.n(omr0Var.c);
            jhl1VarN.s(omr0Var.b);
            jhl1VarN.q(omr0Var.d);
            ((t2j0) this.c).a(jhl1VarN.build());
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object f(g0l g0lVar, onm onmVar) {
        tgl1 tgl1Var;
        s0o1 s0o1Var = (s0o1) this.b;
        if (onmVar instanceof tgl1) {
            tgl1Var = (tgl1) onmVar;
            int i = tgl1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tgl1Var.d = i - Integer.MIN_VALUE;
            } else {
                tgl1Var = new tgl1(this, onmVar);
            }
        } else {
            tgl1Var = new tgl1(this, onmVar);
        }
        Object objA = tgl1Var.b;
        int i2 = tgl1Var.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objA);
            p0t p0tVar = (p0t) this.e;
            tgl1Var.a = g0lVar;
            tgl1Var.d = 1;
            objA = p0tVar.a(s0o1Var, tgl1Var);
            if (objA != d9nVar) {
            }
        }
        if (i2 == 1) {
            g0lVar = tgl1Var.a;
            hm5.M(objA);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    hm5.M(objA);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        hyy0 hyy0VarI = hyy0.i("/connect");
        ((vzq) hyy0VarI.c).a.put("com.spotify.wear.connect.id", (String) objA);
        ((iyy0) hyy0VarI.b).d = 0L;
        iyy0 iyy0VarH = hyy0VarI.h();
        j8n1 j8n1Var = ((kz40) s0o1Var).i;
        pwn1 pwn1Var = new pwn1(s0o1Var.l, j8n1Var, iyy0VarH);
        j8n1Var.a.d(0, pwn1Var);
        hfp1 hfp1VarU = ezn1.u(pwn1Var, vem1.c);
        tgl1Var.a = null;
        tgl1Var.d = 3;
        return u890.l(hfp1VarU, tgl1Var) == d9nVar ? d9nVar : rih1Var;
        if (((Boolean) objA).booleanValue()) {
            xkb1 xkb1Var = new xkb1(new ph11(yoi1.g(((inr) g0lVar).j()), (byte) 23), (byte) 18);
            tgl1Var.a = null;
            tgl1Var.d = 2;
            objA = b5p1.i(xkb1Var, tgl1Var);
            if (objA != d9nVar) {
                hyy0 hyy0VarI2 = hyy0.i("/connect");
                ((vzq) hyy0VarI2.c).a.put("com.spotify.wear.connect.id", (String) objA);
                ((iyy0) hyy0VarI2.b).d = 0L;
                iyy0 iyy0VarH2 = hyy0VarI2.h();
                j8n1 j8n1Var2 = ((kz40) s0o1Var).i;
                pwn1 pwn1Var2 = new pwn1(s0o1Var.l, j8n1Var2, iyy0VarH2);
                j8n1Var2.a.d(0, pwn1Var2);
                hfp1 hfp1VarU2 = ezn1.u(pwn1Var2, vem1.c);
                tgl1Var.a = null;
                tgl1Var.d = 3;
                if (u890.l(hfp1VarU2, tgl1Var) == d9nVar) {
                }
            }
        }
    }

    public void g(boolean z, MusicAppLock musicAppLock) {
        kly0 kly0Var = (kly0) this.b;
        if (z) {
            ((oo70) kly0Var.get()).a(musicAppLock);
        } else {
            ((oo70) kly0Var.get()).g(musicAppLock);
        }
    }

    public final void shutdown() {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.f;
        Object obj3 = this.d;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                ((gaa0) obj3).d((CancellationException) null);
                break;
            case 1:
                ((Disposable) obj3).dispose();
                ((Disposable) obj4).dispose();
                ((Disposable) obj2).dispose();
                kly0 kly0Var = (kly0) obj;
                ((oo70) kly0Var.get()).g(vzm0.a);
                ((oo70) kly0Var.get()).g(wzm0.a);
                ((oo70) kly0Var.get()).g(xzm0.a);
                break;
            case 2:
                ((rku) obj4).a();
                znm znmVar = (znm) ((kly0) this.c).get();
                boolean zA = ((lt4) ((a0m) obj).b).a();
                znmVar.g.a();
                znmVar.a();
                if (zA) {
                    try {
                        sl5.a.deInitialize(znmVar.a.getApplicationContext());
                    } catch (Exception e) {
                        znmVar.c.F("DeInitialize error", e);
                        return;
                    }
                }
                break;
            case 3:
                ((vku) obj4).c();
                break;
            case 4:
                ((n4f0) obj3).b(new h2y0(this, (byte) 20));
                ((xxy0) obj4).a();
                break;
            default:
                smo1.p((llm) obj2, (CancellationException) null);
                break;
        }
    }

    public vf2(r0z0 r0z0Var, r0z0 r0z0Var2, n4f0 n4f0Var, xxy0 xxy0Var, zg4 zg4Var, rvy0 rvy0Var) {
        this.b = r0z0Var;
        this.c = r0z0Var2;
        this.d = n4f0Var;
        this.e = xxy0Var;
        this.f = zg4Var;
        List listQ = ljo1.q(rvy0Var.a.b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listQ.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(Integer.valueOf(((StatusBarNotification) it.next()).getId()));
        }
        ewy0 ewy0Var = rvy0Var.b;
        synchronized (ewy0Var.d) {
            try {
                Set setV0 = dm61.v0(o7h.p1(ewy0Var.e()), linkedHashSet);
                Iterator it2 = setV0.iterator();
                while (it2.hasNext()) {
                    int iIntValue = ((Number) it2.next()).intValue();
                    Iterator it3 = ewy0Var.d(iIntValue).iterator();
                    while (it3.hasNext()) {
                        ewy0Var.c(iIntValue, (dwy0) it3.next());
                    }
                }
                ewy0Var.g(setV0);
            } catch (Throwable th) {
                throw th;
            }
        }
        ((xxy0) this.e).c();
        ((r0z0) this.b).a();
        boolean zD = ((zg4) this.f).d();
        r0z0 r0z0Var3 = (r0z0) this.c;
        if (zD) {
            r0z0Var3.a();
        } else {
            r0z0Var3.cancel();
        }
    }

    public vf2(s0o1 s0o1Var, g0l g0lVar, q8n q8nVar, t2j0 t2j0Var, ygl1 ygl1Var, p0t p0tVar) {
        this.b = s0o1Var;
        this.c = t2j0Var;
        this.d = ygl1Var;
        this.e = p0tVar;
        llm llmVarH = us71.h(q8nVar);
        this.f = llmVarH;
        fn31.T(llmVarH, (o8n) null, 0, new z2l(new ud01(this, (lnm) null, (byte) 1), "WearDataLayerService failed to report paired devices", (lnm) null, (byte) 2), 3);
        fn31.T(llmVarH, (o8n) null, 0, new z2l(new ob01(this, g0lVar, (lnm) null, (byte) 23), "WearDataLayerService failed to get connect ID", (lnm) null, (byte) 2), 3);
    }

    public vf2(Flowable flowable, a0m a0mVar, c3s c3sVar, jly0 jly0Var, Scheduler scheduler, Scheduler scheduler2, dlp dlpVar) {
        this.b = a0mVar;
        this.c = jly0Var;
        this.d = dlpVar;
        rku rkuVar = new rku();
        this.e = rkuVar;
        this.f = new ObservableFromPublisher(new FlowableOnBackpressureLatest(flowable.N(PlayerState.EMPTY).x(eh10.P0)).S(1L, TimeUnit.SECONDS, scheduler2).t(Functions.a));
        if (((lt4) a0mVar.b).a()) {
            znm znmVar = (znm) jly0Var.get();
            Flowable flowable2 = znmVar.d;
            znmVar.g.b(x0d.j(flowable2, flowable2).filter(vf61.Z).map(q9w.U0).distinctUntilChanged().subscribeOn(znmVar.e).subscribe(new yrh(znmVar, (byte) 7)));
            sl5.a.initialize(znmVar.a.getApplicationContext(), znmVar.k);
            rkuVar.b(c3sVar.e.distinctUntilChanged().switchMap(new yfc0(this, (byte) 18)).observeOn(scheduler).subscribe(new lrj0(this, (byte) 0)));
        }
    }

    public vf2(kly0 kly0Var, kly0 kly0Var2, Observable observable, Observable observable2, vpp0 vpp0Var) {
        this.b = kly0Var;
        this.c = kly0Var2;
        this.d = vpp0Var.callStream("spotify.offline_esperanto.proto.Offline", "SubscribeTotalProgress", Empty.n()).map(dj20.S0).map(een.T0).distinctUntilChanged().subscribe(new xu(this, (byte) 6));
        this.e = observable.subscribe(new gj8(this, (byte) 0));
        this.f = observable2.subscribe(new gj8(this, (byte) 1));
    }

    public vf2(q44 q44Var, Flowable flowable, ov20 ov20Var, qns0 qns0Var, t8u0 t8u0Var, q8n q8nVar) {
        this.b = ov20Var;
        this.c = qns0Var;
        gaa0 gaa0VarF = op71.f();
        this.d = gaa0VarF;
        llm llmVarE = smo1.e(flo1.l(gaa0VarF, q8nVar));
        this.e = new idd1(df.e);
        this.f = new idd1(new y4(t8u0Var, this, (byte) 27));
        if (q44Var.a()) {
            vbm[] vbmVarArr = q601.a;
            l4p1.u(llmVarE, new lt20(new gk(new tf2(hu20.e(rqt0.u(new ik(new xy0(new kge(flowable), (byte) 2), (byte) 3)), new qt((lnm) null, this, (byte) 5)), (byte) 0), this, (byte) 15), new jk(3, (lnm) null, (byte) 5), (byte) 0));
        }
    }
}
