package p;

import com.spotify.martini.martinidata.model.Mode;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qq10 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ uq10 a;
    public final /* synthetic */ lik1 b;
    public final /* synthetic */ Mode c;

    public qq10(uq10 uq10Var, lik1 lik1Var, Mode mode) {
        this.a = uq10Var;
        this.b = lik1Var;
        this.c = mode;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objA = this.a.b.a(((lq10) obj).a, this.b, this.c, onmVar);
        return objA == d9n.a ? objA : rih1.a;
    }
}
