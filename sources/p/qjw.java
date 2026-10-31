package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qjw implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ glw a;

    public qjw(glw glwVar) {
        this.a = glwVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        sjq0 sjq0Var = this.a.k;
        Object objY = fn31.Y((q8n) sjq0Var.c, new e3p0(sjq0Var, (tdw) obj, (lnm) null, (byte) 7), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
