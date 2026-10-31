package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l1j1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ n1j1 a;

    public l1j1(n1j1 n1j1Var) {
        this.a = n1j1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        String str = ((g1j1) obj).a;
        n1j1 n1j1Var = this.a;
        Object objY = fn31.Y(n1j1Var.b, new kwb1(n1j1Var, str, (lnm) null, (byte) 29), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
