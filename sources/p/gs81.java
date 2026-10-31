package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gs81 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ rok0 a;

    public gs81(rok0 rok0Var) {
        this.a = rok0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new uk71(obj, (lnm) null, this.a, (byte) 11)).collect(new klp0(r261Var, (byte) 20), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
