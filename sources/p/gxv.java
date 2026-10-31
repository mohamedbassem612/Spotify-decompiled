package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gxv implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ jpa0 a;

    public gxv(jpa0 jpa0Var) {
        this.a = jpa0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objF = f1n0.f((f1n0) this.a.b, pro1.t("publishToProfile"), ((exv) obj).a, onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objF != d9nVar) {
            objF = rih1Var;
        }
        return objF == d9nVar ? objF : rih1Var;
    }
}
