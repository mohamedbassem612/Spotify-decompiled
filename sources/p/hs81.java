package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hs81 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ yt91 a;

    public hs81(yt91 yt91Var) {
        this.a = yt91Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new uk71(obj, (lnm) null, this.a, (byte) 12)).collect(new klp0(r261Var, (byte) 21), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
