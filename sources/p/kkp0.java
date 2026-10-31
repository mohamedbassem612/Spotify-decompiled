package p;

import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract class kkp0 {
    public static final ObservableTransformer a(zcs zcsVar, Scheduler scheduler, clp0 clp0Var) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.c(ikp0.class, new lrj0(zcsVar, (byte) 25));
        subtypeEffectHandlerBuilderC.g(gkp0.class, new lk1(scheduler, (byte) 2));
        subtypeEffectHandlerBuilderC.c(hkp0.class, new lrj0(clp0Var, (byte) 24));
        return subtypeEffectHandlerBuilderC.h();
    }
}
