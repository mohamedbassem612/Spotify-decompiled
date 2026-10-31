package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qdb0 extends hab0 implements vu30 {
    public final /* synthetic */ rdb0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qdb0(rdb0 rdb0Var) {
        super(2);
        this.a = rdb0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        deb0 deb0Var = this.a.c;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(vdb0.class, new bk1((Object) deb0Var, (byte) 24));
        subtypeEffectHandlerBuilderC.d(udb0.class, new rwa0(deb0Var, (byte) 1), deb0Var.e);
        return Mobius.d(ceb0.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h()));
    }
}
