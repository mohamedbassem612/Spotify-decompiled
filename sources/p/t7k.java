package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t7k implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ uu00 a;

    public t7k(uu00 uu00Var) {
        this.a = uu00Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new tc1(obj, (lnm) null, this.a, (byte) 17)).collect(new z6f(r261Var, (byte) 9), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
