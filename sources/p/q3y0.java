package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q3y0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ktv a;
    public final /* synthetic */ String b;

    public q3y0(ktv ktvVar, String str) {
        this.a = ktvVar;
        this.b = str;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new c6h0(obj, (Object) this.a, this.b, (lnm) null, (byte) 16)).collect(new klp0(r261Var, (byte) 10), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
