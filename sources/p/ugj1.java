package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ugj1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ laz a;

    public ugj1(laz lazVar) {
        this.a = lazVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        zgj1 zgj1Var = (zgj1) obj;
        Object objA = ((wh71) this.a.b).a(new dlw0(zgj1Var.a, zgj1Var.b), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objA != d9nVar) {
            objA = rih1Var;
        }
        return objA == d9nVar ? objA : rih1Var;
    }
}
