package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hwi1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ utw0 a;
    public final /* synthetic */ f2g1 b;

    public hwi1(utw0 utw0Var, f2g1 f2g1Var) {
        this.a = utw0Var;
        this.b = f2g1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new nx(obj, (lnm) null, (Object) this.a, (Object) this.b, (byte) 14)).collect(new aud1(r261Var, (byte) 12), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
