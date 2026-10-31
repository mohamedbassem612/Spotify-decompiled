package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yhi1 extends hab0 implements vu30 {
    public final /* synthetic */ aii1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yhi1(aii1 aii1Var) {
        super(2);
        this.a = aii1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ohi1 ohi1Var = this.a.c;
        lhi1 lhi1Var = new lhi1();
        ehi1 ehi1Var = ohi1Var.b;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(ahi1.class, new cp81(ehi1Var, (byte) 9));
        dhi1 dhi1Var = new dhi1(ehi1Var, (byte) 0);
        Scheduler scheduler = ehi1Var.a;
        subtypeEffectHandlerBuilderC.d(zgi1.class, dhi1Var, scheduler);
        subtypeEffectHandlerBuilderC.d(bhi1.class, new dhi1(ehi1Var, (byte) 1), scheduler);
        subtypeEffectHandlerBuilderC.d(ygi1.class, new dhi1(ehi1Var, (byte) 2), scheduler);
        return gvg.d("seadragon", Mobius.d(lhi1Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).b(new mhi1(ohi1Var)).d(new nhi1(ohi1Var)));
    }
}
