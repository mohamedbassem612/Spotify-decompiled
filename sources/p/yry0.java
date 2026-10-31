package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.extras.CompositeLogger;
import com.spotify.mobius.extras.SLF4JLogger;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yry0 extends hab0 implements iu30 {
    public final /* synthetic */ zry0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yry0(zry0 zry0Var) {
        super(1);
        this.a = zry0Var;
    }

    public final Object invoke(Object obj) {
        wry0 wry0Var = this.a.c;
        ury0 ury0Var = new ury0();
        lry0 lry0Var = wry0Var.a;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        wqd0 wqd0Var = new wqd0(lry0Var.a, (byte) 27);
        Scheduler scheduler = lry0Var.b;
        subtypeEffectHandlerBuilderC.b(iry0.class, wqd0Var, scheduler);
        subtypeEffectHandlerBuilderC.g(kry0.class, new ax8(new hox0(lry0Var, (byte) 22), (byte) 2));
        subtypeEffectHandlerBuilderC.d(jry0.class, new lyw0(lry0Var, (byte) 9), scheduler);
        return Mobius.d(ury0Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).h(RxEventSources.a(new ObservableSource[]{((Observable) wry0Var.b.invoke()).map(vry0.a)})).f(CompositeLogger.g(wry0Var.c, new MobiusLoop.Logger[]{new SLF4JLogger("puffin-mobius-onboarding")}));
    }
}
