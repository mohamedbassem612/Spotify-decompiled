package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class zcc1 implements Function {
    public final /* synthetic */ ncc1 a;

    public zcc1(ncc1 ncc1Var) {
        this.a = ncc1Var;
    }

    public final Object apply(Object obj) {
        ncc1 ncc1Var = this.a;
        dgb dgbVar = ncc1Var.c;
        lcc1 lcc1Var = new lcc1();
        fcc1 fcc1Var = ncc1Var.b;
        mcc1 mcc1Var = new mcc1((Consumer) obj);
        Scheduler scheduler = ncc1Var.a;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.d(xcc1.class, mcc1Var, scheduler);
        subtypeEffectHandlerBuilderC.g(ecc1.class, fcc1Var.a);
        subtypeEffectHandlerBuilderC.g(dcc1.class, fcc1Var.b);
        return l1d.g(Mobius.d(lcc1Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h())));
    }
}
