package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vhk implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ sd41 a;

    public vhk(sd41 sd41Var) {
        this.a = sd41Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new hff(obj, (lnm) null, this.a, (byte) 13)).collect(new z6f(r261Var, (byte) 19), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
