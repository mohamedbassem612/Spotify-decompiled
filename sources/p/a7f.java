package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a7f implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ynb0 a;

    public a7f(ynb0 ynb0Var) {
        this.a = ynb0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new vs0(obj, (lnm) null, this.a)).collect(new z6f(r261Var, (byte) 0), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
