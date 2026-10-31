package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bs71 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new lm61(obj, (lnm) null, (byte) 16)).collect(new klp0(r261Var, (byte) 19), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
