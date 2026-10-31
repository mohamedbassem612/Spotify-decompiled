package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class z2p0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ lhd a;
    public final /* synthetic */ qmu b;

    public z2p0(lhd lhdVar, qmu qmuVar) {
        this.a = lhdVar;
        this.b = qmuVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        this.a.a.d((CancellationException) null);
        cx80 cx80Var = this.b.d;
        if (cx80Var != null) {
            cx80Var.cancel();
        }
        return rih1.a;
    }
}
