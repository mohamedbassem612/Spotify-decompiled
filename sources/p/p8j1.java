package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p8j1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ x8j1 a;

    public p8j1(x8j1 x8j1Var) {
        this.a = x8j1Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        l7j1 l7j1Var = (l7j1) obj;
        this.a.X.a(new mmr0[]{oqn1.n("muted", yah0.m(l7j1Var.b)), oqn1.n("position", yah0.q(l7j1Var.a))});
        return rih1.a;
    }
}
