package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vlw implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ Consumer a;

    public vlw(Consumer consumer) {
        this.a = consumer;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        this.a.accept((ihw) obj);
        return rih1.a;
    }
}
