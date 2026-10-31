package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.MobiusAndroid;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class ikg implements jly0 {
    public static MobiusLoop.Controller a(esa esaVar, Scheduler scheduler) {
        fkg fkgVar = new fkg();
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.c(yzk.class, new tra(esaVar));
        subtypeEffectHandlerBuilderC.g(v020.class, new bsa(esaVar));
        subtypeEffectHandlerBuilderC.c(w2d1.class, new csa(esaVar));
        subtypeEffectHandlerBuilderC.g(bz10.class, new zra(esaVar));
        subtypeEffectHandlerBuilderC.c(ysa.class, new qra(esaVar));
        subtypeEffectHandlerBuilderC.g(u020.class, new asa(esaVar));
        subtypeEffectHandlerBuilderC.c(zoc1.class, new dsa(esaVar));
        subtypeEffectHandlerBuilderC.g(jz10.class, new vra(esaVar));
        subtypeEffectHandlerBuilderC.g(vjb0.class, new xra(esaVar));
        subtypeEffectHandlerBuilderC.c(zjb0.class, new yra(esaVar));
        subtypeEffectHandlerBuilderC.a(ugd.class, new rra(esaVar));
        MobiusLoop.Builder builderB = l1d.g(Mobius.d(fkgVar, RxConnectables.a(subtypeEffectHandlerBuilderC.h()))).b(new gkg(scheduler));
        qsa qsaVar = qsa.d;
        lsa lsaVar = lsa.c;
        isa isaVar = isa.c;
        return MobiusAndroid.a(builderB, new ssa(1, 0, qsaVar, isaVar, isaVar, lsaVar));
    }
}
