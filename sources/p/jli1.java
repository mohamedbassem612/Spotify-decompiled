package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jli1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ cmi1 a;

    public jli1(cmi1 cmi1Var) {
        this.a = cmi1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objB = ((f1n0) this.a.f.b).b(wni1.d, onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objB != d9nVar) {
            objB = rih1Var;
        }
        return objB == d9nVar ? objB : rih1Var;
    }
}
