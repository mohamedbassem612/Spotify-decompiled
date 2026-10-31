package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tcw0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ pdw0 a;

    public tcw0(pdw0 pdw0Var) {
        this.a = pdw0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        fcw0 fcw0Var = (fcw0) obj;
        pdw0 pdw0Var = this.a;
        if (u890.j(pdw0Var.N0, fcw0Var.a)) {
            pdw0Var.N0 = null;
        }
        p731 p731Var = pdw0Var.i;
        if (p731Var != null) {
            p731Var.c(fcw0Var.a);
        }
        return rih1.a;
    }
}
