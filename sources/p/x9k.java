package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x9k implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ uu00 a;
    public final /* synthetic */ q8n b;

    public x9k(uu00 uu00Var, q8n q8nVar) {
        this.a = uu00Var;
        this.b = q8nVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new nx(obj, (lnm) null, (Object) this.a, (Object) this.b, (byte) 7)).collect(new z6f(r261Var, (byte) 15), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
