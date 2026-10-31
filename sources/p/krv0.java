package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class krv0 implements Function {
    public final /* synthetic */ lrv0 a;

    public krv0(lrv0 lrv0Var) {
        this.a = lrv0Var;
    }

    public final Object apply(Object obj) {
        Consumer consumer = (Consumer) obj;
        hrv0 hrv0Var = new hrv0();
        lrv0 lrv0Var = this.a;
        wqv0 wqv0Var = lrv0Var.a;
        consumer.getClass();
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(nqv0.class, new o4e0(wqv0Var, (byte) 20));
        subtypeEffectHandlerBuilderC.c(oqv0.class, new ixp0(wqv0Var, (byte) 25));
        subtypeEffectHandlerBuilderC.c(sqv0.class, new k1p0(consumer, (byte) 3));
        return l1d.g(Mobius.d(hrv0Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h()))).d(new irv0(lrv0Var)).b(new jrv0(lrv0Var));
    }
}
