package p;

import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q23 {
    public final ObservableTransformer a;

    public q23(uqn uqnVar, bk1 bk1Var, uqn uqnVar2, uqn uqnVar3, zd1 zd1Var, vrn vrnVar) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(p23.class, uqnVar);
        subtypeEffectHandlerBuilderC.g(k23.class, bk1Var);
        subtypeEffectHandlerBuilderC.g(o23.class, uqnVar2);
        subtypeEffectHandlerBuilderC.e(m23.class, vrnVar);
        subtypeEffectHandlerBuilderC.g(l23.class, uqnVar3);
        subtypeEffectHandlerBuilderC.g(n23.class, zd1Var);
        this.a = subtypeEffectHandlerBuilderC.h();
    }
}
