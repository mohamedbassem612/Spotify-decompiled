package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hdw0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ pdw0 a;

    public hdw0(pdw0 pdw0Var) {
        this.a = pdw0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new glu0(obj, (lnm) null, this.a)).collect(new klp0(r261Var, (byte) 7), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
