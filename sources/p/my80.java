package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class my80 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ bz80 a;

    public my80(bz80 bz80Var) {
        this.a = bz80Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        nx80 nx80Var = (nx80) obj;
        try {
            lo60 lo60Var = this.a.a;
            p1f0 p1f0VarW = rrn1.w(nx80Var.a);
            p1f0VarW.B(nx80Var.b);
            lo60Var.f(p1f0VarW.h());
        } catch (Exception e) {
            n57.t("Effect handling failed for " + nx80Var, e);
        }
        return rih1.a;
    }
}
