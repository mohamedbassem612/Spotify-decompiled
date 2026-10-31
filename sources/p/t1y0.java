package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t1y0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ sb7 a;
    public final /* synthetic */ String b;

    public t1y0(String str, sb7 sb7Var) {
        this.a = sb7Var;
        this.b = str;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new c6h0(obj, (Object) this.a, this.b, (lnm) null, (byte) 15)).collect(new klp0(r261Var, (byte) 9), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
