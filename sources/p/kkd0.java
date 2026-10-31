package p;

import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kkd0 {
    public final Flowable a;
    public final zeu0 b;
    public final ObservableTransformer c;

    public kkd0(Flowable flowable, zeu0 zeu0Var, wht0 wht0Var, t8r0 t8r0Var, zd1 zd1Var, hr0 hr0Var) {
        this.a = flowable;
        this.b = zeu0Var;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(qxt0.class, zd1Var);
        subtypeEffectHandlerBuilderC.c(rxt0.class, new rwa0(zd1Var, (byte) 5));
        subtypeEffectHandlerBuilderC.g(xxt0.class, new ax8(wht0Var, (byte) 5));
        subtypeEffectHandlerBuilderC.g(wxt0.class, new bk1(wht0Var, (byte) 26));
        subtypeEffectHandlerBuilderC.g(yxt0.class, new ax8(t8r0Var, (byte) 6));
        subtypeEffectHandlerBuilderC.g(vxt0.class, new bk1(t8r0Var, (byte) 27));
        subtypeEffectHandlerBuilderC.c(txt0.class, new dy40(hr0Var, (byte) 4));
        subtypeEffectHandlerBuilderC.c(sxt0.class, new jkd0(hr0Var, (byte) 0));
        subtypeEffectHandlerBuilderC.c(uxt0.class, new jkd0(hr0Var, (byte) 1));
        this.c = subtypeEffectHandlerBuilderC.h();
    }
}
