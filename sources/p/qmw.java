package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qmw implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ro30 a;

    public qmw(ro30 ro30Var) {
        this.a = ro30Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ofw ofwVar = (ofw) obj;
        boolean z = ofwVar.a;
        String str = ofwVar.b;
        ro30 ro30Var = this.a;
        Object objY = fn31.Y((q8n) ro30Var.b, new x060(ro30Var, z, str, (lnm) null), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
