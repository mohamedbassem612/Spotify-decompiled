package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l240 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ q240 a;

    public l240(q240 q240Var) {
        this.a = q240Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        cz30 cz30Var = this.a.d;
        Object objY = fn31.Y(cz30Var.b, new az30(cz30Var, ((e240) obj).a, null, (byte) 1), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
