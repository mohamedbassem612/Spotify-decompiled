package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gif implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ r630 a;

    public gif(r630 r630Var) {
        this.a = r630Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new gke(obj, (lnm) null, this.a)).collect(new z6f(r261Var, (byte) 4), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
