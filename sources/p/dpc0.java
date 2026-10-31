package p;

import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableTransformer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dpc0 extends hab0 implements Function0 {
    public final /* synthetic */ g2z a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpc0(g2z g2zVar) {
        super(0);
        this.a = g2zVar;
    }

    public final Object invoke() {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.e(yoc0.class, ta20.t);
        subtypeEffectHandlerBuilderC.e(woc0.class, ua20.t);
        g2z g2zVar = this.a;
        subtypeEffectHandlerBuilderC.g(voc0.class, (ObservableTransformer) ((idd1) g2zVar.f).getValue());
        subtypeEffectHandlerBuilderC.g(xoc0.class, (ObservableTransformer) ((idd1) ((myq0) g2zVar.b).c).getValue());
        return new wiw(subtypeEffectHandlerBuilderC.h(), (byte) 0);
    }
}
