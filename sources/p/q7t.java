package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q7t implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ w7t a;

    public q7t(w7t w7tVar) {
        this.a = w7tVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        w7t w7tVar = this.a;
        Object objY = fn31.Y(w7tVar.g, new p7t(w7tVar, null, (byte) 0), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
