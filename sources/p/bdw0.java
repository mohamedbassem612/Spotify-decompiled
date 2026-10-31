package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bdw0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ pdw0 a;

    public bdw0(pdw0 pdw0Var) {
        this.a = pdw0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        gcw0 gcw0Var = (gcw0) obj;
        pdw0 pdw0Var = this.a;
        r091 r091Var = (r091) pdw0Var.a.b;
        if (r091Var != null) {
            r091Var.b(gcw0Var.a);
            r091.f(r091Var, gcw0Var.b, Long.valueOf(pdw0Var.e.b()), pdw0Var.X, 4);
        }
        return rih1.a;
    }
}
