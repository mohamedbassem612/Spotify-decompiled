package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import spotify.collection.esperanto.proto.CollectionGetArtistViewRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class e2h implements c8m0 {
    public final /* synthetic */ z0h a;
    public final /* synthetic */ cce b;
    public final /* synthetic */ Scheduler c;

    public e2h(z0h z0hVar, cce cceVar, Scheduler scheduler) {
        this.a = z0hVar;
        this.b = cceVar;
        this.c = scheduler;
    }

    public final MobiusLoop.Controller a(Object obj, bk1 bk1Var) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        z0h z0hVar = this.a;
        subtypeEffectHandlerBuilderC.g(n0h.class, new x0h(z0hVar, (byte) 2));
        subtypeEffectHandlerBuilderC.g(u0h.class, new x0h(z0hVar, (byte) 3));
        subtypeEffectHandlerBuilderC.g(v0h.class, new x0h(z0hVar, (byte) 4));
        subtypeEffectHandlerBuilderC.g(q0h.class, new x0h(z0hVar, (byte) 5));
        subtypeEffectHandlerBuilderC.g(o0h.class, new x0h(z0hVar, (byte) 6));
        subtypeEffectHandlerBuilderC.g(t0h.class, new x0h(z0hVar, (byte) 7));
        subtypeEffectHandlerBuilderC.g(r0h.class, new x0h(z0hVar, (byte) 8));
        subtypeEffectHandlerBuilderC.g(s0h.class, new x0h(z0hVar, (byte) 9));
        subtypeEffectHandlerBuilderC.g(p0h.class, new y0h(bk1Var, (byte) 0));
        subtypeEffectHandlerBuilderC.g(w0h.class, new x0h(z0hVar, (byte) 0));
        subtypeEffectHandlerBuilderC.g(m0h.class, new x0h(z0hVar, (byte) 1));
        MobiusLoop.Builder builderD = Mobius.d(a2h.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h()));
        cce cceVar = this.b;
        k0h k0hVar = (k0h) cceVar.b;
        i0h i0hVar = new i0h(new nwd(((xrc0) k0hVar.a.get()).k(k0hVar.e, k0h.f), (byte) 13), (byte) 0);
        o6x o6xVar = o6x.a;
        Observable observableMerge = Observable.merge(yoi1.i(i0hVar, o6xVar), j2h1.D(o6xVar, new bag(k0hVar, (lnm) null, (byte) 9)).w());
        s4b1 s4b1Var = k0hVar.d;
        r5h r5hVar = k0hVar.c;
        b4h b4hVarN = CollectionGetArtistViewRequest.n();
        b4hVarN.r(s4b1Var.F());
        b4hVarN.q(k0h.g);
        b4hVarN.n(k0h.h);
        MobiusLoop.Builder builderH = builderD.h(RxEventSources.a(new ObservableSource[]{Observable.combineLatest(observableMerge, r5hVar.d(b4hVarN.build()).map(qzs0.Q0), pzs0.P0).distinctUntilChanged().map(u321.Q0), ((Observable) cceVar.d).map(uh21.Q0)}));
        Scheduler scheduler = this.c;
        return Mobius.b(builderH.d(new b2h(scheduler)).b(new c2h(scheduler)), (i2h) obj, d2h.a, MainThreadWorkRunner.a());
    }
}
