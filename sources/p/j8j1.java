package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import io.reactivex.rxjava3.internal.functions.Functions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j8j1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ x8j1 a;

    public j8j1(x8j1 x8j1Var) {
        this.a = x8j1Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        this.a.g.a(((e7j1) obj).a).o(Functions.h).subscribe();
        return rih1.a;
    }
}
