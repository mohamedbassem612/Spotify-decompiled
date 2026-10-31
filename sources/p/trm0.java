package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class trm0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ wrm0 a;

    public trm0(wrm0 wrm0Var) {
        this.a = wrm0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Function0 function0 = this.a.Q0;
        if (function0 != null) {
            function0.invoke();
        }
        return rih1.a;
    }
}
