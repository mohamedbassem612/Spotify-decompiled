package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a0f implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ o0f a;

    public a0f(o0f o0fVar) {
        this.a = o0fVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new sze(obj, null, this.a, (byte) 1)).collect(new k91(r261Var, (byte) 19), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
