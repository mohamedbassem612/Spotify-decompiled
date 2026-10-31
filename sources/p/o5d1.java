package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o5d1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ esa1 a;
    public final /* synthetic */ cof0 b;

    public o5d1(esa1 esa1Var, cof0 cof0Var) {
        this.a = esa1Var;
        this.b = cof0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        g7d1 g7d1Var = ((f5d1) obj).a;
        if (!pwo1.n(g7d1Var).isEmpty()) {
            ao0.c((ao0) this.a.b, co0.a1, g7d1Var.a, (Long) null, "survey_submit", f4i1.e(g7d1Var.k, "_submit"), pwo1.h(g7d1Var).toByteString().v(), (String) null, 68);
        }
        cof0 cof0Var = this.b;
        cof0Var.c(g7d1Var);
        cof0Var.b(g7d1Var);
        return rih1.a;
    }
}
