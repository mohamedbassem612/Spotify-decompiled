package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q7k implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ rm5 a;
    public final /* synthetic */ xrk b;

    public q7k(rm5 rm5Var, xrk xrkVar) {
        this.a = rm5Var;
        this.b = xrkVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new nx(obj, (lnm) null, this.a, this.b, (byte) 5)).collect(new z6f(r261Var, (byte) 6), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
