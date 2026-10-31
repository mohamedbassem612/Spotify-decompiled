package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class icb implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ Consumer a;

    public icb(Consumer consumer) {
        this.a = consumer;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        this.a.accept(new ueb(((jbb) obj).a, bk8.d, true));
        return rih1.a;
    }
}
