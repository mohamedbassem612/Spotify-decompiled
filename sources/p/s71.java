package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s71 extends hab0 implements vu30 {
    public final /* synthetic */ eyh0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s71(eyh0 eyh0Var) {
        super(2);
        this.a = eyh0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        j71 j71Var = (j71) this.a.c;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(x61.class, new d71(j71Var, (byte) 0));
        subtypeEffectHandlerBuilderC.g(a71.class, new d71(j71Var, (byte) 2));
        subtypeEffectHandlerBuilderC.g(y61.class, new d71(j71Var, (byte) 1));
        h71 h71Var = new h71(j71Var, (byte) 1);
        Scheduler scheduler = j71Var.j;
        subtypeEffectHandlerBuilderC.d(c71.class, h71Var, scheduler);
        subtypeEffectHandlerBuilderC.d(z61.class, new h71(j71Var, (byte) 0), scheduler);
        subtypeEffectHandlerBuilderC.d(b71.class, new i71(j71Var.k, j71Var.l, (byte) 0), scheduler);
        return Mobius.d(r71.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h()));
    }
}
