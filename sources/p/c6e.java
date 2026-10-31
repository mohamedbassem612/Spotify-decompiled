package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c6e implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ g6e a;

    public c6e(g6e g6eVar) {
        this.a = g6eVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        fns fnsVar = igu.a;
        Object objY = fn31.Y(pyf0.a, new pid(this.a, (l6e) obj, null, (byte) 2), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
