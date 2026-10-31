package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.MobiusAndroid;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q1p0 {
    public final Flowable a;
    public final yjj1 b;
    public final unr c;
    public final e7p0 d;
    public final ior e;
    public final yqg f;
    public final o241 g;
    public final x981 h;
    public final ffb0 i;
    public final cbv j;
    public final Scheduler k;
    public final Scheduler l;
    public final gh4 m;
    public final au90 n;

    public q1p0(Flowable flowable, yjj1 yjj1Var, unr unrVar, e7p0 e7p0Var, ior iorVar, yqg yqgVar, o241 o241Var, x981 x981Var, ffb0 ffb0Var, cbv cbvVar, Scheduler scheduler, Scheduler scheduler2, gh4 gh4Var, au90 au90Var) {
        this.a = flowable;
        this.b = yjj1Var;
        this.c = unrVar;
        this.d = e7p0Var;
        this.e = iorVar;
        this.f = yqgVar;
        this.g = o241Var;
        this.h = x981Var;
        this.i = ffb0Var;
        this.j = cbvVar;
        this.k = scheduler;
        this.l = scheduler2;
        this.m = gh4Var;
        this.n = au90Var;
    }

    public final MobiusLoop.Controller a(u9c0 u9c0Var) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        lrj0 lrj0Var = new lrj0(this.d, (byte) 19);
        Scheduler scheduler = this.k;
        subtypeEffectHandlerBuilderC.d(uzo0.class, lrj0Var, scheduler);
        subtypeEffectHandlerBuilderC.d(tzo0.class, new lrj0(this.e, (byte) 18), scheduler);
        ffb0 ffb0Var = this.i;
        byte b = 20;
        subtypeEffectHandlerBuilderC.d(vzo0.class, new lrj0(ffb0Var, b), scheduler);
        MobiusLoop.Builder builderD = Mobius.d(o1p0.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).d(new p1p0(this));
        ezc ezcVarG = yoi1.g(this.b.a());
        yv8 yv8Var = this.c.c;
        wao0 wao0Var = new wao0(1, this.j, cbv.class, "indicatorEligibleToShowForTrack", "indicatorEligibleToShowForTrack(Lcom/spotify/player/model/ContextTrack;)Z", 0, (byte) 2);
        n0g0 n0g0Var = new n0g0(0, this.f, yqg.class, "currentTimeMillis", "currentTimeMillis()J", 0, (byte) 29);
        Flowable flowable = this.a;
        ObservableSource map = new ObservableFromPublisher(flowable).map(new bnj0(n0g0Var, wao0Var, b)).distinctUntilChanged().map(cj20.R0);
        ObservableFromPublisher observableFromPublisher = new ObservableFromPublisher(flowable);
        gh4 gh4Var = this.m;
        ht20 ht20Var = gh4Var.j() ? new ht20(ezcVarG, new pk50(2, (lnm) null, (byte) 14)) : d5p1.t(ezcVarG, u9c0Var, ey71.a, new rwj1(w7x.a));
        Observable observableDistinctUntilChanged = observableFromPublisher.filter(rh20.R0).distinctUntilChanged(xi20.S0);
        o6x o6xVar = o6x.a;
        ObservableSource map2 = Observable.combineLatest(observableDistinctUntilChanged, yoi1.i(ht20Var, o6xVar).map(yi20.Q0).distinctUntilChanged(), this.g.a("allow-child-video", "true").map(zi20.O0).distinctUntilChanged(), observableFromPublisher.compose(this.h), new ruc0((Object) gh4Var, (byte) 24)).distinctUntilChanged().map(aj20.R0);
        ObservableSource map3 = yoi1.i(yv8Var, o6xVar).map(kc20.R0).distinctUntilChanged().map(ud20.R0);
        ObservableSource map4 = yoi1.i(new x010(ffb0Var.c, ffb0Var.a(), new n6d(ffb0Var, (lnm) null, (byte) 1), (byte) 1), o6xVar).distinctUntilChanged().map(bj20.R0);
        au90 au90Var = this.n;
        return MobiusAndroid.b(gvg.d("NowPlayingBar", builderD.h(RxEventSources.a(new ObservableSource[]{map, map2, map3, map4, yoi1.i(new r6k0(!((no4) au90Var.b.a.get()).B() ? new huz(Boolean.FALSE, (byte) 10) : rqt0.u(new ry50(au90Var.a.b.current(), (byte) 17)), (byte) 22), o6xVar)}))), new t1p0(gbu0.a, u9m.a, a7l.a, false, false, false), new n1p0());
    }
}
