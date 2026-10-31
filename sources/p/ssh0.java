package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ssh0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ xsh0 a;

    public ssh0(xsh0 xsh0Var) {
        this.a = xsh0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        int iOrdinal = ((frh0) obj).a.ordinal();
        xsh0 xsh0Var = this.a;
        if (iOrdinal == 0) {
            xsh0Var.e.invoke();
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
            xsh0Var.f.invoke();
        }
        return rih1.a;
    }
}
