package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rcw0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ pdw0 a;

    public rcw0(pdw0 pdw0Var) {
        this.a = pdw0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        pdw0 pdw0Var = this.a;
        pdw0Var.f.e();
        llm llmVar = pdw0Var.Y;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        pdw0Var.Y = null;
        return rih1.a;
    }
}
