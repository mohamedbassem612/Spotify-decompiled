package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vfd1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ qzn0 a;

    public vfd1(qzn0 qzn0Var) {
        this.a = qzn0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        qfd1 qfd1Var = (qfd1) obj;
        ou80 ou80Var = qfd1Var.b;
        Object objF = this.a.f(qfd1Var.a, ou80Var != null ? new ezn0(ou80Var) : dzn0.b, onmVar);
        return objF == d9n.a ? objF : rih1.a;
    }
}
