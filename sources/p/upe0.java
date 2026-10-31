package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class upe0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ fqe0 a;

    public upe0(fqe0 fqe0Var) {
        this.a = fqe0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        fqe0 fqe0Var = this.a;
        Object objY = fn31.Y(fqe0Var.h, new tpe0(fqe0Var, null, (byte) 0), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
