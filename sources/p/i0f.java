package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i0f implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ o0f a;

    public i0f(o0f o0fVar) {
        this.a = o0fVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new tc1(obj, (lnm) null, this.a, (byte) 13)).collect(new k91(r261Var, (byte) 26), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
