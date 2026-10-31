package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class p7i1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ add a;
    public final /* synthetic */ bfd b;
    public final /* synthetic */ q8n c;
    public final /* synthetic */ lzn0 d;

    public p7i1(add addVar, bfd bfdVar, q8n q8nVar, lzn0 lzn0Var) {
        this.a = addVar;
        this.b = bfdVar;
        this.c = q8nVar;
        this.d = lzn0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new qk3((byte) 13, obj, this.a, this.b, this.c, this.d, (lnm) null)).collect(new aud1(r261Var, (byte) 6), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
