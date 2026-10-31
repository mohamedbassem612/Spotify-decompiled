package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fg00 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ig00 a;

    public fg00(ig00 ig00Var) {
        this.a = ig00Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new a38(obj, (lnm) null, this.a, (byte) 7)).collect(new cg00(r261Var, (byte) 2), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
