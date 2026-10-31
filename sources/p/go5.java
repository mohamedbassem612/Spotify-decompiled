package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class go5 extends hab0 implements iu30 {
    public final /* synthetic */ ho5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go5(ho5 ho5Var) {
        super(1);
        this.a = ho5Var;
    }

    public final Object invoke(Object obj) {
        ho5 ho5Var = this.a;
        oo5 oo5Var = ho5Var.b;
        em3 em3Var = ho5Var.a;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.c(vn5.class, new gqu(em3Var, (byte) 0));
        subtypeEffectHandlerBuilderC.c(wn5.class, new gqu(em3Var, (byte) 1));
        subtypeEffectHandlerBuilderC.g(un5.class, new bk1(oo5Var, (byte) 14));
        return Mobius.d(fqu.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h()));
    }
}
