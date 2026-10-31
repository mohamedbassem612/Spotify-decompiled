package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nli1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ cmi1 a;

    public nli1(cmi1 cmi1Var) {
        this.a = cmi1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        nni1 nni1Var = this.a.i;
        Object objY = fn31.Y(nni1Var.b, new lni1(nni1Var, ((cli1) obj).a, (lnm) null, (byte) 1), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
