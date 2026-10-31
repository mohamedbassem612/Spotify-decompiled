package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zon implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ dpn a;

    public zon(dpn dpnVar) {
        this.a = dpnVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        dpn dpnVar = this.a;
        zwg zwgVar = dpnVar.a;
        Object objY = fn31.Y((q8n) zwgVar.e, new pid(zwgVar, dpnVar.d, (lnm) null, (byte) 20), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
