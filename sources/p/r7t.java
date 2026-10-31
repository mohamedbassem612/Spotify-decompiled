package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r7t implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ w7t a;
    public final /* synthetic */ tbr0 b;

    public r7t(w7t w7tVar, tbr0 tbr0Var) {
        this.a = w7tVar;
        this.b = tbr0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objY = fn31.Y(this.a.g, new iue(this.b, (lnm) null, (byte) 3), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
