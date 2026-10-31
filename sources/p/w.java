package p;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.coremediarenderer.bridge.CmrBridge;
import com.spotify.player.model.AudioStream;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableUnsubscribeOn;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRefCount;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w implements dwo {
    public final /* synthetic */ byte a;
    public final Object b;

    public w(vsg vsgVar, CmrBridge cmrBridge) {
        usg usgVar;
        this.a = (byte) 10;
        if (cmrBridge != null) {
            otg otgVar = cmrBridge.a;
            j0d1 j0d1VarB = guo1.B();
            fns fnsVar = igu.a;
            llm llmVarE = smo1.e(flo1.l(j0d1VarB, pyf0.a));
            vwj1 vwj1Var = vsgVar.b;
            nwj1 nwj1Var = vsgVar.c;
            svj1 svj1VarC = nwj1Var.c();
            svj1 svj1VarB = nwj1Var.b();
            dxz0 dxz0Var = vsgVar.d;
            ntg ntgVar = new ntg(vwj1Var, dxz0Var.b().b ? svj1VarC : svj1VarB, new qka(1, cmrBridge.a, otg.class, "forgetPlayback", "forgetPlayback(Ljava/lang/String;)V", 0, (byte) 24), new j1(2, cmrBridge.a, otg.class, "setMaxVideoResolution", "setMaxVideoResolution(Ljava/lang/String;Lcom/spotify/coremediarenderer/bridge/CmrVideoResolution;)V", 0, (byte) 17));
            x9q x9qVar = vsgVar.a;
            dg8 dg8Var = new dg8(cmrBridge, (byte) 22);
            daq daqVar = x9qVar.a.a;
            wtg wtgVar = new wtg((cug) daqVar.M8.get(), dg8Var, new cua((byte) 2), new eug((Context) daqVar.x1.a), (jtg) daqVar.N8.get(), (ftg) daqVar.P8.get());
            zia ziaVar = nwj1Var.c;
            if (!ziaVar.c()) {
                ziaVar.accept(nwj1Var.c());
            }
            ezc ezcVarG = yoi1.g(ziaVar);
            zia ziaVar2 = nwj1Var.d;
            if (!ziaVar2.c()) {
                ziaVar2.accept(nwj1Var.b());
            }
            tsg tsgVar = new tsg(wtgVar, ntgVar, rqt0.u(h5p1.s(ezcVarG, yoi1.g(ziaVar2), yoi1.g(dxz0Var.c()), ptg.h)), otgVar.d, llmVarE);
            otgVar.a(tsgVar);
            cmrBridge.d(tsgVar);
            usgVar = new usg(cmrBridge, tsgVar, wtgVar);
        } else {
            usgVar = null;
        }
        this.b = usgVar;
    }

    public final void shutdown() {
        boolean zIsTerminated;
        byte b = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                fnh0 fnh0Var = (fnh0) obj;
                w2z w2zVar = fnh0Var.g;
                w2zVar.u(new kz20(false, AudioStream.DEFAULT, enh0.b, 2));
                jnh0 jnh0Var = fnh0Var.c;
                Handler handler = jnh0Var.b;
                if (handler != null) {
                    handler.post(new unc0(fnh0Var.a, fnh0Var.h, w2zVar, fnh0Var.f, fnh0Var.b, jnh0Var, fnh0Var.e, (byte) 1));
                }
                break;
            case 1:
                ((jb0) obj).a();
                break;
            case 2:
                ip31 ip31Var = (ip31) obj;
                smo1.p((llm) ip31Var.h, (CancellationException) null);
                op71.r(((i42) ip31Var.e).c.a);
                op71.r(((liv0) ip31Var.b).c.a);
                ((fza1) ip31Var.d).c(false);
                tp7 tp7Var = (tp7) ip31Var.f;
                ((rku) tp7Var.i).a();
                SensorEventListener sensorEventListener = (ptt) tp7Var.e;
                ((ptt) sensorEventListener).j.clear();
                smo1.p(((ptt) sensorEventListener).i, (CancellationException) null);
                ((ptt) sensorEventListener).b.unregisterListener(sensorEventListener);
                ((ptt) sensorEventListener).a = false;
                BroadcastReceiver broadcastReceiver = (aia) tp7Var.j;
                if (broadcastReceiver != null) {
                    ((Context) tp7Var.b).unregisterReceiver(broadcastReceiver);
                    tp7Var.j = null;
                }
                op71.r(((bqb1) tp7Var.c).b.a);
                dy0 dy0Var = (dy0) ip31Var.i;
                if (dy0Var != null) {
                    op71.q(dy0Var.b.a, (CancellationException) null);
                }
                ip31Var.i = null;
                break;
            case 3:
                ((kwc1) obj).a();
                break;
            case 4:
                ((sfr) obj).a();
                break;
            case 5:
                ((lk) obj).a();
                break;
            case 6:
                ((pnr) obj).a();
                break;
            case 7:
                ((d89) obj).a();
                break;
            case 8:
                ((hir) obj).a();
                break;
            case 9:
                gkb gkbVar = (gkb) obj;
                gkbVar.a.unregisterReceiver(gkbVar.e);
                break;
            case 10:
                AutoCloseable autoCloseable = (usg) obj;
                if (autoCloseable != null) {
                    if (autoCloseable instanceof AutoCloseable) {
                        autoCloseable.close();
                    } else if (autoCloseable instanceof ExecutorService) {
                        ExecutorService executorService = (ExecutorService) autoCloseable;
                        if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                            executorService.shutdown();
                            while (!zIsTerminated) {
                                try {
                                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                } catch (InterruptedException unused) {
                                    if (!z) {
                                        executorService.shutdownNow();
                                        z = true;
                                    }
                                }
                            }
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    } else {
                        bhn0.q();
                    }
                }
                break;
            case 11:
                ((h0l) obj).a();
                break;
            case 12:
                ((knr) obj).a();
                break;
            case 13:
                ((rtz) obj).a();
                break;
            case 14:
                ((qig) obj).a();
                break;
            case 15:
                ((sor) obj).a();
                break;
            case 16:
                ((zor) obj).a();
                break;
            case 17:
                ((bpr) obj).a();
                break;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ((vtk1) obj).a();
                break;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((fpr) obj).a();
                break;
            case 20:
                gal galVar = (gal) obj;
                if (galVar != null) {
                    smo1.p((llm) galVar.c, (CancellationException) null);
                }
                break;
            case 21:
                for (fgb fgbVar : (Set) obj) {
                    Disposable disposable = fgbVar.c;
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    fgbVar.c = null;
                }
                break;
            case 22:
                ((vku) ((a680) obj).f).c();
                break;
            case 23:
                ((vdr) obj).a();
                break;
            case 24:
                ((agr) obj).a();
                break;
            case 25:
                ((bor) obj).a();
                break;
            case 26:
                ((apr) obj).a();
                break;
            case 27:
                ((lur) obj).a();
                break;
            case 28:
                ((f8s) obj).a();
                break;
            default:
                ((hqt) obj).a();
                break;
        }
    }

    public w(lk lkVar) {
        this.a = (byte) 5;
        this.b = lkVar;
        lkVar.b();
    }

    public w(jb0 jb0Var) {
        this.a = (byte) 1;
        this.b = jb0Var;
        jb0Var.b();
    }

    public w(d89 d89Var) {
        this.a = (byte) 7;
        this.b = d89Var;
        d89Var.b();
    }

    public w(qig qigVar) {
        this.a = (byte) 14;
        this.b = qigVar;
        qigVar.b();
    }

    public w(vdr vdrVar) {
        this.a = (byte) 23;
        this.b = vdrVar;
        vdrVar.b();
    }

    public w(pnr pnrVar) {
        this.a = (byte) 6;
        this.b = pnrVar;
        pnrVar.b();
    }

    public w(apr aprVar) {
        this.a = (byte) 26;
        this.b = aprVar;
        aprVar.b();
    }

    public w(hqt hqtVar) {
        this.a = (byte) 29;
        this.b = hqtVar;
        hqtVar.b();
    }

    public w(Set set) {
        this.a = (byte) 21;
        this.b = set;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            fgb fgbVar = (fgb) it.next();
            Observable map = fgbVar.a.map(t9w.N0).distinctUntilChanged().map(e4y.N0);
            Observable observable = fgbVar.b;
            egb egbVar = egb.b;
            fgbVar.c = Observable.merge(map, observable.map(new dgb((byte) 0)).distinctUntilChanged().map(s9w.N0)).subscribe(new mba(fgbVar, (byte) 6));
        }
    }

    public w(gkb gkbVar) {
        this.a = (byte) 9;
        this.b = gkbVar;
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
        boolean zIsEnabled = gkbVar.c.isEnabled();
        Context context = gkbVar.a;
        jlb jlbVar = gkbVar.e;
        if (zIsEnabled) {
            i2p1.s(context, jlbVar, intentFilter, 24);
        } else {
            x74.g0(context, jlbVar, intentFilter, new Handler(Looper.getMainLooper()), 2);
        }
    }

    public w(h0l h0lVar) {
        this.a = (byte) 11;
        this.b = h0lVar;
        ((inr) h0lVar).b();
    }

    public w(agr agrVar) {
        this.a = (byte) 24;
        this.b = agrVar;
        agrVar.b();
    }

    public w(hir hirVar) {
        this.a = (byte) 8;
        this.b = hirVar;
        hirVar.b();
    }

    public w(knr knrVar) {
        this.a = (byte) 12;
        this.b = knrVar;
        knrVar.b();
    }

    public w(bor borVar) {
        this.a = (byte) 25;
        this.b = borVar;
        borVar.b();
    }

    public w(sor sorVar) {
        this.a = (byte) 15;
        this.b = sorVar;
        sorVar.b();
    }

    public w(zor zorVar) {
        this.a = (byte) 16;
        this.b = zorVar;
        zorVar.b();
    }

    public w(bpr bprVar) {
        this.a = (byte) 17;
        this.b = bprVar;
        bprVar.b();
    }

    public w(fpr fprVar) {
        this.a = (byte) 19;
        this.b = fprVar;
        fprVar.b();
    }

    public w(kwc1 kwc1Var) {
        this.a = (byte) 3;
        this.b = kwc1Var;
        kwc1Var.b();
    }

    public w(vtk1 vtk1Var) {
        this.a = (byte) 18;
        this.b = vtk1Var;
        vtk1Var.b();
    }

    public w(sfr sfrVar, dpb dpbVar) {
        this.a = (byte) 4;
        this.b = sfrVar;
        if (dpbVar.isEnabled()) {
            sfrVar.b();
        }
    }

    public w(ttz ttzVar, q8n q8nVar) {
        this.a = (byte) 20;
        hhp0 hhp0Var = hhp0.a;
        this.b = hhp0.y() ? new gal(ttzVar, q8nVar) : null;
    }

    public w(a680 a680Var) {
        this.a = (byte) 22;
        this.b = a680Var;
        ObservableRefCount observableRefCountF = ((Observable) a680Var.c).replay(1).f();
        vku vkuVar = (vku) a680Var.f;
        vkuVar.a(observableRefCountF.skip(1L).observeOn((Scheduler) a680Var.d).subscribe(new yrh((s1r) ((idd1) a680Var.e).getValue(), (byte) 10), p.X));
        Completable completableIgnoreElement = observableRefCountF.take(1L).firstOrError().ignoreElement();
        o1r o1rVar = (o1r) a680Var.b;
        idd1 idd1Var = o1rVar.c;
        vkuVar.a(completableIgnoreElement.d(Observable.just(Boolean.valueOf(((ConnectivityManager) idd1Var.getValue()).isActiveNetworkMetered() && ((ConnectivityManager) idd1Var.getValue()).getRestrictBackgroundStatus() == 3)).concatWith(Observable.merge(new y5c(o1rVar.a, new IntentFilter("android.net.conn.RESTRICT_BACKGROUND_CHANGED"), o1rVar.b).filter(vf61.N0), Observable.create(new n4b(o1rVar, (byte) 25))).map(new a0m(o1rVar, (byte) 10))).distinctUntilChanged()).subscribe(new yrh((t1r) a680Var.a, (byte) 11), fcc.Q0));
    }

    public w(ip31 ip31Var) {
        Disposable disposableSubscribe;
        this.a = (byte) 2;
        this.b = ip31Var;
        bw20 bw20Var = (ov20) ip31Var.g;
        l4p1.u((llm) ip31Var.h, new fu20(new x010(bw20Var.a("ads", false), bw20Var.a("ad-formats-preroll-video", false), ww0.h, (byte) 1), new xw0(ip31Var, (lnm) null, (byte) 0), (byte) 1));
        tp7 tp7Var = (tp7) ip31Var.f;
        SensorEventListener sensorEventListener = (ptt) tp7Var.e;
        Scheduler scheduler = (Scheduler) tp7Var.f;
        if (tp7Var.a) {
            disposableSubscribe = new FlowableUnsubscribeOn(eso1.A((x8c0) tp7Var.g).W(scheduler), scheduler).J(gex0.Q0).t(Functions.a).J(hgx0.Q0).subscribe(new z2a1(tp7Var, (byte) 6));
        } else {
            disposableSubscribe = ((Observable) tp7Var.h).observeOn(scheduler).subscribe(new dy40(tp7Var, (byte) 26));
            disposableSubscribe.getClass();
        }
        ((rku) tp7Var.i).b(disposableSubscribe);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        Context context = (Context) tp7Var.b;
        aia aiaVar = new aia((KeyguardManager) context.getSystemService("keyguard"), tp7Var, (byte) 2);
        tp7Var.j = aiaVar;
        context.registerReceiver(aiaVar, intentFilter, null, (Handler) tp7Var.d);
        Sensor sensor = ((ptt) sensorEventListener).c;
        if (sensor != null) {
            ((ptt) sensorEventListener).b.registerListener(sensorEventListener, sensor, 3);
            ((ptt) sensorEventListener).a = true;
            fn31.T(((ptt) sensorEventListener).i, (o8n) null, 0, new n5s(sensorEventListener, (lnm) null, (byte) 22), 3);
            ((ptt) sensorEventListener).j.add((rpb1) tp7Var.k);
            return;
        }
        ((bqb1) tp7Var.c).a(5, "Not Supported");
    }

    public /* synthetic */ w(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
