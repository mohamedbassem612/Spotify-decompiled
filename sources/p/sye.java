package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sye implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ o0f a;

    public sye(o0f o0fVar) {
        this.a = o0fVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        exe exeVar = (exe) obj;
        wzn wznVar = this.a.v;
        Object objY = fn31.Y((q8n) wznVar.a, new gke(wznVar, exeVar.b, exeVar.a, null, (byte) 18), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
