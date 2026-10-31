package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cuv implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ gmt a;

    public cuv(gmt gmtVar) {
        this.a = gmtVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        gmt gmtVar = this.a;
        Object objY = fn31.Y((q8n) gmtVar.c, new n3s(gmtVar, (lnm) null, (byte) 8), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
