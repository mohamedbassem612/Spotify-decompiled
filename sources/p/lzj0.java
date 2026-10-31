package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lzj0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ xzj0 a;

    public lzj0(xzj0 xzj0Var) {
        this.a = xzj0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new izj0(obj, null, this.a, (byte) 2)).collect(new q5g0(r261Var, (byte) 15), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
