package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ilg1 extends hab0 implements iu30 {
    public final /* synthetic */ jlg1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilg1(jlg1 jlg1Var) {
        super(1);
        this.a = jlg1Var;
    }

    public final Object invoke(Object obj) {
        amg1 amg1Var = this.a.c;
        Scheduler scheduler = amg1Var.a;
        swa0 swa0Var = amg1Var.b;
        xk xkVar = amg1Var.c;
        dlg1 dlg1Var = amg1Var.d;
        lzn0 lzn0Var = amg1Var.f;
        dlg1 dlg1Var2 = amg1Var.g;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.d(mlg1.class, new zwa0(xkVar, swa0Var, (byte) 1), scheduler);
        subtypeEffectHandlerBuilderC.g(llg1.class, new cp81(dlg1Var, (byte) 7));
        subtypeEffectHandlerBuilderC.b(olg1.class, new dkb1(swa0Var, dlg1Var2, (byte) 8), scheduler);
        subtypeEffectHandlerBuilderC.d(qlg1.class, new f5b(lzn0Var, (byte) 20), scheduler);
        subtypeEffectHandlerBuilderC.b(plg1.class, new g5b(lzn0Var, (byte) 5), scheduler);
        subtypeEffectHandlerBuilderC.d(nlg1.class, new f5b(lzn0Var, (byte) 19), scheduler);
        return Mobius.d(zlg1.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).c(RxEventSources.a(new ObservableSource[]{Observable.interval(1L, TimeUnit.SECONDS, Schedulers.b).map(gex0.T0)}), new EventSource[]{RxEventSources.a(new ObservableSource[]{amg1Var.e.a.a().flatMapSingle(rdx0.T0)})});
    }
}
