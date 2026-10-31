package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class di21 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ei21 a;

    public di21(ei21 ei21Var) {
        this.a = ei21Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new a38(obj, (lnm) null, this.a, (byte) 17)).collect(new klp0(r261Var, (byte) 15), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
