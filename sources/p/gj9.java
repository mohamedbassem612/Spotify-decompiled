package p;

import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class gj9 {
    public static final ObservableTransformer a(gjb gjbVar, xir xirVar, uf9 uf9Var, ii9 ii9Var, sir sirVar) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.c(zi9.class, new fj9(gjbVar, (byte) 0));
        subtypeEffectHandlerBuilderC.c(ui9.class, new ej9(xirVar, (byte) 1));
        subtypeEffectHandlerBuilderC.c(yi9.class, new xu(uf9Var, (byte) 12));
        subtypeEffectHandlerBuilderC.c(qi9.class, new dj9(sirVar, xirVar, (byte) 0));
        subtypeEffectHandlerBuilderC.c(pi9.class, new cj9(sirVar, xirVar, (byte) 0));
        subtypeEffectHandlerBuilderC.c(aj9.class, new tg(uf9Var, (byte) 27));
        subtypeEffectHandlerBuilderC.c(ti9.class, new dj9(sirVar, xirVar, (byte) 1));
        subtypeEffectHandlerBuilderC.c(si9.class, new ej9(xirVar, (byte) 0));
        subtypeEffectHandlerBuilderC.c(ri9.class, new qg7(sirVar, ii9Var, xirVar, (byte) 1));
        subtypeEffectHandlerBuilderC.c(wi9.class, new ej9(xirVar, (byte) 3));
        subtypeEffectHandlerBuilderC.c(xi9.class, new xu(xirVar, (byte) 11));
        subtypeEffectHandlerBuilderC.c(vi9.class, new ej9(xirVar, (byte) 2));
        return subtypeEffectHandlerBuilderC.h();
    }
}
