package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kqe implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ rqe a;

    public kqe(rqe rqeVar) {
        this.a = rqeVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        rqe rqeVar = this.a;
        rqeVar.a.s();
        Object objY = fn31.Y(rqeVar.N0, new qqe(rqeVar, null, (byte) 1), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }
}
