package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class asg0 extends hab0 implements vu30 {
    public final /* synthetic */ bsg0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asg0(bsg0 bsg0Var) {
        super(2);
        this.a = bsg0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        bsg0 bsg0Var = this.a;
        hzr hzrVar = bsg0Var.f;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        ezr ezrVar = new ezr(hzrVar, (byte) 0);
        Scheduler scheduler = hzrVar.e;
        subtypeEffectHandlerBuilderC.d(crg0.class, ezrVar, scheduler);
        subtypeEffectHandlerBuilderC.c(erg0.class, new ezr(hzrVar, (byte) 1));
        subtypeEffectHandlerBuilderC.d(frg0.class, new ezr(hzrVar, (byte) 2), scheduler);
        subtypeEffectHandlerBuilderC.d(grg0.class, new ezr(hzrVar, (byte) 3), scheduler);
        subtypeEffectHandlerBuilderC.c(drg0.class, new ezr(hzrVar, (byte) 4));
        return Mobius.d(zrg0.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).h(RxEventSources.a(new ObservableSource[]{bsg0Var.g.a.map(olj0.W0)}));
    }
}
