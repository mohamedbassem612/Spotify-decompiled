package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bj0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ i44 a;
    public final /* synthetic */ i01 b;

    public bj0(i44 i44Var, i01 i01Var) {
        this.a = i44Var;
        this.b = i01Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        x57 x57Var = (x57) obj;
        if (this.a.c()) {
            this.b.c(x57Var.a);
        }
        return rih1.a;
    }
}
