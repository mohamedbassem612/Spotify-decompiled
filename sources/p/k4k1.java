package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k4k1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ g3x a;

    public k4k1(g3x g3xVar) {
        this.a = g3xVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objA;
        boolean z = ((u4k1) obj).a.b.d;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        if (!z || (objA = this.a.a.a(new eud(new rn71(rc11.a.b(x7i0.class))), onmVar)) != d9nVar) {
            objA = rih1Var;
        }
        return objA == d9nVar ? objA : rih1Var;
    }
}
