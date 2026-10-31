package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ura1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ asa1 a;

    public ura1(asa1 asa1Var) {
        this.a = asa1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new rra1(obj, null, this.a, (byte) 2)).collect(new klp0(r261Var, (byte) 24), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
