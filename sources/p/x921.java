package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x921 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ba21 a;

    public x921(ba21 ba21Var) {
        this.a = ba21Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ba21 ba21Var = this.a;
        Object objY = fn31.Y(ba21Var.f, new u921(ba21Var, null, (byte) 1), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
