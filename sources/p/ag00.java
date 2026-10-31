package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ag00 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ db3 a;

    public ag00(db3 db3Var) {
        this.a = db3Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new l2w(this.a, obj, (lnm) null, (byte) 12)).collect(new wmk(r261Var, (byte) 28), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
