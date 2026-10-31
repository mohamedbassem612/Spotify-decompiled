package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g4y implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ bb01 a;

    public g4y(bb01 bb01Var) {
        this.a = bb01Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objS = i1k0.s((h1y) this.a.b, ((c4y) obj).a, onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objS != d9nVar) {
            objS = rih1Var;
        }
        return objS == d9nVar ? objS : rih1Var;
    }
}
