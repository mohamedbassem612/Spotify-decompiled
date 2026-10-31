package p;

import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ai21 {
    public final lux0 a;
    public final lzn0 b;
    public final ObservableTransformer c;

    public ai21(lux0 lux0Var, lzn0 lzn0Var, Scheduler scheduler) {
        this.a = lux0Var;
        this.b = lzn0Var;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(zh21.class, new yx11(this, (byte) 1));
        subtypeEffectHandlerBuilderC.d(wh21.class, new lyw0(this, (byte) 26), scheduler);
        subtypeEffectHandlerBuilderC.b(uh21.class, new ruz0(this, (byte) 5), scheduler);
        this.c = subtypeEffectHandlerBuilderC.h();
    }
}
