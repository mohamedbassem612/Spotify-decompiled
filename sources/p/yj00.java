package p;

import com.spotify.home.evopage.mobius.Effect;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yj00 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ tth1 a;

    public yj00(tth1 tth1Var) {
        this.a = tth1Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objS = smo1.s(new sth1(this.a, (Effect.UpdateOnDemandSet) obj, null), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objS != d9nVar) {
            objS = rih1Var;
        }
        return objS == d9nVar ? objS : rih1Var;
    }
}
