package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h4y implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ij01 a;

    public h4y(ij01 ij01Var) {
        this.a = ij01Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new l2w(obj, (lnm) null, this.a, (byte) 7)).collect(new wmk(r261Var, (byte) 24), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
