package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ycw0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ pdw0 a;

    public ycw0(pdw0 pdw0Var) {
        this.a = pdw0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        vii1 vii1Var = new vii1(((xbw0) obj).a);
        pdw0 pdw0Var = this.a;
        ayh ayhVar = pdw0Var.S0;
        if (ayhVar != null) {
            ayhVar.m0(vii1Var);
        } else {
            pdw0Var.T0 = vii1Var;
        }
        return rih1.a;
    }
}
