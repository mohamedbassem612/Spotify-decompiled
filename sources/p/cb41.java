package p;

import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract class cb41 {
    public static ObservableTransformer a(Scheduler scheduler, v5n v5nVar, oi oiVar, co70 co70Var, s080 s080Var, Flowable flowable) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(ra41.class, new bkf0(flowable, (byte) 2));
        subtypeEffectHandlerBuilderC.g(qa41.class, new x1x0(v5nVar, (byte) 1));
        subtypeEffectHandlerBuilderC.g(ya41.class, new g2x0(oiVar, s080Var, (byte) 6));
        subtypeEffectHandlerBuilderC.g(ua41.class, new bb41(co70Var, (byte) 1));
        subtypeEffectHandlerBuilderC.g(sa41.class, new bb41(co70Var, (byte) 0));
        subtypeEffectHandlerBuilderC.g(wa41.class, new bb41(co70Var, (byte) 3));
        subtypeEffectHandlerBuilderC.g(va41.class, new bb41(co70Var, (byte) 2));
        subtypeEffectHandlerBuilderC.g(ta41.class, new x1x0(v5nVar, (byte) 2));
        subtypeEffectHandlerBuilderC.g(xa41.class, new bb41(co70Var, (byte) 4));
        subtypeEffectHandlerBuilderC.g(pa41.class, new lk1(scheduler, (byte) 6));
        return subtypeEffectHandlerBuilderC.h();
    }
}
