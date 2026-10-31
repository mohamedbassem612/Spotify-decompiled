package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class r7i1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ r630 a;
    public final /* synthetic */ kt91 b;

    public r7i1(r630 r630Var, kt91 kt91Var) {
        this.a = r630Var;
        this.b = kt91Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new wba1(obj, (lnm) null, this.a, this.b)).collect(new aud1(r261Var, (byte) 8), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
