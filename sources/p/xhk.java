package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xhk implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ u9u0 a;

    public xhk(u9u0 u9u0Var) {
        this.a = u9u0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new hff(obj, (lnm) null, this.a, (byte) 14)).collect(new z6f(r261Var, (byte) 23), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
