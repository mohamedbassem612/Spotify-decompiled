package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.accessory.categorizer.BluetoothCategorizer;
import com.spotify.base.java.logging.Logger;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.ApplicationState;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.CacheState;
import com.spotify.mobius.MobiusLoop;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRefCount;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ofb implements dwo {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public Object h;

    public ofb(Flowable flowable, kjc kjcVar, b2p b2pVar, b2p b2pVar2, b2p b2pVar3, b2p b2pVar4, b2p b2pVar5) {
        this.b = kjcVar;
        this.c = b2pVar;
        this.d = b2pVar2;
        this.e = b2pVar3;
        this.f = b2pVar4;
        this.g = b2pVar5;
        rku rkuVar = new rku();
        this.h = rkuVar;
        Logger.g("ClientMessagingPlatformDaemon start", new Object[0]);
        ljc ljcVar = (ljc) kjcVar;
        w7x w7xVar = w7x.a;
        if (ljcVar.k == null) {
            MobiusLoop mobiusLoopG = ljcVar.a.g(new klc(ljcVar.b.a() ? ApplicationState.FOREGROUND : ApplicationState.BACKGROUND, ((ht4) ((dsp) ljcVar.c.b).get()).a(), ljcVar.d.b() / 1000, CacheState.LOADING, w7xVar, b7x.a, w7xVar, w7xVar, new ml5(olc.a, amc.a)));
            ljcVar.k = mobiusLoopG;
            vlc vlcVar = ljcVar.f;
            vlcVar.a = mobiusLoopG;
            vlcVar.b = null;
        }
        MobiusLoop mobiusLoop = ljcVar.k;
        if (mobiusLoop != null) {
            mobiusLoop.a(hlc.a);
        }
        rkuVar.b(flowable.subscribe(new mba(this, (byte) 22)));
    }

    public static final void a(ofb ofbVar, m210 m210Var) {
        FlowableRefCount flowableRefCount = new FlowableRefCount(FlowableReplay.g0(yoi1.i(((BluetoothCategorizer) ofbVar.b).categorizeAndUpdateCaches(m210Var.c), o6x.a).toFlowable(BackpressureStrategy.b).J(q9w.N0).L((Scheduler) ofbVar.d), FlowableReplay.f));
        ofbVar.g = flowableRefCount.subscribe(new kfb(ofbVar, (byte) 1), p.g);
        sp00 sp00Var = new sp00(new ObservableFromPublisher(flowableRefCount), m210Var, (i210) ofbVar.e);
        ofbVar.h = sp00Var;
        l4p1.u((llm) sp00Var.e, new lt20(new fu20(z4p1.F(yoi1.g((ObservableFromPublisher) sp00Var.b), 1), new h210(sp00Var, (lnm) null, (byte) 1), (byte) 1), new pq0(3, (lnm) null, (byte) 1), (byte) 0));
    }

    public final void shutdown() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((vku) this.f).c();
                ((BluetoothCategorizer) obj).stop();
                Disposable disposable = (Disposable) this.g;
                if (disposable != null && !disposable.isDisposed()) {
                    Disposable disposable2 = (Disposable) this.g;
                    disposable2.getClass();
                    disposable2.dispose();
                    break;
                }
                break;
            case 1:
                Logger.g("ClientMessagingPlatformDaemon shutdown", new Object[0]);
                MobiusLoop mobiusLoop = ((kjc) obj).k;
                if (mobiusLoop != null) {
                    mobiusLoop.a(glc.a);
                }
                ((rku) this.h).a();
                break;
            default:
                smo1.p((llm) this.g, null);
                ((n4f0) ((kly0) this.d).get()).b(new v7v(this, (byte) 28));
                break;
        }
    }

    public ofb(ke4 ke4Var, r0z0 r0z0Var, r0z0 r0z0Var2, kly0 kly0Var, xvo xvoVar, w6y w6yVar, q8n q8nVar, t6y t6yVar) {
        this.b = r0z0Var;
        this.c = r0z0Var2;
        this.d = kly0Var;
        this.e = w6yVar;
        this.f = t6yVar;
        v62 v62Var = new v62(olj0.T0, (byte) 6);
        llm llmVarE = smo1.e(flo1.l(q8nVar, guo1.B()).y(v62Var));
        this.g = llmVarE;
        this.h = smo1.e(flo1.l(q8nVar, guo1.B()).y(v62Var));
        fn31.T(llmVarE, (o8n) null, 0, new ymu(xvoVar, this, (lnm) null, (byte) 18), 3);
        fn31.T(llmVarE, (o8n) null, 0, new p1r(ke4Var, this, (lnm) null, (byte) 18), 3);
    }

    public ofb(BluetoothCategorizer bluetoothCategorizer, t141 t141Var, Scheduler scheduler, i210 i210Var, Observable observable) {
        this.b = bluetoothCategorizer;
        this.c = t141Var;
        this.d = scheduler;
        this.e = i210Var;
        vku vkuVar = new vku();
        this.f = vkuVar;
        Observable map = observable.subscribeOn(scheduler).filter(fkj0.h).map(m9h.N0).map(p9w.N0);
        Observable observableSubscribeOn = observable.subscribeOn(scheduler);
        mfb mfbVar = mfb.b;
        vkuVar.b(new Disposable[]{map.subscribe(new xu(this, (byte) 13)), observableSubscribeOn.filter(new nfb((byte) 0, false)).subscribe(new kfb(this, (byte) 0))});
    }
}
