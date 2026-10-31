package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class whe implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ m64 a;
    public final /* synthetic */ qzn0 b;

    public whe(m64 m64Var, qzn0 qzn0Var) {
        this.a = m64Var;
        this.b = qzn0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objY = fn31.Y(geo0.b, new bie((uhe) obj, this.a, this.b, null), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }
}
