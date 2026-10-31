package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dok1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ hok1 a;

    public dok1(hok1 hok1Var) {
        this.a = hok1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new a38(obj, (lnm) null, this.a, (byte) 20)).collect(new aud1(r261Var, (byte) 15), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
