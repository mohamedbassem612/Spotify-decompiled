package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zhk implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ qnv0 a;

    public zhk(qnv0 qnv0Var) {
        this.a = qnv0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new yhk(obj, null, this.a, (byte) 0)).collect(new z6f(r261Var, (byte) 24), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
