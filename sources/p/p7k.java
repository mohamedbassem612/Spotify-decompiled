package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p7k implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ dg8 a;
    public final /* synthetic */ rm5 b;
    public final /* synthetic */ xrk c;

    public p7k(dg8 dg8Var, rm5 rm5Var, xrk xrkVar) {
        this.a = dg8Var;
        this.b = rm5Var;
        this.c = xrkVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new qk3(obj, (lnm) null, this.a, this.b, this.c, (byte) 3)).collect(new z6f(r261Var, (byte) 5), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
