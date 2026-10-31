package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class krv implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ rzo0 a;

    public krv(rzo0 rzo0Var) {
        this.a = rzo0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        crv crvVar = (crv) obj;
        rzo0 rzo0Var = this.a;
        ((kt91) rzo0Var.d).b();
        Object objA = ((sak0) rzo0Var.c).a(crvVar.a, crvVar.b, (String) rzo0Var.b, crvVar.c, true, onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objA != d9nVar) {
            objA = rih1Var;
        }
        return objA == d9nVar ? objA : rih1Var;
    }
}
