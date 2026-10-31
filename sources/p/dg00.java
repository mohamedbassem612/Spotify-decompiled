package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dg00 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ig00 a;

    public dg00(ig00 ig00Var) {
        this.a = ig00Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new l2w(obj, (lnm) null, this.a, (byte) 14)).collect(new cg00(r261Var, (byte) 0), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
