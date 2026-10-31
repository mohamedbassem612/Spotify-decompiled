package p;

import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gzr {
    public final lzn0 a;
    public final vnd1 b;
    public final ObservableTransformer c;

    public gzr(lzn0 lzn0Var, izr izrVar, so soVar, vnd1 vnd1Var, Scheduler scheduler) {
        this.a = lzn0Var;
        this.b = vnd1Var;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.d(bh20.class, new fzr(this, (byte) 0), scheduler);
        subtypeEffectHandlerBuilderC.c(dh20.class, new fzr(this, (byte) 1));
        subtypeEffectHandlerBuilderC.g(eh20.class, izrVar);
        subtypeEffectHandlerBuilderC.g(ch20.class, soVar);
        this.c = subtypeEffectHandlerBuilderC.h();
    }
}
