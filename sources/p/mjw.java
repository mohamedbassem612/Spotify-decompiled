package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mjw implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ hlw a;

    public mjw(hlw hlwVar) {
        this.a = hlwVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        nn61 nn61Var = this.a.f;
        Object objY = fn31.Y((q8n) nn61Var.c, new wp41(nn61Var, (bfw) obj, (lnm) null, (byte) 12), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
