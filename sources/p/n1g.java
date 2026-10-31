package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n1g implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ u1g a;

    public n1g(u1g u1gVar) {
        this.a = u1gVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        fta ftaVar = this.a.a;
        Object objY = fn31.Y((q8n) ftaVar.d, new pid(ftaVar, (b1g) obj, (lnm) null, (byte) 11), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
