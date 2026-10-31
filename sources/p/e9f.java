package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e9f implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ he11 a;

    public e9f(he11 he11Var) {
        this.a = he11Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new a38(obj, (lnm) null, this.a, (byte) 2)).collect(new z6f(r261Var, (byte) 1), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
