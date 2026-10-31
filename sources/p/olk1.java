package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import j$.time.Duration;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class olk1 implements Function {
    public final /* synthetic */ qlk1 a;

    public olk1(qlk1 qlk1Var) {
        this.a = qlk1Var;
    }

    public final Object apply(Object obj) {
        Consumer consumer = (Consumer) obj;
        Duration duration = ove0.a;
        ilk1 ilk1Var = new ilk1();
        qlk1 qlk1Var = this.a;
        lbs0 lbs0Var = qlk1Var.a;
        consumer.getClass();
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        final byte b = 1;
        subtypeEffectHandlerBuilderC.g(lbw.class, new jbs0(lbs0Var, (byte) 1));
        final gbs0 gbs0Var = lbs0Var.a;
        final byte b2 = 0;
        subtypeEffectHandlerBuilderC.g(vfw.class, new ObservableTransformer() { // from class: p.kbs0
            public final ObservableSource apply(Observable observable) {
                byte b3 = b2;
                gbs0 gbs0Var2 = gbs0Var;
                switch (b3) {
                    case 0:
                        return observable.flatMapSingle(new dbs0(gbs0Var2));
                    default:
                        return observable.flatMapSingle(new ebs0(gbs0Var2));
                }
            }
        });
        subtypeEffectHandlerBuilderC.g(agw.class, new ObservableTransformer() { // from class: p.kbs0
            public final ObservableSource apply(Observable observable) {
                byte b3 = b;
                gbs0 gbs0Var2 = gbs0Var;
                switch (b3) {
                    case 0:
                        return observable.flatMapSingle(new dbs0(gbs0Var2));
                    default:
                        return observable.flatMapSingle(new ebs0(gbs0Var2));
                }
            }
        });
        subtypeEffectHandlerBuilderC.g(tfw.class, nm3.g);
        subtypeEffectHandlerBuilderC.g(sfw.class, nm3.h);
        subtypeEffectHandlerBuilderC.g(wew.class, nm3.i);
        subtypeEffectHandlerBuilderC.g(xew.class, nm3.t);
        subtypeEffectHandlerBuilderC.c(fgw.class, new vrk1(lbs0Var, (byte) 24));
        subtypeEffectHandlerBuilderC.c(fiw.class, new dy40(consumer, (byte) 15));
        subtypeEffectHandlerBuilderC.c(pgw.class, new ixp0(lbs0Var.b, (byte) 13));
        subtypeEffectHandlerBuilderC.c(qfw.class, new ibs0(lbs0Var, b2));
        subtypeEffectHandlerBuilderC.g(caw.class, new jbs0(lbs0Var, (byte) 0));
        subtypeEffectHandlerBuilderC.c(rew.class, new ibs0(lbs0Var, b));
        return l1d.g(Mobius.d(ilk1Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h()))).d(new klk1(qlk1Var)).b(new mlk1(qlk1Var));
    }
}
