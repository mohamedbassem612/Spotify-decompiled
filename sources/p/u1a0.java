package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class u1a0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ c2a0 a;

    public u1a0(c2a0 c2a0Var) {
        this.a = c2a0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        n1a0 n1a0Var = (n1a0) obj;
        c2a0 c2a0Var = this.a;
        if (((up90) c2a0Var.c.b).a(hr90.i, false) == 2) {
            n57.e("Jam should not be null");
        }
        Object objF = c2a0Var.b.f(fqn0.a, new ezn0(n1a0Var.b), onmVar);
        return objF == d9n.a ? objF : rih1.a;
    }
}
