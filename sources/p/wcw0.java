package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wcw0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ pdw0 a;

    public wcw0(pdw0 pdw0Var) {
        this.a = pdw0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        jcw0 jcw0Var = (jcw0) obj;
        r091 r091Var = (r091) this.a.a.b;
        if (r091Var != null) {
            if (jcw0Var.a) {
                r091Var.c();
            } else {
                r091Var.k();
            }
        }
        return rih1.a;
    }
}
