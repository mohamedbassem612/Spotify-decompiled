package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class py80 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ bz80 a;

    public py80(bz80 bz80Var) {
        this.a = bz80Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        rx80 rx80Var = (rx80) obj;
        try {
            this.a.b.a(rx80Var.a, rx80Var.b);
        } catch (Exception e) {
            n57.t("Effect handling failed for " + rx80Var, e);
        }
        return rih1.a;
    }
}
