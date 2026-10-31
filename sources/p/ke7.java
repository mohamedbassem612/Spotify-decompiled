package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.Supplier;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ke7 implements Supplier {
    public final /* synthetic */ le7 a;

    public ke7(le7 le7Var) {
        this.a = le7Var;
    }

    public final Object get() {
        le7 le7Var = this.a;
        sd7 sd7Var = le7Var.i;
        Observable observableJust = (sd7Var == null || sd7Var.g != 2) ? Observable.just(le7Var.f) : Observable.empty();
        rd7 rd7Var = le7Var.d;
        rd7Var.getClass();
        od7 od7Var = new od7();
        bd7 bd7Var = rd7Var.d;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(ad7.class, bd7Var.a);
        subtypeEffectHandlerBuilderC.g(wc7.class, bd7Var.b);
        subtypeEffectHandlerBuilderC.g(yc7.class, bd7Var.d);
        subtypeEffectHandlerBuilderC.g(xc7.class, bd7Var.c);
        subtypeEffectHandlerBuilderC.g(zc7.class, bd7Var.e);
        MobiusLoop.Builder builderG = l1d.g(Mobius.d(od7Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).h(RxEventSources.a(new ObservableSource[]{rd7Var.b.b, yoi1.i(new lt20(new hs6(rd7Var.e.c(), (byte) 1), new jk(3, (lnm) null, (byte) 9), (byte) 0), o6x.a)})).b(new pd7(rd7Var)).d(new qd7(rd7Var)));
        sd7 sd7Var2 = le7Var.i;
        if (sd7Var2 == null) {
            sd7Var2 = new sd7(null, null, null, null, null, 2047);
        }
        return observableJust.compose(RxMobius.b(builderG, sd7Var2)).doOnNext(new je7(le7Var, (byte) 0));
    }
}
