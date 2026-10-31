package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lqe implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ rqe a;

    public lqe(rqe rqeVar) {
        this.a = rqeVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        rqe rqeVar = this.a;
        fq2 fq2Var = rqeVar.a;
        fq2Var.s();
        fq2Var.b();
        fq2Var.J();
        Object objY = fn31.Y(rqeVar.N0, new qqe(rqeVar, null, (byte) 2), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }
}
