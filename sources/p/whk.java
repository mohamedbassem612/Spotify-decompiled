package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class whk implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ero a;
    public final /* synthetic */ g341 b;

    public whk(ero eroVar, g341 g341Var) {
        this.a = eroVar;
        this.b = g341Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new x4c(obj, (lnm) null, this.a, this.b, (byte) 19)).collect(new z6f(r261Var, (byte) 22), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
