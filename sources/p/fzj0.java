package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fzj0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ xzj0 a;

    public fzj0(xzj0 xzj0Var) {
        this.a = xzj0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objC = ((op31) this.a.n.b).c(((e0k0) obj).a, onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objC != d9nVar) {
            objC = rih1Var;
        }
        return objC == d9nVar ? objC : rih1Var;
    }
}
