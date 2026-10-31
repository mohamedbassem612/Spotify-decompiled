package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w9y0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ki20 a;

    public w9y0(ki20 ki20Var) {
        this.a = ki20Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        bay0 bay0Var = (bay0) obj;
        Object objA = this.a.a.a(new dlw0(bay0Var.a, bay0Var.b), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objA != d9nVar) {
            objA = rih1Var;
        }
        return objA == d9nVar ? objA : rih1Var;
    }
}
