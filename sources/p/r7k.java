package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r7k implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ dg8 a;

    public r7k(dg8 dg8Var) {
        this.a = dg8Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new a38(obj, (lnm) null, this.a, (byte) 3)).collect(new z6f(r261Var, (byte) 7), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
