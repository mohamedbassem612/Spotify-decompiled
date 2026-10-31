package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f9j1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ruz a;
    public final /* synthetic */ qaj1 b;

    public f9j1(ruz ruzVar, qaj1 qaj1Var) {
        this.a = ruzVar;
        this.b = qaj1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objJ = fc11.j(this.a.a(new d9u0(this.b.a, false)), onmVar);
        return objJ == d9n.a ? objJ : rih1.a;
    }
}
