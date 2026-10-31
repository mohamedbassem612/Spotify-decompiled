package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jqe implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ rqe a;

    public jqe(rqe rqeVar) {
        this.a = rqeVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        tpe tpeVar = (tpe) obj;
        if (tpeVar.b) {
            this.a.b.K = true;
        }
        Object objY0 = this.a.c.y0(tpeVar.a, tpeVar.c, onmVar, tpeVar.b);
        return objY0 == d9n.a ? objY0 : rih1.a;
    }
}
