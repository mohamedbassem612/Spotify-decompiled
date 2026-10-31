package p;

import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v9k1 {
    public final s4b1 a;
    public final lzn0 b;
    public final d520 c;
    public final wb2 d;
    public final kt91 e;
    public final ObservableTransformer f;

    public v9k1(Scheduler scheduler, s4b1 s4b1Var, lzn0 lzn0Var, d520 d520Var, yh2 yh2Var, wr00 wr00Var, wb2 wb2Var, kt91 kt91Var) {
        this.a = s4b1Var;
        this.b = lzn0Var;
        this.c = d520Var;
        this.d = wb2Var;
        this.e = kt91Var;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.d(o8k1.class, new u9k1(this, (byte) 0), scheduler);
        subtypeEffectHandlerBuilderC.d(a9k1.class, new u9k1(this, (byte) 1), scheduler);
        subtypeEffectHandlerBuilderC.d(g9k1.class, new u9k1(this, (byte) 2), scheduler);
        subtypeEffectHandlerBuilderC.d(q9k1.class, new u9k1(this, (byte) 3), scheduler);
        subtypeEffectHandlerBuilderC.d(fj30.class, new jkt0(this, (byte) 14), scheduler);
        subtypeEffectHandlerBuilderC.d(j9k1.class, new jkt0(this, (byte) 15), scheduler);
        subtypeEffectHandlerBuilderC.d(r8k1.class, new u9k1(this, (byte) 4), scheduler);
        subtypeEffectHandlerBuilderC.d(o9k1.class, new u9k1(this, (byte) 5), scheduler);
        this.f = subtypeEffectHandlerBuilderC.h();
    }
}
