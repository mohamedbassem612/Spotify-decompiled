package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r8f0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ wmy a;

    public r8f0(wmy wmyVar) {
        this.a = wmyVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        wmy wmyVar = this.a;
        Object objY = fn31.Y((q8n) wmyVar.f, new q8f0(wmyVar, null, (byte) 0), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
