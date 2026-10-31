package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class noy implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ p811 a;

    public noy(p811 p811Var) {
        this.a = p811Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        boy boyVar = (boy) obj;
        ylt0 ylt0Var = (ylt0) this.a.a;
        if (ylt0Var != null) {
            Object objA = ylt0Var.a(new plt0(boyVar.a), boyVar.b, boyVar.d, boyVar.c, boyVar.e, (96 & 32) != 0 ? hjk0.a : null, false, onmVar);
            if (objA == d9n.a) {
                return objA;
            }
        }
        return rih1.a;
    }
}
