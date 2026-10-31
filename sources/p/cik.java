package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cik implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ dg30 a;
    public final /* synthetic */ dto0 b;

    public cik(dg30 dg30Var, dto0 dto0Var) {
        this.a = dg30Var;
        this.b = dto0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new x4c(obj, (lnm) null, this.a, this.b, (byte) 20)).collect(new z6f(r261Var, (byte) 27), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
