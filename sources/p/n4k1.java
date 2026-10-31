package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n4k1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ n4b a;

    public n4k1(n4b n4bVar) {
        this.a = n4bVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objA = ((wh71) this.a.b).a(new clw0(xmt.d), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objA != d9nVar) {
            objA = rih1Var;
        }
        return objA == d9nVar ? objA : rih1Var;
    }
}
