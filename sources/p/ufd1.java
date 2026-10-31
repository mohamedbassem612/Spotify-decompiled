package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ufd1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ qzn0 a;

    public ufd1(qzn0 qzn0Var) {
        this.a = qzn0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        pfd1 pfd1Var = (pfd1) obj;
        Object objF = this.a.f(pfd1Var.a, new ezn0(pfd1Var.b), onmVar);
        return objF == d9n.a ? objF : rih1.a;
    }
}
