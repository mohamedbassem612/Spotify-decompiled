package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eik implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ kba a;
    public final /* synthetic */ dg8 b;
    public final /* synthetic */ yqg c;
    public final /* synthetic */ boolean d;

    public eik(kba kbaVar, dg8 dg8Var, yqg yqgVar, boolean z) {
        this.a = kbaVar;
        this.b = dg8Var;
        this.c = yqgVar;
        this.d = z;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new shk(obj, null, this.a, this.b, this.c, this.d, (byte) 1)).collect(new z6f(r261Var, (byte) 29), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
