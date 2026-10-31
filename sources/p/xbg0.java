package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xbg0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ncg0 a;

    public xbg0(ncg0 ncg0Var) {
        this.a = ncg0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ncg0 ncg0Var = this.a;
        Object objY = fn31.Y(ncg0Var.f, new vbg0(ncg0Var, null, (byte) 0), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
