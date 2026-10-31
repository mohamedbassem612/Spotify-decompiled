package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class u2w implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ f1n0 a;

    public u2w(f1n0 f1n0Var) {
        this.a = f1n0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objA = this.a.a(onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objA != d9nVar) {
            objA = rih1Var;
        }
        return objA == d9nVar ? objA : rih1Var;
    }
}
