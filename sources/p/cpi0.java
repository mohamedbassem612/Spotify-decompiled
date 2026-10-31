package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cpi0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ epi0 a;

    public cpi0(epi0 epi0Var) {
        this.a = epi0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new a38(obj, (lnm) null, this.a, (byte) 13)).collect(new q5g0(r261Var, (byte) 11), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
