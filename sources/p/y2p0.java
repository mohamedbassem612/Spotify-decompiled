package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class y2p0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ lhd a;
    public final /* synthetic */ qzn0 b;

    public y2p0(lhd lhdVar, qzn0 qzn0Var) {
        this.a = lhdVar;
        this.b = qzn0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        this.a.a.d((CancellationException) null);
        Object objF = this.b.f(zpn0.a, new ezn0(((w2p0) obj).a), onmVar);
        return objF == d9n.a ? objF : rih1.a;
    }
}
