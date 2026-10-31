package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eg00 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ hg00 a;

    public eg00(hg00 hg00Var) {
        this.a = hg00Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new l2w(this.a, obj, (lnm) null, (byte) 15)).collect(new cg00(r261Var, (byte) 1), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
