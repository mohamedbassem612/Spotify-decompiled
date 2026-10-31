package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nqe implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ rqe a;

    public nqe(rqe rqeVar) {
        this.a = rqeVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        rqe rqeVar = this.a;
        rqeVar.a.J();
        Object objY = fn31.Y(rqeVar.N0, new qqe(rqeVar, null, (byte) 4), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }
}
