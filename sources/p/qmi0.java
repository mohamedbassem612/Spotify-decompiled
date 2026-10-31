package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qmi0 extends hab0 implements iu30 {
    public final /* synthetic */ rmi0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qmi0(rmi0 rmi0Var) {
        super(1);
        this.a = rmi0Var;
    }

    public final Object invoke(Object obj) {
        gj10 gj10Var = this.a.b.a;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(hmi0.class, new o4e0(new z6h0(gj10Var, (byte) 23), (byte) 4));
        return Mobius.d(mmi0.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h()));
    }
}
