package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class afy implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ qzn0 a;

    public afy(qzn0 qzn0Var) {
        this.a = qzn0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        tey teyVar = (tey) obj;
        Object objF = this.a.f(teyVar.a, new ezn0(teyVar.b), onmVar);
        return objF == d9n.a ? objF : rih1.a;
    }
}
