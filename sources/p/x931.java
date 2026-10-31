package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x931 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ca31 a;

    public x931(ca31 ca31Var) {
        this.a = ca31Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ca31 ca31Var = this.a;
        Object objY = fn31.Y(ca31Var.b, new kdt0(ca31Var, (lnm) null, (byte) 15), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
