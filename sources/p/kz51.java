package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kz51 extends hab0 implements vu30 {
    public final /* synthetic */ lz51 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz51(lz51 lz51Var) {
        super(2);
        this.a = lz51Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        a061 a061Var = this.a.d;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.d(sz51.class, new tr41(a061Var, (byte) 3), a061Var.b);
        subtypeEffectHandlerBuilderC.g(tz51.class, new yx11(a061Var, (byte) 11));
        return Mobius.d(zz51.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h()));
    }
}
