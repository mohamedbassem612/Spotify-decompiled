package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lcb implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ Consumer a;

    public lcb(Consumer consumer) {
        this.a = consumer;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        lbb lbbVar = (lbb) obj;
        this.a.accept(new web(lbbVar.a, lbbVar.b));
        return rih1.a;
    }
}
