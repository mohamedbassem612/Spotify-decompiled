package p;

import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qlu0 implements Connection {
    public final CompositeDisposable a = new CompositeDisposable();
    public final ObservableTransformer b;
    public final /* synthetic */ Consumer c;

    public qlu0(g1b g1bVar, Consumer consumer) {
        this.c = consumer;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(cew.class, (yon) g1bVar.b);
        subtypeEffectHandlerBuilderC.g(gew.class, (so) g1bVar.d);
        subtypeEffectHandlerBuilderC.g(f9w.class, (zd1) g1bVar.f);
        subtypeEffectHandlerBuilderC.g(vaw.class, (b020) g1bVar.h);
        l5x0 l5x0Var = (l5x0) g1bVar.c;
        Scheduler scheduler = (Scheduler) g1bVar.g;
        subtypeEffectHandlerBuilderC.d(lfw.class, l5x0Var, scheduler);
        subtypeEffectHandlerBuilderC.d(cfw.class, (z0u0) g1bVar.e, scheduler);
        subtypeEffectHandlerBuilderC.d(afw.class, (a381) g1bVar.i, scheduler);
        subtypeEffectHandlerBuilderC.d(hfw.class, (o481) g1bVar.t, scheduler);
        this.b = subtypeEffectHandlerBuilderC.h();
    }

    public final void accept(Object obj) {
        this.a.b(Observable.just((iiw) obj).compose(this.b).subscribe(new k1p0(this.c, (byte) 2)));
    }

    public final void dispose() {
        this.a.dispose();
    }
}
