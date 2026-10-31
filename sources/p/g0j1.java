package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g0j1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ l0j1 a;

    public g0j1(l0j1 l0j1Var) {
        this.a = l0j1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        l0j1 l0j1Var = this.a;
        Object objY = fn31.Y(l0j1Var.b, new vbc1(l0j1Var, (lnm) null, (byte) 18), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
