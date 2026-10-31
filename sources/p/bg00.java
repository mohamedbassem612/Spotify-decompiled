package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bg00 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ gg00 a;

    public bg00(gg00 gg00Var) {
        this.a = gg00Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new l2w(this.a, obj, (lnm) null, (byte) 13)).collect(new wmk(r261Var, (byte) 29), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
