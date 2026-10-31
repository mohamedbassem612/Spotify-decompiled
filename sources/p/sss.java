package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sss {
    public final int a;
    public final Scheduler b;
    public final Scheduler c;
    public final MobiusLoop.Builder d;

    public sss(drm1 drm1Var, ObservableTransformer observableTransformer, pta1 pta1Var, int i, Scheduler scheduler, Scheduler scheduler2) {
        this.a = i;
        this.b = scheduler;
        this.c = scheduler2;
        this.d = Mobius.d(drm1Var, RxConnectables.a(observableTransformer)).h(RxEventSources.a(new ObservableSource[]{pta1Var.b().map(drm0.W0)})).b(new h9n(this, (byte) 17)).d(new sun(this, (byte) 19));
    }

    public final MobiusLoop.Controller a() {
        return Mobius.c(this.d, new gua1(this.a, true), new SchedulerWorkRunner(this.b));
    }
}
