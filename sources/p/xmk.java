package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xmk implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ cnk a;

    public xmk(cnk cnkVar) {
        this.a = cnkVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new a38(obj, (lnm) null, this.a, (byte) 5)).collect(new wmk(r261Var, (byte) 0), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
