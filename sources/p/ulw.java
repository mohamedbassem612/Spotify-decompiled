package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ulw implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ Consumer a;

    public ulw(Consumer consumer) {
        this.a = consumer;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        this.a.accept((jhw) obj);
        return rih1.a;
    }
}
