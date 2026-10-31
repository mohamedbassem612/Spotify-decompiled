package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lf71 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ki20 a;

    public lf71(ki20 ki20Var) {
        this.a = ki20Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        gh71 gh71Var = (gh71) obj;
        Object objA = this.a.a.a(new oy71(gh71Var.f, gh71Var.e, gh71Var.g, gh71Var.d, gh71Var.c.b), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objA != d9nVar) {
            objA = rih1Var;
        }
        return objA == d9nVar ? objA : rih1Var;
    }
}
