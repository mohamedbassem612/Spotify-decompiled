package p;

import android.content.Context;
import android.net.ConnectivityManager;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import com.spotify.playtelemetry.playbackoopsinstrumentationimpl.PlaybackOopsBridge;
import io.reactivex.rxjava3.android.plugins.RxAndroidPlugins;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mtt implements dwo {
    public final /* synthetic */ byte a = 23;
    public Object b;

    public mtt(l8s l8sVar) {
        this.b = l8sVar;
        l8sVar.a.getClass();
        rku rkuVar = l8sVar.d;
        n8s n8sVarB = l8sVar.b();
        Observable observableNever = Observable.never();
        kcs kcsVar = n8sVarB.b;
        Set set = n8sVarB.e;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(pdj0.class, new qn1(set, kcsVar, (byte) 3));
        subtypeEffectHandlerBuilderC.g(ndj0.class, new qdj0(set, kcsVar, (byte) 1));
        subtypeEffectHandlerBuilderC.g(mdj0.class, new qdj0(set, kcsVar, (byte) 0));
        subtypeEffectHandlerBuilderC.c(odj0.class, new rwa0(kcsVar, (byte) 29));
        MobiusLoop.Builder builderD = Mobius.d(m8s.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h()));
        q900 q900Var = n8sVarB.a;
        q900Var.getClass();
        ObservableSource observableSourceSubscribeOn = Observable.defer(new o900(q900Var, (byte) 0)).subscribeOn(q900Var.a);
        Observable observableA = n8sVarB.f.a();
        Set set2 = set;
        ArrayList arrayList = new ArrayList(q7h.U(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(((hzi0) it.next()).getState());
        }
        rkuVar.b(observableNever.compose(RxMobius.b(l1d.g(builderD.h(RxEventSources.a(new ObservableSource[]{observableSourceSubscribeOn, Observable.merge(arrayList).map(y580.i1), observableA.distinctUntilChanged().map(bk20.N0)}))), new bej0(b7x.a, false, false))).distinctUntilChanged().observeOn(l8sVar.b().d).subscribe(l8sVar.b().c));
    }

    public final void shutdown() {
        switch (this.a) {
            case 0:
                if (((sun) this.b) != null) {
                    hhp0 hhp0Var = hhp0.a;
                    hhp0Var.unregisterObservableMetric("device.cpu_time");
                    hhp0Var.unregisterObservableMetric("device.battery_level");
                }
                break;
            case 1:
                ((fut) this.b).a();
                break;
            case 2:
                ((sut) this.b).a();
                break;
            case 3:
                ((bvt) this.b).a();
                break;
            case 4:
                ((ezt) this.b).a();
                break;
            case 5:
                pev pevVar = (pev) this.b;
                pevVar.a.e.remove(pevVar.e);
                if (pevVar.c) {
                    pevVar.a();
                }
                break;
            case 6:
                fuz fuzVar = (fuz) this.b;
                f5t f5tVar = fuzVar.d;
                fuzVar.d = a5t.a;
                f5tVar.cancel();
                break;
            case 7:
                hs00 hs00Var = (hs00) this.b;
                hs00Var.getClass();
                hs00Var.h = BehaviorSubject.g(z6x.a);
                hs00Var.g.a(EmptyDisposable.a);
                hs00Var.e.set(false);
                hs00Var.f.e();
                break;
            case 8:
                i210 i210Var = (i210) this.b;
                i210Var.h = false;
                i210Var.g.clear();
                op71.q(i210Var.e.a, (CancellationException) null);
                op71.r(i210Var.b.b.a);
                break;
            case 9:
                ((p250) this.b).a();
                break;
            case 10:
                Disposable disposable = (Disposable) this.b;
                if (disposable != null) {
                    disposable.dispose();
                }
                break;
            case 11:
                ((c3s) this.b).a();
                break;
            case 12:
                f9c0 f9c0Var = (f9c0) this.b;
                op71.q(f9c0Var.b.a, (CancellationException) null);
                f9c0Var.d.m((Object) null, f9c0Var.c);
                break;
            case 13:
                ((d2k) this.b).stop();
                break;
            case 14:
                ((qr90) this.b).stop();
                break;
            case 15:
                ((o6s) this.b).a();
                break;
            case 16:
                ywh0 ywh0Var = (ywh0) this.b;
                Iterator it = ywh0Var.a.iterator();
                while (it.hasNext()) {
                    ywh0Var.b.a(new cc00((xwh0) it.next(), (byte) 27));
                }
                break;
            case 17:
                ((l8s) this.b).d.a();
                break;
            case 18:
                ((x6m0) this.b).a();
                break;
            case 19:
                ((u2o0) this.b).a();
                break;
            case 20:
                ((y2o0) this.b).a();
                break;
            case 21:
                c8o0 c8o0Var = (c8o0) this.b;
                if (c8o0Var != null) {
                    c8o0Var.m.d((CancellationException) null);
                    smo1.p(c8o0Var.l, (CancellationException) null);
                }
                break;
            case 22:
                ((tiq0) this.b).b.c = false;
                break;
            case 23:
                hhp0 hhp0Var2 = hhp0.a;
                khp0 khp0VarX = hhp0.x();
                khp0 khp0Var = khp0VarX instanceof khp0 ? khp0VarX : null;
                if (khp0Var != null) {
                    khp0Var.y = null;
                }
                this.b = null;
                break;
            case 24:
                ((rku) ((zsc) this.b).e).a();
                break;
            case 25:
                ((j0u0) this.b).a();
                break;
            case 26:
                e2u0 e2u0Var = (e2u0) this.b;
                e2u0Var.c = false;
                e2u0Var.b();
                PlaybackOopsBridge.INSTANCE.setInstrumentation((c2u0) null);
                break;
            case 27:
                ((ifs) this.b).a();
                break;
            case 28:
                ((lkx0) this.b).a();
                break;
            default:
                kdy0 kdy0Var = (kdy0) this.b;
                if (kdy0Var != null) {
                    smo1.p((llm) kdy0Var.b, (CancellationException) null);
                }
                break;
        }
    }

    public mtt(fut futVar) {
        this.b = futVar;
        futVar.b();
    }

    public mtt(sut sutVar) {
        this.b = sutVar;
        sutVar.b();
    }

    public mtt(bvt bvtVar) {
        this.b = bvtVar;
        bvtVar.b();
    }

    public mtt(fuz fuzVar) {
        this.b = fuzVar;
        fuzVar.d = new uo5(fuzVar.a, fuzVar.b, fuzVar.c);
    }

    public mtt(x6m0 x6m0Var) {
        this.b = x6m0Var;
        x6m0Var.b();
    }

    public mtt(u2o0 u2o0Var) {
        this.b = u2o0Var;
        u2o0Var.b();
    }

    public mtt(y2o0 y2o0Var) {
        this.b = y2o0Var;
        y2o0Var.b();
    }

    public mtt(j0u0 j0u0Var) {
        this.b = j0u0Var;
        j0u0Var.b();
    }

    public mtt(lkx0 lkx0Var) {
        this.b = lkx0Var;
        lkx0Var.b();
    }

    public mtt(c3s c3sVar) {
        this.b = c3sVar;
        c3sVar.b();
    }

    public mtt(o6s o6sVar) {
        this.b = o6sVar;
        o6sVar.b();
    }

    public /* synthetic */ mtt() {
    }

    public mtt(ifs ifsVar) {
        this.b = ifsVar;
        ifsVar.b();
    }

    public mtt(ezt eztVar) {
        this.b = eztVar;
        eztVar.b();
    }

    public mtt(hs00 hs00Var) {
        this.b = hs00Var;
        hs00Var.g.a(hs00Var.b.distinctUntilChanged().doOnNext(new xu(hs00Var, (byte) 27)).flatMapMaybe(new lmw(hs00Var, (byte) 9)).subscribeOn(hs00Var.a).subscribe(new cfs(hs00Var, (byte) 25), p.Q0));
    }

    public mtt(i210 i210Var) {
        this.b = i210Var;
        llm llmVar = i210Var.e;
        i210Var.h = true;
        LinkedHashSet linkedHashSet = i210Var.f;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            c921.y(llmVar, (o8n) null, 0, new hl1(true, i210Var, (m210) it.next(), (lnm) null, (byte) 6), 3);
        }
        linkedHashSet.clear();
        boolean zA = i210Var.d.a();
        h241 h241Var = i210Var.c;
        if (zA) {
            l4p1.u(llmVar, new fu20(d5p1.h(h241Var.c), new u98(2, i210Var, i210.class, "reconcileSessionAccessories", "reconcileSessionAccessories(Ljava/util/List;)V", 4, (byte) 8), (byte) 1));
        } else {
            l4p1.u(llmVar, new fu20(yoi1.g(h241Var.b.distinctUntilChanged()), new h210(i210Var, (lnm) null, (byte) 0), (byte) 1));
        }
    }

    public mtt(p250 p250Var) {
        this.b = p250Var;
        p250Var.b();
    }

    public mtt(f9c0 f9c0Var) {
        this.b = f9c0Var;
        f9c0Var.d.m((Object) null, f9c0Var.c);
        l4p1.u(f9c0Var.b, new fu20((mr20) f9c0Var.a.b, new e9c0(f9c0Var, (lnm) null, (byte) 0), (byte) 1));
    }

    public mtt(tiq0 tiq0Var) {
        this.b = tiq0Var;
        tiq0Var.b.c = true;
    }

    public mtt(x84 x84Var, k790 k790Var) {
        Disposable disposableB;
        Logger.g("[InteropMonitor] enabled: " + x84Var.a(), new Object[0]);
        if (x84Var.a()) {
            dq7 dq7Var = new dq7(k790Var.c, (byte) 14);
            CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
            CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
            i790 i790Var = new i790(k790Var);
            jd11 jd11Var = rc11.a;
            coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(a790.class), runSequentially.a(i790Var));
            coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(b790.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new j790(k790Var)));
            MobiusLoop.Builder builderD = Mobius.d(dq7Var, new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI));
            Set set = k790Var.a;
            EventSource eventSource = (EventSource) o7h.p0(set);
            EventSource[] eventSourceArr = (EventSource[]) o7h.k0(set, 1).toArray(new EventSource[0]);
            disposableB = l1d.g(builderD.c(eventSource, (EventSource[]) Arrays.copyOf(eventSourceArr, eventSourceArr.length))).g(new l790(new m790(false, false, false, 0, false, false, 0L, false, false, false, false, 0L, 0L, false, 0L, 0L), w7x.a)).b(z690.a);
        } else {
            disposableB = null;
        }
        this.b = disposableB;
    }

    public mtt(lmw lmwVar) {
        qr90 qr90Var = (qr90) lmwVar.b;
        this.b = qr90Var;
        qr90Var.start();
    }

    public mtt(ywh0 ywh0Var) {
        this.b = ywh0Var;
        Iterator it = ywh0Var.a.iterator();
        while (it.hasNext()) {
            ywh0Var.b.a(new tzf0((xwh0) it.next(), (byte) 27));
        }
    }

    public mtt(e2u0 e2u0Var, kx4 kx4Var) {
        this.b = e2u0Var;
        boolean zA = kx4Var.a();
        e2u0Var.c = zA;
        if (!zA) {
            e2u0Var.b();
        }
        if (kx4Var.a()) {
            PlaybackOopsBridge.INSTANCE.setInstrumentation(e2u0Var);
        }
        int iB = kx4Var.b();
        hhp0 hhp0Var = hhp0.a;
        yiq0.c(iB, "playback.start", "baseline");
        yiq0.c(kx4Var.c(), "playback.start", "detailed");
    }

    public mtt(zsc zscVar) {
        this.b = zscVar;
        rku rkuVar = (rku) zscVar.e;
        Observable observableSwitchMap = ((o241) zscVar.d).a.map(new hfr("type", (byte) 16)).distinctUntilChanged().map(new qpp0((byte) 19)).distinctUntilChanged().switchMap(new pjq0(zscVar, (byte) 16));
        Scheduler scheduler = AndroidSchedulers.a;
        RxAndroidPlugins.b(scheduler);
        rkuVar.b(observableSwitchMap.observeOn(scheduler).subscribe(new fv5(zscVar, (byte) 10), new jld(zscVar)));
    }

    public mtt(d2k d2kVar) {
        this.b = d2kVar;
        d2kVar.start();
    }

    public mtt(q8n q8nVar, v4g1 v4g1Var, yqg yqgVar, ax4 ax4Var) {
        hhp0 hhp0Var = hhp0.a;
        this.b = hhp0.y() ? new c8o0(q8nVar, v4g1Var, yqgVar, !ax4Var.i()) : null;
    }

    public mtt(fnh0 fnh0Var, n2t n2tVar, m54 m54Var) {
        pev pevVar = new pev(fnh0Var, n2tVar, !m54Var.c());
        this.b = pevVar;
        fnh0Var.e.add(pevVar.e);
    }

    public mtt(zwz0 zwz0Var, q8n q8nVar, r3b1 r3b1Var, Context context) {
        hhp0 hhp0Var = hhp0.a;
        this.b = hhp0.y() ? new kdy0(zwz0Var, q8nVar, r3b1Var, new vwz0((ConnectivityManager) context.getApplicationContext().getSystemService(ConnectivityManager.class), (byte) 0)) : null;
    }

    public mtt(Context context, ax4 ax4Var) {
        sun sunVar;
        hhp0 hhp0Var = hhp0.a;
        if (hhp0.y() && ax4Var.g()) {
            nbc nbcVar = new nbc((byte) 16);
            sunVar = new sun(new opg(nbcVar, (byte) 8), new rp5(context.getApplicationContext()));
        } else {
            sunVar = null;
        }
        this.b = sunVar;
    }
}
