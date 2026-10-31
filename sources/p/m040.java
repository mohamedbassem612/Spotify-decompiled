package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m040 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ u040 a;

    public m040(u040 u040Var) {
        this.a = u040Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        kdy0 kdy0Var = this.a.g;
        Object objY = fn31.Y((q8n) kdy0Var.c, new p2z0(kdy0Var, ((nz30) obj).c, null, (byte) 5), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
