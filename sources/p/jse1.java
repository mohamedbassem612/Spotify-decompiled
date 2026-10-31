package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jse1 implements xse1 {
    public final Scheduler a;
    public final ore1 b;
    public final ewn0 c;

    public jse1(Scheduler scheduler, ore1 ore1Var, ewn0 ewn0Var) {
        this.a = scheduler;
        this.b = ore1Var;
        this.c = ewn0Var;
    }

    public final MobiusLoop.Builder a(Consumer consumer) {
        gse1 gse1Var = new gse1();
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        ore1 ore1Var = this.b;
        subtypeEffectHandlerBuilderC.g(lre1.class, new nre1(ore1Var, (byte) 0));
        subtypeEffectHandlerBuilderC.c(mre1.class, new k1p0(consumer, (byte) 12));
        subtypeEffectHandlerBuilderC.g(kre1.class, new nre1(ore1Var, (byte) 1));
        return gvg.d("seadragon", Mobius.d(gse1Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).h(RxEventSources.a(new ObservableSource[]{new ObservableFromPublisher(ytp0.q((ytp0) this.c.b)).map(ud20.Y0)})).b(new hse1(this)).d(new ise1(this)));
    }
}
