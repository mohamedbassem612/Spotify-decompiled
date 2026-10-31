package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qhm implements cvl1, xpw {
    public final /* synthetic */ byte a;
    public boolean b;
    public final psw c;
    public final Object d;
    public final mqw e;
    public final rqw f;

    public qhm(owf1 owf1Var, c3s c3sVar, zwz0 zwz0Var, yjj1 yjj1Var, ynb0 ynb0Var, boolean z) {
        this.a = (byte) 4;
        this.d = ynb0Var;
        this.b = z;
        vwj1 vwj1Var = (vwj1) owf1Var.b;
        any anyVarN = f5p1.n(vwj1Var.a);
        o6x o6xVar = o6x.a;
        Observable map = yoi1.i(anyVarN, o6xVar).map(h2x0.W0);
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.d;
        Flowable flowableA = Flowable.a(map.toFlowable(backpressureStrategy), yoi1.i(vwj1Var.b, o6xVar).toFlowable(backpressureStrategy).J(w1x0.b1), yoi1.i(f5p1.n(vwj1Var.c), o6xVar).toFlowable(backpressureStrategy).J(njx0.W0), yoi1.h(zwz0Var.c(), o6xVar), c3sVar.e.toFlowable(backpressureStrategy), yjj1Var.a().startWithItem(new rwj1(w7x.a)).toFlowable(backpressureStrategy), f2x0.W0);
        flowableA.getClass();
        this.e = d4o1.g(flowableA.t(Functions.a), fsj1.f, new muh1(this, (byte) 25), new xaj1(this, (byte) 20), 8);
        j2i j2iVar = uqj.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
        this.f = n3o1.q(this).a(k3j1.b1, k3j1.c1);
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return this.f;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return this.c;
    }

    public final mqw getBehavior() {
        byte b = this.a;
        poy0 poy0Var = this.e;
        switch (b) {
            case 0:
                return (js20) poy0Var;
            case 1:
                return (e7m0) poy0Var;
            case 2:
                return (e7m0) poy0Var;
            case 3:
                return (rey0) poy0Var;
            default:
                return poy0Var;
        }
    }

    public qhm(njm njmVar) {
        this.a = (byte) 3;
        this.d = njmVar;
        this.e = new rey0(new e9f1(this, (byte) 18));
        this.f = n3o1.q(this).a(swg1.t, swg1.X);
        j2i j2iVar = voj.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public qhm(EventSource eventSource, ObservableTransformer observableTransformer, Scheduler scheduler, boolean z) {
        this.a = (byte) 2;
        this.d = scheduler;
        this.b = z;
        this.e = sbl.z(new qs51(null, false, false, false, null, 16383), t7p0.y, RxConnectables.a(observableTransformer), qr51.c, new hf31(eventSource, this, (byte) 27));
        j2i j2iVar = new j2i(1868038712, new hg31(this, (byte) 17), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
        this.f = n3o1.q(this).a(vp51.c, vp51.d);
    }

    public qhm(pjf0 pjf0Var, vgb vgbVar, eof0 eof0Var, e27 e27Var, z6c z6cVar, Scheduler scheduler, Scheduler scheduler2, zwz0 zwz0Var, Flowable flowable, sqs0 sqs0Var, lnf0 lnf0Var, boolean z, boolean z2, xpw xpwVar) {
        this.a = (byte) 1;
        this.b = z;
        this.d = xpwVar;
        tef0 tef0Var = tef0.j;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.d(ief0.class, new rwa0(pjf0Var, (byte) 15), scheduler);
        subtypeEffectHandlerBuilderC.g(jef0.class, new kef0(lnf0Var, (byte) 0));
        Connectable connectableA = RxConnectables.a(subtypeEffectHandlerBuilderC.h());
        this.e = sbl.B(tef0Var, xxb0.j, connectableA, x5d0.d1, new sef0(eof0Var, z, sqs0Var, zwz0Var, flowable, z2, scheduler2));
        this.f = n3o1.q(this).a(wud0.c1, wud0.d1);
        j2i j2iVar = new j2i(-88731310, new hef0(this, pjf0Var, vgbVar, e27Var, z6cVar, (byte) 0), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public qhm(i3l0 i3l0Var, boolean z) {
        this.a = (byte) 0;
        this.d = i3l0Var;
        this.b = z;
        this.e = x3p1.m(r6x.a, new qrk(this, (byte) 3), new sqk(this, (byte) 4), (o8n) null, new v7l(this, (byte) 16), 8);
        this.f = n3o1.r(this).c(new cml(this, (byte) 6), new v08(this, (byte) 15));
        j2i j2iVar = new j2i(-629266412, new bfm(this, (byte) 4), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }
}
