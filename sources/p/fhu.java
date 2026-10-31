package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fhu implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ i44 a;
    public final /* synthetic */ i01 b;

    public fhu(i44 i44Var, i01 i01Var) {
        this.a = i44Var;
        this.b = i01Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        v57 v57Var = (v57) obj;
        if (this.a.c()) {
            this.b.c(v57Var.a);
        }
        return rih1.a;
    }
}
