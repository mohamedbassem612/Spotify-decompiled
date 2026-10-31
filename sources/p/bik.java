package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bik implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ew0 a;

    public bik(ew0 ew0Var) {
        this.a = ew0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new hff(this.a, obj, (lnm) null, (byte) 15)).collect(new z6f(r261Var, (byte) 26), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
