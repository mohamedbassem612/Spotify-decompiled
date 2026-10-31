package p;

import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class om3 {
    public final oj80 a;
    public final gs3 b;
    public final lan1 c;
    public final hu3 d;
    public final g23 e;

    public om3(oj80 oj80Var, gs3 gs3Var, lan1 lan1Var, hu3 hu3Var, g23 g23Var) {
        this.a = oj80Var;
        this.b = gs3Var;
        this.c = lan1Var;
        this.d = hu3Var;
        this.e = g23Var;
    }

    public final ObservableTransformer a(Consumer consumer) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(gm3.class, new mm3(this, (byte) 0));
        subtypeEffectHandlerBuilderC.g(hm3.class, new mm3(this, (byte) 1));
        subtypeEffectHandlerBuilderC.c(fm3.class, new a21(this, consumer, (byte) 6));
        subtypeEffectHandlerBuilderC.g(im3.class, nm3.b);
        return subtypeEffectHandlerBuilderC.h();
    }
}
