package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cmi0 extends hab0 implements vu30 {
    public final /* synthetic */ dmi0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmi0(dmi0 dmi0Var) {
        super(2);
        this.a = dmi0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ami0 ami0Var = this.a.d;
        nwa nwaVar = ami0Var.a;
        gj10 gj10Var = ami0Var.b;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(rli0.class, new iwa(nwaVar, (byte) 1));
        subtypeEffectHandlerBuilderC.g(qli0.class, new so(gj10Var, nwaVar, (byte) 22));
        return Mobius.d(zli0.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h()));
    }
}
