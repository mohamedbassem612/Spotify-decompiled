package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dcn implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ hvp0 a;

    public dcn(hvp0 hvp0Var) {
        this.a = hvp0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        vbn vbnVar = (vbn) obj;
        k9k k9kVar = (k9k) this.a.b;
        Object objY = fn31.Y((q8n) k9kVar.c, new gke(k9kVar, vbnVar.a, vbnVar.b, (lnm) null, (byte) 14), onmVar);
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
