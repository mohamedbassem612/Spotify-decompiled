package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class scw0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ pdw0 a;

    public scw0(pdw0 pdw0Var) {
        this.a = pdw0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        dcw0 dcw0Var = (dcw0) obj;
        pdw0 pdw0Var = this.a;
        pdw0Var.R0.set(Long.valueOf(dcw0Var.b));
        p731 p731Var = pdw0Var.i;
        if (p731Var != null) {
            p731Var.b(dcw0Var.a, wuh1.a);
        }
        return rih1.a;
    }
}
