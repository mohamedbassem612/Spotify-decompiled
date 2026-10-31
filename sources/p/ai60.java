package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ai60 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ii60 a;

    public ai60(ii60 ii60Var) {
        this.a = ii60Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new a38(obj, (lnm) null, this.a, (byte) 8)).collect(new cg00(r261Var, (byte) 13), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
