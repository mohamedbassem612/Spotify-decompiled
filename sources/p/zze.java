package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zze implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new ha5(obj, (lnm) null)).collect(new k91(r261Var, (byte) 18), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
