package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c731 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ g731 a;

    public c731(g731 g731Var) {
        this.a = g731Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objI = this.a.b.I(((z631) obj).a, onmVar);
        return objI == d9n.a ? objI : rih1.a;
    }
}
