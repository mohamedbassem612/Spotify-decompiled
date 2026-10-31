package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sra1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ asa1 a;

    public sra1(asa1 asa1Var) {
        this.a = asa1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new rra1(obj, null, this.a, (byte) 0)).collect(new klp0(r261Var, (byte) 22), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
