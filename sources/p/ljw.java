package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ljw implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ glw a;

    public ljw(glw glwVar) {
        this.a = glwVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ke71 ke71Var = this.a.f;
        Object objY = fn31.Y((q8n) ke71Var.c, new wp41(ke71Var, (dfw) obj, (lnm) null, (byte) 13), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
