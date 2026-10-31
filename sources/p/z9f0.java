package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z9f0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ aaf0 a;

    public z9f0(aaf0 aaf0Var) {
        this.a = aaf0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        w6e0 w6e0Var = this.a.a;
        Object objY = fn31.Y((q8n) w6e0Var.c, new e9c0(w6e0Var, ((y9f0) obj).a, (lnm) null, (byte) 22), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
