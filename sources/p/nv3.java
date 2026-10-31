package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nv3 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ pv3 a;

    public nv3(pv3 pv3Var) {
        this.a = pv3Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new mv3(obj, null, this.a, (byte) 0)).collect(new k91(r261Var, (byte) 4), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
