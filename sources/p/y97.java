package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y97 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ha7 a;

    public y97(ha7 ha7Var) {
        this.a = ha7Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        j97 j97Var = (j97) obj;
        Object objA = ((by3) this.a.e.b).a(j97Var.a, j97Var.b, onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objA != d9nVar) {
            objA = rih1Var;
        }
        return objA == d9nVar ? objA : rih1Var;
    }
}
