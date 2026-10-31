package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class plk1 implements Function {
    public final /* synthetic */ rlk1 a;

    public plk1(rlk1 rlk1Var) {
        this.a = rlk1Var;
    }

    public final Object apply(Object obj) {
        Consumer consumer = (Consumer) obj;
        jlk1 jlk1Var = new jlk1();
        rlk1 rlk1Var = this.a;
        xas0 xas0Var = rlk1Var.a;
        consumer.getClass();
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(bgw.class, new o4e0(xas0Var.a, (byte) 11));
        subtypeEffectHandlerBuilderC.g(faw.class, nm3.f);
        subtypeEffectHandlerBuilderC.c(eiw.class, new k1p0(consumer, (byte) 1));
        return l1d.g(Mobius.d(jlk1Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h()))).d(new llk1(rlk1Var)).b(new nlk1(rlk1Var));
    }
}
