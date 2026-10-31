package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class q7i1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ bfd a;
    public final /* synthetic */ q8n b;
    public final /* synthetic */ lzn0 c;

    public q7i1(bfd bfdVar, q8n q8nVar, lzn0 lzn0Var) {
        this.a = bfdVar;
        this.b = q8nVar;
        this.c = lzn0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new nx(obj, (lnm) null, this.a, this.b, this.c)).collect(new aud1(r261Var, (byte) 7), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
