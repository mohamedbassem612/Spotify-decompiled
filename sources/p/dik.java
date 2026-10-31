package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dik implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ qa00 a;

    public dik(qa00 qa00Var) {
        this.a = qa00Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new a38(obj, (lnm) null, this.a, (byte) 4)).collect(new z6f(r261Var, (byte) 28), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
