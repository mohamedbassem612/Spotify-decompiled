package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xkl1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ p811 a;

    public xkl1(p811 p811Var) {
        this.a = p811Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        p811 p811Var = this.a;
        faa0 faa0Var = (faa0) p811Var.a;
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
        p811Var.a = null;
        return rih1.a;
    }
}
