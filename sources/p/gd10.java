package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gd10 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ qzn0 a;

    public gd10(qzn0 qzn0Var) {
        this.a = qzn0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        fd10 fd10Var = (fd10) obj;
        Object objF = this.a.f(fd10Var.a, new ezn0(fd10Var.b), onmVar);
        return objF == d9n.a ? objF : rih1.a;
    }
}
